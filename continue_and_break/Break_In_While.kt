package continue_and_break

fun main()
{
    var i = 0
    while(i++ < 100)
    {
        println(i)
        if (i==3) break
    }
}

/*
Output
1
2
3
 */