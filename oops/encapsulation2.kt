package oops

class Data(var name : String, var age : Int)
{
    var isAdult : Boolean
        get()
        {
            return if(age > 18) true else false
        }
        set(value)
        {
             age = if (value) 19 else age
        }
}

