-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 09, 2023 at 02:43 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbtugaspbo`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbadmin`
--

CREATE TABLE `tbadmin` (
  `Username` varchar(25) NOT NULL,
  `Password` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbadmin`
--

INSERT INTO `tbadmin` (`Username`, `Password`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `tbdaftar`
--

CREATE TABLE `tbdaftar` (
  `Nama` varchar(25) NOT NULL,
  `Username` varchar(25) NOT NULL,
  `Password` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbdaftar`
--

INSERT INTO `tbdaftar` (`Nama`, `Username`, `Password`) VALUES
('fikri', 'fikri123', '123'),
('budi', 'budi', '123'),
('bayu', 'bayu12', '123');

-- --------------------------------------------------------

--
-- Table structure for table `tbsiswa`
--

CREATE TABLE `tbsiswa` (
  `id` int(11) NOT NULL,
  `Nis` varchar(25) NOT NULL,
  `Nama` varchar(25) NOT NULL,
  `Jenis_Kelamin` varchar(25) NOT NULL,
  `Tempat_lahir` varchar(25) NOT NULL,
  `Tanggal_lahir` varchar(25) NOT NULL,
  `Alamat` varchar(25) NOT NULL,
  `Nama_ayah` varchar(25) NOT NULL,
  `Nama_ibu` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbsiswa`
--

INSERT INTO `tbsiswa` (`id`, `Nis`, `Nama`, `Jenis_Kelamin`, `Tempat_lahir`, `Tanggal_lahir`, `Alamat`, `Nama_ayah`, `Nama_ibu`) VALUES
(1, '22371972', 'Fikri', 'Laki-Laki', 'Bontang', '24 april 2003', 'Pelabuhan 3', 'Adam', 'Nur aeni'),
(3, '37292937', 'Bayu', 'Laki-Laki', 'Balikpapan', '9 april 2001', 'AWS 7', 'Abdu', 'Rusi');

-- --------------------------------------------------------

--
-- Table structure for table `test`
--

CREATE TABLE `test` (
  `Username` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `test`
--

INSERT INTO `test` (`Username`) VALUES
('fikri123'),
('budi'),
('bayu12');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbsiswa`
--
ALTER TABLE `tbsiswa`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbsiswa`
--
ALTER TABLE `tbsiswa`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
