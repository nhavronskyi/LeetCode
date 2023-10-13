SELECT s.user_id, round(avg(if(c.action = "confirmed", 1, 0)), 2) confirmation_rate
FROM signups s
         LEFT JOIN confirmations c ON s.user_id = c.user_id
GROUP BY user_id;