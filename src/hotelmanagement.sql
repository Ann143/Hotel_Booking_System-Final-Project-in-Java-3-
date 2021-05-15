-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 15, 2021 at 08:59 AM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 7.4.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hotelmanagement`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `Id` int(11) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `MobileNumber` varchar(15) NOT NULL,
  `Nationality` varchar(20) NOT NULL,
  `Gender` varchar(10) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `IdType` varchar(20) NOT NULL,
  `IdNumber` int(50) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `CheckIn` varchar(50) NOT NULL,
  `RoomNumber` varchar(10) NOT NULL,
  `Bed` varchar(200) NOT NULL,
  `roomType` varchar(50) NOT NULL,
  `pricePerDay` int(10) NOT NULL,
  `NumberOfDaysStay` int(10) NOT NULL,
  `TotalAmount` varchar(200) DEFAULT NULL,
  `CheckOut` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`Id`, `Name`, `MobileNumber`, `Nationality`, `Gender`, `Email`, `IdType`, `IdNumber`, `Address`, `CheckIn`, `RoomNumber`, `Bed`, `roomType`, `pricePerDay`, `NumberOfDaysStay`, `TotalAmount`, `CheckOut`) VALUES
(30, 'Ann Telez', '09229265447', 'Filipino', 'Female', 'ann@gmail.com', 'SchoolId', 19104915, 'Nasipit Talamban', '2021/05/10', '2', 'Triple', 'Air Condition', 900, 3, '2700.0', '2021/05/10'),
(35, 'Ann Telez', '09229265447', 'Filipino', 'Female', 'ann@gmail.com', 'School ID', 19104915, 'Nasipit Talamban', '2021/05/12', '01', 'Single', 'Air Condition', 200, 3, '600.0', '2021/05/12'),
(36, 'Judy Ann Arquisal', '0945738453', 'Filipino', 'Female', 'judy@gmail.com', 'School ID', 19104918, 'Talamban', '2021/05/12', '04', 'Single', 'Air Condition', 400, 2, '800.0', '2021/05/12');

-- --------------------------------------------------------

--
-- Table structure for table `food`
--

CREATE TABLE `food` (
  `foodId` int(11) NOT NULL,
  `foodName` varchar(100) NOT NULL,
  `foodPrice` int(11) NOT NULL,
  `drinkName` varchar(100) NOT NULL,
  `drinkPrice` int(11) NOT NULL,
  `total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `food`
--

INSERT INTO `food` (`foodId`, `foodName`, `foodPrice`, `drinkName`, `drinkPrice`, `total`) VALUES
(1, 'Pan', 10, 'Coke', 12, 22),
(5, 'Fried chiken with 2 cups of rice', 150, 'Coke', 15, 165);

-- --------------------------------------------------------

--
-- Table structure for table `room`
--

CREATE TABLE `room` (
  `RoomId` int(11) NOT NULL,
  `RoomNumber` varchar(20) NOT NULL,
  `RoomType` varchar(20) NOT NULL,
  `Bed` varchar(20) NOT NULL,
  `Price` int(10) NOT NULL,
  `Status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `room`
--

INSERT INTO `room` (`RoomId`, `RoomNumber`, `RoomType`, `Bed`, `Price`, `Status`) VALUES
(79, '01', 'Air Condition', 'Single', 300, 'Not Booked'),
(81, '02', 'Air Condition', 'Double', 1000, 'Not Booked'),
(83, '03', 'Air Condition', 'Triple', 2500, 'Not Booked'),
(85, '04', 'Air Condition', 'Single', 600, 'Not Booked'),
(88, '05', 'Not Air Condition', 'Double', 400, 'Not Booked'),
(89, '06', 'Air Condition', 'Triple', 3000, 'Not Booked'),
(91, '07', 'Air Condition', 'Single', 300, 'Not Booked'),
(92, '08', 'Not Air Condition', 'Double', 800, 'Not Booked'),
(93, '09', 'Air Condition', 'Triple', 2500, 'Not Booked'),
(94, '10', 'Air Condition', 'Single', 500, 'Not Booked');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `food`
--
ALTER TABLE `food`
  ADD PRIMARY KEY (`foodId`);

--
-- Indexes for table `room`
--
ALTER TABLE `room`
  ADD PRIMARY KEY (`RoomId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=38;

--
-- AUTO_INCREMENT for table `food`
--
ALTER TABLE `food`
  MODIFY `foodId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `room`
--
ALTER TABLE `room`
  MODIFY `RoomId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=95;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
