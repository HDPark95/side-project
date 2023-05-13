package com.study.side.controller;

import com.study.side.dto.GradeDTO;
import com.study.side.dto.SubjectStatisticsDTO;
import com.study.side.service.GradeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/grade")
@RequiredArgsConstructor
public class GradeController {

    private final GradeService gradeService;

    @PostMapping
    public ResponseEntity<SubjectStatisticsDTO> calculateGrade(@RequestBody GradeDTO gradeDTO) {
        return ResponseEntity.ok().body(gradeService.calculateStatisticKoreanSubject(gradeDTO));
    }

}
