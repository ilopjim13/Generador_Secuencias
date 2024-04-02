class Menu(private val consola: EntradaSalida, private val generador: GeneradorSecuencias) {

    fun mostrarMenu() {
        var opcion:Int
        do {
            consola.mostrar("1. Mostrar incrementalmente.")
            consola.mostrar("2. Mostrar palabra al final.")
            consola.mostrar("3. Salir.")

            opcion = consola.pedirNum(">> Introduce la opción: ")

            ejecutarOpcion(opcion)

        } while (opcion != 3)
    }

    private fun ejecutarOpcion(opcion:Int) {
        when (opcion) {
            1 -> incremental()
            2 -> final()
        }
    }

    private fun incremental() {
        limpiarPantalla()
        val num = consola.pedirNum("Introduce el número de palabras: ")
        generador.fraseIncremental(num)
        enterContinuar()
    }

    private fun final() {
        limpiarPantalla()
        val num = consola.pedirNum("Introduce el número de palabras: ")
        generador.fraseFinal(num)
        enterContinuar()
    }

}