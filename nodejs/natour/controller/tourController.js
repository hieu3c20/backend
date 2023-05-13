const fs = require('fs');
const Tour = require('./../models/tourModel')

const tours = JSON.parse(fs.readFileSync(`${__dirname}/../dev-data/data/tours-simple.json`))

exports.checkId = (req, res, next, value) => {
  console.log(`tour id is ${value}, i'm a check middleware`);

  if (req.params.id * 1 > tours.length) {
    return res.status(404).json({
      status: 'fail',
      message: 'invalid id'
    })
  }

  next()
}

exports.checkBody = (req, res, next) => {
  if (!req.body.name || !req.body.price) {
    return res.status(400).json({
      status: 'fail',
      message: 'missing name or price'
    })
  }

  next()
}

exports.getAllTour = (req, res) => {
  res.status(200).json({
    status: 'success',
    requestedAt: req.requestTime,
    result: tours.length,
    data: {
      tours
    }
  })
}

exports.getIndividualTour = (req, res) => {
  console.log(req.params)

  const id = Number(req.params.id)
  const tour = tours.find(el => el.id === id)

  if (!tour) {
    return res.status(404).json({
      status: 'fail',
      message: 'invalid id'
    })
  }

  res.status(200).json({
    status: 'success',
    data: {
      tour
    }
  })
}

exports.createTour = (req, res) => {
  const newId = tours[tours.length - 1].id + 1
  const newTour = Object.assign({ id: newId }, req.body)

  tours.push(newTour)

  fs.writeFile(`${__dirname}/dev-data/data/tours-simple.json`, JSON.stringify(tours), _ => {
    res.status(201).json({
      status: 'success',
      data: {
        tour: newTour
      }
    })
  })
}

exports.updateTour = (req, res) => {
  if (req.params.id * 1 > tours.length) {
    return res.status(404).json({
      status: 'fail',
      message: 'invalid id'
    })
  }

  res.status(200).json({
    status: 'success',
    data: {
      tour: '<updated tour here>'
    }
  })
}

exports.deleteTour = (req, res) => {
  if (req.params.id * 1 > tours.length) {
    return res.status(404).json({
      status: 'fail',
      message: 'invalid id'
    })
  }

  res.status(200).json({
    status: 'success',
    data: null
  })
}