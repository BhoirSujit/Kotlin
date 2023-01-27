class OuterClass
{
    class NestedClass
    {
        fun foo() = "Welcome to jungle : Jumanji"
    }
}

fun main()
{
    var out = OuterClass.NestedClass()
    println(out.foo())
}


/*
Output
Welcome to jungle : Jumanji
 */
