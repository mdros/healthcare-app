import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.7.0-M2"
	id("io.spring.dependency-management") version "1.0.11.RELEASE"
	kotlin("jvm") version "1.6.10"
	kotlin("plugin.spring") version "1.6.10"
	kotlin("plugin.jpa") version "1.6.10"
}

group = "me.mdros"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
	mavenCentral()
	maven { url = uri("https://repo.spring.io/milestone") }
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter:2.6.4")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa:2.6.4")
	implementation("org.springframework.boot:spring-boot-starter-web:2.6.4")
	implementation("org.flywaydb:flyway-core:8.5.1")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.13.1")

	runtimeOnly("org.postgresql:postgresql:42.3.3")

	testImplementation("org.springframework.boot:spring-boot-starter-test:2.6.4")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "17"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}

allOpen {
	annotations(
		"javax.persistence.Entity",
		"javax.persistence.MappedSuperclass",
		"javax.persistence.Embedabble"
	)
}