
CREATE TABLE reading_records (
                                 record_id BIGINT PRIMARY KEY AUTO_INCREMENT,
                                 user_id BIGINT NOT NULL,
                                 book_id BIGINT NOT NULL,
                                 status VARCHAR(50) NOT NULL
);

INSERT INTO reading_records (user_id, book_id, status) VALUES
                                                           (34, 1, 'Читается'),
                                                           (34, 2, 'Прочитана'),
                                                           (35, 1, 'Хочу прочитать'),
                                                           (36, 3, 'Читается'),
                                                           (37, 4, 'Прочитана');