package oops

class Employee (var name : String, var salary : Int, var age : Int)
{
    var isSenior : Boolean


        get()
        {
            print("here we read the value")
            return age!! > 35
        }
        set(value)
        {
            if (value)
            {
                print("here we write the new value")
                age = 35
            }
            else null
        }
}

fun main()
{
    var emp = Employee(name="job", salary= 1000, age=38)
    println("Employee is senior? : ${emp.isSenior}")
    emp.isSenior  = false

}

/*
Output
here we read the valueEmployee is senior? : true
 */