-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 12, 2024 at 02:47 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `system`
--

-- --------------------------------------------------------

--
-- Table structure for table `administrator`
--

CREATE TABLE `administrator` (
  `id` int(255) NOT NULL,
  `First_Name` varchar(255) DEFAULT NULL,
  `Last_Name` varchar(255) DEFAULT NULL,
  `Email_Address` varchar(255) DEFAULT NULL,
  `Password` varchar(255) DEFAULT NULL,
  `Roles` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `administrator`
--

INSERT INTO `administrator` (`id`, `First_Name`, `Last_Name`, `Email_Address`, `Password`, `Roles`) VALUES
(1, 'Laxmi', 'Shrestha', 'Laxmi@gmail.com', 'Laxmi', 'Administrator');

-- --------------------------------------------------------

--
-- Table structure for table `modules`
--

CREATE TABLE `modules` (
  `id` int(255) NOT NULL,
  `module` varchar(255) DEFAULT NULL,
  `Course` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `modules`
--

INSERT INTO `modules` (`id`, `module`, `Course`) VALUES
(1, 'Concepts and Technologies of AI', 'BIT'),
(2, 'Numerical And Concurrency', 'BIT'),
(3, 'Object Oriented Programming', 'BIT'),
(4, 'Academic Skills and Team-based Learning', 'BIT'),
(5, 'Web Technologies', 'BIT'),
(6, 'Computational Mathematics', 'BIT'),
(7, 'Embedded System Programming', 'BIT'),
(8, 'Internet Software Architecture', 'BIT'),
(9, 'Introductory Programming And Problem Solving', 'BIT'),
(10, 'The Digital Business', 'BIBM'),
(12, 'Strategic Global Marketing ', 'IMBA');

-- --------------------------------------------------------

--
-- Table structure for table `result`
--

CREATE TABLE `result` (
  `id` int(255) NOT NULL,
  `Name` varchar(255) DEFAULT NULL,
  `Module` varchar(255) DEFAULT NULL,
  `Marks` decimal(65,0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `result`
--

INSERT INTO `result` (`id`, `Name`, `Module`, `Marks`) VALUES
(1, 'Merina', 'Academic Skills and Team-based Learning', 80),
(2, 'Merina', 'Internet Software Architecture', 85),
(3, 'Anjali', 'Web Technologies', 70),
(4, 'Anjali', 'Fundamentals of Computing', 80),
(5, 'Shrisha', 'Web Technologies', 80);

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `id` int(100) NOT NULL,
  `First_Name` varchar(100) DEFAULT NULL,
  `Last_Name` varchar(100) DEFAULT NULL,
  `Email_Address` varchar(100) DEFAULT NULL,
  `Password` varchar(100) DEFAULT NULL,
  `Roles` varchar(100) DEFAULT NULL,
  `Course` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`id`, `First_Name`, `Last_Name`, `Email_Address`, `Password`, `Roles`, `Course`) VALUES
(1, 'Merina', 'Shrestha', 'merina@gmail.com', 'merina', 'Student', 'BIT '),
(5, 'Shrisha ', 'Tuladhar', 'Shrisha@gmail.com', 'Shrisha', 'Student', 'BIT '),
(6, 'Anjali ', 'Gurung', 'Anjali@gmail.com', 'Anjali', 'Student', 'BIBM'),
(7, 'Rachana', 'Thapa', 'Rachana@gmail.com', 'Rachana', 'Student', 'IMBA'),
(8, 'Bishaka', 'Gurung', 'Bishaka@gmail.com', 'bishaka', 'Student', 'IMBA'),
(9, 'Abhilasha', 'Subedi', 'Abhilasha@gmail.com', 'Abhilasha', 'Student', 'BIBM'),
(10, 'Sunita', 'Ghale', 'Sunita@gmail.com', NULL, 'Student', 'IMBA'),
(11, 'Anita', 'Adhikari', 'Anita@gmail.com', NULL, 'Student', 'IMBA');

-- --------------------------------------------------------

--
-- Table structure for table `teacher`
--

CREATE TABLE `teacher` (
  `id` int(255) NOT NULL,
  `First_Name` varchar(255) DEFAULT NULL,
  `Last_Name` varchar(255) DEFAULT NULL,
  `Email_Address` varchar(255) DEFAULT NULL,
  `Password` varchar(255) DEFAULT NULL,
  `Roles` varchar(255) DEFAULT NULL,
  `Module` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `teacher`
--

INSERT INTO `teacher` (`id`, `First_Name`, `Last_Name`, `Email_Address`, `Password`, `Roles`, `Module`) VALUES
(1, 'Subash', 'Bista', 'Subash@gmail.com', 'Subash', 'Teacher', 'Object Oriented Programming'),
(2, 'Anil ', 'Pandeya', 'Anil@gmail.com', 'Anil', 'Teacher', 'Numerical Methods and Concurrency'),
(3, 'Sagun', 'Thapa', 'Sagun@gmail.com', 'Sagun', 'Teacher', 'Internet Software Architecture'),
(4, 'Dipesh', 'Shrestha', 'Dipesh@gmail.com', 'Dipesh', 'Teacher', 'Academic Skills and Team-based Learning');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `administrator`
--
ALTER TABLE `administrator`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `modules`
--
ALTER TABLE `modules`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `result`
--
ALTER TABLE `result`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `teacher`
--
ALTER TABLE `teacher`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `administrator`
--
ALTER TABLE `administrator`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `modules`
--
ALTER TABLE `modules`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `result`
--
ALTER TABLE `result`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `teacher`
--
ALTER TABLE `teacher`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
