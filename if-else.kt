package com.genarossi19.helloworld

fun main(args: Array<String>) {
    val result = add(5, 10)

    if(result > 10){
        println("El resultado es mayor que 10")
    }else{
        println("El resultado es menor que 10")
    }
}

fun add(firstNumber: Int, secondNumber: Int) : Int = firstNumber + secondNumber