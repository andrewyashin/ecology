SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

SET NAMES 'utf8';
SET CHARACTER SET 'utf8';
SET SESSION collation_connection = 'utf8_general_ci';
-- -----------------------------------------------------
-- Schema ecology
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `ecology` ;

-- -----------------------------------------------------
-- Schema ecology
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `ecology` DEFAULT CHARACTER SET utf8 ;
USE `ecology` ;

-- -----------------------------------------------------
-- Table `ecology`.`places`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ecology`.`places` ;

CREATE TABLE IF NOT EXISTS `ecology`.`places` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NOT NULL,
  `longitude` DOUBLE NULL,
  `latitude` DOUBLE NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;