package me.phx

import org.springframework.data.repository.CrudRepository

/**
 * Created by ye on 3/13/17.
 */
interface UserRepository : CrudRepository<User, Long>