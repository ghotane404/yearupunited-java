-- EXERCISE 2
-- 1. Add a new supplier.--
INSERT INTO Suppliers (SupplierID, CompanyName, ContactName, ContactTitle, Address, City, Region, PostalCode, Country, Phone, Fax, HomePage)
    VALUE (30, "Bleach", "Ichigo Kurosaki", "Soul Reaper", "3-8 Sakura Street", "Karakura", "Tokyo", "180-0001", "Japan", "+81-42-555-1234", "+81-42-555-1235", NULL);


-- 2. Add a new product provided by that supplier--
INSERT INTO Products (ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued)
VALUES(101, 'Ichigo Strawberry Juice', 30, 1, '12 bottles', 4.99, 75, 10, 15, 0);


-- 3. List all products and their suppliers. --
SELECT ProductName, Suppliers.CompanyName
FROM Products
         JOIN Suppliers
              ON Products.SupplierID = Suppliers.SupplierID
ORDER BY CompanyName ASC;


-- 4. Raise the price of your new product by 15%.--
UPDATE Products
SET UnitPrice = UnitPrice * 1.15
WHERE ProductID = 101;


-- 5. List the products and prices of all products from that supplier.--
SELECT ProductName
     , UnitPrice
FROM Products
         JOIN Suppliers
              ON Products.SupplierID = Suppliers.SupplierID
WHERE Suppliers.SupplierID = 30;


-- 6. Delete the new product.--
DELETE FROM Products
WHERE ProductID = 101;



-- 7. Delete the new supplier.--
DELETE FROM Suppliers
WHERE SupplierID = 30;



-- 8. List all products.--
SELECT *
FROM Products;



-- 9. List all suppliers.
SELECT *
FROM Suppliers;