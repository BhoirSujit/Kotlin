package collection

fun main()
{
    var immutableSet = setOf(1,1,3,3,5,"Android","Java")
    for (item in immutableSet)
    {
        println(item)
    }
}

/*
Output
1
3
5
Android
Java
 */