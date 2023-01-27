class Circle (val radius : Double)
{
    fun area() : Double {
        return Math.PI * radius * radius;
    }
}

fun main()
{
    fun Circle.perimeter() : Double
    {
        return 2 * Math.PI * radius
    }

    val newCircle = Circle(2.5)
    println("Area of the circle is ${newCircle.area()}")
    println("Perimeter of the circle is ${newCircle.perimeter()}")
}

