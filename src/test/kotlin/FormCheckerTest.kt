import kodego_class_samples.MobileNumberException
import kodego_class_samples.testing.FormChecker
import org.jetbrains.annotations.TestOnly
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class SampleTest {
    val formChecker: FormChecker = FormChecker()

    @Test
    fun checkCellNumber() {
        assertThrows<MobileNumberException.InvalidLength.MobileNumberTooLong> {
            formChecker.checkCellNumber("0911111221111")
        }
        assertThrows<MobileNumberException> {
            formChecker.checkCellNumber("0911111221111")
        }

        assertThrows<MobileNumberException.InvalidLength> {
            formChecker.checkCellNumber("092920293044")
        }
        assertThrows<MobileNumberException.InvalidLength.MobileNumberTooShort> {
            formChecker.checkCellNumber("09000000")
        }
    }
}