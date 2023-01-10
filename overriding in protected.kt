open class A5
{
    open protected var int = 10
}

class B5 : A5()
{
    override var int = 20
    fun getValue() : Int
    {
        return int
    }
}

fun main()
{
    var b = B5()
    println("The overrided value of int is ${b.getValue()}")
}

/*
Output
The overrided value of int is 20
 */