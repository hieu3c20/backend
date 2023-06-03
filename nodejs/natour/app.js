const { create } = require('domain');
const express = require('express');
const fs = require('fs');
const morgan = require('morgan');

const tourRouter = require('./routes/tourRoute')
const userRouter = require('./routes/userRoute')

const app = express();

// console.log(process.env.NODE_ENV, "11");
if (process.env.NODE_ENV !== 'production') {
  app.use(morgan('common'))
}

app.use(express.json());

app.use(express.static(`${__dirname}/public`))

// app.use((req, res, next) => {
//   console.log("Hello, i'm a test middleware");
//   next();
// })

app.use((req, res, next) => {
  req.requestTime = new Date().toISOString();
  next();
})

const tours = JSON.parse(fs.readFileSync(`${__dirname}/dev-data/data/tours-simple.json`))

const getHomePage = (_, res) => {
  res.status(200)
  res.send('hello home page')
}

// app.get('/api/v1/tours', getAllTour)
// app.get('/api/v1/tours/:id', getIndividualTour)
// app.post('/api/v1/tours', createTour)
// app.patch('/api/v1/tours/:id', updateTour)
// app.delete('/api/v1/tours/:id', deleteTour)
app.get('/', getHomePage)

app.use('/api/v1/tours', tourRouter)
app.use('/api/v1/users', userRouter)

module.exports = app;

