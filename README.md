# AI Job Application Tracker

My submission for Code Kitchen, a national coding reality show for India's elite working developers - an 8 episode AIM Originals series streaming on YouTube and social, presented by Google Cloud. This implementation is for the track - AI Job Application Tracker: design a smart, data-driven career optimization pipeline and application tracking dashboard.

## Users & problem

AI Job Application Tracker helps job seekers manage applications, eliminate scattered records, repetitive writing, and missed recruiter follow-ups.

## Approach

Users authenticate, upload their resume, and ingest structured job postings and historical drafts. Resume intelligence extracts skills, experience, and achievements. Each application is linked to its job, communication history, and persistent status (Applied, Interview, Offer, Reject). Gemini uses this context to generate tailored cover letters and follow-up emails. The platform also extends this intelligence to generate personalized cold emails to recruiters from the same resume and schedule follow-ups for active applications. A closed-loop workflow connects resume intelligence, job matching, applications, AI communication, recruiter outreach, follow-ups, status updates, and next-action recommendations.

## GCP stack

Gemini for resume analysis and content generation, Cloud SQL for PostgreSQL for application and communication data, Cloud Storage for resumes, Cloud Tasks + Cloud Scheduler for automation, Identity Platform for authentication, and Cloud Run for deployment.

## Why this data product

Cloud SQL provides transactional consistency, relational joins, indexing, and efficient querying across users, jobs, applications, and communication history.

## Edge cases

User-isolated access, encrypted storage, idempotent tasks preventing duplicate emails, and Cloud Run autoscaling support privacy, reliability, and scale.

## What this workspace contains

This starter project includes:
- Spring Boot 3 backend with REST endpoints for application tracking
- Next.js frontend dashboard shell
- PostgreSQL schema for users, resumes, jobs, applications, and communications
- Docker Compose setup for local PostgreSQL
- Structured project layout aligned with the requested architecture

## Stack

- Backend: Spring Boot, Java 21, Maven
- Frontend: Next.js, React, TypeScript
- Database: PostgreSQL / SQL Server-ready schema conventions
- Cloud services: GCP Gemini, Cloud SQL, Cloud Storage, Cloud Tasks, Cloud Scheduler, Identity Platform, Cloud Run

## Getting started

### 1. Start the database

```bash
docker-compose up -d
```

### 2. Run the backend

```bash
cd backend
mvn spring-boot:run
```

### 3. Run the frontend

```bash
cd frontend
npm install
npm run dev
```

## Backend endpoints

- `GET /api/health`
- `GET /api/applications`
- `GET /api/applications/{id}`
- `POST /api/applications`
- `PUT /api/applications/{id}`

## Local database

The backend is configured to connect to PostgreSQL at `localhost:5432` with:
- database: `job_tracker`
- username: `postgres`
- password: `postgres`

## Architecture notes

- Resume intelligence, job matching, and AI-generated communication are represented as domain areas in the codebase.
- The schema supports relational joins across users, resumes, jobs, applications, and communication history.
- Cloud SQL/Cloud Run patterns are reflected through the project structure and deployment-oriented configuration.
- The design includes edge-case support for user isolation, encrypted storage, idempotent background tasks, and autoscaling.

## Next enhancements

- Add JPA entities and repository layer mapped to the PostgreSQL schema
- Integrate Gemini APIs for resume analysis and content generation
- Add authentication with Identity Platform or Spring Security OAuth2
- Add Cloud Storage resume uploads and background task processing
- Expand the UI into dashboards for applications, communication history, and follow-up automation

