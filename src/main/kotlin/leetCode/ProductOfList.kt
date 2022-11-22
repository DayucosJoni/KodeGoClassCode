package leetCode
//extension functions

fun main() {
    var input = arrayListOf<Int>(1,2,3,4,5)
    println("${input.prodList()}")
    Rect(a = .2)

    var id = readln().toIntOrNull()
        println(id)


}

fun ArrayList<Int>.prodList(): Int {
var result: Int = 1
    print("Product of : ")
    for (i in this) {
        print("$i")
        print(", ")
       result *= i
    }
return result
}

class Rect (
    a: Double
        ){
    var a: Double = a


}