// My First Calculator program!

fun main() {
    println("Enter a number: ")
    val x = readLine()!!.toDouble()

    /*
     * readLine() reads user input as a string
     * !! asserts that the input is not null
     * .toDouble() converts the input to a Double
     */

    println() // Adds a blank line

    println("Choose an operator (*, /, +, -): ")
    val operator = readLine()!! // Read user's chosen operator

    println() // Adds a blank line

    println("Enter another number: ")
    val y = readLine()!!.toDouble() // Read and convert the second number to Double

    println() // Adds a blank line

    // Perform calculation based on the selected operator
    val operation = when (operator) {
        "*" -> x * y // Multiplication
        "/" -> {
            if (y == 0.0) {
                "Cannot divide by zero" // Handle division by zero
            } else {
                x / y // Division
            }
        }
        "+" -> x + y // Addition
        "-" -> x - y // Subtraction
        else -> "Invalid operator" // Handle invalid input
    }

    println() // Adds a blank line

    println("The result is $operation")

    /*
     * The "when" expression works like a "switch" statement.
     * It selects the operation based on the operator entered.
     */
}