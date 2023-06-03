const fs = require('fs')
const Tour = require('./../../models/tourModel')

// console.log(process.env);

const tours = JSON.parse(fs.readFileSync(`${__dirname}/tours-simple.json`, 'utf-8'))

const importData = async () => {
  try {
    await Tour.create(tours)
    console.log('Data successfully loaded!');
  } catch (err) {
    console.log(err);
  }
  process.exit();
}

const deleteData = async () => {
  try {
    await Tour.deleteMany()
    console.log('Data successfully delete!');
  } catch (err) {
    console.log(err);
  }
  process.exit();
}

console.log(process.argv);

if (process.argv[2] === '--import') {
  importData()
} else if (process.argv[2] === '--delete') {
  deleteData()
}