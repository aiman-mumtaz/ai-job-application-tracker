package com.example.ai.job.application.tracker.service;

import com.example.ai.job.application.tracker.dto.ApplicationDto;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class ApplicationService {

    private final List<ApplicationDto> applications = new ArrayList<>();

    public List<ApplicationDto> getAllApplications() {
        return applications;
    }

    public Optional<ApplicationDto> getApplication(Long id) {
        return applications.stream()
                .filter(app -> app.id() != null && app.id().equals(id))
                .findFirst();
    }

    public ApplicationDto createApplication(ApplicationDto applicationDto) {
        long nextId = applications.stream().map(ApplicationDto::id)
                .filter(id -> id != null)
                .mapToLong(Long::longValue)
                .max()
                .orElse(0L) + 1;

        ApplicationDto created = new ApplicationDto(
                nextId,
                applicationDto.company(),
                applicationDto.role(),
                applicationDto.status(),
                applicationDto.appliedDate() == null ? LocalDate.now() : applicationDto.appliedDate(),
                applicationDto.jobUrl(),
                applicationDto.notes()
        );

        applications.add(created);
        return created;
    }

    public ApplicationDto updateApplication(Long id, ApplicationDto applicationDto) {
        ApplicationDto existing = applications.stream()
                .filter(app -> app.id() != null && app.id().equals(id))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Application not found: " + id));

        ApplicationDto updated = new ApplicationDto(
                existing.id(),
                applicationDto.company(),
                applicationDto.role(),
                applicationDto.status(),
                applicationDto.appliedDate() == null ? existing.appliedDate() : applicationDto.appliedDate(),
                applicationDto.jobUrl(),
                applicationDto.notes()
        );

        applications.remove(existing);
        applications.add(updated);
        return updated;
    }
}
