SELECT name
FROM customer
where referee_id is null
   OR referee_id != 2;