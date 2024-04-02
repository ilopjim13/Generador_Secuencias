class GeneradorSecuencias(private val consola:EntradaSalida) {

    private lateinit var sec:Sequence<String>

    private fun lineSequence(limit: Int = Int.MAX_VALUE) = generateSequence { readln() }.constrainOnce().take(limit)

    fun fraseIncremental(num: Int) {
        var palabras = ""
        sec = lineSequence(num)
        sec.forEach {
            palabras += "$it "
            consola.mostrar(palabras) }
    }

    fun fraseFinal(num:Int) {
        sec = lineSequence(num)
        mostrarSec()
    }

    fun getSec() = sec.toList().joinToString(" ")

    fun mostrarSec() {
        consola.mostrar(getSec())
    }

}