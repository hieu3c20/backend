const app = require('./app');
const mongoose = require('mongoose');
const dotenv = require('dotenv');

dotenv.config({ path: './config.env' })

console.log(app.get('env') + " mode");

const DB = process.env.DATABASE.replace('<PASSWORD>', process.env.PASSWORD)

mongoose.connect(DB, {
  useNewUrlParser: true,
  useCreateIndex: true,
  useFindAndModify: false,
  useUnifiedTopology: true
}).then(connection => {
  // console.log(connection.connections);
  console.log('DB connection successful');
})

const port = 3000
app.listen(port, () => {
  console.log(`app is running on port ${port}...`);
});