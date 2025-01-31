package ru.javaguru.readingrecordsservice.usecasses.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(setterPrefix = "with")
public class ReadingRecordDto {
    private Long recordId;
    private Long userId;
    private BookDto book;
    private String status;
}