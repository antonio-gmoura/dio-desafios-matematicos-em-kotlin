fun main(args: Array<String>) {

    val distancia: Int = readLine()!!.toInt()

    val consumo: Double = readLine()!!.toDouble()

    val media: Double = distancia.toDouble() / consumo

    println(String.format("%.3f km/l", media))

}