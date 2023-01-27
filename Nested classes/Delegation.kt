package `Nested classes`

interface delegation
{
    fun myMessage()
    fun myMessageAgeLine()
}

class DelegationImplementation(val y : String) : delegation
{
    override fun myMessage() {
        print(y)
    }

    override fun myMessageAgeLine() {
        println(y)
    }
}

class NewFeature(m : delegation) : delegation by m
{
    override fun myMessage() {
        print("Hello")
    }
}


fun main()
{
    val b = DelegationImplementation("\nWelcome, to the world of kotlin!")

    NewFeature(b).myMessage()
    NewFeature(b).myMessageAgeLine()
}

/*
Output
Hello
Welcome, to the world of kotlin!
 */