const path = require('path')
const express = require('express')
const app = express()
const morgan = require('morgan')
const { engine } = require('express-handlebars')

const port = 2012

const route = require('./routes')

app.use(express.urlencoded({
  extended: true
}))
app.use(express.json())
app.use(express.static(path.join(__dirname, 'public')))
app.use(morgan('combined'))
// respond with "hello world" when a GET request is made to the homepage
app.engine('hbs', engine({
  extname: '.hbs'
}))
app.set('view engine', 'hbs')
app.set('views', path.join(__dirname, 'resources/views'))
console.log("Path: ", __dirname)
// console.log('PATH: ', path.join(__dirname, 'resources/views'))

route(app)

app.listen(port, () => console.log(`Example app listening at http://localhost:${port}`)) 