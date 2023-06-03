const express = require('express');
const tourController = require('../controller/tourController');

const app = express();
const tourRouter = express.Router()

// tourRouter.param('id', tourController.checkId)

tourRouter.route('/top-5-cheapest').get(tourController.aliasTopTours, tourController.getAllTour)

tourRouter.route('/tour-stats').get(tourController.getTourStats)

tourRouter.route('/monthly-plan/:year').get(tourController.getMonthlyPlan)

tourRouter.route('/')
  .get(tourController.getAllTour)
  .post(tourController.createTour)

tourRouter.route('/:id')
  .get(tourController.getIndividualTour)
  .patch(tourController.updateTour)
  .delete(tourController.deleteTour)

module.exports = tourRouter