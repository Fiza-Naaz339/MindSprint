-- 1. Retrieve the first name, last name, and job title of all employees. --
select e.first_name, e.last_name,t.title
from employees e
join titles t
on e.emp_no = t.emp_no;

-- 2. Find all employees who work in the Sales department --
SELECT employees.first_name, employees.last_name, departments.dept_name
FROM employees
JOIN dept_emp ON employees.emp_no = dept_emp.emp_no
JOIN departments ON dept_emp.dept_no = departments.dept_no
WHERE departments.dept_name = 'Sales';

-- 3. List all products sorted by product name in ascending order --
SELECT * FROM products ORDER BY product_name ASC;

-- 4. Calculate the average salary of all employees --
SELECT AVG(salary) AS average_salary
FROM salaries;

-- 5. Find the total number of employees in each department --
SELECT departments.dept_name, COUNT(dept_emp.emp_no) AS total_employees
FROM departments
JOIN dept_emp ON departments.dept_no = dept_emp.dept_no
GROUP BY departments.dept_name;

-- 6. list departments with more than 5 employees. --
