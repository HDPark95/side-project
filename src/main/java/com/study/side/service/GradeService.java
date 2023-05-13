package com.study.side.service;

import com.study.side.dto.GradeDTO;
import com.study.side.dto.GradeEach;
import com.study.side.dto.SubjectStatisticsDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

@Service
public class GradeService {
    public SubjectStatisticsDTO calculateStatisticKoreanSubject(GradeDTO gradeDTO) {

        List<GradeEach> filteredList = gradeDTO.getGradeEachList().stream()
                .filter(gradeEach -> isKoreanSubject(gradeEach.getSubject()))
                .collect(Collectors.toList());

        OptionalDouble optionalAverage = filteredList.stream().mapToInt(GradeEach::getScore).average();
        double average = optionalAverage.orElse(0);

        return SubjectStatisticsDTO
                .builder()
                .count(filteredList.size())
                .average(average)
                .build();
    }

    private boolean isKoreanSubject(String subject) {
        return subject.matches(".*[ㄱ-ㅎㅏ-ㅣ가-힣]+.*");
    }
}