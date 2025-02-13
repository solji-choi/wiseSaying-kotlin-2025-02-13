package com.ll.app

import java.util.*

class App(
    val scanner: Scanner = Scanner(System.`in`)
) {
    fun run() {
        println("== 명언 앱 ==")

        while (true) {
            print("명령) ")
            val cmd = scanner.nextLine()

            if (cmd == "종료") break;

            if (cmd == "등록") {
                print("명언 : ")
                val content = scanner.nextLine()
                print("작가 : ")
                val author = scanner.nextLine()
            }


        }


    };
}