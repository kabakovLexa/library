CREATE TABLE books (
                       id BIGINT PRIMARY KEY AUTO_INCREMENT,
                       title VARCHAR(255) NOT NULL,
                       author VARCHAR(255) NOT NULL,
                       genre VARCHAR(100) NOT NULL
);

INSERT INTO books (title, author, genre) VALUES
                                             ('1984', 'George Orwell', 'Science Fiction'),
                                             ('The Great Gatsby', 'F. Scott Fitzgerald', 'Classic'),
                                             ('Harry Potter and the Philosopher''s Stone', 'J.K. Rowling', 'Fantasy'),
                                             ('Murder on the Orient Express', 'Agatha Christie', 'Mystery'),
                                             ('The Lord of the Rings', 'J.R.R. Tolkien', 'Fantasy');