package oops.Inheritance


open class Person(var roll : String = "Person", var name : String = "S")
{
    fun eat()
    {
        println(name + " is eating")
    }
    fun sleep()
    {
        println("$name is sleeping")
    }
}

class Student(name: String) : Person("Student", name)
{
    fun activity()
    {
        println("$name is a $roll. $name is studying in school")
    }

    fun doAll()
    {
        eat()
        sleep()
        activity()
    }
}

class Teacher(name : String) : Person("Teacher", name)  {
    fun activity()
    {
        println("$name is a $roll. $name teaches at school")
    }

    fun doAll()
    {
        eat()
        sleep()
        activity()
    }
}

fun main()
{
    var student1 = Student("sujit")
    var teacher1 = Teacher("Kundan sir")

    println("\n\nabout "+ student1.name + "\n")
    student1.doAll()

    println("\n\nabout "+ teacher1.name + "\n")
    teacher1.doAll()

}

/*
Output


about sujit

sujit is eating
sujit is sleeping
sujit is a Student. sujit is studying in school


about Kundan sir

Kundan sir is eating
Kundan sir is sleeping
Kundan sir is a Teacher. Kundan sir teaches at school

 */