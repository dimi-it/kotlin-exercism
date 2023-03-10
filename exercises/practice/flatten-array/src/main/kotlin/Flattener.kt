object Flattener {
    var list: MutableList<Any> = mutableListOf()
    fun flatten(source: Collection<Any?>): List<Any> {
        list = mutableListOf()
        flattenRecusrsive(source)
        return list
    }

    fun flattenRecusrsive(source: Collection<Any?>): Unit {
        source.forEach { it ->
            if (it is List<*>) {
                flattenRecusrsive(it)
            } else if (it != null) {
                list.add(it)
            }
        }
    }
}