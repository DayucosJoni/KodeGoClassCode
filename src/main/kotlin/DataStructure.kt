import mu.KotlinLogging
private val logger = KotlinLogging.logger{}

lateinit var dogBreed : Array<String>

fun main() {
    //array
    var books = Array<String>(100){
        ""
    }
    var stations: Array<String> = arrayOf("Taft", "Magallanes", "Ayala")
    for (station in stations)
        logger.info { "Station: $station" }
    var numbers: Array<Int>

    numbers = Array(10) {
        0
    }
    logger.info {"Station Size: ${stations.size}"}
    for (index in 0 until stations.size) {
        logger.info { "UNTIL Station [${index}]  : ${stations[index]}"}
    }
    for (index in stations.indices) {
        logger.info {"Using INDICES station [${index}]: ${stations[index]}"}
    }

    logger.info { "Station: ${stations[0]}" }
    var arrayOfNumbers = Array(5, {i -> i + 1})
    var arrayOfIntegers = intArrayOf(1, 3, 4, 7, 11, 18)
    var arrayOfIntegers2 = intArrayOf(2, 4, 6, 8, 10, 0)

    arrayOfIntegers.set(2, 0)
    arrayOfIntegers[1] = 100
    arrayOfIntegers.forEach {
        logger.info {"For Each : $it"}
    }
    logger.info { "Average : ${arrayOfIntegers.average()}"}
    logger.info { "Sum : ${arrayOfIntegers.sum()}"}
    logger.info { "Max : ${arrayOfIntegers.max()}" }
    logger.info { "Min : ${arrayOfIntegers.min()}" }
    arrayOfIntegers = arrayOfIntegers.plus(arrayOfIntegers2)


    arrayOfIntegers.forEach {
        logger.info { "After plus : $it" }
    }

//
//    var names: Array<String>
//    var name1 = readln()
//    names = arrayOf(name1)
//    logger.info { "names: ${names[0]}" }
}