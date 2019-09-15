fun main(args: Array<String>) {
    //

    println("Crea tu pripia receta aquí \t")

    println("Menu \t")
    println("\t")

    var opciones = """
        1.- Crear nueva receta
        2.- Ver mis recetas
        3.- Salir
    """.trimIndent()

    println(opciones)

    println("\t")
    println("Ingresa la opción que deseas: ")
    var sel:String? = readLine()
    var selInt:Int? = sel?.toInt()

    when(selInt){
        1 -> println("Crear nueva receta \t")
        2 -> println("Ver mis recetas \t")
        3 -> println("Gracias, regrese pronto")

        else -> {
            println("Seleccione una opción correcta...")
            //Regresar a menu
        }
    }
}

fun CrearReceta(){
    println("Ingresar nombre de la receta: ")
    var nameRec:String? = readLine()
    println("Seleccione al menos un ingrediente")

    println("1.- Agua")
    println("2.- Leche")
    println("3.- Carne")
    println("4.- Verduras")
    println("5.- Frutas")
    println("6.- Cereal")
    println("7.- Huevos")
    println("8.- Aceite")
}