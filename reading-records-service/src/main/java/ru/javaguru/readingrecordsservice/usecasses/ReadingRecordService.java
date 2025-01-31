package ru.javaguru.readingrecordsservice.usecasses;

import ru.javaguru.readingrecordsservice.usecasses.dto.ReadingRecordDto;

public interface ReadingRecordService {
    ReadingRecordDto getReadingRecordById(Long recordId);
}