package control_statement

fun main()
{
    var day = 3
    var result = when (day)
    {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednessday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day"
    }

    println("day is $result")
}

/*
Output
day is Wednessday
 */