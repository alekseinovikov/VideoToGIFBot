plugins {
    kotlin("jvm") version "1.3.72"
}

group = "org.bot.video.to.gif"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven(url = "https://jitpack.io")
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("io.github.kotlin-telegram-bot.kotlin-telegram-bot:telegram:5.0.0")

    testImplementation("org.junit.jupiter:junit-jupiter:5.6.2")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}