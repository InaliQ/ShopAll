import React, { useState, useEffect } from 'react';
import { useParams } from 'react-router-dom';
import ProductService from '../Services/ProductsService';

const UpdateProduct = () => {
  const { id } = useParams();
  const [product, setProduct] = useState({
    productName: '',
    description: '',
    price: ''
  });

  useEffect(() => {
    ProductService.getProductById(id).then((response) => {
      setProduct(response.data);
    });
  }, [id]);

  const handleChange = (e) => {
    const { name, value } = e.target;
    setProduct({ ...product, [name]: value });
  };

  const saveProduct = (e) => {
    e.preventDefault();
    ProductService.updateProduct(product).then(() => {
      window.location.href = '/products';
    });
  };

  return (
    <div className="container mt-4">
    <h2 className="mb-4">Update Product</h2>
    <form onSubmit={saveProduct}>
      <div className="mb-3">
        <label htmlFor="productName" className="form-label">Name:</label>
        <input
          type="text"
          id="productName"
          name="productName"
          className="form-control"
          value={product.productName}
          onChange={handleChange}
          required
        />
      </div>
      <div className="mb-3">
        <label htmlFor="description" className="form-label">Description:</label>
        <input
          type="text"
          id="description"
          name="description"
          className="form-control"
          value={product.description}
          onChange={handleChange}
          required
        />
      </div>
      <div className="mb-3">
        <label htmlFor="price" className="form-label">Price:</label>
        <input
          type="number"
          id="price"
          name="price"
          className="form-control"
          value={product.price}
          onChange={handleChange}
          required
        />
      </div>
      <button type="submit" className="btn btn-primary">Save</button>
    </form>
  </div>
  );
};

export default UpdateProduct;
