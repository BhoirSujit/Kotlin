package collection

fun main()
{
    val immutableMap = mapOf(9 to "Android", 8 to "Windows", 7 to "Linux")
    for (key in immutableMap.keys)
    {
        println(immutableMap[key])
    }
}

/*
Output
Android
Windows
Linux
 */