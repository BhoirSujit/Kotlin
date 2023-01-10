package oops

class MyClass
{
    private var name : String = "Object Oriented Language"
    fun printB()
    {
        println("Kotlin is "+name)
    }
}

fun main()
{
    val obj = MyClass()
    obj.printB()
}

/*
Output
Kotlin is Object Oriented Language
 */