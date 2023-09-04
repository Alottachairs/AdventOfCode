import java.io.File

fun main() {
    val filePath = "src/main/resources/input.txt"
    val file = File(filePath)
    val groups = mutableListOf<String>()
    var groupIndex = 0
    var total_priority = 0

    if(file.exists()){
        file.bufferedReader().use {reader ->
            reader.forEachLine { line ->
                groups.add(line)

            }
        }
    }
    do {
       var x = groups[groupIndex]
        groupIndex++
       var y = groups[groupIndex]
        groupIndex++
       var z = groups[groupIndex]
        groupIndex++
       total_priority += findInThree(x,y,z)
    } while (groupIndex < groups.size)
    println("Total: $total_priority")
}

fun findInThree(first: String, second: String, third: String): Int{

    var ans = 'a'
    first.forEach {
        if( it in second && it in third ){ ans = it}
    }
    return calculateTotalPriority(ans.toString())
}
