package PracticeClass

fun main() {
    //searchStudentWildSearch()
    StudentArray().addStudent()
}


fun searchStudentWildSearch() {
    var firstName = StudentArray().firstName
    var lastName = StudentArray().lastName
    var nickName = StudentArray().nickName
    var id = StudentArray().id
    var yearEnrolled = StudentArray().yearEnrolled
    var foundSet = hashSetOf<String>()

    print("Search for: ")
    var searchFor = readln()
    //error handling
    if (firstName.size == 0) {
        println("No Students in the list")
    }else if (firstName.size != lastName.size || firstName.size != nickName.size || firstName.size != id.size || firstName.size != yearEnrolled.size) {
        println("There are missing value in the list, fill it up correctly first")
    }else {

        if (searchFor.length > 3 || searchFor == "" || searchFor == " " || searchFor == "  " || searchFor == "   ") {
            println("Invalid Input: Max 3 chars long and be sure string is not empty")
        } else {

            var searchLength = searchFor.length
            var index = 0

            for (i in firstName) {
                if (i.length >= searchLength) {
                    var x = i.removeRange(searchLength..i.lastIndex)
                    if (searchFor.uppercase() == x.uppercase()) {
                        //println("Found a match in the first name: ${firstName[index]} \"${nickName[index]}\" ${lastName[index]}")
                        foundSet.add(firstName[index] + " " + "\"" + nickName[index] + "\"" + " " + lastName[index] + " - ID Number: " + id[index] + " - Year Enrolled: " + yearEnrolled[index])
                    }
                    index++
                }
            }
            index = 0
            for (i in nickName) {
                if (i.length >= searchLength) {
                    var x = i.removeRange(searchLength..i.lastIndex)
                    if (searchFor.uppercase() == x.uppercase()) {
                        foundSet.add(firstName[index] + " " + "\"" + nickName[index] + "\"" + " " + lastName[index] + " - ID Number: " + id[index] + " - Year Enrolled: " + yearEnrolled[index])
                    }
                    index++
                }
            }

            index = 0
            for (i in lastName) {
                if (i.length >= searchLength) {
                    var x = i.removeRange(searchLength..i.lastIndex)
                    if (searchFor.uppercase() == x.uppercase()) {
                        foundSet.add(firstName[index] + " " + "\"" + nickName[index] + "\"" + " " + lastName[index] + " - ID Number: " + id[index] + " - Year Enrolled: " + yearEnrolled[index])
                    }
                    index++
                }
            }
            if (foundSet.size > 0) {
                for (i in foundSet) {
                    println("Found: $i")
                }
            } else {
                println("Found nothing")
            }
        }
    }
}