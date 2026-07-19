-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema inscripciones_cursos_db
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `inscripciones_cursos_db` ;

-- -----------------------------------------------------
-- Schema inscripciones_cursos_db
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `inscripciones_cursos_db` DEFAULT CHARACTER SET utf8 ;
USE `inscripciones_cursos_db` ;

-- -----------------------------------------------------
-- Table `inscripciones_cursos_db`.`estudiantes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `inscripciones_cursos_db`.`estudiantes` (
  `id_estudiante` INT NOT NULL,
  `nombre_estudiante` VARCHAR(45) NOT NULL,
  `edad` INT NULL,
  PRIMARY KEY (`id_estudiante`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `inscripciones_cursos_db`.`cursos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `inscripciones_cursos_db`.`cursos` (
  `id_curso` INT NOT NULL,
  `nombre_curso` VARCHAR(45) NOT NULL,
  `duracion` INT NULL,
  PRIMARY KEY (`id_curso`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `inscripciones_cursos_db`.`inscripciones`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `inscripciones_cursos_db`.`inscripciones` (
  `id_inscripcion` INT NOT NULL,
  `id_estudiante` INT NOT NULL,
  `id_curso` INT NOT NULL,
  PRIMARY KEY (`id_inscripcion`),
  INDEX `fk_inscripciones_estudiantes_idx` (`id_estudiante` ASC) VISIBLE,
  INDEX `fk_inscripciones_cursos_idx` (`id_curso` ASC) VISIBLE,
  CONSTRAINT `fk_inscripciones_estudiantes`
    FOREIGN KEY (`id_estudiante`)
    REFERENCES `inscripciones_cursos_db`.`estudiantes` (`id_estudiante`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_inscripciones_cursos`
    FOREIGN KEY (`id_curso`)
    REFERENCES `inscripciones_cursos_db`.`cursos` (`id_curso`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
