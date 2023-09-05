-- https://leetcode.com/problems/duplicate-emails/
SELECT email Email
FROM Person
GROUP BY email
HAVING count(email) > 1;