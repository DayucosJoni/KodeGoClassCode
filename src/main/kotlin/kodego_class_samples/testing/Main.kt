package kodego_class_samples.testing

import kodego_class_samples.CellNumberException
import kodego_class_samples.MobileNumberException
import kodego_class_samples.isNumeric

class FormChecker {
    fun checkCellNumber (cellNumber: String){
        if (cellNumber.length < 11)
            throw MobileNumberException.InvalidLength.MobileNumberTooShort()

        if (cellNumber.length > 11)
            throw MobileNumberException.InvalidLength.MobileNumberTooLong()

        if (!isNumeric(cellNumber))
            throw CellNumberException("Contains Alphabets")
    }

    fun getTax(values:ArrayList<Int>): Double {
        var sum = 0
        if (values.size == 0)
            return 0.0
        for(value in values) {
            sum += value
        }
        return sum * .12
    }
}