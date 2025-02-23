import React, { useState } from 'react'; // Import useState from React
import 'D:/OneDrive - Olam International/Desktop/Training/API/first-app/src/App.css';
import emailjs from 'emailjs-com';

function Contact() {
    const [name, setName] = useState('');
    const [email, setEmail] = useState('');
    const [message, setMessage] = useState('');

    const handleSubmit = (e) => {
        e.preventDefault(); // Prevent the default form submission

        const templateParams = {
            name,
            email,
            message,
        };

        emailjs.send('service_pnfzj1m', 'template_35cacln', templateParams, 'olPNkoiSTS1G3Hpl_') // Replace with your service ID, template ID, and user ID
            .then((response) => {
                console.log('SUCCESS!', response.status, response.text);
                alert('Your message has been sent successfully!');
                // Clear the form
                setName('');
                setEmail('');
                setMessage('');
            }, (err) => {
                console.log('FAILED...', err);
                alert('Failed to send your message. Please try again later.');
            });
    };

    return ( 
        <div className="contact-container">
            <h2>Contact Us</h2>
            <form className="contact-form" onSubmit={handleSubmit}>
                <div className="form-group">
                    <label htmlFor="name">Name:</label>
                    <input type="text" id="name" name="name" value={name} onChange={(e) => setName(e.target.value)} required />
                </div>
                <div className="form-group">
                    <label htmlFor="email">Email:</label>
                    <input type="email" id="email" name="email" value={email} onChange={(e) => setEmail(e.target.value)} required />
                </div>
                <div className="form-group">
                    <label htmlFor="message">Message:</label>
                    <textarea id="message" name="message" rows="4" value={message} onChange={(e) => setMessage(e.target.value)} required></textarea>
                </div>
                <button type="submit" className="submit-button">Send Message</button>
            </form>
        </div>
    );
}

export default Contact;