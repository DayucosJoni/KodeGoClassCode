package kodego_class_samples

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {
   // var dateNow = Date()
    var dateTimeNow = LocalDateTime.now()
  //  var dateTime = LocalDateTime.of(2022, Month.OCTOBER, 5,8,1)
    var dateFormat1 = DateTimeFormatter.ofPattern("M/d/y H:m:ss")
    var dateBorrowed: ArrayList<String> = arrayListOf()
    var dateReturn: ArrayList<String> = arrayListOf()
  //  println(dateNow)
    println(dateTimeNow)
  //  println(dateTime)
    println(dateTimeNow.format(dateFormat1))
    dateTimeNow.plusDays(3)
    println(dateTimeNow.plusDays(3).format(dateFormat1))
    var borrowDate = dateTimeNow.format(dateFormat1)
    dateBorrowed.add(borrowDate)
    println(dateBorrowed)
    var returnDate = dateTimeNow.plusDays(3).format(dateFormat1)
    dateReturn.add(returnDate)
    print(dateReturn)

}