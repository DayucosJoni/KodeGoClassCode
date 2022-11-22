fun main() {
    searchAllAuthor()
}

class Book {
    var author = "a"
    fun calledFromClass() {
        println("Called from class.")
    }
}

class Mag {
    var author = "a"
}

class News {
    var author = "a"
}

fun searchAuthor() {
    println("I am called.")
}

fun searchAllAuthor() {
    println("Calling it.")
    searchAuthor()
    Book().calledFromClass()
}
