import java.io.File
import java.lang.IllegalArgumentException

fun main() {
    var total_score=0
    val filePath = "src/main/resources/example.txt"
    val file = File(filePath)

    if(file.exists()) {
        file.forEachLine { line ->
            if ( line.length == 3 ) {
                val opponentChoice = convertToPoints(line[0])
                val yourChoice = convertToPoints(line[2])
                total_score += calculateScore(opponentChoice,yourChoice)

            } else {println("length is wrong")}
        }
    } else {
        println("File not found: $filePath")
    }
    println("Total Score: $total_score")

}

fun convertToPoints(c: Char): Int {
    val points = when (c) {
        'A', 'X' -> 1 // Rock
        'B', 'Y' -> 2 // Paper
        'C', 'Z' -> 3 // Scissors
        else -> throw IllegalArgumentException("Invalid convert to points")
    }
    return points
}

fun calculateScore(oc: Int,yc: Int ): Int {
    var score = 0
    if(oc == yc){score = 3 + yc}
    else if(oc == 1){when(yc) {
        2 -> score = yc + 6
        3 -> score = yc
        else -> throw IllegalArgumentException("ILLEGALLL!!!!!")
    }}
    else if(oc == 2){when(yc){
        3 -> score = yc + 6
        1 -> score = yc
        else -> throw IllegalArgumentException("ILLEGALLL!!!!!")

        }
        }
    else if(oc == 3) {
        when (yc) {
            1 -> score = yc + 6
            2 -> score = yc
            else -> throw IllegalArgumentException("ILLEGALLL!!!!!")
        }
    }
    return score

}