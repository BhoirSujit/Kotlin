package oops

fun main()
{
    val name = "Java"
    if (name is String)
    {
        println("String : '$name' of length ${name.length}")
    }
}

/*
Output
String : 'Java' of length 4
 */