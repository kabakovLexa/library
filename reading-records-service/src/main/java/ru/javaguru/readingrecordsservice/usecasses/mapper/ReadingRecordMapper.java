package ru.javaguru.readingrecordsservice.usecasses.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import ru.javaguru.readingrecordsservice.persistence.model.ReadingRecord;
import ru.javaguru.readingrecordsservice.usecasses.dto.BookDto;
import ru.javaguru.readingrecordsservice.usecasses.dto.ReadingRecordDto;

import java.util.List;


@Mapper(componentModel = "spring")
public interface ReadingRecordMapper {

    default ReadingRecordDto toDto(ReadingRecord record, BookDto bookDto) {
        return ReadingRecordDto.builder()
                .withRecordId(record.getRecordId())
                .withUserId(record.getUserId())
                .withBook(bookDto)
                .withStatus(record.getStatus())
                .build();
    }

    @Named("toDtoWithoutBook")
    default ReadingRecordDto toDtoWithoutBook(ReadingRecord record) {
        return toDto(record, null);
    }

    @Mapping(target = "bookId", source = "book.id")
    ReadingRecord toEntity(ReadingRecordDto dto);

    List<ReadingRecordDto> toDtoList(List<ReadingRecord> records);
}