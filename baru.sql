-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 11, 2019 at 10:31 AM
-- Server version: 10.1.32-MariaDB
-- PHP Version: 7.2.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `baru`
--

-- --------------------------------------------------------

--
-- Table structure for table `absen`
--

CREATE TABLE `absen` (
  `id_absen` varchar(50) NOT NULL,
  `tgl` date NOT NULL,
  `peserta` varchar(50) NOT NULL,
  `masuk` varchar(50) NOT NULL,
  `keluar` varchar(50) NOT NULL,
  `keterangan` varchar(50) NOT NULL,
  `unit` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `absen`
--

INSERT INTO `absen` (`id_absen`, `tgl`, `peserta`, `masuk`, `keluar`, `keterangan`, `unit`) VALUES
('cab11120-dd9a-4d4e-9f79-3b1997acca24', '2019-03-11', 'ruhyat@gmail.com', '14:36:59', '14:37:21', 'hallo world', 'Instansi Pengembangan Sistem Informasi');

-- --------------------------------------------------------

--
-- Table structure for table `daftar`
--

CREATE TABLE `daftar` (
  `id_calon` varchar(50) NOT NULL,
  `univ_id` varchar(50) NOT NULL,
  `jurusan` varchar(50) NOT NULL,
  `pendidikan` varchar(50) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `email` varchar(50) NOT NULL,
  `dari` date NOT NULL,
  `sampai` date NOT NULL,
  `hasil` varchar(11) NOT NULL,
  `unit` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `daftar`
--

INSERT INTO `daftar` (`id_calon`, `univ_id`, `jurusan`, `pendidikan`, `jumlah`, `email`, `dari`, `sampai`, `hasil`, `unit`) VALUES
('2b5b82d9-9cc7-4565-bba6-ade8766d361e', 'UNIVERSITAS MUHAMMADIYAH SUMATERA BARAT', 'Sistem Informasi', 'S1', 4, 'diki@gmail.com', '2019-03-01', '2019-03-09', 'sudah', 'Instansi Pengembangan Sistem Informasi'),
('5114a7a2-1a8e-4e3d-934b-3845257c6611', 'Universitas Indraprasta PGRI', 'Teknik Informatika', 'S1', 6, 'm.r1zky@ovi.com', '2019-02-01', '2019-03-01', 'sudah', 'instansi pengembangan system informasi'),
('5dc72487-409e-4085-b35b-216eec507964', 'UNIVERSITAS MUHAMMADIYAH PONOROGO', 'Teknik Sipil', 'S1', 3, 'tes@gmail.com', '2019-03-01', '2019-03-14', 'sudah', 'instansi administrasi perkantoran'),
('c608feb4-6cde-43b0-99d3-4b20f291aade', 'Universitas Budi Luhur', 'Teknik Industri', 'S1', 3, 'acer@acer.com', '2019-02-01', '2019-03-02', 'sudah', 'Instansi Multimedia'),
('da517e14-afe6-472f-8cd9-4a0b822dbb93', 'Universitas Gajah Mada', 'Sistem Informasi', 'S1', 3, 'fifa@gmial.com', '2019-03-01', '2019-03-08', 'tolak', 'Instansi Pengembangan Sistem Informasi');

-- --------------------------------------------------------

--
-- Table structure for table `daftarulang`
--

CREATE TABLE `daftarulang` (
  `id_calon` varchar(50) NOT NULL,
  `id_peserta` varchar(50) NOT NULL,
  `nama_peserta` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `tgllahir` date NOT NULL,
  `telepon` varchar(50) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `univ_id` varchar(50) NOT NULL,
  `jurusan` varchar(50) NOT NULL,
  `tingkatpendidikan` varchar(50) NOT NULL,
  `unit` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `daftarulang`
--

INSERT INTO `daftarulang` (`id_calon`, `id_peserta`, `nama_peserta`, `email`, `tgllahir`, `telepon`, `alamat`, `univ_id`, `jurusan`, `tingkatpendidikan`, `unit`) VALUES
('2b5b82d9-9cc7-4565-bba6-ade8766d361e', '045ed486-5e43-4aef-8efb-1e6b22256692', 'ruhyat', 'ruhyat@gmail.com', '1997-08-17', '345355456', 'bekasi', 'UNIVERSITAS MUHAMMADIYAH SUMATERA BARAT', 'Sistem Informasi', 'S1', 'Instansi Pengembangan Sistem Informasi'),
('5114a7a2-1a8e-4e3d-934b-3845257c6611', '7c106851-2fea-423d-8e43-ce2b759201ed', 'Muhamad RIzky', 'rizkykiki18@gmail.com', '1997-07-23', '085715553987', 'citayem', 'Universitas Indraprasta PGRI', 'Teknik Informatika', 'S1', 'instansi pengembangan system informasi'),
('5dc72487-409e-4085-b35b-216eec507964', 'b0cf7049-4948-4f5a-8db2-c7a4bfc8d34f', 'tes anggota nih', 't@ymail.com', '1997-08-17', '5354', 'fdvd', 'UNIVERSITAS MUHAMMADIYAH PONOROGO', 'Teknik Sipil', 'S1', 'instansi administrasi perkantoran'),
('c608feb4-6cde-43b0-99d3-4b20f291aade', 'febd7c69-3094-4e4e-b2eb-38d8191b7c7e', 'hello', 'hello@gmail.com', '2019-03-20', '434535', 'bekasi', 'Universitas Budi Luhur', 'Teknik Industri', 'S1', 'Instansi Multimedia');

-- --------------------------------------------------------

--
-- Table structure for table `loginadmin`
--

CREATE TABLE `loginadmin` (
  `id_user` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `kewenangan` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `loginadmin`
--

INSERT INTO `loginadmin` (`id_user`, `username`, `password`, `kewenangan`) VALUES
('c608feb4-6cde-43b0-99d3-4b20f291aade', 'acer@acer.com', 'clnpklbkn', '4'),
('d716f769-d6a9-4234-98b0-b949c684dd6e', 'acerlah@gmail.com', 'bknpkl', '1'),
('', 'admin@admin.com', 'admin', '2'),
('2b5b82d9-9cc7-4565-bba6-ade8766d361e', 'diki@gmail.com', 'clnpklbkn', '4'),
('da517e14-afe6-472f-8cd9-4a0b822dbb93', 'fifa@gmial.com', 'clnpklbkn', '4'),
('febd7c69-3094-4e4e-b2eb-38d8191b7c7e', 'hello@gmail.com', 'bknpkl', '1'),
('informasi', 'informasi@bkn.com', 'informasi', '3'),
('5114a7a2-1a8e-4e3d-934b-3845257c6611', 'm.r1zky@ovi.com', 'clnpklbkn', '4'),
('multimedia', 'multimedia@bkn.com', 'multimedia', '3'),
('kantor', 'perkantoran@bkn.com', 'perkantoran', '3'),
('7c106851-2fea-423d-8e43-ce2b759201ed', 'rizkykiki18@gmail.com', 'bknpkl', '1'),
('045ed486-5e43-4aef-8efb-1e6b22256692', 'ruhyat@gmail.com', 'bknpkl', '1'),
('b0cf7049-4948-4f5a-8db2-c7a4bfc8d34f', 't@ymail.com', 'bknpkl', '1'),
('5dc72487-409e-4085-b35b-216eec507964', 'tes@gmail.com', 'clnpklbkn', '4');

-- --------------------------------------------------------

--
-- Table structure for table `nilai`
--

CREATE TABLE `nilai` (
  `id_anggota` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `unit` varchar(50) NOT NULL,
  `disiplin` int(11) NOT NULL,
  `absen` int(11) NOT NULL,
  `tatatertib` int(11) NOT NULL,
  `keterampilan` int(11) NOT NULL,
  `kualitas_hasil` int(11) NOT NULL,
  `tanggungjawab` int(11) NOT NULL,
  `bersosialisasi` int(11) NOT NULL,
  `kerjasama` int(11) NOT NULL,
  `kerajinan` int(11) NOT NULL,
  `etika` int(11) NOT NULL,
  `penampilan` int(11) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `rata` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `nilai`
--

INSERT INTO `nilai` (`id_anggota`, `email`, `unit`, `disiplin`, `absen`, `tatatertib`, `keterampilan`, `kualitas_hasil`, `tanggungjawab`, `bersosialisasi`, `kerjasama`, `kerajinan`, `etika`, `penampilan`, `jumlah`, `rata`) VALUES
('045ed486-5e43-4aef-8efb-1e6b22256692', 'ruhyat@gmail.com', 'Instansi Pengembangan Sistem Informasi', 60, 90, 70, 80, 70, 70, 90, 70, 70, 80, 90, 840, 76),
('7c106851-2fea-423d-8e43-ce2b759201ed', 'rizkykiki18@gmail.com', 'instansi pengembangan system informasi', 90, 90, 80, 70, 90, 80, 70, 80, 90, 70, 100, 910, 82),
('b0cf7049-4948-4f5a-8db2-c7a4bfc8d34f', 't@ymail.com', 'instansi administrasi perkantoran', 70, 80, 90, 60, 80, 90, 80, 80, 90, 60, 65, 845, 76),
('febd7c69-3094-4e4e-b2eb-38d8191b7c7e', 'hello@gmail.com', 'Instansi Multimedia', 90, 80, 90, 90, 80, 40, 80, 90, 50, 50, 60, 800, 72);

-- --------------------------------------------------------

--
-- Table structure for table `univ`
--

CREATE TABLE `univ` (
  `univ_id` varchar(50) NOT NULL,
  `nama` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `univ`
--

INSERT INTO `univ` (`univ_id`, `nama`) VALUES
('u1', 'Universitas Indraprasta PGRI'),
('u2', 'Universitas Indonesia'),
('u3', 'Universitas Pacasila');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `absen`
--
ALTER TABLE `absen`
  ADD PRIMARY KEY (`id_absen`),
  ADD UNIQUE KEY `masuk` (`masuk`),
  ADD KEY `id_peserta` (`peserta`);

--
-- Indexes for table `daftar`
--
ALTER TABLE `daftar`
  ADD PRIMARY KEY (`id_calon`),
  ADD KEY `jurusan` (`jurusan`),
  ADD KEY `pendidikan` (`pendidikan`),
  ADD KEY `univ_id` (`univ_id`),
  ADD KEY `univ_id_2` (`univ_id`),
  ADD KEY `jurusan_2` (`jurusan`),
  ADD KEY `pendidikan_2` (`pendidikan`),
  ADD KEY `univ_id_3` (`univ_id`,`jurusan`,`pendidikan`),
  ADD KEY `univ_id_4` (`univ_id`);

--
-- Indexes for table `daftarulang`
--
ALTER TABLE `daftarulang`
  ADD PRIMARY KEY (`id_peserta`);

--
-- Indexes for table `loginadmin`
--
ALTER TABLE `loginadmin`
  ADD PRIMARY KEY (`username`),
  ADD KEY `kewenangan` (`kewenangan`);

--
-- Indexes for table `nilai`
--
ALTER TABLE `nilai`
  ADD UNIQUE KEY `id_anggota` (`id_anggota`);

--
-- Indexes for table `univ`
--
ALTER TABLE `univ`
  ADD PRIMARY KEY (`univ_id`),
  ADD KEY `univ_id` (`univ_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
