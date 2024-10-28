plugins {
    kotlin("jvm") version "2.0.0"
}

group = "org.jihyuklab.discordbot"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("net.dv8tion:JDA:5.1.2")
}

tasks.test {
    useJUnitPlatform()
}