var i = 0
fun main() {
    println("hello, world")
    var a = 10
    //this is comment
    /*this
    is
    multiline
    comment
     */
    println("a is : $a")

    //val and var
    var name = "sujit"
    val age = 18
    print(name)
    print(" " + age + "  ")

    var day: String = "Thursday"
    var date: Int = 26

    println("day is $day, date is $date")

    a += 5
    println("a is after += : $a")
    println(name.length)
    var name2 = "aumat"
    println(name.compareTo(name2))
    println(name.indexOf("j"))
    println("hello 'world'")

    var x = 5
    var y = 10
    println(x > y)

    val time = 11
    if (time < 10) {
        println("Good morning.")
    } else if (time < 20) {
        println("Good day.")
    } else {
        println("Good evening.")
    }
// Outputs "Good evening."

    main2()
    kotlinWhen()
    kotlinWhile()
    kotlinDoWhile()
    kotlinBreckContinue()
    kotlinArray()
    kotlinRange()

}
fun main2() {
    val time = 20
    val greeting = if (time < 18) "Good day." else "Good evening."
    println(greeting)
}

// Kotlin When
fun kotlinWhen() {
    val day = 4

    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }
    println(result)

// Outputs "Thursday" (day 4)
}

// While
fun kotlinWhile(){
    while (i < 5){
        println(i)
        i++
    }
}

//do while
fun kotlinDoWhile(){
    println("in do while loop i = $i")
    do {
        println(i)
        i++
    }
    while (i < 10)
}

//breck and continue
fun kotlinBreckContinue(){
    var z = 10
    while (z > 0){
        if(z ==8){
            z--
            continue
        }
        if (z == 3){
            break
        }
        println(z)
        z--


    }
}

//array
fun kotlinArray() {
    var fruit = arrayOf("mango","banana")
    println(fruit[1])
    fruit[1] = "apple"
    println(fruit[1])
    for (fr in fruit){
        println(fr)
    }
}

//range
fun kotlinRange() {
    //printing 2 table
    for (be in 2..20){
        if (be % 2 == 0){
            println(be)
        }
    }
}
