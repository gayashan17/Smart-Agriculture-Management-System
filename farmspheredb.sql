-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 23, 2026 at 09:06 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `farmspheredb`
--

-- --------------------------------------------------------

--
-- Table structure for table `crops`
--

CREATE TABLE `crops` (
  `cropid` int(11) NOT NULL,
  `farmer_Id` int(11) NOT NULL,
  `crop_name` varchar(50) NOT NULL,
  `category` varchar(50) NOT NULL,
  `planting_date` date NOT NULL,
  `harvest_date` date NOT NULL,
  `land_size` varchar(100) NOT NULL,
  `quantity` varchar(100) NOT NULL,
  `status` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `crops`
--

INSERT INTO `crops` (`cropid`, `farmer_Id`, `crop_name`, `category`, `planting_date`, `harvest_date`, `land_size`, `quantity`, `status`) VALUES
(12, 4, 'Pumkin', 'Vegetables', '2026-05-11', '2026-05-30', '20Acres', '50kg', 'Harvested'),
(13, 7, 'Wheat', 'Grains', '2026-05-11', '2026-05-15', '22Acres', '200kg', 'Harvested'),
(14, 4, 'Carrots', 'Vegetables', '2026-04-01', '2026-07-15', '15Acres', '15.3kg', 'Growing'),
(15, 7, 'Rice', 'Grains', '2026-01-10', '2026-05-28', '40Acres', '1200kg', 'Ready to Harvest'),
(16, 4, 'Tomatoes', 'Vegetables', '2026-03-15', '2026-06-01', '5Acres', '50kg', 'Damaged'),
(17, 7, 'Maize', 'Grains', '2026-02-01', '2026-05-20', '10Acres', '450kg', 'Harvested');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `role` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `name`, `username`, `password`, `role`) VALUES
(4, 'Charindu Gayashan1', 'charindu', '123456', 'Farmer'),
(5, 'Malisha Madusith', 'mm17', 'm123456', 'Field Officer'),
(6, 'Naveen Naveen', 'naveen', 'n123456', 'Buyer'),
(7, 'Saman Wijeerathna', 'saman', '123456', 'Farmer');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `crops`
--
ALTER TABLE `crops`
  ADD PRIMARY KEY (`cropid`),
  ADD KEY `fk_farmer` (`farmer_Id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `crops`
--
ALTER TABLE `crops`
  MODIFY `cropid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `crops`
--
ALTER TABLE `crops`
  ADD CONSTRAINT `fk_farmer` FOREIGN KEY (`farmer_Id`) REFERENCES `users` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
