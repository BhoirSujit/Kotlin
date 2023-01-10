import java.util.Scanner;

fun main()
{
    var sc = Scanner(System.`in`)
    print("Enter your name : ")
    var name = sc.nextLine()
    print("Enter your age : ")
    var age = sc.nextInt()


    println("hi $name, your age is $age")
}

/*
Output
Enter your name : sujit
Enter your age : 19
hi sujit, your age is 19
 */