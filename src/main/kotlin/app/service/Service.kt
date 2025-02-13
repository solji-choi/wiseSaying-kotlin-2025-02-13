package com.ll.app.service

import com.ll.app.entity.WiseSaying
import com.ll.app.repository.Repository

class Service(
    var repository: Repository = Repository()
) {
    fun add(content: String, author: String): WiseSaying {
        return repository.save(content, author);
    }

    fun list(): MutableList<WiseSaying> {
        return repository.findAll()
    }
}