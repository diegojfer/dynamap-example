plugins {
    kotlin("jvm") version "1.9.20"
    kotlin("plugin.serialization") version "1.9.20"

    application
}

repositories {
    mavenLocal()
    mavenCentral()
}

application {
    mainClass.set("com.diegofer.app.Main")
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:1.5.0")
    implementation("aws.sdk.kotlin:dynamodb:1.0.69")
    
    implementation("com.codanbaru.kotlin:dynamap:0.9.0")
}
