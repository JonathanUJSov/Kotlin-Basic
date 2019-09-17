

fun main(args: Array<String>) {

    var lisend:List<String?> = listOf<String?>("")
    var listSave:MutableList<List<String?>> = mutableListOf<List<String?>>()

    var listIng:List<String?> = listOf<String?>("Agua","Leche", "Carne", "Verduras",
            "Frutas", "Cereal", "Huevos", "Aceite")
    var rec:List<String?> = listOf()

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
        1 -> {
            var num:Int = 0

            println("**************Crear nueva receta************* \t")

            println("Ingresar nombre de la receta: ")
            var nameRec:String? = readLine().toString()

            println("Ingresa cantidad de ingredientes que deseas agregar: ")
            var cant:Int = readLine()!!.toInt()
            var array = IntArray(cant)

            println("Selecciona los ingrediente")

            var counter:Int = 1

            for (ingredient in listIng)
            {
                println(counter.toString() + ".- " + ingredient)
                counter++
            }

            while(num.compareTo(cant)<0){
                array[num] = readLine()!!.toInt()
                num++
            }


            println("=== Lista de Ingredientesa gregados ===\t")
            for (inr in array)
            {
                lisend  = listOf<String?>(listIng[inr-1])
                println(lisend)
                //Recetas(nameRec,lisend)
                listSave.add(1,lisend)
            }

            println("Receta guardada")
        }
        2 -> {
            println("Ver mis recetas \t")
            if(listSave!= null ){
                for (li in listSave){
                    println(li)
                }
            }else
                println("No tiene recetas guardadas")

        }
        3 -> {
            println("Gracias, regrese pronto...")
        }

        else -> {
            println("Seleccione una opción correcta...")
            //Regresar a menu

        }
    }

}
