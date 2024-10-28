plugins {
    kotlin("jvm") version "2.0.0"
}

group = "org.jihyuklab.discordbot"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

tasks.jar {
    manifest { attributes["Main-Class"] = "org.jihyuklab.discordbot.MainKt" }
    from(configurations.runtimeClasspath.get().map { if (it.isDirectory) it else zipTree(it) })
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("net.dv8tion:JDA:5.1.2")
    implementation("com.github.oshi:oshi-core:6.4.0")
}

tasks.test {
    useJUnitPlatform()
}