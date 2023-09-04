CREATE DATABASE  IF NOT EXISTS `mydb` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `mydb`;
-- MySQL dump 10.13  Distrib 8.0.26, for macos11 (x86_64)
--
-- Host: localhost    Database: mydb
-- ------------------------------------------------------
-- Server version	8.0.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(10) COLLATE utf8mb4_0900_as_ci DEFAULT NULL,
  `email` varchar(30) COLLATE utf8mb4_0900_as_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11606 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_as_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1,'fff',NULL),(2,'batch_1',NULL),(3,'batch_2',NULL),(4,'batch_3',NULL),(5,'batch_4',NULL),(6,'batch_5',NULL),(7,'batch_6',NULL),(8,'batch_7',NULL),(9,'batch_8',NULL),(10,'batch_9',NULL),(11,'batch_10',NULL),(12,'batch_11',NULL),(13,'batch_12',NULL),(14,'batch_13',NULL),(15,'batch_14',NULL),(16,'batch_15',NULL),(17,'batch_16',NULL),(18,'batch_17',NULL),(19,'batch_18',NULL),(20,'batch_19',NULL),(21,'batch_20',NULL),(22,'batch_21',NULL),(23,'batch_22',NULL),(24,'batch_23',NULL),(25,'batch_24',NULL),(26,'batch_25',NULL),(27,'batch_26',NULL),(28,'batch_27',NULL),(29,'batch_28',NULL),(30,'batch_29',NULL),(31,'batch_30',NULL),(32,'batch_31',NULL),(33,'batch_32',NULL),(34,'batch_33',NULL),(35,'batch_34',NULL),(36,'batch_35',NULL),(37,'batch_36',NULL),(38,'batch_37',NULL),(39,'batch_38',NULL),(40,'batch_39',NULL),(41,'batch_40',NULL),(42,'batch_41',NULL),(43,'batch_42',NULL),(44,'batch_43',NULL),(45,'batch_44',NULL),(46,'batch_45',NULL),(47,'batch_46',NULL),(48,'batch_47',NULL),(49,'batch_48',NULL),(50,'batch_49',NULL),(51,'batch_0',NULL),(52,'batch_1',NULL),(53,'batch_2',NULL),(54,'batch_3',NULL),(55,'batch_4',NULL),(56,'batch_5',NULL),(57,'batch_6',NULL),(58,'batch_7',NULL),(59,'batch_8',NULL),(60,'batch_9',NULL),(61,'batch_10',NULL),(62,'batch_11',NULL),(63,'batch_12',NULL),(64,'batch_13',NULL),(65,'batch_14',NULL),(66,'batch_15',NULL),(67,'batch_16',NULL),(68,'batch_17',NULL),(69,'batch_18',NULL),(70,'batch_19',NULL),(71,'batch_20',NULL),(72,'batch_21',NULL),(73,'batch_22',NULL),(74,'batch_23',NULL),(75,'batch_24',NULL),(76,'batch_25',NULL),(77,'batch_26',NULL),(78,'batch_27',NULL),(79,'batch_28',NULL),(80,'batch_29',NULL),(81,'batch_30',NULL),(82,'batch_31',NULL),(83,'batch_32',NULL),(84,'batch_33',NULL),(85,'batch_34',NULL),(86,'batch_35',NULL),(87,'batch_36',NULL),(88,'batch_37',NULL),(89,'batch_38',NULL),(90,'batch_39',NULL),(91,'batch_40',NULL),(92,'batch_41',NULL),(93,'batch_42',NULL),(94,'batch_43',NULL),(95,'batch_44',NULL),(96,'batch_45',NULL),(97,'batch_46',NULL),(98,'batch_47',NULL),(99,'batch_48',NULL),(100,'batch_49',NULL),(101,'Ted','ted@gmail.com'),(102,'Ted','ted@gmail.com'),(103,'Ted','ted@gmail.com'),(104,'Ted','ted@gmail.com'),(105,'Ted','ted@gmail.com'),(106,'Ted','ted@gmail.com'),(107,'Ted','ted@gmail.com'),(108,'Ted','ted@gmail.com'),(109,'Ted','ted@gmail.com'),(110,'Ted','ted@gmail.com'),(111,'Ted','ted@gmail.com'),(112,'Ted','ted@gmail.com'),(10115,'qqiq','qqiq@gmail.com'),(10116,'tiger12','tiger12@gmail.com'),(10117,'tiger11','tiger11@gmail.com'),(11087,'James','james@hotmail.com'),(11088,'David','david@hotmail.com'),(11089,'Tom','tom@hotmail.com'),(11090,'Ted','ted@gmail.com');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `id_card`
--

DROP TABLE IF EXISTS `id_card`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `id_card` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_number` varchar(255) COLLATE utf8mb4_0900_as_ci DEFAULT NULL,
  `issue_date` datetime(6) DEFAULT NULL,
  `valid` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=135 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_as_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `id_card`
--

LOCK TABLES `id_card` WRITE;
/*!40000 ALTER TABLE `id_card` DISABLE KEYS */;
INSERT INTO `id_card` VALUES (1,'B12345678','2023-08-25 17:00:00.491000',1),(2,'682932742','2023-08-25 16:59:41.644000',1),(3,'999999','2023-08-31 10:16:44.200000',1),(4,'999999','2023-08-31 11:14:56.704000',1),(5,'999999','2023-08-31 11:28:36.602000',1),(6,'999999','2023-08-31 13:08:38.843000',1),(7,'999999','2023-08-31 13:09:11.589000',1),(8,'999999','2023-08-31 13:09:44.973000',1),(9,'999999','2023-08-31 13:12:09.747000',1),(10,'999999','2023-08-31 13:12:10.183000',1),(11,'999999','2023-08-31 13:12:10.546000',1),(12,'999999','2023-08-31 13:12:10.903000',1),(13,'999999','2023-08-31 13:12:11.187000',1),(14,'999999','2023-08-31 13:12:11.501000',1),(15,'999999','2023-08-31 13:12:11.800000',1),(16,'999999','2023-08-31 13:12:12.055000',1),(17,'999999','2023-08-31 13:12:12.330000',1),(18,'999999','2023-08-31 13:12:12.586000',1),(19,'999999','2023-08-31 13:12:12.951000',1),(20,'999999','2023-08-31 13:12:13.333000',1),(21,'999999','2023-08-31 13:12:13.599000',1),(22,'999999','2023-08-31 13:12:13.831000',1),(23,'999999','2023-08-31 13:12:14.072000',1),(24,'999999','2023-08-31 13:12:14.375000',1),(25,'999999','2023-08-31 13:12:14.724000',1),(26,'999999','2023-08-31 13:12:14.951000',1),(27,'999999','2023-08-31 13:12:15.231000',1),(28,'999999','2023-08-31 13:12:15.580000',1),(29,'999999','2023-08-31 13:12:15.827000',1),(30,'999999','2023-08-31 13:12:16.004000',1),(31,'999999','2023-08-31 13:12:16.186000',1),(32,'999999','2023-08-31 13:12:16.380000',1),(33,'999999','2023-08-31 13:12:16.579000',1),(34,'999999','2023-08-31 13:12:16.753000',1),(35,'999999','2023-08-31 13:12:16.892000',1),(36,'999999','2023-08-31 13:12:17.045000',1),(37,'999999','2023-08-31 13:12:17.225000',1),(38,'999999','2023-08-31 13:12:17.439000',1),(39,'999999','2023-08-31 13:12:17.657000',1),(40,'999999','2023-08-31 13:12:18.010000',1),(41,'999999','2023-08-31 13:12:18.195000',1),(42,'999999','2023-08-31 13:12:18.354000',1),(43,'999999','2023-08-31 13:12:18.500000',1),(44,'999999','2023-08-31 13:12:18.682000',1),(45,'999999','2023-08-31 13:12:18.824000',1),(46,'999999','2023-08-31 13:12:18.988000',1),(47,'999999','2023-08-31 13:12:19.142000',1),(48,'999999','2023-08-31 13:12:19.300000',1),(49,'999999','2023-08-31 13:12:19.467000',1),(50,'999999','2023-08-31 13:12:19.615000',1),(51,'999999','2023-08-31 13:12:19.774000',1),(52,'999999','2023-08-31 13:12:20.165000',1),(53,'999999','2023-08-31 13:12:20.385000',1),(54,'999999','2023-08-31 13:12:20.533000',1),(55,'999999','2023-08-31 13:12:20.659000',1),(56,'999999','2023-08-31 13:12:20.771000',1),(57,'999999','2023-08-31 13:12:20.936000',1),(58,'999999','2023-08-31 13:12:21.067000',1),(59,'999999','2023-08-31 13:12:21.233000',1),(60,'999999','2023-08-31 13:12:21.502000',1),(61,'999999','2023-08-31 13:12:21.725000',1),(62,'999999','2023-08-31 13:12:21.842000',1),(63,'999999','2023-08-31 13:12:21.991000',1),(64,'999999','2023-08-31 13:12:22.097000',1),(65,'999999','2023-08-31 13:12:22.216000',1),(66,'999999','2023-08-31 13:12:22.346000',1),(67,'999999','2023-08-31 13:12:22.480000',1),(68,'999999','2023-08-31 13:12:22.601000',1),(69,'999999','2023-08-31 13:12:22.742000',1),(70,'999999','2023-08-31 13:12:23.016000',1),(71,'999999','2023-08-31 13:12:23.137000',1),(72,'999999','2023-08-31 13:12:23.277000',1),(73,'999999','2023-08-31 13:12:23.444000',1),(74,'999999','2023-08-31 13:12:23.618000',1),(75,'999999','2023-08-31 13:12:23.718000',1),(76,'999999','2023-08-31 13:12:23.813000',1),(77,'999999','2023-08-31 13:12:23.923000',1),(78,'999999','2023-08-31 13:12:24.085000',1),(79,'999999','2023-08-31 13:12:24.195000',1),(80,'999999','2023-08-31 13:12:24.309000',1),(81,'999999','2023-08-31 13:12:24.424000',1),(82,'999999','2023-08-31 13:12:24.522000',1),(83,'999999','2023-08-31 13:12:24.624000',1),(84,'999999','2023-08-31 13:12:24.740000',1),(85,'999999','2023-08-31 13:12:24.873000',1),(86,'999999','2023-08-31 13:12:24.982000',1),(87,'999999','2023-08-31 13:12:25.102000',1),(88,'999999','2023-08-31 13:12:25.324000',1),(89,'999999','2023-08-31 13:12:25.547000',1),(90,'999999','2023-08-31 13:12:25.732000',1),(91,'999999','2023-08-31 13:12:25.838000',1),(92,'999999','2023-08-31 13:12:25.937000',1),(93,'999999','2023-08-31 13:12:26.057000',1),(94,'999999','2023-08-31 13:12:26.205000',1),(95,'999999','2023-08-31 13:12:26.443000',1),(96,'999999','2023-08-31 13:12:26.636000',1),(97,'999999','2023-08-31 13:12:26.762000',1),(98,'999999','2023-08-31 13:12:26.866000',1),(99,'999999','2023-08-31 13:12:26.970000',1),(100,'999999','2023-08-31 13:12:27.051000',1),(101,'999999','2023-08-31 13:12:27.155000',1),(102,'999999','2023-08-31 13:12:27.251000',1),(103,'999999','2023-08-31 13:12:27.346000',1),(104,'999999','2023-08-31 13:12:27.486000',1),(105,'999999','2023-08-31 13:12:27.616000',1),(106,'999999','2023-08-31 13:12:27.729000',1),(107,'999999','2023-08-31 13:12:27.830000',1),(108,'999999','2023-08-31 13:12:27.931000',1),(109,'999999','2023-08-31 13:12:28.038000',1),(110,'999999','2023-08-31 13:17:36.623000',1),(111,'999999','2023-08-31 13:17:37.051000',1),(112,'999999','2023-08-31 13:17:37.409000',1),(113,'999999','2023-08-31 13:17:37.774000',1),(114,'999999','2023-08-31 13:17:38.084000',1),(115,'999999','2023-08-31 13:17:38.390000',1),(116,'999999','2023-08-31 13:17:38.691000',1),(117,'999999','2023-08-31 13:17:38.946000',1),(118,'999999','2023-08-31 13:17:39.227000',1),(119,'999999','2023-08-31 13:17:39.558000',1),(120,'999999','2023-08-31 13:17:39.872000',1),(121,'999999','2023-08-31 13:17:40.274000',1),(122,'999999','2023-08-31 13:17:40.555000',1),(123,'999999','2023-08-31 13:17:40.790000',1),(124,'999999','2023-08-31 13:17:41.040000',1),(125,'999999','2023-08-31 13:17:41.242000',1),(126,'999999','2023-08-31 13:17:41.482000',1),(127,'999999','2023-08-31 13:17:41.668000',1),(128,'999999','2023-08-31 13:17:42.002000',1),(129,'999999','2023-08-31 13:17:42.348000',1),(130,'999999','2023-08-31 13:59:39.964000',1),(131,'999999','2023-08-31 14:12:17.514000',1),(132,'999999','2023-08-31 14:28:58.473000',1),(133,'999999','2023-08-31 15:01:39.131000',1),(134,'999999','2023-08-31 15:08:34.378000',1);
/*!40000 ALTER TABLE `id_card` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `owner`
--

DROP TABLE IF EXISTS `owner`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `owner` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8mb4_0900_as_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_as_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `owner`
--

LOCK TABLES `owner` WRITE;
/*!40000 ALTER TABLE `owner` DISABLE KEYS */;
INSERT INTO `owner` VALUES (1,'james');
/*!40000 ALTER TABLE `owner` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `owner_t`
--

DROP TABLE IF EXISTS `owner_t`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `owner_t` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8mb4_0900_as_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_as_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `owner_t`
--

LOCK TABLES `owner_t` WRITE;
/*!40000 ALTER TABLE `owner_t` DISABLE KEYS */;
INSERT INTO `owner_t` VALUES (1,'james');
/*!40000 ALTER TABLE `owner_t` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `person`
--

DROP TABLE IF EXISTS `person`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `person` (
  `DTYPE` varchar(31) COLLATE utf8mb4_0900_as_ci NOT NULL,
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(255) COLLATE utf8mb4_0900_as_ci DEFAULT NULL,
  `last_name` varchar(255) COLLATE utf8mb4_0900_as_ci DEFAULT NULL,
  `PROG_LANG` varchar(255) COLLATE utf8mb4_0900_as_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_as_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `person`
--

LOCK TABLES `person` WRITE;
/*!40000 ALTER TABLE `person` DISABLE KEYS */;
INSERT INTO `person` VALUES ('Developer',1,'James','Liao','C#'),('200',2,'Ted','Wang','Cobol');
/*!40000 ALTER TABLE `person` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `person_many`
--

DROP TABLE IF EXISTS `person_many`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `person_many` (
  `DTYPE` varchar(31) COLLATE utf8mb4_0900_as_ci NOT NULL,
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(255) COLLATE utf8mb4_0900_as_ci DEFAULT NULL,
  `last_name` varchar(255) COLLATE utf8mb4_0900_as_ci DEFAULT NULL,
  `prog_lang` varchar(255) COLLATE utf8mb4_0900_as_ci DEFAULT NULL,
  `id_card_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK1yla88ij0ci4mbypgkscyhaca` (`id_card_id`),
  CONSTRAINT `FK1yla88ij0ci4mbypgkscyhaca` FOREIGN KEY (`id_card_id`) REFERENCES `id_card` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_as_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `person_many`
--

LOCK TABLES `person_many` WRITE;
/*!40000 ALTER TABLE `person_many` DISABLE KEYS */;
INSERT INTO `person_many` VALUES ('Designer',1,'James','Gruicci','.NET',134);
/*!40000 ALTER TABLE `person_many` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `person_project`
--

DROP TABLE IF EXISTS `person_project`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `person_project` (
  `project_id` int NOT NULL,
  `designer_id` int NOT NULL,
  KEY `FKbptk3m22oahhg6yletw7mv3of` (`designer_id`),
  KEY `FKcb0682fxd4idjr270yh43sona` (`project_id`),
  CONSTRAINT `FKbptk3m22oahhg6yletw7mv3of` FOREIGN KEY (`designer_id`) REFERENCES `project` (`id`),
  CONSTRAINT `FKcb0682fxd4idjr270yh43sona` FOREIGN KEY (`project_id`) REFERENCES `person_many` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_as_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `person_project`
--

LOCK TABLES `person_project` WRITE;
/*!40000 ALTER TABLE `person_project` DISABLE KEYS */;
INSERT INTO `person_project` VALUES (1,1),(1,2);
/*!40000 ALTER TABLE `person_project` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `phones`
--

DROP TABLE IF EXISTS `phones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `phones` (
  `id` int NOT NULL AUTO_INCREMENT,
  `brand_name` varchar(255) COLLATE utf8mb4_0900_as_ci DEFAULT NULL,
  `number` varchar(255) COLLATE utf8mb4_0900_as_ci DEFAULT NULL,
  `owner_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKfo09c30243b5yhjm04wcda8t4` (`owner_id`),
  CONSTRAINT `FKfo09c30243b5yhjm04wcda8t4` FOREIGN KEY (`owner_id`) REFERENCES `owner` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_as_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `phones`
--

LOCK TABLES `phones` WRITE;
/*!40000 ALTER TABLE `phones` DISABLE KEYS */;
INSERT INTO `phones` VALUES (1,'iPhone14','0920890890',1),(2,'Samsung Galaxy','0936987987',1);
/*!40000 ALTER TABLE `phones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `phones_t`
--

DROP TABLE IF EXISTS `phones_t`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `phones_t` (
  `id` int NOT NULL,
  `brand_name` varchar(255) COLLATE utf8mb4_0900_as_ci DEFAULT NULL,
  `number` varchar(255) COLLATE utf8mb4_0900_as_ci DEFAULT NULL,
  `owner_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK11chyxj97du8dbg7jnin1ljqt` (`owner_id`),
  CONSTRAINT `FK11chyxj97du8dbg7jnin1ljqt` FOREIGN KEY (`owner_id`) REFERENCES `owner_t` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_as_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `phones_t`
--

LOCK TABLES `phones_t` WRITE;
/*!40000 ALTER TABLE `phones_t` DISABLE KEYS */;
INSERT INTO `phones_t` VALUES (1,'iPhone14','0920890890',1),(2,'Samsung Galaxy','0936987987',1);
/*!40000 ALTER TABLE `phones_t` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `project`
--

DROP TABLE IF EXISTS `project`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `project` (
  `id` int NOT NULL AUTO_INCREMENT,
  `end_date` datetime(6) DEFAULT NULL,
  `projectType` varchar(255) COLLATE utf8mb4_0900_as_ci DEFAULT NULL,
  `start_date` datetime(6) DEFAULT NULL,
  `title` varchar(255) COLLATE utf8mb4_0900_as_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_as_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `project`
--

LOCK TABLES `project` WRITE;
/*!40000 ALTER TABLE `project` DISABLE KEYS */;
INSERT INTO `project` VALUES (1,'2023-08-31 15:08:34.378000','SHORT','2023-08-31 15:08:34.378000','Fido - Transaction'),(2,'2023-08-31 15:08:34.378000','LONG','2023-08-31 15:08:34.378000','ChatGPT - OpenAPI'),(5,NULL,'LONG',NULL,'Java Project'),(6,NULL,'LONG',NULL,'Java Project'),(7,NULL,'LONG',NULL,'Java Project'),(8,'2019-12-31 09:30:00.000000','LONG','2019-08-01 09:00:00.000000','Java Project'),(9,'2019-12-31 09:30:00.000000','LONG','2019-08-01 09:00:00.000000','Java Project');
/*!40000 ALTER TABLE `project` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `project_embedded`
--

DROP TABLE IF EXISTS `project_embedded`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `project_embedded` (
  `id` int NOT NULL AUTO_INCREMENT,
  `END_DATE` datetime(6) DEFAULT NULL,
  `START_DATE` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_as_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `project_embedded`
--

LOCK TABLES `project_embedded` WRITE;
/*!40000 ALTER TABLE `project_embedded` DISABLE KEYS */;
INSERT INTO `project_embedded` VALUES (1,'2023-12-01 09:30:00.000000','2023-09-01 09:00:00.000000'),(2,NULL,NULL),(4,'2019-12-31 09:30:00.000000','2019-08-01 09:00:00.000000'),(5,'2019-12-31 09:30:00.000000','2019-08-01 09:00:00.000000'),(6,'2019-12-31 09:30:00.000000','2019-08-01 09:00:00.000000'),(7,NULL,NULL),(8,NULL,NULL);
/*!40000 ALTER TABLE `project_embedded` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `S_PROJECT`
--

DROP TABLE IF EXISTS `S_PROJECT`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `S_PROJECT` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_as_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `S_PROJECT`
--

LOCK TABLES `S_PROJECT` WRITE;
/*!40000 ALTER TABLE `S_PROJECT` DISABLE KEYS */;
INSERT INTO `S_PROJECT` VALUES (21);
/*!40000 ALTER TABLE `S_PROJECT` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `T_BILLING_PERIOD`
--

DROP TABLE IF EXISTS `T_BILLING_PERIOD`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `T_BILLING_PERIOD` (
  `PROJECT_ID` int NOT NULL,
  `END_DATE` datetime(6) DEFAULT NULL,
  `START_DATE` datetime(6) DEFAULT NULL,
  KEY `FKn4o0q6sglrao5nkiy1dkgko0l` (`PROJECT_ID`),
  CONSTRAINT `FKn4o0q6sglrao5nkiy1dkgko0l` FOREIGN KEY (`PROJECT_ID`) REFERENCES `project_embedded` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_as_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `T_BILLING_PERIOD`
--

LOCK TABLES `T_BILLING_PERIOD` WRITE;
/*!40000 ALTER TABLE `T_BILLING_PERIOD` DISABLE KEYS */;
INSERT INTO `T_BILLING_PERIOD` VALUES (2,'2023-12-01 09:30:00.000000','2023-11-01 09:00:00.000000'),(2,'2024-01-01 09:30:00.000000','2023-10-01 09:00:00.000000'),(4,'2020-01-31 09:30:00.000000','2020-01-01 09:00:00.000000'),(4,'2020-03-02 09:30:00.000000','2020-02-01 09:00:00.000000'),(5,'2020-01-31 09:30:00.000000','2020-01-01 09:00:00.000000'),(5,'2020-03-02 09:30:00.000000','2020-02-01 09:00:00.000000'),(6,'2020-01-31 09:30:00.000000','2020-01-01 09:00:00.000000'),(6,'2020-03-02 09:30:00.000000','2020-02-01 09:00:00.000000'),(7,'2020-01-31 09:30:00.000000','2020-01-01 09:00:00.000000'),(7,'2020-03-02 09:30:00.000000','2020-02-01 09:00:00.000000'),(8,'2020-01-31 09:30:00.000000','2020-01-01 09:00:00.000000'),(8,'2020-03-02 09:30:00.000000','2020-02-01 09:00:00.000000');
/*!40000 ALTER TABLE `T_BILLING_PERIOD` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `T_SEQUENCES`
--

DROP TABLE IF EXISTS `T_SEQUENCES`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `T_SEQUENCES` (
  `SEQ_NAME` varchar(255) COLLATE utf8mb4_0900_as_ci NOT NULL,
  `SEQ_VALUE` bigint DEFAULT NULL,
  PRIMARY KEY (`SEQ_NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_as_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `T_SEQUENCES`
--

LOCK TABLES `T_SEQUENCES` WRITE;
/*!40000 ALTER TABLE `T_SEQUENCES` DISABLE KEYS */;
INSERT INTO `T_SEQUENCES` VALUES ('PHONE',101);
/*!40000 ALTER TABLE `T_SEQUENCES` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `test`
--

DROP TABLE IF EXISTS `test`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `test` (
  `id` int DEFAULT NULL,
  `name` varchar(10) COLLATE utf8mb4_0900_as_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_as_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `test`
--

LOCK TABLES `test` WRITE;
/*!40000 ALTER TABLE `test` DISABLE KEYS */;
INSERT INTO `test` VALUES (1,'s'),(1,'s'),(1,'s'),(1,'s'),(1,'s'),(1,'s');
/*!40000 ALTER TABLE `test` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `DTYPE` varchar(31) COLLATE utf8mb4_0900_as_ci NOT NULL,
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(255) COLLATE utf8mb4_0900_as_ci DEFAULT NULL,
  `last_name` varchar(255) COLLATE utf8mb4_0900_as_ci DEFAULT NULL,
  `PROG_LANG` varchar(255) COLLATE utf8mb4_0900_as_ci DEFAULT NULL,
  `id_card_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK2y8xk8loi3isby5ju3eg7xan1` (`id_card_id`),
  CONSTRAINT `FK2y8xk8loi3isby5ju3eg7xan1` FOREIGN KEY (`id_card_id`) REFERENCES `id_card` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_as_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('User',1,'Moris','Chang',NULL,1),('Programming',2,'Tim','Liao','C#',NULL),('Programming',3,'Ted','Go','Java',2);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-09-03 16:41:07
