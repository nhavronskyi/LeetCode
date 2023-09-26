SELECT unique_id, name
FROM employees
         LEFT JOIN employeeuni
                   USING (id)