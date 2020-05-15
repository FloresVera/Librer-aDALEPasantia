-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: May 15, 2020 at 10:09 PM
-- Server version: 5.5.24-log
-- PHP Version: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `bd_ld`
--

-- --------------------------------------------------------

--
-- Table structure for table `clientes`
--

CREATE TABLE IF NOT EXISTS `clientes` (
  `cli_id` int(11) NOT NULL AUTO_INCREMENT,
  `cli_nombre` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `cli_ruc` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `cli_dv` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `cli_telefono` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `cli_dire` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `cli_ultima` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`cli_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=3 ;

-- --------------------------------------------------------

--
-- Table structure for table `detalle_venta`
--

CREATE TABLE IF NOT EXISTS `detalle_venta` (
  `deta_id` int(11) NOT NULL AUTO_INCREMENT,
  `deta_ven_id` int(11) NOT NULL,
  `deta_produ_id` int(11) NOT NULL,
  `deta_cantidad` int(11) NOT NULL,
  `deta_precio` int(11) NOT NULL,
  PRIMARY KEY (`deta_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `productos`
--

CREATE TABLE IF NOT EXISTS `productos` (
  `produ_id` int(11) NOT NULL AUTO_INCREMENT,
  `produ_nombre` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `produ_precio` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `produ_stock` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `produ_ultima` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`produ_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=4 ;

--
-- Dumping data for table `productos`
--

INSERT INTO `productos` (`produ_id`, `produ_nombre`, `produ_precio`, `produ_stock`, `produ_ultima`) VALUES
(1, 'Lapiz', '1500', '10', 'ale'),
(2, 'Boligrafo', '2000', '25', 'rosa'),
(3, 'Cuaderno', '5000', '10', 'ale');

-- --------------------------------------------------------

--
-- Table structure for table `usuarios`
--

CREATE TABLE IF NOT EXISTS `usuarios` (
  `usu_id` int(11) NOT NULL AUTO_INCREMENT,
  `usu_nombre` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `usu_email` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `usu_telefono` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `usu_user` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `usu_pass` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `usu_estado` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `usu_nivel` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `usu_ultima` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`usu_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=5 ;

--
-- Dumping data for table `usuarios`
--

INSERT INTO `usuarios` (`usu_id`, `usu_nombre`, `usu_email`, `usu_telefono`, `usu_user`, `usu_pass`, `usu_estado`, `usu_nivel`, `usu_ultima`) VALUES
(1, 'Alejandro Flores', 'alefloresvera04@gmail.com', '0985237297', 'ale', '123456', 'Activo', 'Administrador', 'ale');

-- --------------------------------------------------------

--
-- Table structure for table `ventas`
--

CREATE TABLE IF NOT EXISTS `ventas` (
  `ven_id` int(11) NOT NULL AUTO_INCREMENT,
  `ven_cli_id` int(11) NOT NULL,
  `ven_usu_id` int(11) NOT NULL,
  `ven_numero_venta` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `ven_fecha_venta` date NOT NULL,
  `ven_monto` int(11) NOT NULL,
  PRIMARY KEY (`ven_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=1 ;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
