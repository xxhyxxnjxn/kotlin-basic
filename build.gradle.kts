plugins {
    kotlin("jvm") version "2.0.20"
    application
}

group = "com.hyeonjin"
version = "0.0.1"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}

application {
    mainClass.set("MainKt") // -> 하나를 세팅하려고
}