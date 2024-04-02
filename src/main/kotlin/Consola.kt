class Consola :EntradaSalida {
    override fun mostrar(mensj: String, salto: Boolean) {
        if (salto) print(mensj)
        else println(mensj)
    }

    override fun pedirNum(mensj: String):Int {
        var num:Int
        do {
            print(mensj)
            num = readLine()?.toIntOrNull() ?: -1
        } while (num == -1)
        return num
    }
}