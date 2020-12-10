CREATE DATABASE [AvonDB]
GO

USE [AvonDB]
GO

CREATE TABLE Customer(
    Customer_ID int NOT NULL IDENTITY(1,1),
    Customer_FirstName varchar(100),
    Customer_LastName varchar(100),
    Customer_Contact varchar(20),
    Customer_Address varchar(100),
    PRIMARY KEY(Customer_ID)
);

CREATE TABLE Suppliers(
    Supplier varchar(50),
    Supplier_Contact varchar(20),
    PRIMARY KEY(Supplier)
);


CREATE TABLE Products(
    Product_Code varchar(100),
    Product_Name varchar(100),
    Product_Category varchar(50),
    Product_Price smallmoney,
    Supplier varchar(50),
    PRIMARY KEY(Product_Code),
    FOREIGN KEY(Supplier) REFERENCES Suppliers(Supplier)
);


CREATE TABLE Transactions(
    Transaction_No int NOT NULL identity(1,1),
    Customer_ID int NOT NULL,
    Transaction_Date smalldatetime,
    PRIMARY KEY(Transaction_No),
    FOREIGN KEY(Customer_ID) REFERENCES Customer(Customer_ID)
);


CREATE TABLE [Transaction Details](
    Transaction_No int,
    Product_Code varchar(100),
    Qty int,
    Unit_Price smallmoney,
    Discount smallmoney,
    PRIMARY KEY(Transaction_No,Product_Code),
    FOREIGN KEY(Transaction_No) REFERENCES Transactions(Transaction_No),
    FOREIGN KEY(Product_Code) REFERENCES Products(Product_Code)
);
