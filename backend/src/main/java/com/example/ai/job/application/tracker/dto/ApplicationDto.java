package com.example.ai.job.application.tracker.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record ApplicationDto(
        Long id,
        @NotBlank String company,
        @NotBlank String role,
        @NotBlank String status,
        @NotNull LocalDate appliedDate,
        String jobUrl,
        String notes
) {
}
