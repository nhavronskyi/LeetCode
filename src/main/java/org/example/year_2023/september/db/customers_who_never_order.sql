SELECT name AS 'Customers'
FROM customers c
         LEFT JOIN orders o on c.id = o.customerId
WHERE o.customerId IS NULL;