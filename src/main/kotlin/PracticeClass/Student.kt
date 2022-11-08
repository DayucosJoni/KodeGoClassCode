package PracticeClass


class StudentArray(
    firstName: ArrayList<String> = arrayListOf("Joni", "Jane", "Audric", "Stephen", "Joshua"),
    lastName: ArrayList<String> = arrayListOf("Dayucos", "Dacullo", "Dayucos", "Tee", "Zy"),
    nickName: ArrayList<String> = arrayListOf("James", "Kaye", "Zyaire", "John", "Zylie"),
    id: ArrayList<Int> = arrayListOf(2022001, 2022002, 2021001, 2020001, 2019001),
    yearEnrolled:ArrayList<Int> = arrayListOf(2022, 2022, 2021, 2020, 2019)
) {
    var firstName = firstName
    var lastName = lastName
    var nickName = nickName
    var id = id
    var yearEnrolled = yearEnrolled


    fun addStudent() {
        println(firstName)
        firstName.add("Vyvo")
        println(firstName)
        firstName.set(0,"Mark")
        println(firstName)
    }

    }

