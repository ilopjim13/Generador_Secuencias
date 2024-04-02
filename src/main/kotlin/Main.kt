fun main() {
    val consola:EntradaSalida = Consola()
    val generador = GeneradorSecuencias(consola)

    var num: Int = consola.pedirNum("Introduce el número de palabras: ")

    generador.fraseIncremental(num)

    num = consola.pedirNum("Introduce el número de palabras: ")

    generador.fraseFinal(num)
}