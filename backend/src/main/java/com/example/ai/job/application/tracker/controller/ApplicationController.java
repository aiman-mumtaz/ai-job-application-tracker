package com.example.ai.job.application.tracker.controller;

import com.example.ai.job.application.tracker.dto.ApplicationDto;
import com.example.ai.job.application.tracker.service.ApplicationService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/applications")
public class ApplicationController {

    private final ApplicationService applicationService;

    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping
    public List<ApplicationDto> getAll() {
        return applicationService.getAllApplications();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApplicationDto> getById(@PathVariable Long id) {
        return ResponseEntity.of(applicationService.getApplication(id));
    }

    @PostMapping
    public ResponseEntity<ApplicationDto> create(@Valid @RequestBody ApplicationDto applicationDto) {
        return ResponseEntity.ok(applicationService.createApplication(applicationDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApplicationDto> update(@PathVariable Long id, @Valid @RequestBody ApplicationDto applicationDto) {
        return ResponseEntity.ok(applicationService.updateApplication(id, applicationDto));
    }
}
