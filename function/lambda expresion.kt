package function

fun addNumber(a:Int , b: Int, mylambda : (Int) -> Unit)
{
    val add = a + b
    mylambda(add)
}

fun main(args : Array<String>)
{
    val mylambda : (Int) -> Unit = {
        s: Int ->
        println(s)
    }

    addNumber(5, 10, mylambda)
}

/*
Output
15
 */