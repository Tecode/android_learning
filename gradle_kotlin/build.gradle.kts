import org.jetbrains.kotlin.ir.backend.js.compile
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    application
    kotlin("jvm") version "1.5.0"
}

application {
    mainClass.set("HumanKt")
}

dependencies {
//    compile(kotlin("org.jetbrains.kotlin:kotlin-stdlib"))
    implementation(kotlin("stdlib-jdk8"))
}

repositories {
    jcenter()
}

val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}
val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}