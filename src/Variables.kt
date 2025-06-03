fun main(){
    /*Variable type
    * var == value can be changed (mutable)
    * val == value cannot be changed/reassigned (immutable)
    * println == method used to display variables
    * + == character that combines both text and a variable, add a variable to another variable, works as a mathematical operator, and concatenate strings.
    */


    val batman = "Bruce Wayne"
    var superman = "Clark Kent"
    superman = "Kal-El" //changing Superman's name to his other alias
    val wonderWoman = "Diana Prince"

    val dianaPrince = 1
    val bruceWayne = 1
    val clarkKent = 1
    var holyTrinity = 1 + 1 + 1 //adds all three digits
    holyTrinity = dianaPrince + 1 + 1 //adds a variable with numbers
    holyTrinity = dianaPrince + clarkKent + 1
    holyTrinity = dianaPrince + clarkKent + bruceWayne //adds all three variables

    println("The DC comics' holy trinity are Wonder Woman, Superman, and Batman.")
    println("Their aliases are $wonderWoman, $superman, and $batman.")
    println("These $holyTrinity heroes are the cornerstone of the Justice League.")


    val suria = "Suria" //Kotlin is smart enough to understand the type of variable based on its value

    val angela: String = "Angela" //You can specify the type if you insist

    val jayden: String //When declaring a variable without a value, the type must be specified
    jayden = "Jayden"


    /* Variable Names
    * can be short or descriptive
    * can contain letters, digits, underscores, and dollar signs
    * should start with a letter
    * can also begin with $ and _
    * are case-sensitive
    * should start with a lowercase letter, and it cannot contain whitespace
    * use camelCase for good practice as it makes it easier to read the variable name
    */
}