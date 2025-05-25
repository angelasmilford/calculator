fun main(){
    /* Expression
    * An expression evaluates to something
    * "2 + 2" is an expression that evaluates to "4"
    * "x + 2" is an expression that adds 2 to the value stored in "x"
    */


    //Arithmetic expressions
    var a = 1 + 1 //evaluates to 2
    val b = a * 10 //evaluates to 10 times the value of x
    val c = (a + b)/2 //average of a and b
    println(a)
    println(b)
    println(c)

    println("")


    //Boolean expressions
    var superman = 5
    var batman = 8
    println(superman > batman)

    val isKotlinFun: Boolean = true
    val arePicklesTasty = false
    println(isKotlinFun)
    println(arePicklesTasty)

    println("")


    //If...Else expressions
    val number = 21
    val age = if(number == 21) { //similar to Java's "ternary operator" (short hand if...else)
        println("You can now sponsor a parent for U.S. permanent residency.")
    }else{
        println("Unfortunately, you cannot sponsor a parent for U.S. permanent residency because you're eighteen.")
    }

    println("")


    //when expression
    val month = 1

    val result = when (month) { //"when" is similar to Java's "switch" statement
        1 -> "January"
        2 -> "February"
        3 -> "March"
        4 -> "April"
        5 -> "May"
        6 -> "June"
        7 -> "July"
        8 -> "August"
        9 -> "September"
        10 -> "October"
        11 -> "November"
        12 -> "December"
        else -> "Invalid month."
    }

    println(result)
}