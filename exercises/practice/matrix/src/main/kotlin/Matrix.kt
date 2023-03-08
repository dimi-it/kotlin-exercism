class Matrix(matrixAsString: String) {
    private val matrix: MutableList<List<Int>> = mutableListOf()

    init{
        val rows = matrixAsString.split('\n')
        for(row in rows) {
            val elements = row.split(' ')
            val list: MutableList<Int> = mutableListOf()
            for (element in elements) {
                list.add(element.toInt())
            }
            matrix.add(list)
        }
    }

    fun column(colNr: Int): List<Int> {
        val list: MutableList<Int> = mutableListOf()
        for(row in matrix){
            list.add(row[colNr - 1])
        }
        return list
    }

    fun row(rowNr: Int): List<Int> {
        return matrix[rowNr - 1]
    }
}
