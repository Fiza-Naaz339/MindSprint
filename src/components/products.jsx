import { useEffect, useState } from "react";
import axios from 'axios';
import { Link } from "react-router-dom";
 
function Products() {
    const [products, setProducts] = useState([]);
    const [error, setError] = useState(null);
 
    const fetchData = async () => {
        try {
            const resp = await axios.get('https://dummyjson.com/products');
            setProducts(resp.data.products);
        } catch (error) {
            setError(error.message);
        }
    };
 
    useEffect(() => {
        fetchData();
    }, []);
 
    return (
        <div>
            <h3 className="text-center p-2 text-bg-secondary">Product Page</h3>
            {error && <p className="text-danger text-center">{error}</p>}
            <div className="row">
                {products.map(product => (
                    <div className="col-md-lg-4, col-md-4" key={product.id}>
                        <div className="card mb-4">
                        <Link to ={`/products/${product.id}`}>
                            <img src={product.thumbnail} className="card-img-top" alt={product.title} />
                        </Link>
                            
                            <div className="card-body">
                                <h5 className="card-title">{product.title}</h5>
            
                                <p className="card-text">{product.description}</p>
                                <p className="card-text"><strong>Price:</strong> ${product.price}</p>
                                <p>Rating: {product.rating}</p>
                                <button className="btn btn-primary">Add to Cart</button>
                            </div>
                        </div>
                    </div>
                ))}
            </div>
        </div>
    );
}
 
export default Products;