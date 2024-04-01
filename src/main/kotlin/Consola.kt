class Consola :EntradaSalida {
    override fun mostrar(mensj: String, salto: Boolean) {
        if (salto) print(mensj)
        else println(mensj)
    }

    override fun pedirNum(mensj: String) {
        print(mensj)
        val num = readLine()?.toIntOrNull()
    }
}