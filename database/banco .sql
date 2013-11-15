-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         5.6.13 - MySQL Community Server (GPL)
-- SO del servidor:              Win64
-- HeidiSQL Versión:             8.0.0.4396
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Volcando estructura de base de datos para banco
CREATE DATABASE IF NOT EXISTS `banco` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `banco`;


-- Volcando estructura para tabla banco.cuentabancaria
CREATE TABLE IF NOT EXISTS `cuentabancaria` (
  `idCuentaBancaria` int(10) NOT NULL,
  `sucursalBancaria` varchar(50) DEFAULT NULL,
  `numeroCuenta` varchar(50) DEFAULT NULL,
  `dc` varchar(50) DEFAULT NULL,
  `saldo` varchar(50) DEFAULT NULL,
  `cif` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idCuentaBancaria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.


-- Volcando estructura para tabla banco.entidadbancaria
CREATE TABLE IF NOT EXISTS `entidadbancaria` (
  `idEntidadBancaria` int(10) NOT NULL,
  `codigoEntidad` varchar(50) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `cif` varchar(50) NOT NULL,
  `tipoEntidadBancaria` varchar(50) NOT NULL,
  PRIMARY KEY (`idEntidadBancaria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.


-- Volcando estructura para tabla banco.movimientobancario
CREATE TABLE IF NOT EXISTS `movimientobancario` (
  `idMovimientoBancario` int(10) NOT NULL,
  `tipoMovimientoBancario` varchar(50) DEFAULT NULL,
  `importe` varchar(50) DEFAULT NULL,
  `fecha` varchar(50) DEFAULT NULL,
  `saldoTotal` varchar(50) DEFAULT NULL,
  `concepto` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idMovimientoBancario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.


-- Volcando estructura para tabla banco.sucursalbancaria
CREATE TABLE IF NOT EXISTS `sucursalbancaria` (
  `idSucursalBancaria` int(10) DEFAULT NULL,
  `entidadBancaria` varchar(50) DEFAULT NULL,
  `codigoSucursal` varchar(50) DEFAULT NULL,
  `nombre` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
entidadbancaria