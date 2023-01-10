package oops

class Sum
{
    constructor(a : Int, b : Int)
    {
        var c = a+b
        println("The sum of number is $c")
    }
}

fun main()
{
    Sum(5,6)
}

/*
Output
The sum of number is 11
 */