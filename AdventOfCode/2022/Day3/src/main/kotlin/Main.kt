// Day 3 !!
// Kotlin BAYBEEE!!

import java.io.File

fun main() {
    val filePath = "src/main/resources/input.txt"
    val file = File(filePath)
    var dupItem: String
    var sumOfPriority = 0


    if(file.exists()) {
        file.bufferedReader().use { reader ->  // Adding .use to automatically close file.
            reader.forEachLine { line -> // Loop through each line
                val (firstHalf, secondHalf) = splitRucksack(line) // split line into two strings
                dupItem = findItem(firstHalf, secondHalf) // locate duplicate item
                sumOfPriority += calculateTotalPriority(dupItem) // convert item to priority number, and add to total.
            }
            println(sumOfPriority)
        }
    }
}

// splits the line in the file, into two equal strings.
fun splitRucksack(contents: String): Pair<String, String> {

    val length = contents.length
    val midpoint = length / 2

    val firstHalf = contents.substring(0,midpoint)
    val secondHalf = contents.substring(midpoint)

    return Pair(firstHalf, secondHalf)
}

// finds the similar item on each half.
fun findItem(firstHalf: String, secondHalf: String): String{

    var ans = 'a'
    firstHalf.forEach {
        if(it in secondHalf){ ans = it}
    }
    return ans.toString()
}

// No lie, ChatGPT helped a little with this function ....
fun calculateTotalPriority(input: String): Int {

    val typeToPriorityMap = ('a'..'z').zip(1..26).toMap() + ('A'..'Z').zip(27..52).toMap()

    return input.sumOf { typeToPriorityMap.getOrDefault(it, 0) }
}
