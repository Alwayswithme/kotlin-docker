package me.phx

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
open class KotlinDockerApplication {

    @Bean
    open fun init(userRepository: UserRepository) = CommandLineRunner {
        val allUser = listOf<User>(User(name = "John"), User(name = "Doe"))
        userRepository.save(allUser)
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(KotlinDockerApplication::class.java, *args)
}
