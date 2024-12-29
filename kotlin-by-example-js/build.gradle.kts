plugins {
    kotlin("multiplatform") version "2.1.0"
}

group = "in.parambir"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
//    testImplementation(kotlin("test"))
}

//tasks.test {
//    useJUnitPlatform()
//}
kotlin {
    js {
        browser {
        }
        binaries.executable()
    }
}