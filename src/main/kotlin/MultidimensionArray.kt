import mu.KotlinLogging
private val logger = KotlinLogging.logger{}

fun main() {
    var rectangleDimensions = Array(4) { Array (4){} }
    var xPosition = intArrayOf(1, 2, 3)
    var yPosition = intArrayOf(2, 3, 4)
    var position = arrayOf(xPosition, yPosition)
    var index = 0

    for (xPosition in position) {
        for (yPosition in xPosition) {
            logger.info {"$yPosition"}
        }
        println()
    }

    for (xposition in position.indices) {
        for (yposition in position[xposition].indices) {
            logger.info { "position : $xposition, $yposition = [${position[xposition][yposition]}]" }
        }
    }

    var names1 = arrayOf("Joni", "Stephen", "Janekaye")
    var names2 = arrayOf("Mama", "Papa", "Tito")
    var names3 = arrayOf("AZ", "Az","aZ")
    var name = arrayOf(names1,names2,names3)

    for (name1 in name.indices) {
        for (name2 in name[name1].indices) {
            logger.info { "$name1, $name2 -> ${name[name1][name2]} " }
          //  logger.info { "${name[name1][name2]}" }
        }
    }








    /*
    var cinema = arrayOf<Array<Int>>()

    var number = arrayOf(arrayOf(1,2,3), arrayOf(4,5,6), arrayOf(7,8,9))

    for (row in number) {
        for (col in row) {
            print(col)
        }
        println()
    }
var rowNumber:Int = 1
for (row in number) {
    print("row $rowNumber -> ")
    for (col in row) {
        print("$col ")
    }
    println()
    rowNumber++
}


    var school = arrayOf<Array<Int>>()

    //fill with zeros
    for (row in 0..4) {
        var seats = arrayOf<Int>()
        for (col in 0 .. 4) {
            seats += 0
        }
    school += seats
    }
    for (seats in school) {
        for (numOfSeats in seats) {
            print("$numOfSeats ")
        }
        println()
    }
    println()
    println()
    school [2][2] = 1
 for (i in 1..3) {
     school [3][i] = 1
     }
for (i in 0..4) {
    school [4][i] = 1
    }


    for (seats in school) {
        for (numOfSeats in seats) {
            print("$numOfSeats ")
        }
        println()
    }

     */

    var threeDimensions = Array(4) {Array(4){Array(4){} } }
    }


