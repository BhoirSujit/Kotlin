fun main()
{
    fun Int.abs() : Int
    {
        return if (this < 0) this else this
    }

    println((-4).abs())
    println(4.abs())
}