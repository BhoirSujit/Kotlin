package Exception

fun main()
{
    try
    {
        val result = 25/0
        result
    }
    catch (e : NumberFormatException)
    {
        println(e)
    }
    catch (e : ArithmeticException)
    {
        println(e)
    }
    catch (e : Exception)
    {
        println(e)
    }
}

/*
Output
java.lang.ArithmeticException: / by zero
 */