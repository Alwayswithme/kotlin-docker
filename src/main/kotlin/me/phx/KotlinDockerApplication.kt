package me.phx

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class KotlinDockerApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinDockerApplication::class.java, *args)
}
