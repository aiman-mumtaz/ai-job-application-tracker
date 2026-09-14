# AI Job Application Tracker 

My submission for Code Kitchen, a national coding reality show for India's elite working developers - an 8 episode AIM Originals series streaming on YouTube and social, presented by Google Cloud. This implementation is for the track - AI Job Application Tracker :Design a smart, data-driven career optimization pipeline and application tracking dashboard.

**Users & problem:** AI Job Application Tracker helps job seekers manage applications, eliminate scattered records, repetitive writing, and missed recruiter follow-ups.

**Approach:** Users authenticate, upload their resume, and ingest structured job postings and historical drafts. Resume intelligence extracts skills, experience, and achievements. Each application is linked to its job, communication history, and persistent status (Applied, Interview, Offer, Reject). Gemini uses this context to generate tailored cover letters and follow-up emails. The platform also extends this intelligence to generate personalized cold emails to recruiters from the same resume and schedule follow-ups for active applications. A closed-loop workflow connects resume intelligence, job matching, applications, AI communication, recruiter outreach, follow-ups, status updates, and next-action recommendations.

**GCP stack:** Gemini for resume analysis and content generation, Cloud SQL for PostgreSQL for application and communication data, Cloud Storage for resumes, Cloud Tasks + Cloud Scheduler for automation, Identity Platform for authentication, and Cloud Run for deployment. Build on Springboot, NextJS and SQL Server.

**Why this data product:** Cloud SQL provides transactional consistency, relational joins, indexing, and efficient querying across users, jobs, applications, and communication history.

**Edge cases:** User-isolated access, encrypted storage, idempotent tasks preventing duplicate emails, and Cloud Run autoscaling support privacy, reliability, and scale.

