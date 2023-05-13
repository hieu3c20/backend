const express = require('express');
const tourController = require('../controller/tourController');

const app = express();
const tourRouter = express.Router()

tourRouter.param('id', tourController.checkId)

tourRouter.route('/')
  .get(tourController.getAllTour)
  .post(tourController.checkBody, tourController.createTour)

tourRouter.route('/:id')
  .get(tourController.getIndividualTour)
  .patch(tourController.updateTour)
  .delete(tourController.deleteTour)

module.exports = tourRouter