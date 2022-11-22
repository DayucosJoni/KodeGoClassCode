package kodego_class_samples

fun main() {
    var x = mutableListOf<Int>()
    println("How many numbers do you want to multiply?:")
    var iterate = readln()
    println("Input $iterate numbers you want to multiply: ")
    for (i in 1..iterate.toInt()) {
        var y = readln()
        x.add(y.toInt())
    }

    var prodAns = multiplyThisList(x)
    print(prodAns)
    }


fun multiplyThisList(list: List<Int>): Int {
    var prodAns: Int = 1
    for (i in list) {
        prodAns*=i
    }
    return prodAns
}


fun Int.isPrime(number: Int): Boolean {
    for (i in 2 until number - 1) {
        if (number % i == 0)
            return false
    }
    return true
    }


fun getMaxNum (vararg numbers: Int): Int {
    var max = numbers[0]
    for (i in numbers)
        if (i > max) {
            max = i;
        }
    return max
}

fun whatIndex(list: List<Int>, value:Int): Int {
    for(i in 0..list.size - 1) {
        if (list[i] == value) {
            return i
        }
    }
    return -1
}





fun mult(a: Int, b: Int) = a * b

fun sumOf(num1: Int, num2: Int): Int {
    var ans:Int = 0
    for (i in num1 .. num2) {
        ans += i
    }
    return ans
}

fun powerOf(base: Int, exponent: Int){
    var result = 1
    for (i in 1.. exponent) {
        result *= base
    }
println("$base to the power of $exponent = $result")
}