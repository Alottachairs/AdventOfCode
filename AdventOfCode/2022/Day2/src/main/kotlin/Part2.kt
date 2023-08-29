import java.io.File
import java.io.Serializable
import kotlin.IllegalArgumentException

fun main() {
    var totalScore=0
    val filePath = "src/main/resources/input.txt"
    val file = File(filePath)

    if(file.exists()) {
        file.forEachLine { line ->
            if ( line.length == 3 ) {
                val opponentChoice = convertToPoints(line[0])
                val outcome = calculateOutcome(opponentChoice, line[2])
                println(outcome)
                totalScore += outcome

            } else {println("length is wrong")}
        }
    } else {
        println("File not found: $filePath")
    }
    println("Total Score: $totalScore")

}
fun calculateOutcome(op: Int, out: Char): Int {
    var yp = 0
    when (out) {
       'X' ->  when (op) { // To lose
               1 -> yp = 3
               2 -> yp = 1
               3 -> yp = 2
               else -> IllegalArgumentException("ERR")
           }
       'Y' -> yp = op
       'Z' -> when (op) { // Need to Win
           1 -> yp = 2
           2 -> yp = 3
           3 -> yp = 1
           else -> IllegalArgumentException("ERRR")
       }
       else -> IllegalArgumentException("ERRRR")
   }

   return calculateScore(op, yp)
}