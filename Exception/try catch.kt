package Exception

fun main()
{
    try
    {
        val message = "Lets learn kotlin together"
        message.toInt()
    }
    catch(e : NumberFormatException)
    {
        println(e)
    }
}

/*
Output
java.lang.NumberFormatException: For input string: "Lets learn kotlin together"
 */