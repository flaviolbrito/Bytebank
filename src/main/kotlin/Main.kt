fun main() {
    println("Bem vindo ao Bytebank")
    //val titular = "Alex"
    val titular: String = "Alex"
    val numeroConta: Int = 1000
    var saldo = 0.0
    saldo = 100 + 2.0
    saldo += 200

    println("titular $titular")
    println("número da conta $numeroConta")
    println("saldo da conta $saldo")
//
//    if (saldo > 0.0 )
//        println("saldo positivo")
//    else if ( saldo == 0.0 )
//        println("saldo positivo")
//        else
//        println("saldo negativo")
//}
when {
        saldo > 0.0 -> println("saldo positivo")
        saldo == 0.0 -> println("saldo positivo")
        else -> println("saldo negativo")
    }
}