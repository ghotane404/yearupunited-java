-- Examine the Products table. 
-- How do you know what supplier supplies 
-- each product? 

-- Write a query to list all the items 
-- that "Tokyo Traders" supplies to Northwind

USE northwind;

SELECT *

FROM Products product

JOIN Suppliers supplier

ON product.SupplierID = supplier.SupplierID

WHERE supplier.CompanyName = 'Tokyo Traders'

;