package transposition


object Enter {

    private val A = listOf("D#", "E", "F", "F#", "G", "G#", "A", "A#", "H", "C", "C#", "D")
    private val B = listOf("B-6", "B-5", "B-4", "B-3", "B-2", "B-1", "B", "B+1", "B+2", "B+3", "B+4", "B+5")

    private fun trans(accord: String, grade: Int): String {
        return if (grade in -6..5)
            when (accord) {
                "A" -> A[grade + 6]
                "B" -> B[grade + 6]
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