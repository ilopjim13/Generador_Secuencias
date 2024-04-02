fun limpiarPantalla() {
    // Imprime 50 caracteres de nueva línea para "limpiar" la pantalla
    repeat(50) { println() }
}

fun enterContinuar() {
    print(">> Dale <ENTER> para continuar...")
    readln()
    println()
}

fun main() {
    val consola: EntradaSalida = Consola()
    val generador = GeneradorSecuencias(consola)

    val menu = Menu(consola, generador)

    menu.mostrarMenu()
}