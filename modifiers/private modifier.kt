private class A2 {
    private var int = 10
    fun display()
    {
        println("Accessing int Successfully")
    }
}

fun main(args: Array<String>)
{
    var a = A2()
    a.display()
    //println(a.int)
}

//getting error because class A2 is private cant accessible outside the class
