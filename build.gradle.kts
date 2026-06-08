plugins {
    kotlin("jvm") version "2.4.0"
    application
}

group = "org.echocat.kata"
version = "1-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("org.assertj:assertj-core:3.27.7")
}

tasks.test {
    useJUnitPlatform()
}

application {
    mainClass.set("org.echocat.kata.kotlin.part1.MainAppKt")
}
