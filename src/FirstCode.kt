//fun keyword is used to create a function in Kotlin.
fun main(args : Array<String>)
{
    //println is used to print a statement in kotlin.
    println("Hey People !! Welcome to the Kotlin World.");

    //A reference to an object of the class Actor is created in the stmt below.
    var a1 = Actor();

    //Accessing the name attribute of the object using dot operator.
    a1.name = "Jon Snow";
    println("The name is " + a1.name);

    //ERROR ! The statement below gives an error as industry is a constant whose value cannot be changed.
    //a1.industry = "Bollywood";

    //Therefore, industry remains the same i.e Hollywood.
    println("The industry is " + a1.industry);

    //Second way of printing an attribute's value using $ and {}.
    println("The name is ${a1.name}" );
    println("The industry is ${a1.industry}");
}

class Actor
{
    //var keyword is used to declare a variable in Kotlin.
    var name : String = "";

    //val keyword is used to declare a constant in Kotlin.
    val industry : String = "Hollywood";
}