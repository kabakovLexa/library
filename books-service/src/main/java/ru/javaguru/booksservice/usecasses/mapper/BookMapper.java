package ru.javaguru.booksservice.usecasses.mapper;

import org.mapstruct.Mapper;
import ru.javaguru.booksservice.persistence.model.Book;
import ru.javaguru.booksservice.usecasses.dto.BookDto;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BookMapper {

    BookDto toDto(Book book);

    Book toEntity(BookDto bookDTO);

    List<BookDto> toDtoList(List<Book> books);
}