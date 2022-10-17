import java.util.LinkedList
import mu.KotlinLogging


private val logger = KotlinLogging.logger{}

fun main() {

    var set:Set<String> = HashSet<String>()
    var map:Map<String, String> = HashMap<String, String>()
    var list:List<String> = ArrayList<String>()

    var listNames = ArrayList<String>()
    var listLocations = LinkedList<String>()

    var mapName = HashMap<String, String>()
    var mapLocation = LinkedHashMap<String, String>()

    var setName = HashSet<String>()
    var setLocation = LinkedHashSet<String>()

    var names:List<String> = mutableListOf<String>("Jason", "Kurt", "Logan", "Monique")
    var numbers:Set<Char> = mutableSetOf('1', '2', '3', '4', '5')
    var characters:Map<String, Int> = mutableMapOf(("One" to 1), ("Two" to 2), ("Three" to 3))

    var locations:List<String> = listOf("Cubao", "Santolan", "Shaw", "Boni", "Buendia")
    var setPoints:Set<Int> = setOf(1, 2, 3, 4, 5)
    var mapPoints:Map<String, Int> = mapOf(("One" to 1), ("Two" to 2), ("Three" to 3))

    var arraylist: ArrayList<String> = names as ArrayList<String>
  //  var linkedList : LinkedList<String> = names as LinkedList<String>



//    for (name in names) {
//        logger.info { "Name: $name" }
//    }
//    for (index in names.indices) {
//        logger.info { "Name: ${names[index]}"}
//    }
//    var iterator = names.iterator()
//    while (iterator.hasNext()) {
//        logger.info { "Name: ${iterator.next()}" }
//    }
//    names.forEach{
//        logger.info { "Names ~> $it" }
//    }
//
//    names.forEachIndexed{ index, name ->
//        logger.info { "Name [$index]: $name"}
//    }
//
//
//    var studentNames = names as ArrayList
//    studentNames.add("Noah")
//    studentNames.add(0,"Isiah")
//    studentNames.add("Oakley")
//    studentNames.addAll(listOf("Patrick", "Quentin" ))
//    studentNames.sort()
//
//    for (name in studentNames){
//        logger.info { "Name ~> $name" }
//    }
//    studentNames.removeAt(1)
//    studentNames.remove("Oakley")
//    println("Removed some names")
//    for (name in names){
//        logger.info { "Name ~> $name" }
//    }
    for(number in numbers) {
        logger.info { "Number: $number"}
    }

    for (entry in characters.entries) {
        logger.info { "Key: ${entry.key} -> Value: ${entry.value}"}

    }
}









