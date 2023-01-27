package `Nested classes`

class Outer
{
    private val welcomeString : String = "Welcome"
    inner class Inner
    {
        fun foo() = welcomeString
    }
}

fun main()
{
    val out = Outer().Inner()
    println(out.foo())
}

/*
Output
Welcome
 */
