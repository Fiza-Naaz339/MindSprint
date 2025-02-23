import React from 'react';
import 'D:/OneDrive - Olam International/Desktop/Training/API/first-app/src/App.css';

function Login() {
    return ( 
        <div className="login-container">
            <h3 className="text-center p-2 text-bg-secondary">Login Page</h3>
            <form className="login-form">
                <div className="mb-3">
                    <label htmlFor="exampleFormControlInput1" className="form-label">Email address</label>
                    <input type="email" className="form-control" placeholder="name@example.com" required />
                </div>
                <div className="mb-3">
                    <label htmlFor="inputPassword6" className="form-label">Password</label>
                    <input type="password" className="form-control" aria-describedby="passwordHelpInline" required />
                    <span id="passwordHelpInline" className="form-text">
                        Must be 8-20 characters long.
                    </span>
                </div>
                <button className="btn btn-primary mt-3 w-100">Login</button>
            </form>
        </div>
    );
}

export default Login;