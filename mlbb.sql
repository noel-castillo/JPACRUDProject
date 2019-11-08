-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mlbb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `mlbb` ;

-- -----------------------------------------------------
-- Schema mlbb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mlbb` DEFAULT CHARACTER SET utf8 ;
USE `mlbb` ;

-- -----------------------------------------------------
-- Table `Hero`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Hero` ;

CREATE TABLE IF NOT EXISTS `Hero` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NULL,
  `health` INT NULL,
  `mana` INT NULL,
  `backstory` VARCHAR(45) NULL,
  `image` LONGBLOB NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SET SQL_MODE = '';
DROP USER IF EXISTS blue@localhost;
SET SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE USER 'blue'@'localhost' IDENTIFIED BY 'blue';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'blue'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
