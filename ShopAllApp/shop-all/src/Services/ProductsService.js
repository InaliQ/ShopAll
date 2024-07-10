
import axios from 'axios';

const API_URL = 'http://localhost:8092/api/v1';

class ProductService {
  getAllProducts() {
    return axios.get(`${API_URL}/products`);
  }

  getProductById(id) {
    return axios.get(`${API_URL}/product/${id}`);
  }

  createProduct = (product) => {
    return axios.post(`${API_URL}/product`, product)
      .then(response => response.data)
      .catch(error => {
        console.error("There was an error creating the product!", error);
        throw error;
      });
  };
  

  updateProduct(product) {
    return axios.put(`${API_URL}/product`, product);
  }

  deleteProduct(id) {
    return axios.delete(`${API_URL}/product/${id}`);
  }
}

export default new ProductService();
