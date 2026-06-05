-- What is the price of the cheapest item that Northwind sells?

USE northwind;

SELECT MIN(UnitPrice)

FROM Products

;