-- What is the average price of items that Northwind sells?

USE northwind;

SELECT AVG(UnitPrice * UnitsOnOrder)

FROM Products

;

-- '186.72077922'