
USE [ProjectPRJ]
GO
/****** Object:  Table [dbo].[category]    Script Date: 22/3/2022 2:38:34 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[category](
	[id_cat] [int] NOT NULL,
	[name_cat] [varchar](255) NULL,
	[describe] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[id_cat] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Order]    Script Date: 22/3/2022 2:38:34 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Order](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[account_id] [int] NULL,
	[created_date] [date] NULL,
	[totalmoney] [money] NULL,
 CONSTRAINT [PK_Order] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[OrderLine]    Script Date: 22/3/2022 2:38:34 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[OrderLine](
	[oid] [int] NOT NULL,
	[pid] [int] NOT NULL,
	[quantity] [float] NOT NULL,
	[price] [float] NOT NULL,
	[FirstName] [varchar](255) NULL,
	[LastName] [varchar](255) NULL,
	[Phone] [varchar](255) NULL,
	[Address] [varchar](255) NULL,
 CONSTRAINT [PK_OrderLine] PRIMARY KEY CLUSTERED 
(
	[oid] ASC,
	[pid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[product]    Script Date: 22/3/2022 2:38:34 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[product](
	[id_pro] [int] NOT NULL,
	[id_cat] [int] NULL,
	[name_pro] [varchar](255) NULL,
	[images] [varchar](255) NULL,
	[quantity] [tinyint] NULL,
	[price] [float] NULL,
	[supplier] [varchar](255) NULL,
	[infor] [varchar](255) NULL,
	[sell_ID] [int] NULL,
 CONSTRAINT [PK__product__6FC9A86CB980CD38] PRIMARY KEY CLUSTERED 
(
	[id_pro] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[user]    Script Date: 22/3/2022 2:38:34 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[user](
	[id_user] [int] NOT NULL,
	[username] [varchar](255) NULL,
	[password] [varchar](255) NULL,
	[dob] [date] NULL,
	[gender] [varchar](255) NULL,
	[email] [varchar](255) NULL,
	[phone] [varchar](255) NULL,
	[address] [varchar](255) NULL,
	[role] [varchar](255) NULL,
	[block] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id_user] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[category] ([id_cat], [name_cat], [describe]) VALUES (1, N'MACBOOK', N'LapTop')
INSERT [dbo].[category] ([id_cat], [name_cat], [describe]) VALUES (2, N'ASUS ', N'LapTop')
INSERT [dbo].[category] ([id_cat], [name_cat], [describe]) VALUES (3, N'DELL', N'LapTop')
INSERT [dbo].[category] ([id_cat], [name_cat], [describe]) VALUES (4, N'LENOVO', N'LapTop')
GO
SET IDENTITY_INSERT [dbo].[Order] ON 

INSERT [dbo].[Order] ([id], [account_id], [created_date], [totalmoney]) VALUES (32, 14, CAST(N'2022-03-03' AS Date), 1000.0000)
INSERT [dbo].[Order] ([id], [account_id], [created_date], [totalmoney]) VALUES (33, 14, CAST(N'2022-03-03' AS Date), 1000.0000)
INSERT [dbo].[Order] ([id], [account_id], [created_date], [totalmoney]) VALUES (34, 14, CAST(N'2022-03-04' AS Date), 2.4780)
INSERT [dbo].[Order] ([id], [account_id], [created_date], [totalmoney]) VALUES (35, 14, CAST(N'2022-03-04' AS Date), 3000.0000)
INSERT [dbo].[Order] ([id], [account_id], [created_date], [totalmoney]) VALUES (36, 14, CAST(N'2022-03-04' AS Date), 2.4780)
INSERT [dbo].[Order] ([id], [account_id], [created_date], [totalmoney]) VALUES (37, 14, CAST(N'2022-03-04' AS Date), 4.9560)
INSERT [dbo].[Order] ([id], [account_id], [created_date], [totalmoney]) VALUES (38, 14, CAST(N'2022-03-04' AS Date), 4000.0000)
INSERT [dbo].[Order] ([id], [account_id], [created_date], [totalmoney]) VALUES (39, 14, CAST(N'2022-03-04' AS Date), 2.4780)
INSERT [dbo].[Order] ([id], [account_id], [created_date], [totalmoney]) VALUES (40, 14, CAST(N'2022-03-04' AS Date), 8000.0000)
INSERT [dbo].[Order] ([id], [account_id], [created_date], [totalmoney]) VALUES (41, 14, CAST(N'2022-03-07' AS Date), 3000.0000)
INSERT [dbo].[Order] ([id], [account_id], [created_date], [totalmoney]) VALUES (42, 14, CAST(N'2022-03-08' AS Date), 1000.0000)
INSERT [dbo].[Order] ([id], [account_id], [created_date], [totalmoney]) VALUES (43, 456, CAST(N'2022-03-08' AS Date), 1000.0000)
INSERT [dbo].[Order] ([id], [account_id], [created_date], [totalmoney]) VALUES (44, 13, CAST(N'2022-03-12' AS Date), 2600.0000)
INSERT [dbo].[Order] ([id], [account_id], [created_date], [totalmoney]) VALUES (45, 456, CAST(N'2022-03-12' AS Date), 1001.2390)
INSERT [dbo].[Order] ([id], [account_id], [created_date], [totalmoney]) VALUES (46, 14, CAST(N'2022-03-15' AS Date), 1500.0000)
INSERT [dbo].[Order] ([id], [account_id], [created_date], [totalmoney]) VALUES (47, 13, CAST(N'2022-03-15' AS Date), 1200.0000)
INSERT [dbo].[Order] ([id], [account_id], [created_date], [totalmoney]) VALUES (48, 14, CAST(N'2022-03-19' AS Date), 1315.7800)
SET IDENTITY_INSERT [dbo].[Order] OFF
GO
INSERT [dbo].[OrderLine] ([oid], [pid], [quantity], [price], [FirstName], [LastName], [Phone], [Address]) VALUES (32, 1003, 1, 1000, N'Bui', N'Linh', N'0987654321', N'Vinh Phuc')
INSERT [dbo].[OrderLine] ([oid], [pid], [quantity], [price], [FirstName], [LastName], [Phone], [Address]) VALUES (33, 1003, 1, 1000, N'Ngoc', N'a', N'0987654321', N'Phu Tho')
INSERT [dbo].[OrderLine] ([oid], [pid], [quantity], [price], [FirstName], [LastName], [Phone], [Address]) VALUES (34, 5001, 6, 1.239, N'Bui', N'Linh', N'0987654321', N'Phu Tho')
INSERT [dbo].[OrderLine] ([oid], [pid], [quantity], [price], [FirstName], [LastName], [Phone], [Address]) VALUES (35, 1010, 6, 1500, N'Bui', N'v', N'0987654321', N'Vinh Phuc')
INSERT [dbo].[OrderLine] ([oid], [pid], [quantity], [price], [FirstName], [LastName], [Phone], [Address]) VALUES (36, 5001, 6, 1.239, N'Bui', N'Linh', N'0987654321', N'Phu Tho')
INSERT [dbo].[OrderLine] ([oid], [pid], [quantity], [price], [FirstName], [LastName], [Phone], [Address]) VALUES (37, 5001, 6, 1.239, N'Bui', N'a', N'0987654321', N'Phu Tho')
INSERT [dbo].[OrderLine] ([oid], [pid], [quantity], [price], [FirstName], [LastName], [Phone], [Address]) VALUES (38, 5004, 46, 2000, N'Ngoc', N'a', N'0987654321', N'Phu Tho')
INSERT [dbo].[OrderLine] ([oid], [pid], [quantity], [price], [FirstName], [LastName], [Phone], [Address]) VALUES (39, 5001, 2, 1.239, N'Ngoc', N'a', N'0987654321', N'Phu Tho')
INSERT [dbo].[OrderLine] ([oid], [pid], [quantity], [price], [FirstName], [LastName], [Phone], [Address]) VALUES (40, 5004, 4, 2000, N'Ngoc', N'a', N'0987654321', N'Phu Tho')
INSERT [dbo].[OrderLine] ([oid], [pid], [quantity], [price], [FirstName], [LastName], [Phone], [Address]) VALUES (41, 1003, 3, 1000, N'Bui', N'Duong', N'12345678', N'Phu Tho')
INSERT [dbo].[OrderLine] ([oid], [pid], [quantity], [price], [FirstName], [LastName], [Phone], [Address]) VALUES (42, 1003, 1, 1000, N'Ngoc', N'Duong', N'0987654321', N'Phu Tho')
INSERT [dbo].[OrderLine] ([oid], [pid], [quantity], [price], [FirstName], [LastName], [Phone], [Address]) VALUES (43, 5006, 1, 1000, N'Bui Thai', N'Duong', N'0978765472', N'Phu Tho')
INSERT [dbo].[OrderLine] ([oid], [pid], [quantity], [price], [FirstName], [LastName], [Phone], [Address]) VALUES (45, 1003, 1, 1000, N'Ngoc', N'a', N'0987654321', N'Phu Tho')
INSERT [dbo].[OrderLine] ([oid], [pid], [quantity], [price], [FirstName], [LastName], [Phone], [Address]) VALUES (45, 5001, 1, 1.239, N'Ngoc', N'a', N'0987654321', N'Phu Tho')
INSERT [dbo].[OrderLine] ([oid], [pid], [quantity], [price], [FirstName], [LastName], [Phone], [Address]) VALUES (46, 1010, 1, 1500, N'Bui', N'Duong', N'098762123', N'Phu Tho')
INSERT [dbo].[OrderLine] ([oid], [pid], [quantity], [price], [FirstName], [LastName], [Phone], [Address]) VALUES (47, 5005, 1, 1200, N'Bui', N'a', N'0987654321', N'Vinh Phuc')
INSERT [dbo].[OrderLine] ([oid], [pid], [quantity], [price], [FirstName], [LastName], [Phone], [Address]) VALUES (48, 1008, 2, 657.89, N'Ngoc', N'Duong', N'0987654321', N'Phu Tho')
GO
INSERT [dbo].[product] ([id_pro], [id_cat], [name_pro], [images], [quantity], [price], [supplier], [infor], [sell_ID]) VALUES (1003, 2, N'Asus Zenbook UX325EA', N'https://image.cellphones.com.vn/358x/media/catalog/product/l/a/laptop-asus-zenbook-ux325ea-kg656w-1.jpg', 0, 1000, N'FPT', N'14.0 inch, 1920 x 1080 Pixel, IPS, 60 Hz, 400 nits, Anti-glare LED-backlit

Intel, Core i5, 1135G7

8 GB, LPDDR4X, 3200 MHz

SSD 512 GB', 14)
INSERT [dbo].[product] ([id_pro], [id_cat], [name_pro], [images], [quantity], [price], [supplier], [infor], [sell_ID]) VALUES (1008, 4, N' Lenovo Legion 5 15ACH6', N'https://cellphones.com.vn/media/catalog/product/l/a/laptop-lenovo-legion-5-15ach6-82jw0037vn-1.jpg', 8, 657.89, N'Amazon', N'HD Touch Screen Laptop;10th Gen Quad-Core Intel Core i5-1035G1 (Beat i7-8550U);12GB DDR4 RAM, 256GB PCIE SSD, Bundled with Woov Sleeve, Webcam, Windows 10, Grey', 664)
INSERT [dbo].[product] ([id_pro], [id_cat], [name_pro], [images], [quantity], [price], [supplier], [infor], [sell_ID]) VALUES (1010, 1, N'Macbook Air M1', N'https://cdn.tgdd.vn/Files/2021/09/26/1385726/7a_1280x720-800-resize.jpg', 59, 1500, N'Apple', N'FHD 144Hz 5ms Gaming Laptop Computer;Intel Hexa-Core i7-9750H up to 4.5GHz, 32GB DDR4 RAM, 1TB PCIe SSD;NVIDIA GeForce GTX 1650, RGB', 664)
INSERT [dbo].[product] ([id_pro], [id_cat], [name_pro], [images], [quantity], [price], [supplier], [infor], [sell_ID]) VALUES (5001, 1, N'Macbook Apple M1', N'https://hoanghamobile.com/Uploads/2020/09/23/Macbook%20Pro%2013%20inch%20(2020)%20with%20Touch%20bar-100.jpg', 60, 1239, N'Apple', N'2020 Apple MacBook Pro with Apple M1 Chip (13-inch, 8GB RAM, 256GB SSD Storage) - Space Gray', 664)
INSERT [dbo].[product] ([id_pro], [id_cat], [name_pro], [images], [quantity], [price], [supplier], [infor], [sell_ID]) VALUES (5004, 1, N'Apple MacBook Air', N'images\mb3.jpg', 41, 2000, N'Amazon', N'
2020 Apple MacBook Air with Apple M1 Chip (13-inch, 8GB RAM, 256GB SSD Storage) - Gold', 18)
INSERT [dbo].[product] ([id_pro], [id_cat], [name_pro], [images], [quantity], [price], [supplier], [infor], [sell_ID]) VALUES (5005, 2, N'Asus ROG Strix Gaming', N'https://laptopaz.vn/media/product/1754_asus_g731_vev089t_i7_9750h_16gb_512_ssd_rtx2060_6g_17_3_fhd_144hz_win_10_39240_1.jpg', 9, 1200, N'Amazon', N'15.6 inch, 1920 x 1080 Pixel, IPS, 144 Hz, 250 nits, Anti-glare LED-backlit

AMD, Ryzen 7, 4800H

8 GB, DDR4, 3200 MHz', 13)
INSERT [dbo].[product] ([id_pro], [id_cat], [name_pro], [images], [quantity], [price], [supplier], [infor], [sell_ID]) VALUES (5006, 2, N'ROG Gaming', N'images\as2.jpg', 4, 1000, N'Microsoft', N' Intel Hexa-Core i7-9750H Up to 4.5GHz| 32GB DDR4;1TB HDD + 512GB SSD| 15.6" FHD;NVIDIA GeForce GTX 1650;', 664)
INSERT [dbo].[product] ([id_pro], [id_cat], [name_pro], [images], [quantity], [price], [supplier], [infor], [sell_ID]) VALUES (5009, 3, N'DH231 Lap', N'https://cdn.pico.vn/Product/41886/medium_363857_img7605.jpg', 12, 1300, N'Apple', N'OK', 664)
INSERT [dbo].[product] ([id_pro], [id_cat], [name_pro], [images], [quantity], [price], [supplier], [infor], [sell_ID]) VALUES (5010, 3, N'DPro _LJ2', N'https://laptopg7.vn/images/thumbnails/300/300/detailed/102/Surface-Laptop-top-04-02-1621503997.png', 12, 1121, N'Apple', N'That will  be fine', 664)
INSERT [dbo].[product] ([id_pro], [id_cat], [name_pro], [images], [quantity], [price], [supplier], [infor], [sell_ID]) VALUES (10001, 4, N'Lenovo S540', N'images\l3.jpg', 10, 2000, N'Amazon', N'15.6", 1920 x 1080 Pixel, IPS, 60 Hz, 300 nits, LED-backlit

Intel Core i5-10210U

8 GB, DDR4, 2400 MHz

SSD 512 GB

Geforce MX250 2GB', 13)
INSERT [dbo].[product] ([id_pro], [id_cat], [name_pro], [images], [quantity], [price], [supplier], [infor], [sell_ID]) VALUES (10004, 1, N'Apple MacBook Pro', N'images\mb4.jpg', 15, 230, N'Amazon', N'2019 Apple MacBook Pro (16-inch, 16GB RAM, 1TB Storage, 2.3GHz Intel Core i9) - Silver', 13)
INSERT [dbo].[product] ([id_pro], [id_cat], [name_pro], [images], [quantity], [price], [supplier], [infor], [sell_ID]) VALUES (10007, 1, N'MacBook Air 2020', N'https://macone.vn/wp-content/uploads/2020/11/Macbook-Air-2020-ARM.png', 10, 2252, N'Apple', N'13.3 inch, 2560 x 1600 Pixel, IPS, IPS LCD LED Backlit, True Tone

Apple, M1

8 GB, LPDDR4

SSD 256 GB', 13)
INSERT [dbo].[product] ([id_pro], [id_cat], [name_pro], [images], [quantity], [price], [supplier], [infor], [sell_ID]) VALUES (10009, 4, N'Lenovo Yoga', N'https://laptopaz.vn/media/lib/1965_6367802_sd.jpg', 25, 1222, N'VinGroup', N'14.0 inch, 1920 x 1080 Pixel, IPS, 300 nits, IPS LCD

AMD, Ryzen 5, 5600U

8 GB, LPDDR4X, 4266 MHz

SSD 512 GB', 13)
INSERT [dbo].[product] ([id_pro], [id_cat], [name_pro], [images], [quantity], [price], [supplier], [infor], [sell_ID]) VALUES (10018, 1, N'M37', N'https://media.istockphoto.com/photos/macbook-pro-16-inch-with-touchbar-front-view-picture-id1202959798?s=170667a', 24, 2000, N'Apple', N'Nice Product', 664)
INSERT [dbo].[product] ([id_pro], [id_cat], [name_pro], [images], [quantity], [price], [supplier], [infor], [sell_ID]) VALUES (100011, 4, N'Lenovo IdeaPad 330', N'https://cdn.nguyenkimmall.com/images/detailed/724/10049049-laptop-lenovo-ideapad-3-14itl6-i3-1115g4-14-inch-82h700dnvn-1_2qns-0w.jpg', 0, 990, N'Apple', N'15.6 inch, 1920 x 1080 Pixel, TN, 60 Hz, 250 nits, Anti-glare LED-backlit

Ryzen 3, 5300U

8 GB, DDR4, 3200 MHz

SSD 512 GB', 13)
GO
INSERT [dbo].[user] ([id_user], [username], [password], [dob], [gender], [email], [phone], [address], [role], [block]) VALUES (13, N'duc', N'123', CAST(N'2000-01-04' AS Date), N'Male', N'duc123@gmail.com', N'0323473641', N'Hai Duong', N'2', 0)
INSERT [dbo].[user] ([id_user], [username], [password], [dob], [gender], [email], [phone], [address], [role], [block]) VALUES (14, N'linh', N'123', CAST(N'1997-02-04' AS Date), N'Female', N'linh12@gmail.com', N'0383437423', N'Hung Yen-My Hao', N'1', 0)
INSERT [dbo].[user] ([id_user], [username], [password], [dob], [gender], [email], [phone], [address], [role], [block]) VALUES (21, N'test', N'test', CAST(N'2015-05-04' AS Date), N'Male', N'duche1@gmail.com', N'0962491151', N'hochiminh', N'2', 0)
INSERT [dbo].[user] ([id_user], [username], [password], [dob], [gender], [email], [phone], [address], [role], [block]) VALUES (74, N'hai', N'123aq', CAST(N'2003-07-08' AS Date), N'Male', N'hailt@fpt.edu.vn', N'0246757372', N'Ha Noi', N'2', 0)
INSERT [dbo].[user] ([id_user], [username], [password], [dob], [gender], [email], [phone], [address], [role], [block]) VALUES (90, N'duylong', N'123', CAST(N'0013-01-10' AS Date), N'Male', N'longdt@gmail.com', N'0228374831', N'Hai Phong', N'2', 0)
INSERT [dbo].[user] ([id_user], [username], [password], [dob], [gender], [email], [phone], [address], [role], [block]) VALUES (239, N'cham', N'123', CAST(N'2011-12-12' AS Date), N'Female', N'cham@fpt.edu.vn', N'0356645824', N'Ninh Binh', N'3', 0)
INSERT [dbo].[user] ([id_user], [username], [password], [dob], [gender], [email], [phone], [address], [role], [block]) VALUES (321, N'trinh', N'456', CAST(N'2010-12-11' AS Date), N'Male', N'trang@1gmail.com', N'036888929', N'Nam Dinh', N'3', 1)
INSERT [dbo].[user] ([id_user], [username], [password], [dob], [gender], [email], [phone], [address], [role], [block]) VALUES (456, N'duong', N'12345', CAST(N'0007-10-21' AS Date), N'Male', N'duong@gmail.com', N'0987654321', N'Viet Tri', N'1', 0)
INSERT [dbo].[user] ([id_user], [username], [password], [dob], [gender], [email], [phone], [address], [role], [block]) VALUES (487, N'linhdan', N'123', CAST(N'2003-05-16' AS Date), N'Female', N'linhdan123@gmail.com', N'0224582375', N'An Giang', N'2', 0)
INSERT [dbo].[user] ([id_user], [username], [password], [dob], [gender], [email], [phone], [address], [role], [block]) VALUES (664, N'nam', N'123', CAST(N'0019-12-19' AS Date), N'Male', N'hue@gmail.com', N'022458237711', N'Yen Bai', N'2', 0)
INSERT [dbo].[user] ([id_user], [username], [password], [dob], [gender], [email], [phone], [address], [role], [block]) VALUES (775, N'men', N'123', CAST(N'2018-02-07' AS Date), N'Male', N'men@gmail.com', N'0356645824', N'Bac Giang', N'2', 0)
GO
ALTER TABLE [dbo].[Order] ADD  CONSTRAINT [DF_Order_created_date_1]  DEFAULT (getdate()) FOR [created_date]
GO
ALTER TABLE [dbo].[Order]  WITH CHECK ADD  CONSTRAINT [FK_Order_user] FOREIGN KEY([account_id])
REFERENCES [dbo].[user] ([id_user])
GO
ALTER TABLE [dbo].[Order] CHECK CONSTRAINT [FK_Order_user]
GO
ALTER TABLE [dbo].[OrderLine]  WITH CHECK ADD  CONSTRAINT [FK_OrderLine_Order] FOREIGN KEY([oid])
REFERENCES [dbo].[Order] ([id])
GO
ALTER TABLE [dbo].[OrderLine] CHECK CONSTRAINT [FK_OrderLine_Order]
GO
ALTER TABLE [dbo].[OrderLine]  WITH CHECK ADD  CONSTRAINT [FK_OrderLine_Product] FOREIGN KEY([pid])
REFERENCES [dbo].[product] ([id_pro])
GO
ALTER TABLE [dbo].[OrderLine] CHECK CONSTRAINT [FK_OrderLine_Product]
GO
ALTER TABLE [dbo].[product]  WITH CHECK ADD  CONSTRAINT [FK__product__id_cat__30F848ED] FOREIGN KEY([id_cat])
REFERENCES [dbo].[category] ([id_cat])
GO
ALTER TABLE [dbo].[product] CHECK CONSTRAINT [FK__product__id_cat__30F848ED]
GO
USE [master]
GO
ALTER DATABASE [ProjectPRJ] SET  READ_WRITE 
GO
