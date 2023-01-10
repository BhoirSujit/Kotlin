internal class A4 {}

public class B4
{
    internal val int = 10
    internal fun display()
    {
        println("Hello world")
    }
}

fun main()
{
    var b = B4()
    println(b.int)
    b.display()
}

/*
Output
10
Hello world
 */