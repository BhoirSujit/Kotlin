class EmployeeData(var empId : Int, var empName : String)
{
    companion object
    {
        val companyName = "Google"
        val companyLocation = "New York"
    }
}

fun main()
{
    println("Campanion Object Data - ${EmployeeData.companyLocation} & ${EmployeeData.companyName}")

}