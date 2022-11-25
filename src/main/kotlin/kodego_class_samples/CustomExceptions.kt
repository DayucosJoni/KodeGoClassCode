package kodego_class_samples

class CellNumberException(message: String) : Exception(message)

sealed class MobileNumberException(message: String) : Exception(message) {
    sealed class InvalidLength(message: String) : MobileNumberException(message) {
        class MobileNumberTooShort(message: String = "Length too short"): InvalidLength(message)
        class MobileNumberTooLong(message: String = "Length too long"): InvalidLength(message)
    }
    class ContainsCharacters(message: String) : MobileNumberException(message)
    sealed class UnknownProvider(message: String) : MobileNumberException(message) {
        class NotGlobeProvider(message: String) : UnknownProvider(message)
        class NotSmartProvider(message: String) : UnknownProvider(message)
        class NotTouchMobileProvider(message: String) : UnknownProvider(message)
        class NotTalknTextProvider(message: String) : UnknownProvider(message)
    }
}

fun main() {
    MobileNumberException.UnknownProvider.NotGlobeProvider("dsdsds")
    var cellNumber = "09658249238s"
    try {
        checkCellNumber(cellNumber)
    } catch (e: Exception) {
        e.printStackTrace()
    }
}

fun checkCellNumber(cellNumber: String) {
    if (cellNumber.length > 11)
        throw MobileNumberException.InvalidLength.MobileNumberTooLong()
    if (cellNumber.length > 11)
        throw MobileNumberException.InvalidLength.MobileNumberTooLong()
    if (!isNumeric(cellNumber))
        throw CellNumberException("Contains Alphabets")
}

fun isNumeric(toCheck: String): Boolean {
    return toCheck.all { char -> char.isDigit() }
}