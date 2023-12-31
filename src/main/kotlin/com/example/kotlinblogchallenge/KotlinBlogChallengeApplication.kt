package com.example.kotlinblogchallenge

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinBlogChallengeApplication

fun main(args: Array<String>) {
    runApplication<KotlinBlogChallengeApplication>(*args) {
        setBannerMode(Banner.Mode.OFF)
    }
}
