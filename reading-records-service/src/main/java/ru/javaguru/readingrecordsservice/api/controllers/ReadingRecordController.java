package ru.javaguru.readingrecordsservice.api.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.javaguru.readingrecordsservice.usecasses.ReadingRecordService;
import ru.javaguru.readingrecordsservice.usecasses.dto.ReadingRecordDto;

@RestController
@RequestMapping("/api/reading-records")
@RequiredArgsConstructor
public class ReadingRecordController {
    private final ReadingRecordService service;

    @GetMapping("/{recordId}")
    public ReadingRecordDto getReadingRecordById(@PathVariable Long recordId) {
        return service.getReadingRecordById(recordId);
    }
}