# ************************************************************
# Sequel Pro SQL dump
# Versión 4529
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 127.0.0.1 (MySQL 5.5.5-10.1.11-MariaDB)
# Base de datos: empleados
# Tiempo de Generación: 2016-06-08 00:12:06 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Volcado de tabla salarios
# ------------------------------------------------------------

DROP TABLE IF EXISTS `salarios`;

CREATE TABLE `salarios` (
  `id` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `base` int(11) NOT NULL,
  `extras` int(11) NOT NULL,
  `vextra` int(11) NOT NULL,
  `comision` int(11) NOT NULL,
  `total` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `salarios` WRITE;
/*!40000 ALTER TABLE `salarios` DISABLE KEYS */;

INSERT INTO `salarios` (`id`, `nombre`, `base`, `extras`, `vextra`, `comision`, `total`)
VALUES
	(1,'jose ingeniero',1600000,2,30000,500000,3760000),
	(2,'berta arquitecto',2200000,1,50000,1000000,0),
	(3,'paola tecnico',1200000,8,30000,100000,0),
	(666,'barderson',546000,225699,6565,76,1481714011);

/*!40000 ALTER TABLE `salarios` ENABLE KEYS */;
UNLOCK TABLES;



/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
