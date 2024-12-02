package com.example.libb

import com.example.liba.LibA

class LibB {
    fun sayHello() {
        println("Hello")
    }

    fun sayHelloFromLibA() {
        LibA.sayHello()
    }
}
