package me.phx

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.net.URI
import javax.servlet.http.HttpServletRequest

/**
 * Created by ye on 3/13/17.
 */

@RestController
class KotlinController(val userRepository: UserRepository) {

    @GetMapping("/")
    fun index() = "hello world"

    /**
     * curl -i http://localhost:8080/users/1
     */
    @GetMapping("/users/{id}")
    fun getUser(@PathVariable id : Long) = userRepository.findOne(id)

    /**
     * curl -i http://localhost:8080/users
     */
    @GetMapping("/users")
    fun getUsers() = userRepository.findAll()

    /**
     * curl -i -X PUT -H "Content-Type:application/json" -d "{ \"name\": \"phoenix\"}" http://localhost:8080/users/
     */
    @PutMapping("/users")
    fun putUser(@RequestBody user: User, request: HttpServletRequest): ResponseEntity<*>? {
        userRepository.save(user)

        return ResponseEntity.created(URI.create("http://${request.serverName}:${request.serverPort}/users/${user.id}")).build<Any>()
    }

}