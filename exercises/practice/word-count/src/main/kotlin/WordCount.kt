object WordCount {

    fun phrase(phrase: String): Map<String, Int> {
        val map: MutableMap<String, Int> = mutableMapOf()
        Regex("[a-z0-9]+('?[a-z0-9]+)?").findAll(phrase.lowercase())
            .map{it.value}
            .forEach{map[it] = (map[it]?.plus(1)) ?: 1}
        return map
    }
}
