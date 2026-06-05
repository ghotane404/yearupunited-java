-- Examine the Products table. 
-- How does it identify the type (category) 
-- of each item sold? 
-- Write a query to list all of the 
-- seafood items we carry.

USE northwind;

SELECT ProductName

FROM Products

WHERE CategoryID = 8

;

--
-- SELECT product.ProductID
--      , product.ProductName
--      , CategoryName
--
-- FROM Products product
--
-- JOIN Categories category
--
-- ON product.CategoryID = category.CategoryID
--
-- WHERE category.CategoryName = 'Seafood'
--
-- ;



