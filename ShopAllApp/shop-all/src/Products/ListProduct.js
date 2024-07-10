// src/components/ListProduct.js
import React, { useEffect, useState } from 'react';
import ProductService from '../Services/ProductsService';
import { useNavigate } from 'react-router-dom';

const ListProduct = () => {
  const [products, setProducts] = useState([]);
  const navigate = useNavigate();  
  const editProduct = (id) => {
    navigate(`/edit-product/${id}`);
};

  useEffect(() => {
    ProductService.getAllProducts().then((response) => {
      setProducts(response.data);
    });
  }, []);

  return (
    <div className="container mt-4">
    <h2 className="mb-4">Products List</h2>
    <table className="table table-striped">
      <thead>
        <tr>
          <th>ID</th>
          <th>Name</th>
          <th>Description</th>
          <th>Price</th>
          <th>Actions</th>
        </tr>
      </thead>
      <tbody>
        {products.map(product => (
          <tr key={product.idProducts}>
            <td>{product.idProducts}</td>
            <td>{product.productName}</td>
            <td>{product.description}</td>
            <td>${product.price}</td>
            <td>
              <button
                className="btn btn-danger me-2"
                onClick={() => deleteProduct(product.idProducts)}
              >
                Delete
              </button>
              <button
                className="btn btn-warning"
                onClick={() => editProduct(product.idProducts)}
              >
                Edit
              </button>
            </td>
          </tr>
        ))}
      </tbody>
    </table>
  </div>
  );
};
const deleteProduct = (id) => {
    ProductService.deleteProduct(id).then(() => {
      window.location.reload();
    });
  };
  
  



export default ListProduct;
