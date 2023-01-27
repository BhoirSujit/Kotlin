package `Nested classes`

interface Human {
    fun think()
}

fun main()
{
    var programmer : Human = object: Human {
        override fun think() {
            print("I am an example of Anonymous Inner Class")
        }
    }

    programmer.think()
}