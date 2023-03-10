class Reactor<T>() {
    // Your compute cell's addCallback method must return an object
    // that implements the Subscription interface.
    interface Subscription {
        fun cancel()
    }

    inner class InputCell(var value: Int){

    }

    inner class ComputeCell(vararg input: InputCell, ){

    }
}
