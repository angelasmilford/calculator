fun main() {
    val nightwing = "Richard Grayson"
    val redHood = "Jason Todd"
    val redRobin = "Timothy Drake"
    val robin = "Damian Wayne"

    if(nightwing == "Richard Grayson" && redHood == "Jason Todd" && redRobin == "Timothy Drake" && robin == "Damian Wayne") {
        println("These are the sons of Bruce Wayne: $nightwing, $redHood, $redRobin, and $robin.")
    }else{
        println("These are the pupils of Bruce Wayne: $nightwing, $redHood, $redRobin, and $robin.")
    }

    println("")


    val pacificIsland = 4

    val pacificIslands = when (pacificIsland) {
        1 -> "Samoa"
        2 -> "Fiji"
        3 -> "Tonga"
        4 -> "American Samoa"
        5 -> "Hawaii"
        6 -> "New Zealand"
        7 -> "Cook Islands"
        8 -> "Tahiti"
        9 -> "Palau"
        10 -> "Federated States of Micronesia"
        11 -> "Nauru"
        12 -> "Kiribati"
        13 -> "Wallis and Futuna"
        else -> "Please enter a valid Pacific Island"
    }

    println(pacificIslands)


}