plugins {
    kotlin("jvm") version "2.2.0"
    id("org.hibernate.orm") version "7.0.6.Final"
}

group = "com.evolutio"
version = "1.0-SNAPSHOT"

repositories {
    gradlePluginPortal()
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.9.0")
    implementation("dev.kord:kord-core:0.15.0")
}

tasks.test {
    useJUnitPlatform()
}