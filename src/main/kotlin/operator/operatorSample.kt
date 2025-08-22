package com.hyeonjin.operator

class operatorSample {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var a = 10 + 100
            var b = 20 + 200
            var c = 30 + 300

            println(a + b)
            println(a - b)
            println(a * b)
            println(a / b)
            println(a % b)

            println(a > b)
            println(a < b)
            println(a >= b)
            println(a <= b)

            println(a == b)
            println(a != b)

            println(a > b && a > c)
            println(a > b || a > c)
        }
    }
}