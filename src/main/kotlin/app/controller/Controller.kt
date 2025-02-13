package com.ll.app.controller

import java.util.*

class Controller(
    var lastId: Int = 0
) {

    fun actionAdd(scanner: Scanner) {
        print("명언 : ")
        val content = scanner.nextLine()
        print("작가 : ")
        val author = scanner.nextLine()

        lastId++

        println("${lastId}번 명언이 등록되었습니다.")
    }
}