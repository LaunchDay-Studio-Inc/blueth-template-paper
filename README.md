# Blueth Paper Plugin Template

Starter template for Blueth ecosystem plugins.

## Stack
- **Java 21** / **Gradle 8.13**
- **Paper 1.21.4** (api-version 1.21)
- **Shadow** for fat jars
- **GitHub Actions** CI + release
- **Codespaces** ready

## Quick Start

```bash
./gradlew build
# Output: build/libs/<plugin>.jar
```

## Structure
```
src/main/java/online/blueth/template/  — Plugin code
src/main/resources/paper-plugin.yml    — Plugin descriptor
.devcontainer/                         — Codespaces config
.github/workflows/                     — CI + release
```

## License
Proprietary — LaunchDay Studio Inc.
