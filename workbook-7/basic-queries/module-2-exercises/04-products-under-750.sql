-- what are all the products that we carry
-- where the unit price is under 7.50
-- include id, name and price

USE northwind;

SELECT ProductID
     , ProductName
     , UnitPrice

FROM Products

WHERE UnitPrice < 7.50

;