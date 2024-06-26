import "./styles.css";
import '@popperjs/core'
import 'bootstrap/js/dist/collapse'

const Navbar = () => {
  return (
    <nav className="main-nav navbar navbar-expand-md navbar-dark bg-primary">
      <div className="container-fluid">
        <a href="link" className="nav-logo-text">
          <h4>DS Catalog</h4>
        </a>
        {/* Botao */}
        <button
          className="navbar-toggler"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#dscatalog-navbar"
          aria-controls="dscatalog-navbar"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <span className="navbar-toggler-icon"></span>
        </button>

        <div className="collapse navbar-collapse" id="dscatalog-navbar">
          <ul className="navbar-nav offset-md-2 main-menu">
            <li>
              <a className="active" href="link">
                HOME
              </a>
            </li>
            <li>
              <a href="link">CATÁLOGO</a>
            </li>
            <li>
              <a href="link">ADMIN</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>
  );
};

export default Navbar;
