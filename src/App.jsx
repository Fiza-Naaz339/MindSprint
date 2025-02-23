// import { useState } from 'react'
// import reactLogo from './assets/react.svg'
// import viteLogo from '/vite.svg'
// import './App.css'
import Header from "./components/header"
import Footer from "./components/footer"
import {BrowserRouter, Route, Routes} from 'react-router-dom'
import About from "./components/about"
import Contact from "./components/contact"
import User from "./components/user"
import Home from "./components/home"
import Login from "./components/Login"
import Products from "./components/products"
import ProductDetails from "./components/ProductDetails"
import Register from "./components/Register"

function App() {


  return (
      <BrowserRouter>
      <div className="container">

        
        <Header />
        
        <Routes>
          <Route path = '' element={<Home />} />
          <Route path = 'home' element={<Home />} />
          <Route path = 'about' element={<About />}/>
          <Route path = 'contact' element={<Contact />}/>
          <Route path = 'user' element={<User />}/>
          <Route path = 'login' element={<Login />}/>
          <Route path = 'register' element={<Register />}/>
          <Route path = 'products' element={<Products />}/>
          <Route path = 'products/:id' element={<ProductDetails />}/>
        </Routes>


      </div>
      </BrowserRouter>
    
  )
}

export default App
