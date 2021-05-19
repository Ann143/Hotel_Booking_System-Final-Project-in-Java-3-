-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 19, 2021 at 03:33 PM
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
(1, 'Pan', 10, 'Coke', 12, 22);

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
(94, '10', 'Air Condition', 'Single', 500, 'Not Booked'),
(95, '11', 'Air Condition', 'Single', 300, 'Not Booked');

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
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=45;

--
-- AUTO_INCREMENT for table `food`
--
ALTER TABLE `food`
  MODIFY `foodId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `room`
--
ALTER TABLE `room`
  MODIFY `RoomId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=96;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
