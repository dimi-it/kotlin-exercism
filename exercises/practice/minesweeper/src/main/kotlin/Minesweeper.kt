data class MinesweeperBoard(val rows: List<String>) {

    val matrix: MutableList<List<String>> = mutableListOf()

    init{
        for(row in rows){
            val elements = row.split(' ')
            matrix.add(elements)
        }
    }

    fun countAdj(val row: Int, val col:Int): String{
        val count: Int = 0
        val lx = if(col > 0) col-1 else col
        val rx = if(col - 1 < matrix[0].size) col+1 else col
        val up = if(row > 0) row-1 else row
        val dw = if(row - 1 < matrix.size) row+1 else row
        for(i in up..dw){
            for(j in lx..rx){
                if(matrix[i][j] == "*"){
                    count += 1
                }
            }
        }
        return count
    }

    fun withNumbers(): List<String> {
        val result: MutableList<String> = mutableListOf()
        for(i in matrix.indices){
            val strOut: String = ""
            for(j in matrix.indices){
                if(matrix[i][j] != "*"){
                    strOut += countAdj(i, j)
                }
                else{
                    strOut += "*"
                }
            }
            result.add(strOut)
        }
    }
    return result
}
