class Matrix(matrixAsString: String) {
    private val matrix: List<List<Int>> = matrixAsString.split('\n')
        .map { row -> row.split(' ')
            .map { element -> element.toInt() }
        }

    fun column(colNr: Int): List<Int> = matrix.map { row -> row[colNr - 1]}

    fun row(rowNr: Int): List<Int> = matrix[rowNr - 1]
}
