package me.phx

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by ye on 3/13/17.
 */

@RestController
class KotlinController {

    @GetMapping("/")
    fun index() = "hello world"
}