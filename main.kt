
fun main(args: Array<String>) {

    val dog = "empty"
    val cat = "Nina"
    println("My dog is:" + dog + "and my cat is:" + cat)
    println("My dog is: $dog and my cat is $cat")


    /*
        val <-> immutable
        var <-> mutable
     */

    val mySet = setOf(
        "lsd", "cp", "cn", "fcpl", "cp"
    )
    println(mySet)

    val myList = mutableListOf(
        1, 2, 3, 4, 5, 10
    )
    myList.add(33)
    myList.remove(3)
    println(myList)

    val myMap = mutableMapOf(
        "Value1" to 1, "Value2" to 2, "Value3" to 3
    )
    myMap.remove("Value2")
    myMap.keys.remove("Value1")
    myMap.values.remove(2)

    val y = 0
    val x = if(y == 0) 0 else 1

    var i = 0
    for (number in myList){
        println(number)
    }
    for (index in mySet.indices){
        println(index)
    }
    for( i in 0..3 step(1)){
        println(myList[i])
    }

    for (number in myList) {
        val x = when (number){
            1 -> number * 10
            2, 3, 4, 5 -> number * 100
            else -> number / 10
        }
        println(x)
    }

    val newString = function1("param1", 10, def2 = "name")

    val numberReturned = mult(5)

    val new_string : (String) -> (Int) ={
            str -> str.length
    }
    val my_length = new_string("length")

    val firstClass = FirstClass(false)
    println(firstClass)

    val r = FirstClass.incresePrice(4)

    val Mark = People("brown", false, 15)
    val Ghita = People("blonde", true, 3)

    Mark.apply {
        trimHair(3)
        colorHair("blonde")
    }

}
fun function1(p1 : String, p2 : Int, defaultParam : String = "STRING", def2 : String = "qwer") : String{
    return p1 + defaultParam;
}
fun mult(number : Int) = number * 2
}