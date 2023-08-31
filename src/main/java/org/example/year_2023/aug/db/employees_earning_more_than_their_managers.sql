SELECT e.name as 'Employee'
FROM employee
         JOIN employee e ON employee.id = e.managerid
WHERE employee.salary < e.salary;