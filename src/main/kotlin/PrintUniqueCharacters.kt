fun main() {
    var index: Int = 0
    var name: String = "09991"
    var name2: String = "29993"
    var nameLength:Int = 0
    var unique:String = ""
    do {
     //   print(name[index])
        nameLength = name.length
        if (name[index] in name2) {
           // println(name[index])
        } else {
            unique = unique + name[index]
        }
        if (name2[index] in name) {
            //println(name2[index])
        } else {
            unique = unique + name2[index]
        }
        index++
    }while(index < nameLength)
    print(unique)
}