-- What employees have a salary 
-- that is between $200 0 and $2500?

USE northwind;

SELECT FirstName
     , LastName
     , Salary

FROM Employees

WHERE Salary

BETWEEN 2000 AND 2500

;