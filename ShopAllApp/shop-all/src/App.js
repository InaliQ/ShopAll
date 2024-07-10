// src/App.js
import React from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import ListProduct from './Products/ListProduct';
import CreateProduct from './Products/CreateProduct';
import UpdateProduct from './Products/UpdateProduct';
import Header from './Components/header';

const App = () => {
  return (
    <Router>
      <div>
        <Header/>
        <Routes>
          <Route path="/products" element={<ListProduct />} />
          <Route path="/add-product" element={<CreateProduct />} />
          <Route path="/edit-product/:id" element={<UpdateProduct />} />
        </Routes>
      </div>
    </Router>
  );
};

export default App;
