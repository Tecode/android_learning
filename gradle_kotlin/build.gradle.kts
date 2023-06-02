import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    application
    kotlin("jvm") version "1.5.0"
}

application {
    mainClass.set("HumanKt")
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("commons-httpclient","commons-httpclient","3.1")
}

repositories {
    maven {
        setUrl("https://maven.aliyun.com/repository/public/")
    }
    mavenCentral()
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

// 自定义任务
task("runTask001") {
    println("runTask001")
}

task("runTask002") {
    println("runTask002")
}.dependsOn("runTask001")