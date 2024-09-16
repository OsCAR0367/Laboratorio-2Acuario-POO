package acuario

fun construirAcuario() {
    val acuario1 = Acuario()
    acuario1.imprimirTamano()
// altura y largo por defecto
    val acuario2 = Acuario(ancho = 25)
    acuario2.imprimirTamano()
// ancho por defecto
    val acuario3 = Acuario(alto = 35, largo = 110)
    acuario3.imprimirTamano()

    val acuario8 = Acuario(largo = 25, ancho = 25, alto = 40)
    acuario8.imprimirTamano()
    val miTorre1 = TanqueTorre(diametro = 25, alto = 45)
    miTorre1.imprimirTamano()
    val miTorre = TanqueTorre(diametro = 25, alto = 40)
    miTorre.imprimirTamano()
}

fun main() {
    construirAcuario()
}
