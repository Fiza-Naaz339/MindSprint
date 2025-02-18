-- PK and FK constraints --
create database sample;
use sample;
show tables;

-- Create department table --
create table departments (
id int primary key,
name varchar(100) not null
);

-- Insert some sample records --
INSERT INTO departments (id, name) 
VALUES 
(1, 'Sales'), 
(2, 'R&D'), 
(3, 'Marketing'), 
(4, 'Finance'), 
(5, 'Human Resources');

-- Verify the inserted data --
select * from department;

-- Create employee table which make many to one relationship between department and employees 
-- one departmen can have many employee
create table employees(
id int primary key,
name varchar(100) not null,
position varchar(100) not null,
salary decimal(10,2),
department_id int,
foreign key (department_id)
references departments(id)
);

desc employee;

-- Insert into Employee Table --

INSERT INTO employees 
(id, name, position, salary, department_id) 
VALUES 
(1, 'John Doe', 'Manager', 75000.00, 1), 
(2, 'Jane Smith', 'Developer', 65000.00, 2), 
(3, 'Emily Johnson', 'Designer', 60000.00, 3), 
(4, 'Michael Brown', 'Analyst', 70000.00, 4), 
(5, 'Linda Green', 'Manager', 75000.00, 1), 
(6, 'James White', 'Developer', 65000.00, 2), 
(7, 'William Black', 'Developer', NULL, 2), 
(8, 'Mary Blue', 'HR', 50000.00, 5);

select * from employees;

-- Inner join to take the common details from both tables
SELECT employees.id, employees.name, employees.position, 
employees.salary, departments.name AS department
FROM employees
INNER JOIN departments ON employees.department_id = departments.id;

-- Lets insert one record in employee table without department id --
INSERT INTO employees 
(id, name, position, salary, department_id) 
VALUES (9,'Test User', 'Testing',234567,null);

-- Left join --
SELECT employees.id, employees.name, employees.position, 
employees.salary, departments.name AS department
FROM employees
LEFT JOIN departments ON employees.department_id = departments.id;

-- Insert one record into the department --
insert into departments values(6,'IT');

-- Right Join -- 
SELECT employees.id, employees.name, employees.position, 
employees.salary, departments.name AS department
FROM employees
RIGHT JOIN departments ON employees.department_id = departments.id;

-- Full Outer join -- 
SELECT employees.id, employees.name, employees.position, 
employees.salary, departments.name AS department
FROM employees
LEFT JOIN departments ON employees.department_id = departments.id
UNION 
SELECT employees.id, employees.name, employees.position, 
employees.salary, departments.name AS department
FROM employees
RIGHT JOIN departments ON employees.department_id = departments.id;

-- Cross Join --
SELECT employees.id AS employee_id, employees.name AS employee_name, 
departments.id AS department_id, departments.name AS department_name
FROM employees
CROSS JOIN departments;


-- Total employee in each department --
select count(*) "Number of employee", department_id
from employees 
group by department_id;

-- Find Total employee based on department name --
SELECT dep.name AS "Department Name", COUNT(*) AS "Total Employee"
FROM employees emp
JOIN departments dep
ON emp.department_id = dep.id
GROUP BY dep.name;

-- Having clause --
SELECT departments.name AS department, SUM(employees.salary) AS 
total_salary
FROM employees
JOIN departments ON employees.department_id = departments.id
GROUP BY departments.name
HAVING `total_salary`> 100000;

-- Having count --
-- List the department which is having more than two employees --
SELECT departments.name AS department, COUNT(employees.id) AS 
employee_count
FROM employees
JOIN departments ON employees.department_id = departments.id
GROUP BY departments.name
HAVING COUNT(employees.id) > 2;

-- Rollup --
SELECT departments.name AS department, SUM(employees.salary) AS total_salary
FROM employees
JOIN departments ON employees.department_id = departments.id
GROUP BY departments.name WITH ROLLUP;

show tables;
CREATE TABLE Accounts (
 account_id VARCHAR(10) PRIMARY KEY,
 account_name VARCHAR(100),
 balance DECIMAL(10, 2)
);

INSERT INTO Accounts (account_id, account_name, balance) 
VALUES
('A001', 'Alice', 1000.00),
('A002', 'Bob', 1500.00),
('A003', 'Charlie', 2000.00);

desc Accounts;
select * from Accounts;

BEGIN;
UPDATE Accounts SET balance = balance - 100 WHERE account_id = 'A002';
UPDATE Accounts SET balance = balance + 100 WHERE account_id = 'A001';
COMMIT;
rollback;
select * from Accounts;

-- savepoint --
BEGIN;
UPDATE Accounts SET balance = balance + 100 WHERE account_id = 'A001';
SAVEPOINT sp1;
UPDATE Accounts SET balance = balance + 100 WHERE account_id = 'A002';
ROLLBACK TO sp1;
COMMIT;
select * from Accounts;

-- Delimiter --
DELIMITER // -- Change the termination symbol
CREATE PROCEDURE GetAllAccounts() -- Create the procedure
BEGIN
 SELECT * FROM Accounts;
END // -- last line of procedute which ends with //
DELIMITER ; -- Changes the tremination symbol to ;
CALL GetAllAccounts();

SELECT * FROM Accounts;

select * from employee limit 5;
