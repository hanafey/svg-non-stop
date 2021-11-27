plugins {
    kotlin("jvm") version "1.6.0"
    java
    application
}

group = "com.hanafey.svg-non-stop"
version = "1.0"

application {
    mainClass.set("com.hanafey.svgnonstop.NonStop")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}