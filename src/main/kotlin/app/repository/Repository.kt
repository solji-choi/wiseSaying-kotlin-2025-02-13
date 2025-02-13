package com.ll.app.repository

import com.ll.app.entity.WiseSaying

class Repository(
    var lastId: Int = 0,
    val wiseSayings: MutableList<WiseSaying> = mutableListOf(),
) {
    fun save(content: String, author: String): WiseSaying {
        val wiseSaying = WiseSaying(++lastId, content, author)

        wiseSayings.add(wiseSaying)

        return wiseSaying
    }

    fun findAll(): MutableList<WiseSaying> {
        return wiseSayings
    }
}