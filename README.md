# pipeline-test-app
[![Coverage](.github/badges/jacoco.svg)](https://github.com/divyavollen/pipeline-test-app/actions/workflows/workflow.yml)

This repository demonstrates a CI/CD pipeline using GitHub Actions for a Java + Maven application.
It includes build verification, test execution with coverage reporting, automated PR comments, badge generation, and Docker image publishing.
Code and development by me. Occasional reviews by others.

# Tools
- Language / Build: Java 21, Maven
- CI/CD: GitHub Actions
- Coverage: JaCoCo (with PR comments + badges)
- Docker: Docker Hub publishing via GitHub Actions

# Workflow
- Triggered on Pull Requests → runs on main branch PRs.
- Build & Test: Uses Maven with JDK 21.
- Generates JaCoCo reports.
- Posts coverage summary as a PR comment.
- Fails if coverage < 70% overall or < 80% on changed files.
- Automatically generates coverage and branch badges (jacoco.svg, branches.svg) and commits them back to repo.
- Uploads full coverage report as GitHub artifact.
- Builds Docker image and pushes to Docker Hub with version tag from Maven project.
