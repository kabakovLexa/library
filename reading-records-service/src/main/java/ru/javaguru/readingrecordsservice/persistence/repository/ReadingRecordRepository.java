package ru.javaguru.readingrecordsservice.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.javaguru.readingrecordsservice.persistence.model.ReadingRecord;

public interface ReadingRecordRepository extends JpaRepository<ReadingRecord, Long> {
}
