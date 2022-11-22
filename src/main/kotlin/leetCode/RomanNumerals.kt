package leetCode

fun main() {
    Solution().romanToInt()
}
class Solution {
    fun romanToInt(s: String = "mcm"): Int {
//        var i = 1
//        var v = 5
//        var x = 10
//        var l = 50
//        var c = 100
//        var d = 500
//        var m = 1000
        var romans = hashMapOf<String,Int>()
        romans.put("m",1000)
        romans.put("c",100)
        var input = s
        var roman: Int = 0
        println(romans)
       //print(romans.getValue("m"))

        for (i in input) {
            romans.getValue(i.toString())
        }

            print(romans.getValue(input[0].toString()))





return roman
    }
}