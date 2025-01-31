package ru.javaguru.readingrecordsservice.usecasses.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.javaguru.readingrecordsservice.api.exception.ReadingRecordNotFoundException;
import ru.javaguru.readingrecordsservice.client.BookServiceClient;
import ru.javaguru.readingrecordsservice.persistence.model.ReadingRecord;
import ru.javaguru.readingrecordsservice.persistence.repository.ReadingRecordRepository;
import ru.javaguru.readingrecordsservice.usecasses.ReadingRecordService;
import ru.javaguru.readingrecordsservice.usecasses.dto.BookDto;
import ru.javaguru.readingrecordsservice.usecasses.dto.ReadingRecordDto;
import ru.javaguru.readingrecordsservice.usecasses.mapper.ReadingRecordMapper;

@Service
@RequiredArgsConstructor
public class ReadingRecordServiceImpl implements ReadingRecordService {
    private final ReadingRecordRepository readingRecordRepository;
    private final BookServiceClient bookServiceClient;
    private final ReadingRecordMapper mapper;

    @Override
    public ReadingRecordDto getReadingRecordById(Long recordId) {
        return readingRecordRepository.findById(recordId)
                .map(this::getBookFromServiceAndConvertToDTO)
                .orElseThrow(() -> new ReadingRecordNotFoundException("Reading record not found"));
    }

    private ReadingRecordDto getBookFromServiceAndConvertToDTO(ReadingRecord record) {
        BookDto bookDto = bookServiceClient.getBookInfo(record.getBookId());
        return mapper.toDto(record, bookDto);
    }
}