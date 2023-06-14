const mongoose = require('mongoose')

const slugify = require('slugify')

const tourSchema = new mongoose.Schema({
  name: {
    type: String,
    required: [true, 'A tour must have a name'], // validator
    unique: true,
    trim: true,
    maxlength: [40, 'A tour name must have less or equal than 40 characters'],
    minlength: [10, 'A tour name must have more or equal than 10 characters']
  },
  slug: String,
  duration: {
    type: Number,
    required: [true, 'A tour must have a duration']
  },
  maxGroupSize: {
    type: Number,
    required: [true, 'A tour must have a group size']
  },
  difficulty: {
    type: String,
    required: [true, 'A tour must have a difficulty'],
    enum: {
      values: ['easy', 'medium', 'difficult'],
      message: 'Difficulty is either: easy, medium, or difficult'
    }
  },
  ratingsAverage: {
    type: Number,
    default: 4.5,
    min: [1, 'Rating must be above 1.0'], // validator
    max: [5, 'Rating must be below 5.0']
  },
  ratingsQuantity: {
    type: Number,
    default: 0
  },
  price: {
    type: Number,
    required: [true, 'A tour must have a price']
  },
  priceDiscount: Number,
  summary: {
    type: String,
    trim: true, // remove all white space in the beginning and end of the string
  },
  description: {
    type: String,
    trim: true // remove all white space in the beginning and end of the string
  },
  imageCover: {
    type: String,
    required: [true, 'A tour must have a cover image']
  },
  images: [String],
  createdAt: {
    type: Date,
    default: Date.now(),
  },
  startDates: [Date],
  secretTour: {
    type: Boolean,
    default: false
  }
}, {
  toJSON: {
    virtuals: true
  },
  toObject: {
    virtuals: true
  }
})

tourSchema.virtual('durationWeeks').get(function () {
  return (this.duration / 7).toFixed(2) * 1
})

tourSchema.pre('save', function (next) {
  this.slug = slugify(this.name, {
    lower: true
  })
  next()
})

/** 
tourSchema.pre('save', function (next) {
  console.log('Will save document ...');
  next(); 
}) 

tourSchema.post('save', function (doc, next) {
  console.log(doc);
  next();
})
*/

// QUERY MIDDLEWARE
tourSchema.pre(/^find/, function (next) {
  this.find({
    secretTour: {
      $ne: true
    }
  })
  this.start = Date.now()
  next()
})

tourSchema.post(/^find/, function (docs, next) {
  next()
})

tourSchema.pre(/^find/, function (next) {
  this.pipeline().unshift({ $match: { secretTour: { $ne: true } } })

  next()
})

// tourSchema.pre('aggregate', function (next) {
//   this.pipeline().unshift({ $match: { secretTour: { $ne: true } } })
//   console.log(this.pipeline());
//   next()
// })

const Tour = mongoose.model('Tour', tourSchema)

// const testTour = new Tour({
//   name: 'The Park Camper',
//   rating: 4.7,
//   price: 997
// })

// testTour.save().then(doc => {
//   console.log(doc);
// }).catch(err => {
//   console.log('ERROR: ', err);
// })

module.exports = Tour