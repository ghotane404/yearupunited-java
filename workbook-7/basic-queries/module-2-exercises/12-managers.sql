-- What employees have "manager" in their titles?

USE northwind;

SELECT FirstName
     , LastName

FROM Employees

WHERE Title

LIKE '%manager%'
;