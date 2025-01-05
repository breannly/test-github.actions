package ru.grokaemjava.demo1

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Demo1Application

fun main(vararg args: String) {
    runApplication<Demo1Application>(*args)
}
