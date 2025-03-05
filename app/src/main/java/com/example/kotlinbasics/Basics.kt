import com.example.kotlinbasics.Dog

//package com.example.kotlinbasics
//
//fun main() {
//    println("hello word!")
//
//    var age: UShort = 35u
//
//    //boolean
////
////    val myTrue:Boolean=true
////    val myFalse:Boolean=false
////    println( myTrue || myFalse )
////    println(myFalse&&myTrue)
////    println(!myTrue)
//
////Char
//
//
////    val myChar ='\u00AE'
////    println(myChar)
//
////    strings
//
////    var name="Junaid"
//////    name="ftfjhgfjhfjhf jhfjhgfhgf jhfjhfghgfh"
////    println(name + " Shah")
//    println("enter age")
//
//    var myAge= 87
//    myAge= readln().toInt()
//
//    if (myAge>=18) {
//
//
//        println("you can go in ")
//
//    }else{
//        println("not allowed")
//    }
////}
//                                   // LOOPS
//
//fun main() {
//
//    var count =0
//   while (count < 10){
//       println("Count is $count")
//       count++
//
//   }
//}
data class CoffeeDetails(
    val sugarCount: Int,
    val name: String
)

fun main() {
    val coffeeForJunaid = CoffeeDetails(2, "junaid")
   makeCoffee(coffeeForJunaid)

}

//fun askDetails() {
//println("who is this coffee for")
//    val name = readln()
//    println("how many pieces of sugar you want?")
//    val sugarCount= readln()
//    val sugarCountInt=sugarCount.toInt()
//makeCoffee(coffeeDetails = sugarCountInt,name)
//}
//fun makeCoffee(){
//    println("Buy Beans")
//    println("grind")
//    println("add hot water to the grinded beans")
//
//
//}
fun makeCoffee(coffeeDetails: CoffeeDetails) {
    if (coffeeDetails.sugarCount == 1) {
    println("coffee with ${coffeeDetails.sugarCount} spoons of sugar for ${coffeeDetails.name}")
    }else if (coffeeDetails.sugarCount ==0)
    {
        println("coffee with no sugar for ${coffeeDetails.name}")
    }else{
        println("coffee with ${coffeeDetails.sugarCount} spoons of sugar for ${coffeeDetails.name}")
    }

}
//    println()
//}
//
//fun main() {
//    println("Enter User Number1")
//    val num1Str= readln()
//    val num1=num1Str.toInt()
//    println("Enter Number 2")
//    val num2Str= readln()
//    val num2=num1Str.toInt()
//    val myResult=add(num1,num2)
//println(myResult)
//}
//
//fun add (a:Int,b:Int):Int{
//    val result= a+b
//    return result
//}
//fun main() {
//    var ranbow =Dog("Ranbow")
//}

