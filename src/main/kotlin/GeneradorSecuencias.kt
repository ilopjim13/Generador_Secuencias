class GeneradorSecuencias {

    lateinit var sec:Sequence<String>

    fun lineSequence(limit: Int = Int.MAX_VALUE) = generateSequence { readln() }.constrainOnce().take(limit)

    fun fraseIncremental(num: Int) {

    }

    fun fraseFinal() {

    }

    fun getSec() {

    }

    fun mostrarSec() {

    }

}