class A
{
    var int = 10
}

public class B
{
    var int2 = 20
    fun display()
    {
        println("Accessible anywhere")
    }
}

fun main()
{
    var a = A()
    println(a.int)

    var b = B()
    println(b.int2)
    b.display()
}

/*
Output
10
20
Accessible anywhere
 */