open class A3
{
    protected var int = 10
}

class B3 : A3()
{
    fun getValue(): Int
    {
        return int
    }
}

fun main()
{
    var b = B3()
    println("The value of int is ${b.getValue()}")
}

/*
Output
The value of int is 10
 */