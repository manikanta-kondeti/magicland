package com.magicland.magicland

import com.magicland.magicland.models.Greeting
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@SpringBootApplication
class MagiclandApplication {
}

fun main(args: Array<String>) {
	runApplication<MagiclandApplication>(*args)
}
