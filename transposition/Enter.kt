package transposition


object Enter {

    private val A = listOf("D#", "E", "F", "F#", "G", "G#", "A", "A#", "H", "C", "C#", "D")
    private val B = listOf("E", "F", "F#", "G", "G#", "A", "B", "H", "C", "C#", "D", "D#")
    private val C = listOf("F#", "G", "G#", "A", "A#", "H", "C", "C#", "D", "D#", "E", "F")

    private fun trans(accord: String, grade: Int): String {
        return if (grade in -6..5)
            when (accord) {
                "A" -> A[grade + 6]
                "B" -> B[grade + 6]
                "C" -> C[grade + 6]
                else -> accord
            } else {
            accord
        }
    }


    @JvmStatic
    fun main(args: Array<String>) {

        println("Replace A grade -6 = [${trans("A", -6)}]")
        println("Replace A grade 0 = [${trans("A", 0)}]")
        println("Replace A grade 5 = [${trans("A", 5)}]")
        println("Replace A grade 8 = [${trans("A", 8)}] <- fail")


    }


}