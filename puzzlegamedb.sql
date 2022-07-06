-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 04, 2022 at 07:45 AM
-- Server version: 10.4.16-MariaDB
-- PHP Version: 7.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `puzzlegamedb`
--

-- --------------------------------------------------------

--
-- Table structure for table `level1details`
--

CREATE TABLE `level1details` (
  `userID` int(11) NOT NULL,
  `time` int(11) NOT NULL,
  `clicks` int(11) NOT NULL,
  `status` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `level1details`
--

INSERT INTO `level1details` (`userID`, `time`, `clicks`, `status`) VALUES
(7, 9, 0, 'Completed');

-- --------------------------------------------------------

--
-- Table structure for table `level2details`
--

CREATE TABLE `level2details` (
  `userID` int(11) NOT NULL,
  `time` int(11) NOT NULL,
  `clicks` int(11) NOT NULL,
  `status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `level2details`
--

INSERT INTO `level2details` (`userID`, `time`, `clicks`, `status`) VALUES
(7, 12, 14, 'Completed');

-- --------------------------------------------------------

--
-- Table structure for table `level3details`
--

CREATE TABLE `level3details` (
  `userID` int(11) NOT NULL,
  `time` int(11) DEFAULT NULL,
  `clicks` int(11) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `level3details`
--

INSERT INTO `level3details` (`userID`, `time`, `clicks`, `status`) VALUES
(7, 9, 12, 'Completed');

-- --------------------------------------------------------

--
-- Table structure for table `level4details`
--

CREATE TABLE `level4details` (
  `userID` int(11) NOT NULL,
  `time` int(11) DEFAULT NULL,
  `clicks` int(11) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `level4details`
--

INSERT INTO `level4details` (`userID`, `time`, `clicks`, `status`) VALUES
(7, 9, 13, 'Completed');

-- --------------------------------------------------------

--
-- Table structure for table `level5details`
--

CREATE TABLE `level5details` (
  `userID` int(11) NOT NULL,
  `time` int(11) DEFAULT NULL,
  `clicks` int(11) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `level5details`
--

INSERT INTO `level5details` (`userID`, `time`, `clicks`, `status`) VALUES
(7, 8, 10, 'Completed');

-- --------------------------------------------------------

--
-- Table structure for table `level6details`
--

CREATE TABLE `level6details` (
  `userID` int(11) NOT NULL,
  `time` int(11) DEFAULT NULL,
  `clicks` int(11) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `level6details`
--

INSERT INTO `level6details` (`userID`, `time`, `clicks`, `status`) VALUES
(7, 8, 7, 'Completed');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `userID` int(11) NOT NULL,
  `email` varchar(50) NOT NULL,
  `PASSWORD` varchar(50) NOT NULL,
  `name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`userID`, `email`, `PASSWORD`, `name`) VALUES
(2, 'minjanaruwanpura1@gmail.com', 'hii', 'minjanaruwanpura'),
(7, 'minjanaruwanpura@gmail.com', 'MINJ', 'Minjana');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `level1details`
--
ALTER TABLE `level1details`
  ADD PRIMARY KEY (`userID`);

--
-- Indexes for table `level2details`
--
ALTER TABLE `level2details`
  ADD PRIMARY KEY (`userID`);

--
-- Indexes for table `level3details`
--
ALTER TABLE `level3details`
  ADD PRIMARY KEY (`userID`);

--
-- Indexes for table `level4details`
--
ALTER TABLE `level4details`
  ADD PRIMARY KEY (`userID`);

--
-- Indexes for table `level5details`
--
ALTER TABLE `level5details`
  ADD PRIMARY KEY (`userID`);

--
-- Indexes for table `level6details`
--
ALTER TABLE `level6details`
  ADD PRIMARY KEY (`userID`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`userID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `userID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
