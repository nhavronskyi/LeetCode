SELECT firstname, lastname, address.city, address.state
FROM person
         LEFT JOIN address ON person.personid = address.personid;
