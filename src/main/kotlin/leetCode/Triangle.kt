package leetCode

import kotlin.math.sqrt

fun main() {
    val myTri = Triangle(5.0,5.0,5.0)

    myTri.areaTriangle()

}

class Triangle (
    var a: Double,
    var b: Double,
    var c: Double
        ) {

    init {
        println("Triangle created with a = $a, b = $b, c = $c")
    }

    fun areaTriangle () {
        var s = (a + b + c) / 2
       var x = sqrt(s*(s-a) * (s-b) * (s-c))
        println("Area of the triangle is $x")
    }
}




