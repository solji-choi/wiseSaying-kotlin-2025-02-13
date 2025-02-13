package com.ll.app

import com.ll.app.controller.Controller
import java.util.*

class App(
    val scanner: Scanner = Scanner(System.`in`),
    val controller: Controller = Controller()
) {
    fun run() {
        println("== 명언 앱 ==")

        while (true) {
            print("명령) ")
            val cmd = scanner.nextLine()

            if (cmd == "종료") break;

            if (cmd == "등록") {
                controller.actionAdd(scanner);
            }


        }


    };
}