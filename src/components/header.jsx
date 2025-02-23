import { Link } from "react-router-dom";

function Header() {
  return (
    <ul className="nav justify-content-end">
      <li className="nav-item">
        <Link className="nav-link active" aria-current="page" to="home">
          Home
        </Link>
      </li>
      <li className="nav-item">
        <Link className="nav-link" to="about">
          About
        </Link>
      </li>
      <li className="nav-item">
        <Link className="nav-link" to="contact">
          Contact
        </Link>
      </li>
      <li className="nav-item">
        <Link className="nav-link" to="products">
          Products
        </Link>
      </li>
      <li className="nav-item">
        <Link className="nav-link" to="user">
          Users
        </Link>
      </li>
      <li className="nav-item">
        <Link className="nav-link" to="Login">
          Login
        </Link>
      </li>
      <li className="nav-item">
        <Link className="nav-link" to="Register">
          Register
        </Link>
      </li>
    </ul>
  );
}
export default Header;
