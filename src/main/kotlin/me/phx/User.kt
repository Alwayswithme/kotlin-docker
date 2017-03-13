package me.phx

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * Created by ye on 3/13/17.
 */
@Entity
class User(
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long = 0,
        var name: String = ""
)