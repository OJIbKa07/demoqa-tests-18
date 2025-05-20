plugins {
    id("java")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation ("com.codeborne:selenide:6.1.2")
    testImplementation ("org.junit.jupiter:junit-jupiter:5.9.2")
    testImplementation("io.github.bonigarcia:webdrivermanager:5.3.0")
}


tasks.test {
    useJUnitPlatform()
}