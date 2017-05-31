package es.restester.tester

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class TesterApplication

fun main(args: Array<String>) {
    SpringApplication.run(TesterApplication::class.java, *args)
}
