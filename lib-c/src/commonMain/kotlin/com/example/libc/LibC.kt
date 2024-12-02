package com.example.libc

import com.example.liba.LibA
import com.example.libb.LibB

object LibC {
    fun sayHelloFromLibA() {
        LibA.sayHello()
    }

    fun sayHelloFromLibB() {
        val libB = LibB()
        libB.sayHello()
    }
}
