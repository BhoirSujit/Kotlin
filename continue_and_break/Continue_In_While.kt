package continue_and_break

fun main()
{
    var i = 0
    while(i++ < 10)
    {
        if (i==3) continue
        println(i)
    }
}

/*
Output
1
2
4
5
6
7
8
9
10
 */