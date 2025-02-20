-- Connect to MySQL and use the employees database
USE employees;

-- Show all tables in the database
SHOW TABLES;

-- Select the first 5 records from the employees table
SELECT * FROM employees LIMIT 5;

-- 1. Retrieve the first name, last name, and job title of all employees.
SELECT e.first_name, e.last_name, t.title
FROM employees e
JOIN titles t ON e.emp_no = t.emp_no;

-- 2. Find all employees who work in the Sales department.
SELECT employees.first_name, employees.last_name, departments.dept_name
FROM employees
JOIN dept_emp ON employees.emp_no = dept_emp.emp_no
JOIN departments ON dept_emp.dept_no = departments.dept_no
WHERE departments.dept_name = 'Sales';

-- 3. List all products sorted by product name in ascending order.
SELECT * FROM products ORDER BY product_name ASC;

-- 4. Calculate the average salary of all employees.
SELECT AVG(salary) AS average_salary
FROM salaries;

-- 5. Find the total number of employees in each department.
SELECT departments.dept_name, COUNT(dept_emp.emp_no) AS total_employees
FROM departments
JOIN dept_emp ON departments.dept_no = dept_emp.dept_no
GROUP BY departments.dept_name;

-- 6. List departments with more than 5 employees.
SELECT departments.dept_name
FROM departments
JOIN dept_emp ON departments.dept_no = dept_emp.dept_no
GROUP BY departments.dept_name
HAVING COUNT(dept_emp.emp_no) > 5;

-- 7. Retrieve a list of orders along with the customer names who placed the orders.
-- Create customers table
CREATE TABLE customers (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    email VARCHAR(100)
);

-- Create orders table
CREATE TABLE orders (
    order_id INT PRIMARY KEY AUTO_INCREMENT,
    customer_id INT,
    order_date DATE,
    total_amount DECIMAL(10, 2),
    FOREIGN KEY (customer_id) REFERENCES customers(id)
);
SELECT orders.*, customers.name AS customer_name
FROM orders
JOIN customers ON orders.customer_id = customers.id;

-- 8. Find all customers and their orders, including customers who have not placed any orders.
SELECT customers.*, orders.*
FROM customers
LEFT JOIN orders ON customers.id = orders.customer_id;

-- 9. List all employees and the names of their managers.
SELECT 
    e.first_name AS employee_first_name, 
    e.last_name AS employee_last_name, 
    m.first_name AS manager_first_name, 
    m.last_name AS manager_last_name,
    dm.dept_no
FROM 
    dept_manager dm
JOIN 
    employees e ON dm.emp_no = e.emp_no
JOIN 
    dept_manager dm2 ON dm.dept_no = dm2.dept_no AND dm2.from_date <= CURDATE() AND (dm2.to_date IS NULL OR dm2.to_date > CURDATE())
JOIN 
    employees m ON dm2.emp_no = m.emp_no
WHERE 
    e.emp_no != m.emp_no;  -- Ensure we are not matching the employee with themselves

-- 10. Find all products that have never been ordered.
-- Create products table
CREATE TABLE products (
    product_id INT PRIMARY KEY AUTO_INCREMENT,
    product_name VARCHAR(100),
    price DECIMAL(10, 2),
    stock INT
);

-- Create order_details table
CREATE TABLE order_details (
    order_id INT,
    product_id INT,
    quantity INT,
    PRIMARY KEY (order_id, product_id),
    FOREIGN KEY (product_id) REFERENCES products(product_id)
);
SELECT * FROM products
WHERE product_id NOT IN (SELECT product_id FROM order_details);

-- 11. Find all employees who work in the 'Marketing' or 'Finance' departments.
SELECT employees.*
FROM employees
JOIN dept_emp ON employees.emp_no = dept_emp.emp_no
JOIN departments ON dept_emp.dept_no = departments.dept_no
WHERE departments.dept_name IN ('Marketing', 'Finance');

-- 12. List all orders placed between January 1, 2020, and December 31, 2020.
SELECT * FROM orders
WHERE order_date BETWEEN '2020-01-01' AND '2020-12-31';

-- 13. Find all customers whose names start with the letter 'A'.
SELECT * FROM customers
WHERE name LIKE 'A%';

-- 14. Combine the first names of employees and customers into a single list.
SHOW COLUMNS FROM customers;
SELECT first_name FROM employees 
UNION 
SELECT name FROM customers;

-- 15. Find the names of employees who have placed the highest number of orders.
ALTER TABLE orders
ADD COLUMN employee_id INT,
ADD FOREIGN KEY (employee_id) REFERENCES employees(emp_no);

SELECT e.first_name, e.last_name, COUNT(o.order_id) AS order_count 
FROM employees e 
JOIN orders o ON e.emp_no = o.employee_id  -- Assuming this is the correct column
GROUP BY e.emp_no 
ORDER BY order_count DESC 
LIMIT 1;

-- 16. Find the number of Male and Female employees in the database and the order count in descending order.
SELECT gender, COUNT(*) AS employee_count, SUM(order_count) AS total_orders
FROM (
    SELECT e.gender, e.emp_no, COUNT(o.order_id) AS order_count
    FROM employees e
    LEFT JOIN orders o ON e.emp_no = o.employee_id
    GROUP BY e.emp_no
) AS subquery
GROUP BY gender
ORDER BY total_orders DESC;

-- 17. Find the Average salary by employee title and order by descending order.
SELECT t.title, AVG(s.salary) AS average_salary
FROM titles t
JOIN salaries s ON t.emp_no = s.emp_no
GROUP BY t.title
ORDER BY average_salary DESC;

-- 18. List first 5 employees (id, fname, lname, department name) along with their department names.
SELECT e.emp_no, e.first_name, e.last_name, d.dept_name
FROM employees e
JOIN dept_emp de ON e.emp_no = de.emp_no
JOIN departments d ON de.dept_no = d.dept_no
LIMIT 5;

-- 19. Display first name, last name, salary of the highest paid employee.
SELECT e.first_name, e.last_name, s.salary 
FROM employees e 
JOIN salaries s ON e.emp_no = s.emp_no 
WHERE s.to_date IS NULL  -- Only consider current salaries
ORDER BY s.salary DESC 
LIMIT 1;

-- 20. Second highest paid employee.
SELECT e.first_name, e.last_name, s.salary 
FROM employees e 
JOIN salaries s ON e.emp_no = s.emp_no 
WHERE s.to_date IS NULL  -- Only consider current salaries
ORDER BY s.salary DESC 
LIMIT 1 OFFSET 1;  -- Get the second highest salary
