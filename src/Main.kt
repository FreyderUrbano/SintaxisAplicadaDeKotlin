import kotlin.random.Random

fun main() {

    //FUNDAMENTOS
    /*comentarios en kotlin */
    println("Hola mundo Freyder Eres el mejor")

    var numero = 5
    println(numero)
    val perro = "Mia"
    println(perro)
    var nombre = "Cadena de texto"
    println(nombre)
    var double = 2.5
    println(double)
    var boolean = false
    println(boolean)
    var int = 50000
    var int1 = 200000
    var suma = int + int1
    println(suma)

    var MyFloat = 6.55555f
    println(MyFloat)

    var boolean1 = false
    println(boolean1)

    //CONSTANTES

    val myConst = "Mi constante"

    //control de flujo

    if (boolean1){
        println("la variable es true")
    }
    else{
        println("error")
    }

    //ejemplo de CONTROL DE FLUJO COMPLETO

    var num1 = 50

    if (num1 > 40){
        println("Es mayor a 40")
    }else{
        println("No es mayor a 40")
    }

    var name = "Freyder"

    if (name == "Freyder"){
        println("Es el mismo nombre")
    }else{
        println("No es el mismo nombre")
    }

    //NUEVO EJEMPLO

    if (name == "Freyder" && num1 > 30){
        println("SON VALIDAS")
    }   else{
        println("NO SON VALIDAS ")
    }


    if (name == "Alejandro" && num1 > 30){
        correcto()
    }else{
        incorrecto()
    }

    //listas
    //lista de strings
    var mylista = listOf<String>("Freyder", "Alejjandro", "Urbano", "Rosales")
    println(mylista)
    println(mylista[0])//imprime el elemento segun su indice

    //mutableListOf crea una lista que se puede modificar
    var listaMutable = mutableListOf<String>("Topa","Mia", "Milu", "Flaca", "Lobo")
    println(listaMutable)
    listaMutable.add("Cokky")//adiciona a la lista
    println(listaMutable)
    listaMutable.remove("Cokky")//borra un elemento de la lista
    println(listaMutable)

    //sets
    val mySet = setOf("name", "lastname", "pla", "name")
    println(mySet)//los sets no imprimen duplicados

    // mapas

    val myMap = mutableMapOf("Freyder" to 40, "Alejandro" to 90, "Milu" to 2)//crea una clave para acceder a un valor
    myMap.put("Mia", 10)//adiciona una llave valor al mapa
    println(myMap.get("Freyder"))// obtiene el valor de la llave Freyder
    println(myMap.get("Alejandro"))
    println(myMap.get("Milu"))//obtine el valor 2

    //BUCLES

    //for
    for (value in myMap){//recorre myMap imprime todo lo que contenga
        println("contenido muMap " + value)
    }

    //while
    var cont = 0

    while (cont < mylista.count()){
       println(mylista[cont])
        cont++
    }

    //OPCIONALES

    var opcional: String? = null//inicia con un valor nulo
    opcional = "Texto de prueba"//se modifica a un texto
    println(opcional)//imprime el texto modioficado

    //se puede usar para validar nulidad en variables
    var opcional1 = null

    if (opcional1 != null){
        println("Error")
    }else{
        println("opcional1 es nulo")
    }

    //FUNCIONES

    myFunction()
    myFunction()
    myFunction()

    //clases

    var myClass = myClass("Freyder", 40)
    println(myClass.datos())
    println(myClass.name)
    println(myClass.age)

    println("Esta es mi lista " + mylista)

    //==========================================================
    //plantillas de cadenas

    /*
    Es útil saber cómo imprimir el contenido de las variables en
    la salida estándar. Puede hacerlo con plantillas de cadena.
    Puede utilizar expresiones de plantilla para acceder a los
    datos almacenados en variables y otros objetos, y convertirlos
    en cadenas. Un valor de cadena es una secuencia de caracteres
    entre comillas dobles. Las expresiones de plantilla siempre
    comienzan con un signo de dólar."$
     */
    val valor = 10
    println("Este es un $valor numerico")

    println("valor $(valor + 1) numerico")

    //exercice

    val name1 = "Clara"
    val edad = 60

    println("Mi mama $name1 tiene $edad anos")

    //TIPOS BASICOS

    var precio = 20

    //sumar
    precio = precio + 20//suma 20
    precio += 25//suma 25
    precio -= 10//resta 10
    precio *= 5 // multiplica por 5
    precio /= 2//divide entre 2
    precio %= 2// dice si es par
    println(precio)

    val a: Int = 2000
    a = 1000
    val b: String = "texto"
    val c: Double = 3.14
    val d: Boolean = true
    val e: Char = 'd'

    //COLECCIONES

    //listas
    var myNuevaLista = listOf("dato", "dato1", "dato2", "dato3")
    var myNuevaLista2 = mutableListOf("Gato", "Perro", "copnejo")
    var listaNumeros = mutableListOf<Int>(1,2,3,4,5,6,6,8,8,8,8)
    //acceder a elementos de una lista con operador de indexado
    println("El tercer elemento de la lista myNuevaLista es: ${myNuevaLista[3]}" )
    println("el 5to elemento de listaNumeros es: ${listaNumeros[5]}")
    //obtener el primer dato de la lista
    println("el primer elemento de la lista listaNumeros es: ${listaNumeros.first()}")
    //obtener el ultimo datos de una lista
    println("el ultimo dato de la lista listaNumeros es: ${listaNumeros.last()}")
    //obtener el numero de elementos de una lista
    println("numero de elmentos de la lista listaNumeres: ${listaNumeros.count()}")
    //comprobar si un elemento esta en una lista
    println(5 in listaNumeros)
    //agregar un elemento a una lista (TIENE QUE SER UNA MUTABLELISTOF)
    listaNumeros.add(20)
    println(listaNumeros)
    myNuevaLista2.add("Raton")
    println(myNuevaLista2)
    //eliminar un elemento de una listas
    listaNumeros.remove(20)
    println(listaNumeros)
    myNuevaLista2.remove("Raton")
    println(myNuevaLista2)

    //PONER CONJUNTOS SET
    //CREAR UN CONJUNTO
    //no permite elementos duplicados
    //no se pueden acceder a elementos mediante indice
    val conjunto = setOf("banano", "pera", "limon")//conjunto normal
    val conjuntoMutable = mutableSetOf("lechuga", "frijol", "arbeja", "garbanzo")
    //variable mutable de forma explicita
    val juegos: MutableSet<String> = mutableSetOf("Warzon", "Fortnite", "Roblox")
    println(juegos)
    //obtener el numero de elementos del conjunto
    println("el numero de elementos es : " + conjunto.count())
    //comprobar si un elemento esta en el conjunto
    println("frijol" in conjuntoMutable)//true
    //agregar elementos a un conjunto (Solo se puede con Mutables)
    conjuntoMutable.add("coco")
    println(conjuntoMutable)
    //borrar un elemento de un conjunto
    conjuntoMutable.remove("coco")
    println(conjuntoMutable)

    //MAPA
    //mapOf() mapa de solo lectura
    //mutableMapOf() crea un mama mutable

    val nuevoMapa = mapOf("carro" to 100000, "moto" to 2000, "bicicleta" to 5000)
    println(nuevoMapa)

    //mapa mutable
    val mapaMutable = mutableMapOf("pera" to 10, "manzana" to 20, "naranja" to 5)
    println(mapaMutable)
    //obtener el valor de un elemento de un mapa usando su clave
    println("valor mapa es: ${mapaMutable["manzana"]}")
    //obtener el nuemero de elementos de un mapa
    println("El numero de elementos de mapaMutable es: + ${mapaMutable.count()}")

    //agregar elementos a un mapa mutable
    mapaMutable.put("lulo", 50)
    println(mapaMutable)
    //eliminar elementos de un mapa mutable
    mapaMutable.remove("lulo")
    println(mapaMutable)

    //comprobar si una clave ya esta en un mapa
    println(mapaMutable.containsKey("pera"))//true

    //obtener coleccion de las claves o valores de un mapa
    //keys o llaves
    println(mapaMutable.keys)//otiene las llaves
    //valores
    println(mapaMutable.values)//obtiene los valores

    //comprovar si una llave o valor estan en un mapa
    //llaves
    println("manzana" in mapaMutable.keys)//true
    //valores
    println(15 in mapaMutable.values)//false

    val greenNumbers = mutableListOf(1,5,6,3)
    val redNumbers = mutableListOf(5,3,8,9,6)

    val green = println(greenNumbers.count())
    val red = println(redNumbers.count())

    println("Numeros verdes ${green} Numeros rojas ${red}")


    //excercice 2

    val soportados = setOf("http", "https", "ftp")
    val requerido = "smtp"
    val esSoportado = "smtp" in soportados
    println("esta soportado ${esSoportado}" )

    //excercice

    val mapaNumeros = mutableMapOf(1 to "Uno", 2 to "Dos", 3 to "Tres")
    val n = 2
    println("$n se dice asi: ${mapaNumeros[n]} y se dice D-O-S")

    //FLUJOS DE CONTROL
    //EXPRESIONES CONDICIONALES

    //IF
    val entera: Int
    val check = false

    if (check){
        entera = 20
    }
    else{
        entera = 10
    }
    println(entera)

    //expresion similar a una ternaria en kotlin

    val f = 1
    val g = 2
    println(if(f > g) f else g)//valida si f es mayor que g, si es asi imprime f sino imprime g

    //WHEN (CUANDO)
    //SE USA CUANDO SE TIENE UNA EXPRESION CON VARIAS RAMAS
    //EJEMPLO

    val obj = ""

    when (obj){
        "1" -> println("One")
        "Hola" -> println("Texto Hola mejorado")
        "Hola texto complejo" -> println("El texto fue escrito correctamente")
        else -> println("ERROR DE TEXTO")
    }

    //ejemplo

    val obj1 = ""

    val result = when (obj1) {
        "Freyder" -> "Nombre correcto"
        "Alejandro" -> "Nombre Incorrecto"
        else -> "No son mis nombres"

    }
    println(result)

    //ejemplo temperatura

    val temperatura = 35

    val clima = when {
        temperatura < 0 -> "frio"
        temperatura < 10 -> "Clima Fresco"
        temperatura < 20 -> "Calido"
        temperatura < 30 -> "HOT"
        else -> "Efecto invernadero"
    }
    println(clima)

    //GAMAS

    //BUCLES
    //FOR

    //CREAR UN BLUCLE FOR QUE ITERE SOBRE LOS NUMEROS DEL 1 AL 5

    //for para int
    for (number in 1..100){
        print(number)
    }

    //Iterar una coleccion con un ciclo for

    val animales = mutableListOf("perro", "gato", "loro", "lobo")

    for (animal in animales){
        println("El ${animal} en la lista de ${animales}")
    }

    //lista de colores
    val colores = listOf("rojo", "negro", "blanco", "amarillo", "azul")

    for (color in colores){
        println("El $color es mi favorito de la lista")
    }

    //MIENTRAS
    //primer caso while
    var numberPositive = 0

    while (numberPositive < 20){
        println("$numberPositive es menor que 20")
        numberPositive++
    }

    //segundo caso do while

    var disparos = 0
    var sinMunicion = 0

    while (disparos < 16){
        println("Sigue disparando...")
        disparos++
    }
    do{
        println("Sin municion... ")
        sinMunicion++
    }while (disparos < sinMunicion)

    //EJERCICIOS BUCLES

    //Con una expresión, actualice el siguiente programa
    // para que cuando introduzca los nombres de los botones
    // de GameBoy, las acciones se impriman en la salida.when

    val boton = "B"
//una forma de hacerlo
    when (boton){
        "Un" -> println("Si")
        "B" -> println("No")
        "X" -> println("Menu")
        "Y" -> println("Nada")
        "Otro" -> println("NO EXISTE TAL BOTON")
        else -> println("Error")
    }
    //otra forma de hacerlo

    println(
        when (boton){
            "Un" -> "Si"
            "B" -> "No"
            "X" -> "Menu"
            "Y" -> "Nada"
            "Otro" -> "No existe boton"
            else -> "ERROR"
        }
    )

    //ejercicio 2

    //Tienes un programa que cuenta las rebanadas de pizza hasta
    // que hay una pizza entera con 8 rebanadas. Refactorice este
    // programa de dos maneras:

    //WHILE

    var rebanada = 0

    while (rebanada < 8){
        println("La pizza tiene $rebanada rebanadas NO esta completa")
        rebanada++
    }
    println("La pizza tiene $rebanada rebanadas YA ESTA LISTA")

    //DO WHILE
    rebanada++
    do{
        println("La pizza tiene $rebanada rebanades no esta lista")
        rebanada++
    }
        while ( rebanada < 8)
        println("La pizza esta completa")

    //CREAR UN FIZZ BUZZ


    fun fizzBuzz(){
        for (number in 1 .. 100){
            if(number % 3 == 0){
                println("FIZZ")
            }else if(number % 5 == 0){
                println("BUZZ")
            }else if(number % 3 == 0 && number % 5 == 0){
                println("FIZZBUZZ")
            }
            else{
                println(number)
            }
        }
    }
    fizzBuzz()

    //EJERCICIO 4 DE UNA LISTA DE PALABRAS IMPRIMIR SOLO LAS QUE COMIENCEN POR
    //LA LETRA B

    fun imprimirPalabraConB(){
        val listaPalabras = mutableListOf("Baul", "Bodega", "Bola", "Balon", "Ardilla", "Gallina", "Burro", "Gato", "Perro", "Lobo", "Buho", "Conejo", "Raton", "")
        for (lista in listaPalabras){
           if(lista.startsWith("B")){
               println(lista)
           }
        }
    }
    imprimirPalabraConB()

    //FUNCIONES
    //FUNCIONES CON PARAMETROS

    //parametros int
    fun sumar(x: Int, y: Int): Int{
        return x + y
    }
    println(sumar(2, 5))

    //parametros String
    fun words(w1: String, w2: String): String{
        return w1 + w2
    }
    println(words("Freyder ", "Urbano"))

    //ARGUMENTOS CON NOMBRE

    fun mensajeCodificado(message: String, prefijo: String) {
        println("El mensaje $message tiene un prefijo $prefijo")
    }
    mensajeCodificado("Hola desde Kotlin", "55255")

    //VALORES DE PARAMETROS PREDERMINADOS

    //ejemplo
    fun parametroPredeterminado(nombre: String, cedula: String = "87062458"){
        println("El cliente $nombre de cedula $cedula")
    }
    parametroPredeterminado("Freyder")

    //FUNCIONES SIN RETORNO

    fun funcionSinReturn(mensaje: String){
        println(mensaje)
    }
    funcionSinReturn("Hola desde kotlin");

    //FUNCIONES DE EXPRESION UNICA

    fun sum(x: Int, y: Int): Int{
        return x + y
    }
    println(sum(20, 50))

    //se pueden quitar las llaves y usar el operador de asignacion (EL IGUAL)
    //y omitir el tipo de retorno
    fun res(x: Int, y: Int) = x - y
    println(res(50, 30))

    //EJERCCICIOS
    //CREAR UN AREA DE UN CIRCULO

    fun areaDelCirculo( radio: Int, pi: Double = 3.1416): Double{
        return pi * (radio*radio)
    }
    println("El Area del Circulo es: " + areaDelCirculo(2))

    //EJERCICIO 2

    //area del circulo como expresion unica

    fun areaC(radio: Int, pi: Double = 3.1416) = pi * (radio*radio)
    println("Area Circulo expresion unica " + areaC(5))

    //EJERCICIO 3

    fun segundos(horas: Int, minutos: Int, segundos: Int) = (((horas * 60) + minutos) * 60) + segundos
    println(segundos(5,5,50))

    //EXPRESIN LAMDA
    //EJEMPLO
    fun nombres(nombre: String): String{
        return nombre.uppercase()//Nombre en mayusculas
    }
    println(nombres("freyder"))//imprime en mayusculas //FREYDER

    //LA MISMA FUNCION PERO COMO EXPRESION LAMBDA

    println({nombre: String -> nombre.uppercase()}("freyder"))

    //para asignar una expresion lambda a una varible se debe utilizar
    //el operador de asignacion

    val nombreLambda = { nombre: String -> nombre.uppercase()}
    println(nombreLambda("alejandro"))//imprime ALEJANDRO

    //PASAR A OTRA FUNCION

    val numeros = mutableListOf(1,5,6,8,6,3,4,10,-5,-3,-2,-1,-50)
    val positivos = numeros.filter { x -> x > 0 }
    val negativos = numeros.filter { x -> x < 0 }
    println(positivos)
    println(negativos)

    //.map para modificar elementos de una lista nuemrica

    val numerosCambiar = mutableListOf(1,2,6,5,7,9,10,11,25,36,65,45)
    val alDoble = numerosCambiar.map { x -> x * 2 }
    val alaMitad = numerosCambiar.map { x -> x / 2 }
    println(alDoble)
    println(alaMitad)

    //TIPOS DE FUNCIONES

    val todasMayusculas: (String) -> String = { string -> string.uppercase()}
    println(todasMayusculas("letras minusculas"))

    //RETORNO DE UNA FUNCION

    fun aSegundos(tiempo: String): (Int) -> Int = when (tiempo){
        "Hora" -> {value -> value * 60 * 60}//7200 segundos
        "minutos" -> {value -> value * 60}//120 minutos
        "segundos" -> { value -> value }//segundos
        else -> { value -> value}
    }
    val tiempoEnMinutos = mutableListOf(2,10,15,1)
    val minutosASegundo = aSegundos("minutos")
    val totalTiempoEnSegundos = tiempoEnMinutos.map(minutosASegundo).sum()
    println("Total tiempo en segundos $totalTiempoEnSegundos")

    //INVOCAR POR SEPARADO
    println({ string: String -> string.uppercase() }("hello"))// HELLO

    //lambdas finales
    //el valor inicial es cero
    println(listOf(1,2,3).fold(0) {x, item -> x + item })//6

    //Practica de expresiones lambda

    val actions = mutableListOf("title", "year", "autor")
    val prefix = "https://example.com/book-info"
    val id = 5
    val urls =  actions.map{action -> "$prefix/$id/$action"}//.map modifica actions toma una action y le coloca
    //un prefix el id y la action
    println(urls)//imprime las 3 urls

    //EJERCICIO 2
    //Escriba una función que tome un valor y una acción (una función con el tipo ) que luego repita la acción
    //el número dado de veces. A continuación, utilice esta función para imprimir "Hola" 5 veces.Int()
    //-> Unit

    fun repetir(valor: Int, action: () -> Unit){
        for (i in 1 .. valor){
            action()
        }
    }
    repetir(5){
        println("Hola")
    }

    //CLASES
    //caracteristicas dentro del parentesis de la clase
    class Custumer(val id: Int, var email: String)
    //dentro del cuerpo de la clase definido por las llaves
    class Prueba(val id: Int, var email: String){
        val category: String = ""
    }

    //las propiedades de la clase pueden tener valores predeterminados
    class Contact(val id: Int, var email: String = "example@gmail.com"){
        val category: String = "work"
    }

    //CREAR INSTANCIA
    class Contact1(val id: Int, var email: String)
    fun contacto(){
        val contact = Contact1(1, "correo@gmail.com")
    }
    //Contact1 es una clase
    //contact es una instancia de la clase Contact
    //email y id son propiedades
    //id email y contact se utilizan con el constructor predeterminado para crear archivos

    //PROPIEDADES DE ACCESO
    //PARA ACCEDER A UNA PROPIEDAD DE UNA INSTANCIA ESCRIBA EL NOMBRE DE
    //LA PROPIEDAD DESPUES DE LA INSTANCIA ANEXADO CON UN PUNTO

    class Frey(val id: Int, var email: String)
    fun ejemploAcceso(){
        val freyder = Frey(10, "correo@gmail.com")
        //se imprime el valor correo
        println(freyder.email)//asi se accede a la propiedad correo
        //Actualiza el valor de email
        freyder.email = "otro@gmail.com"
        println(freyder.email)
        //concatenacion de valores de una propiedad
        println("El id ${freyder.id} es del correo ${freyder.email}")
    }
    ejemploAcceso()

    //FUNCIONES MIEMBRO
    //se deben declarar dentro del cuerpo de la clase.
    //para llamarla escriba el nombre de la funcion despues de la instancia anexado con punto

    //ejemplo
    class Alejandro(val id1: Int, var nombre1: String){
        fun printId(){
            println(id1)
        }
    }
    fun imprimirId() {
        val ale = Alejandro(10, "Freyder")
        //se llama a la funcion miembro printId
        ale.printId()
    }
    imprimirId()

    //CLASE DE DATOS
    //utiles para almacenar datos
    //vienen con funciones miembro automaticas permiten imprimir comparar y copiar instancias de una clase
    //se declaran con la palabra clave data

    data class User(val name: String, val id: Int)
    //.toString() imprime una cadena legible de la instacioa de clase y sus propiedades
    //.equals() o == compara instancias de una clase
    //.copy() crea una instacia de clase copiando otra

    //IMPRIMIR COMO CADENA .toString()

    val usuario = User("Juan", 5)
    println(usuario)// imprime el usuario Juan 5

    //COMPARAR INSTANCIAS

    val usuario1 = User("Alex", 1)
    val usuario2 = User("Javier", 2)
    val usuario3 = User("Max", 3)

// compara usuario1 con usuario2
    println("usuario1 == usuario2: ${usuario1 == usuario2}")
// usuario1 == usuario2: false

// Compares usuario1 to usuario3
    println("usuario1 == usuario3: ${usuario1 == usuario3}")
// usuauri1 == usuario3: false

//COPIAR INSTANCIAS

    //.copy() hace una copia exacta de la instancia de clase de datos

//para crear una copia de una instancia de clase de datos y cambiar algunas
    //propiedades llame a la funcion en la instancia y agregue valores de
    //reeemplazo para las propiedades como parametros de funcion

//ejemplo

val usu1 = User("Freyder", 20)
val usu2 = User("Alejandro", 10)
val usu3 = User("Valeria", 15)

//crea una copia exacta de user1
println(usu1.copy())
    //crea una copia de usu2 y cambia el nombre a Jacobo
    println(usu2.copy("Jacobo"))
    //crea una copia de usu3 y cambia el id por 100
    println(usu3.copy(id = 100))

    //EXERCICE 1 PRACTICA

    data class Empleado2(val nombre: String, var salario: Int)

    fun mostrarEmpleado(){
        val emp = Empleado2("Freyder", 50)
        println(emp)
        emp.salario += 50
        println(emp)
    }
    mostrarEmpleado()

    //ejerciicio 2

    data class Emp(val nombre: String, var salario: Int)
    class RandomEmpGenerator(var minimo: Int, var maximo: Int){
        val nombresEmp = mutableListOf("Juan", "Catalina", "Pancha", "Julia", "Eperanza", "Pedro")
        fun generarEmpleado() = Emp(nombresEmp.random(),
            Random.nextInt(from = minimo, until = maximo))

    }
    fun EmpShow(){
        val empGenerado = RandomEmpGenerator(1000 , 1100)
        println(empGenerado.generarEmpleado())
        println(empGenerado.generarEmpleado())
        println(empGenerado.generarEmpleado())
        println(empGenerado.generarEmpleado())
        println(empGenerado.generarEmpleado())
        println(empGenerado.generarEmpleado())
        empGenerado.minimo = 1000
        empGenerado.maximo = 1100
        println(empGenerado.generarEmpleado())

    }
    EmpShow()

    //SEGURIDAD NULA
    //TIPOS QUE ACEPTAN VALORES NULL

    fun tiposNull(){
        //nunca un tipo String es nulo
        var nuncaNulo: String = "Este no puede ser nulo"
        //genera un error de compilacion
        //nuncaNulo = null //ERROR

        //SE PUEDE HACER NULEABLE UN STRING
        var nuleable: String? = "puede ser nulo"
        //esto es correcto
        nuleable = null // aqui no hay error

        //COMPROBAR SI HAY VALORES NULOS

    }

    val puedeSerString = null

    fun describeString(puedeSerString: String?): String{
        if (puedeSerString != null && puedeSerString.length > 0){
            return "Caracteres de ${puedeSerString.length}"
        }else{
            return "String Vacio o nulo"
        }

    }

    fun mostrarNulo(){
        var stringNulo: String? = null
        println(describeString(stringNulo))
    }
    mostrarNulo()


//USAR LLAMADAS SEGURAS
    //EL OPERADOR DE LLAMADA SEGURA DEVUELVE LA PROPIEDAD DEL OBJETO

    //EN EL SIGUIENTE EJEMPLO LA FUNCION UTILIZA UNA LLAMADA SEGURA PARA
    //DEVOLVER LA LONGITUD DE LA CADENA

    fun longitudCadena(posibleString: String?): Int? = posibleString?.length
    fun cadena(){
        var stringNuleable: String? = null
        println(longitudCadena(stringNuleable))//imprime null
    }
    cadena()

    //USO DEL OPERADOR ELVIS
    //ESCRIBIR AL LADO IZQUIERDO DEL OPERADOR ELVIS LO QUE SE DEBE VERIFICAR PARA UN VALOR
    //ESCRIBIR AL LADO DERECHO DEL OPERADOR ELVIS LO QUE SE DEBE DEVOLVER SI SE DETECTA UN VALOR NULL

    //EJEMPLO
    fun elvisOp(){
        var nullString: String? = null
        //uso del operador elvis
        println(nullString?.length ?: "si es nulo")//imprime "si es nulo"
    }
    elvisOp()

    //EJERCICIO

    data class Empleado3 (val name: String, var salary: Int)

    fun empleadoById(id: Int) = when(id) {
        1 -> Empleado3("Mary", 20)
        2 -> null
        3 -> Empleado3("John", 21)
        4 -> Empleado3("Ann", 23)
        else -> null
    }

    fun salaryById(id: Int) = empleadoById(id)?.salary ?: 0

    fun main() {
        println((1..5).sumOf { id -> salaryById(id) })
    }
    main()







}



fun myFunction(){
    println("ESTO ES UNA FUNCION")
}
//funcion CORRECTO
fun correcto(){
    println("Freyder el codigo es correcto")
}
//funcion incorrecto
fun incorrecto(){
    println("FREYDER CODIGO INCORRECTO")
}



class myClass(val name: String, val age: Int) {
    fun datos(){
        println("MIS DATOS SON: ")
    }
}