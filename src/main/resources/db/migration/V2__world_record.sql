CREATE TABLE `world_record`
(
    `id`              BIGINT(20) NOT NULL AUTO_INCREMENT,
    `date_of_record`  DATE NOT NULL,
    `description`     VARCHAR(255) NOT NULL COLLATE 'utf8_general_ci',
    `recorder_id`     BIGINT(20) NOT NULL,
    `unit_of_measure` VARCHAR(255) NOT NULL COLLATE 'utf8_general_ci',
    `value`           DOUBLE NOT NULL,
	PRIMARY KEY (`id`)
)
;