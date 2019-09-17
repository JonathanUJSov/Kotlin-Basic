var lisend:List<String?> = listOf<String?>("")

var listIng:List<String?> = listOf<String?>("Agua","Leche", "Carne", "Verduras",
        "Frutas", "Cereal", "Huevos", "Aceite")
var rec:List<String?> = listOf()

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
        1 -> CrearReceta()
        2 -> {
            println("Ver mis recetas \t")

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

fun CrearReceta(){

    var num:Int = 0

    println("**************Crear nueva receta************* \t")

    println("Ingresar nombre de la receta: ")
    var nameRec:String? = readLine().toString()

    println("Ingresa cantidad de ingredientes que deseas agregar: ")
    var cant:Int = readLine()!!.toInt()
    var array = IntArray(cant)

    println("Selecciona los ingrediente")
    Ingredientes()

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
    }

    println("Receta guardada")

}


fun Ingredientes(){

    var counter:Int = 1

    for (ingredient in listIng)
    {
        println(counter.toString() + ".- " + ingredient)
        counter++
    }

}


fun saveRec(Title:String?, Receta:List<String?>){

    var recetas:MutableMap<String?,List<String?>> = mutableMapOf<String?,List<String?>>()


    var i:Int = 0
    for(rr in Receta){
        rec = listOf<String?>(rr)
        recetas.put(Title,Receta)
    }

    i = i++

}

fun  Recetas(Titulo:String?, Receta:List<String?>)
{
    var i = 0

    println("Nombre: " + Titulo + "\t")
    println("Ingredientes")

    for (inte in Receta)
    {
        println(inte)
    }


    /*var recetas:MutableMap<String?,List<String?>> = mutableMapOf<String?,List<String?>>()

    recetas.put(Titulo,Receta)

    println(recetas)*/

}

