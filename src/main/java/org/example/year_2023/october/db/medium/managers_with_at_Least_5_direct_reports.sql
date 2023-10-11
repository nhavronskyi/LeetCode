SELECT e2.name
FROM employee e1
         INNER JOIN employee e2
                    ON e1.managerId = e2.id
GROUP BY e1.managerId
HAVING COUNT(e1.id) >= 5