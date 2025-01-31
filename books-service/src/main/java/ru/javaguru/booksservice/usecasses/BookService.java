package ru.javaguru.booksservice.usecasses;

import ru.javaguru.booksservice.usecasses.dto.BookDto;

public interface BookService {
    BookDto getBookById(Long id);
}