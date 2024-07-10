import React from 'react';
import { Link } from 'react-router-dom';

const Header = () => {
  return (
    <header>
      <nav>
        <ul>
          <li>
            <Link to="/products">Product List</Link>
          </li>
          <li>
            <Link to="/add-product">Create Product</Link>
          </li>
          {/* Puedes añadir más enlaces aquí según tus necesidades */}
        </ul>
      </nav>
      <style jsx>{`
        header {
          background-color: #282c34;
          padding: 10px;
          color: white;
        }
        nav ul {
          list-style: none;
          display: flex;
          gap: 10px;
        }
        nav a {
          color: white;
          text-decoration: none;
        }
        nav a:hover {
          text-decoration: underline;
        }
      `}</style>
    </header>
  );
};

export default Header;
