package com.hyeonjin.variable

class VariableSample {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val name = "Hyeonjin";
            var age = 12;
            age = 15;

            println("name : $name, age : $age");
        }
    }

}