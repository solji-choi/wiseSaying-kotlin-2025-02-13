package com.ll.app.controller

import com.ll.app.entity.WiseSaying
import java.util.*

class Controller(
    var lastId: Int = 0,
    val wiseSayings: MutableList<WiseSaying> = mutableListOf()
) {

    fun actionAdd(scanner: Scanner) {
        print("명언 : ")
        val content = scanner.nextLine()
        print("작가 : ")
        val author = scanner.nextLine()

        lastId++

        wiseSayings.add(WiseSaying(lastId, content, author))

        println("${lastId}번 명언이 등록되었습니다.")
    }

    fun actionList() {
        println("번호 / 작가 / 명언")
        println("----------------------")

        for(wiseSaying in wiseSayings.reversed()) {
            println("${wiseSaying.id} / ${wiseSaying.content} / ${wiseSaying.author}")
        }
    }
}