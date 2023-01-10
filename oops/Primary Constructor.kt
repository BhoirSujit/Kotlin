package oops

class Person(val firstname : String, val age : Int)
{}

fun main()
{
    var p = Person("Sujit", 19)
    println("name is = ${p.firstname}")
    println("age is = ${p.age}")
}

/*
Output
name is = Sujit
age is = 19
 */