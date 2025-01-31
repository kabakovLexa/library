package ru.javaguru.readingrecordsservice.api.exception;


public class ReadingRecordNotFoundException extends RuntimeException {

    public ReadingRecordNotFoundException(String message) {
        super(message);
    }

    public ReadingRecordNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
