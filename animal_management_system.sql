-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3307
-- Generation Time: Apr 15, 2022 at 01:11 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `animal_management_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `ai_monitoring`
--

CREATE TABLE `ai_monitoring` (
  `AIID` int(11) NOT NULL,
  `AnimalID` int(11) DEFAULT NULL,
  `AIDate` varchar(30) DEFAULT NULL,
  `AIRemarks` varchar(50) DEFAULT NULL,
  `PregnancyTestDate` varchar(30) DEFAULT NULL,
  `ExpectedDeliveryDate` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ai_monitoring`
--

INSERT INTO `ai_monitoring` (`AIID`, `AnimalID`, `AIDate`, `AIRemarks`, `PregnancyTestDate`, `ExpectedDeliveryDate`) VALUES
(10, 11, 'Feb 21 2020', 'Perfect Timing', 'April 21 2021', 'Nov 21 2020'),
(20, 11, 'Aug 11 2021', 'Successful Insemination', '10 10 2021', 'May 11 2022');

-- --------------------------------------------------------

--
-- Table structure for table `animal`
--

CREATE TABLE `animal` (
  `AnimalID` int(11) NOT NULL,
  `FarmerID` int(11) DEFAULT NULL,
  `AnimalControlNumber` varchar(30) DEFAULT NULL,
  `AnimalType` varchar(30) DEFAULT NULL,
  `AnimalGender` varchar(30) DEFAULT NULL,
  `BreedDescription` varchar(50) DEFAULT NULL,
  `DateofBirth` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `animal`
--

INSERT INTO `animal` (`AnimalID`, `FarmerID`, `AnimalControlNumber`, `AnimalType`, `AnimalGender`, `BreedDescription`, `DateofBirth`) VALUES
(11, 1, 'D11', 'Dairy', 'Female', 'Hybrid Danish Freshian', 'Nov 15 2017'),
(22, 2, 'BF22', 'Beef', 'Male', 'Argentine Bull', 'July 12 2019');

-- --------------------------------------------------------

--
-- Table structure for table `animal_production`
--

CREATE TABLE `animal_production` (
  `ProductionID` int(11) NOT NULL,
  `AnimalID` int(11) DEFAULT NULL,
  `ProductionType` varchar(30) DEFAULT NULL,
  `ProductionDate` varchar(50) DEFAULT NULL,
  `ProductionQuantity` varchar(30) DEFAULT NULL,
  `ProductionRemarks` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `animal_production`
--

INSERT INTO `animal_production` (`ProductionID`, `AnimalID`, `ProductionType`, `ProductionDate`, `ProductionQuantity`, `ProductionRemarks`) VALUES
(1000, 11, 'Milk', 'Sept 18 2021', '15 Gallons', 'Remarkable yield'),
(2000, 22, 'Beef', 'Sep 5 2021', '800 Pounds', 'Above average yield.');

-- --------------------------------------------------------

--
-- Table structure for table `deworming_monitoring`
--

CREATE TABLE `deworming_monitoring` (
  `DewormingID` int(11) NOT NULL,
  `AnimalID` int(11) DEFAULT NULL,
  `DewormingDate` varchar(30) DEFAULT NULL,
  `DewormingRemarks` varchar(50) DEFAULT NULL,
  `NextDewormingDate` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `deworming_monitoring`
--

INSERT INTO `deworming_monitoring` (`DewormingID`, `AnimalID`, `DewormingDate`, `DewormingRemarks`, `NextDewormingDate`) VALUES
(1111, 22, 'Jul 20 2020', 'Well timed', 'Oct 20 2020'),
(2222, 22, 'Oct 19 2020', 'Dewormed a day early', 'Jan 20 2021');

-- --------------------------------------------------------

--
-- Table structure for table `farmer`
--

CREATE TABLE `farmer` (
  `FarmerID` int(11) NOT NULL,
  `FarmerName` varchar(50) DEFAULT NULL,
  `PhysicalAddress` varchar(50) DEFAULT NULL,
  `City` varchar(30) NOT NULL,
  `State` varchar(30) NOT NULL,
  `ZipCode` varchar(30) NOT NULL,
  `PhoneNumber` varchar(50) DEFAULT NULL,
  `EmailAddress` varchar(50) DEFAULT NULL,
  `Username` varchar(30) DEFAULT NULL,
  `Password` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `farmer`
--

INSERT INTO `farmer` (`FarmerID`, `FarmerName`, `PhysicalAddress`, `City`, `State`, `ZipCode`, `PhoneNumber`, `EmailAddress`, `Username`, `Password`) VALUES
(1, 'Roland Mendel', '305 - 14th Ave. S.', 'Seattle', 'Washington BB', '98128', '(206) 555-4112', 'rolandmendel@gmail.com', 'rolamende', 'rolamende'),
(2, 'Paula Wilson', '2817 Milton Dr.', 'Albuquerque', 'New Mexico', '87110', '(505) 555-5939', 'wilsonpaula@yahoo.com', 'paulwils', 'pawi2022');

-- --------------------------------------------------------

--
-- Table structure for table `treatment_monitoring`
--

CREATE TABLE `treatment_monitoring` (
  `TreatmentID` int(11) NOT NULL,
  `AnimalID` int(11) DEFAULT NULL,
  `TreatmentDate` varchar(30) DEFAULT NULL,
  `TreatmentDescription` varchar(50) DEFAULT NULL,
  `DiseaseTreated` varchar(30) DEFAULT NULL,
  `TreatmentComments` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `treatment_monitoring`
--

INSERT INTO `treatment_monitoring` (`TreatmentID`, `AnimalID`, `TreatmentDate`, `TreatmentDescription`, `DiseaseTreated`, `TreatmentComments`) VALUES
(100, 11, 'Sep 17 2020', 'Severe Ticks Infestation', 'East Coast Fever', 'The animal would recover'),
(200, 22, 'Jan 9 2020', 'Tse tse Fly parasites', 'Trypanasomiasis', 'Animal is stable');

-- --------------------------------------------------------

--
-- Table structure for table `vaccine_monitoring`
--

CREATE TABLE `vaccine_monitoring` (
  `VaccineID` int(11) NOT NULL,
  `AnimalID` int(11) DEFAULT NULL,
  `VaccinationDate` varchar(30) DEFAULT NULL,
  `VaccinationType` varchar(30) DEFAULT NULL,
  `VaccineRemarks` varchar(50) DEFAULT NULL,
  `NextVaccinationDate` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `vaccine_monitoring`
--

INSERT INTO `vaccine_monitoring` (`VaccineID`, `AnimalID`, `VaccinationDate`, `VaccinationType`, `VaccineRemarks`, `NextVaccinationDate`) VALUES
(111, 22, 'Sep 27 2020', 'Anthrax', 'Timely Vaccinated', 'March 27 2021'),
(222, 22, 'Dec 15 2019', 'Foot and Mouth', 'A healthy animal', 'Dec 15 2020');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `ai_monitoring`
--
ALTER TABLE `ai_monitoring`
  ADD PRIMARY KEY (`AIID`),
  ADD KEY `AI_Monitoring_FK` (`AnimalID`);

--
-- Indexes for table `animal`
--
ALTER TABLE `animal`
  ADD PRIMARY KEY (`AnimalID`),
  ADD KEY `Animal_FK` (`FarmerID`);

--
-- Indexes for table `animal_production`
--
ALTER TABLE `animal_production`
  ADD PRIMARY KEY (`ProductionID`),
  ADD KEY `Animal_Production_FK` (`AnimalID`);

--
-- Indexes for table `deworming_monitoring`
--
ALTER TABLE `deworming_monitoring`
  ADD PRIMARY KEY (`DewormingID`),
  ADD KEY `Deworming_Monitoring_FK` (`AnimalID`);

--
-- Indexes for table `farmer`
--
ALTER TABLE `farmer`
  ADD PRIMARY KEY (`FarmerID`);

--
-- Indexes for table `treatment_monitoring`
--
ALTER TABLE `treatment_monitoring`
  ADD PRIMARY KEY (`TreatmentID`),
  ADD KEY `Treatment_Monitoring_FK` (`AnimalID`);

--
-- Indexes for table `vaccine_monitoring`
--
ALTER TABLE `vaccine_monitoring`
  ADD PRIMARY KEY (`VaccineID`),
  ADD KEY `Vaccine_Monitoring_FK` (`AnimalID`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `ai_monitoring`
--
ALTER TABLE `ai_monitoring`
  ADD CONSTRAINT `AI_Monitoring_FK` FOREIGN KEY (`AnimalID`) REFERENCES `animal` (`AnimalID`);

--
-- Constraints for table `animal`
--
ALTER TABLE `animal`
  ADD CONSTRAINT `Animal_FK` FOREIGN KEY (`FarmerID`) REFERENCES `farmer` (`FarmerID`);

--
-- Constraints for table `animal_production`
--
ALTER TABLE `animal_production`
  ADD CONSTRAINT `Animal_Production_FK` FOREIGN KEY (`AnimalID`) REFERENCES `animal` (`AnimalID`);

--
-- Constraints for table `deworming_monitoring`
--
ALTER TABLE `deworming_monitoring`
  ADD CONSTRAINT `Deworming_Monitoring_FK` FOREIGN KEY (`AnimalID`) REFERENCES `animal` (`AnimalID`);

--
-- Constraints for table `treatment_monitoring`
--
ALTER TABLE `treatment_monitoring`
  ADD CONSTRAINT `Treatment_Monitoring_FK` FOREIGN KEY (`AnimalID`) REFERENCES `animal` (`AnimalID`);

--
-- Constraints for table `vaccine_monitoring`
--
ALTER TABLE `vaccine_monitoring`
  ADD CONSTRAINT `Vaccine_Monitoring_FK` FOREIGN KEY (`AnimalID`) REFERENCES `animal` (`AnimalID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
