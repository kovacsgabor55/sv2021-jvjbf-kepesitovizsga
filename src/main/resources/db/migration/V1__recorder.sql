CREATE TABLE `recorder`
(
    `id`            BIGINT(20) NOT NULL AUTO_INCREMENT,
    `date_of_birth` DATE NOT NULL,
    `name`          VARCHAR(255) NOT NULL COLLATE 'utf8_general_ci',
    PRIMARY KEY (`id`)
)
;