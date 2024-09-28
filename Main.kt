import kotlin.math.sqrt
import kotlin.math.pow

class Point (val x: Double, val y: Double)

fun distance(point1: Point, point2: Point): Double {
    return sqrt((point2.x - point1.x).pow(2)+ (point2.y - point1.y).pow(2))
}

fun readPoint (pointName: String): Point {
    print("Введите координату x для точки $pointName: ")
    val x = readLine()!!.toDouble()
    print("Введите координату y для точки $pointName: ")
    val y = readLine()!!.toDouble()

    return Point(x, y)

}
fun main() {
    val point1 = readPoint("A")
    val point2 = readPoint ("B")

    val dist = distance(point1, point2)
    println("Расстояние между точками A и B: $dist ")

}