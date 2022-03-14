const val MINIMUM_COMMISSION_VISA_MIR = 35_00.0
const val COMMISSION_VISA_MIR = 0.0075
const val LIMIT_WITHOUT_COMMISSION_MASTERCARD_MAESTRO = 75_000_00.0
const val COMMISSION_MASTERCARD_MAESTRO = 0.006
const val COMMISSION_MASTERCARD_MAESTRO_FIX = 20_00.0
const val CARDS_TRANSFER_LIMIT = 600_000_00.0
const val VK_PAY_LIMIT = 40_000_00.0

fun main() {
    print("Для перевода со счета VK Pay введите 1, MasterCard/Maestro - 2, VISA/MIR - 3")
    val accountType = readLine()?.toDouble() ?: return
    print("Введите сумму предыдущих переводов за текущий месяц: ")
    val previousTransfersInMonth = readLine()?.toDouble() ?: return
    print("Введите сумму перевода: ")
    val amount = readLine()?.toDouble() ?: return
    fun calculateCommission(accountType: UInt = 1U, previousTransfersInMonth: UInt = 0U, transferAmount: UInt): Double {
        val commissionToPay: Double = when (accountType) {
            2U -> when {
                previousTransfersInMonth <=

                }
                    error("Месячный тариф для перевода превышен!")

            }
        }
        return commissionToPay
    }
}