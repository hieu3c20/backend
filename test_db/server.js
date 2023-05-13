const express = require('express');
const mongoose = require('mongoose');
const app = express();
const bodyParser = require('body-parser');

const port = 3000;

const uri = 'mongodb+srv://hiu_2012:hovanhieu201202@testdb.dglbggb.mongodb.net/?retryWrites=true&w=majority'

app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: true }));

// Define the item schema
const itemSchema = new mongoose.Schema({
  name: String,
  description: String,
  price: String,
});

// Create the item model
const Item = mongoose.model('Item', itemSchema);

async function connect() {
  try {
    await mongoose.connect(uri)
    console.log("Connected to mongoose");
  }
  catch (e) {
    console.error(e);
  }
}

// Create a route to add a new item
app.post('/items', async (req, res) => {
  try {
    const newItem = new Item({
      name: req.body.name,
      description: req.body.description,
      price: req.body.price,
    });

    await newItem.save();
    res.send(newItem);
  } catch (e) {
    console.error(e);
    res.status(500).send('Error saving item to database');
  }
});

// Create a route to add a new item using parameters in the URL
// app.post('/items/:name/:description/:price', async (req, res) => {
//   try {
//     const newItem = new Item({
//       name: req.params.name,
//       description: req.params.description,
//       price: req.params.price,
//     });
//     await newItem.save();
//     res.send(newItem);
//   } catch (e) {
//     console.error(e);
//     res.status(500).send('Error saving item to database');
//   }
// });

// Create a route to view the item by ID
app.get('/items/:id', async (req, res) => {
  try {
    const itemId = mongoose.Types.ObjectId(req.params.id);
    const item = await Item.findById(itemId);
    if (!item) {
      res.status(404).send('Item not found');
    } else {
      res.send(item);
    }
  } catch (e) {
    if (e instanceof mongoose.Error.CastError) {
      res.status(400).send('Invalid item ID');
    } else {
      console.error(e);
      res.status(500).send('Error retrieving item from database');
    }
  }
});

app.get('/items', async (req, res) => {
  try {
    const items = await Item.find({});
    const itemsToSend = items.map(item => ({
      name: item.name,
      description: item.description,
      price: item.price
    }));
    res.send(itemsToSend);
  } catch (e) {
    console.error(e);
    res.status(500).send('Error retrieving items from database');
  }
});

connect();

app.listen(port, () => console.log(`server is starting on port ${port}`));