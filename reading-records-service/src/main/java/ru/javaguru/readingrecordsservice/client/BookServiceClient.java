package ru.javaguru.readingrecordsservice.client;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import ru.javaguru.readingrecordsservice.api.exception.BookNotFoundException;
import ru.javaguru.readingrecordsservice.usecasses.dto.BookDto;

@Component
@RequiredArgsConstructor
@Slf4j
public class BookServiceClient {

    private final RestTemplate template;

    public BookDto getBookInfo(Long bookId) {
        try {
            return template.getForObject(
                    "http://BOOKS-SERVICE/api/books/" + bookId,
                    BookDto.class
            );
        } catch (HttpClientErrorException e) {
            log.error("Error while getting book with id: {}", bookId, e);
            throw new BookNotFoundException(bookId);
        }
    }
}
