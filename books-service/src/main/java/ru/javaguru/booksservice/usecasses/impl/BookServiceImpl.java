package ru.javaguru.booksservice.usecasses.impl;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.javaguru.booksservice.persistence.repository.BookRepository;
import ru.javaguru.booksservice.usecasses.BookService;
import ru.javaguru.booksservice.usecasses.dto.BookDto;
import ru.javaguru.booksservice.usecasses.mapper.BookMapper;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookMapper bookMapper;
    private final BookRepository bookRepository;

    @Override
    public BookDto getBookById(Long id) {
        return bookMapper.toDto(
                bookRepository.findById(id)
                        .orElseThrow(() -> new EntityNotFoundException("Book not found with id: " + id))
        );
    }
}