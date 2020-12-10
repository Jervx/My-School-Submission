use AvonDB
GO


insert into Customer(Customer_FirstName,Customer_LastName,Customer_Contact,Customer_Address)
values
('Elvira','Atinaja','09391456816','Quezon City'),
('Andrei','Quemado','09391812567','Caloocan City'),
('Ailyn','Gener','09382598395','Bulacan'),
('Arian','Sarte','09251927521','Caloocan City'),
('Russel','Viernes','09969318869','Caloocan City');

insert into Suppliers(Supplier,Supplier_Contact)
values
('Avon QC Branch','888-2130'),
('Avon Castro Branch','528-969'),
('Avon Makati Branch','330-525'),
('Avon Novaliches Branch','555-555');

insert into Products(Product_Code,Product_Name,Product_Category,Product_Price,Supplier)
values
('1334462','PAULA UW BRA 36B','Intimate Apparel',380.00,'Avon QC Branch'),
('1320468','ARIELLA UNDERWIRE BRA 36B','Intimate Apparel',380.00,'Avon Castro Branch'),
('1305515','BILLIE UNDERWIRE BRA 36B','Intimate Apparel',380.00,'Avon Makati Branch'),
('1347425','AC ROYAL JELLY HBL 750ML','Body & Toiletries',279.00,'Avon Novaliches Branch'),
('1257673','AVCARE ANTI-BACTERIAL BW250ML','Body & Toiletries',149.00,'Avon Castro Branch'),
('1370311','FF ULTRA GLUTA ROD 75ML','Feelin'' Fresh',99.00,'Avon QC Branch'),
('1306730','SSS KOJIC BAR SOAP 90G','Body & Toiletries',59.00,'Avon QC Branch'),
('1328053','FF CLSSC FLORAL ROD 40ML','Feelin'' Fresh',79.00,'Avon Makati Branch'),
('1334788','3PC KITCHEN TOOL SET','Home & Kitchen',299.00,'Avon Makati Branch'),
('1318537','KELVIN DIGITAL WATCH','Men''s Store',1099.00,'Avon Castro Branch');

insert into Transactions(Customer_ID,Transaction_Date)
values
(1,'2020-11-07 14:56:46'),
(2,'2020-11-04 9:33:05'),
(3,'2020-10-29 10:01:59'),
(4,'2020-10-23 17:09:15'),
(5,'2020-10-31 0:30:53');

insert into [Transaction Details](Transaction_No,Product_Code,Qty,Unit_Price,Discount)
values
(1,'1334462',1,380.00,380.00),
(1,'1320468',1,380.00,0.00),
(1,'1305515',1,380.00,0.00),
(2,'1347425',1,279.00,0.00),
(3,'1257673',1,149.00,0.00),
(3,'1370311',1,99.00,0.00),
(4,'1306730',1,59.00,0.00),
(4,'1328053',1,79.00,0.00),
(5,'1334788',1,299.00,0.00),
(5,'1318537',1,1099.00,0.00);
