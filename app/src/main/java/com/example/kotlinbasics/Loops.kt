package com.example.kotlinbasics

fun main() {

    val shopingList = listOf("Processor","Ram","Cooling System","Ssd")
for (item in shopingList){
    println(item)
    if (item.equals("ram", true)){
        break
    }
}
}

