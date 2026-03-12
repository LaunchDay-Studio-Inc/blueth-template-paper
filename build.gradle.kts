plugins {
    java
    id("io.papermc.paperweight.userdev") version "2.0.0-beta.14" apply false
    id("com.gradleup.shadow") version "9.0.0-beta12"
}

group = "online.blueth"
version = "0.1.0-SNAPSHOT"
description = "Blueth Plugin Template"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.21.4-R0.1-SNAPSHOT")
    compileOnly("net.milkbowl.vault:VaultAPI:1.7.1")
    compileOnly("me.clip:placeholderapi:2.11.6")
    implementation("net.kyori:adventure-api:4.21.0")
    implementation("net.kyori:adventure-text-minimessage:4.21.0")
}

tasks {
    shadowJar {
        archiveClassifier.set("")
        relocate("net.kyori", "online.blueth.libs.adventure")
    }
    build {
        dependsOn(shadowJar)
    }
    processResources {
        filesMatching("paper-plugin.yml") {
            expand("version" to project.version)
        }
    }
}
