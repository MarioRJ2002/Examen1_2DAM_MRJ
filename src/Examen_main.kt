fun main() {
    var salir = "1"
    var comprobarY = ""
    while(salir.toInt()!=0) {
        var edad = 0
        var mes = 0
        try {
            println("Que edad tiene el alumno y de que mes es el alumno?")
            var Salir = readLine()!!
            val entradaTeclado = Salir!!.split(",")

            if(entradaTeclado.get(3)!=null){}

            edad = entradaTeclado[0]!!.trim().toInt()

            mes = entradaTeclado[1]!!.trim().toInt()

            if (edad < 6 || edad > 12) {
                println("Edad: " + edad + ". No se contempla esta edad")
            }
            if (mes < 1 || mes > 12) {
                println("Mes: " + mes + ". El mes es erroneo")
            }
        } catch (e: Exception) {
            println("valor invalido introducido")
        }
        if (edad >= 6 && edad <= 12 && mes >0 && mes < 13) {
            RepartirTablas(edad, mes)
        }
        println("Va a introducir otro alumno?('Y' para continuar)")
        comprobarY = readLine().toString()
        if(comprobarY.uppercase()=="Y"){
        }else{salir = "0"}
    }
}

fun printTabla(num: Int) {
    println("Tabla del " + num)
    println("***********")
    for (i in 1..10) {
        println("1 x " + i + " = " + i * num)
    }
}

fun RepartirTablas(edad: Int, mes: Int) {
    println("PROGRAMA DE GENERACIÓN DE TABLAS: MARIO RAMIREZ")
    println("_________________________________________________")
    if (edad <= 12 && edad > 10) {
        if (mes % 2 == 0) {
            println("Edad: " + edad + ". El alumno esta dentro del rango [11-16]")
            println("Mes: " + mes + ". El mes es par, corresponden las tablas siguientes: {11,12,13}")
            println("_________________________________________________")
            for (i in 11..13) {
                printTabla(i)
            }
        } else {
            println("Edad: " + edad + ". El alumno esta dentro del rango [11-16]")
            println("Mes: " + mes + ". El mes es impar, corresponden las tablas siguientes: {14,15,16}")
            println("_________________________________________________")
            for (i in 14..16) {
                printTabla(i)
            }
        }
    } else if (edad > 8 && edad <= 10) {
        if (mes % 2 == 0) {
            println("Edad: " + edad + ". El alumno esta dentro del rango [6-10]")
            println("Mes: " + mes + ". El mes es par, corresponden las tablas siguientes: {7,9}")
            println("_________________________________________________")
            for (i in 7..9 step (2)) {
                printTabla(i)
            }
        } else {
            println("Edad: " + edad + ". El alumno esta dentro del rango [6-10]")
            println("Mes: " + mes + ". El mes es impar, corresponden las tablas siguientes: {6,8,10}")
            println("_________________________________________________")
            for (i in 6..10 step (2)) {
                printTabla(i)
            }
        }
    } else if (edad >= 6 && edad <= 8) {
        if (mes % 2 == 0) {
            println("Edad: " + edad + ". El alumno esta dentro del rango [1-5]")
            println("Mes: " + mes + ". El mes es par, corresponden las tablas siguientes: {1,3,5}")
            println("_________________________________________________")
            for (i in 1..5 step (2)) {
                printTabla(i)
            }
        } else {
            println("Edad: " + edad + ". El alumno esta dentro del rango [1-5]")
            println("Mes: " + mes + ". El mes es impar, corresponden las tablas siguientes: {2,4}")
            println("_________________________________________________")
            for (i in 2..4 step (2)) {
                printTabla(i)
            }
        }

    }
}
