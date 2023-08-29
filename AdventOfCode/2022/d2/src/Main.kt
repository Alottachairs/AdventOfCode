import java.io.InputStreamReader

fun main() {
    // Load the text file as an InputStreamReader
    val inputStream = MainKt::class.java.classLoader.getResourceAsStream("example.txt")

    if (inputStream != null) {
        // Create a reader to read the text from the InputStreamReader
        val reader = InputStreamReader(inputStream)
        var char: Int

        // Read and print each character from the file
        while (reader.read().also { char = it } != -1) {
            print(char.toChar())
        }

        // Close the reader
        reader.close()
    } else {
        println("File not found.")
    }
}
