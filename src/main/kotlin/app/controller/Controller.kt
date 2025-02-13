package com.ll.app.controller

import com.ll.app.service.Service
import java.util.*

class Controller(
    val service: Service = Service()
) {

    fun actionAdd(scanner: Scanner) {
        print("명언 : ")
        val content = scanner.nextLine()
        print("작가 : ")
        val author = scanner.nextLine()

        val wiseSaying = service.add(content, author);

        println("${wiseSaying.id}번 명언이 등록되었습니다.")
    }

    fun actionList() {
        println("번호 / 작가 / 명언")
        println("----------------------")

        val wiseSayings = service.list()

        for(wiseSaying in wiseSayings.reversed()) {
            println("${wiseSaying.id} / ${wiseSaying.content} / ${wiseSaying.author}")
        }
    }
}