package com.study.side.dto;

import lombok.Builder;
import lombok.Data;

@Data
public class SubjectStatisticsDTO {

    private int count;

    private double average;

    @Builder
    public SubjectStatisticsDTO(int count, double average) {
        this.count = count;
        this.average = average;
    }
}
