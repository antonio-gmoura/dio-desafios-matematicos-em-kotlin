fun main(args: Array<String>) {

    val input = readLine()!!

    val H = input.split(" ")[0].toInt()

    val P = input.split(" ")[1].toInt()

    val media: Double = H.toDouble() / P.toDouble()

    println(String.format("%.2f", media))

}