fun calculateCommission(cardType: String = "MasterCard", previousTransfers: Double = 0.0, transferAmount: Double): Double {
    val commissionRate = 0.0075

    return when (cardType) {
        "MasterCard", "Maestro" -> {
            if (previousTransfers + transferAmount > 0) {
                0.0
            } else {
                transferAmount * commissionRate
            }
        }
        "VK Pay" -> 0.0
        else -> transferAmount * commissionRate
    }
}

fun main() {
    val cardType = "MasterCard"
    val previousTransfers = 500.0
    val transferAmount = 1000.0

    val commission = calculateCommission(cardType, previousTransfers, transferAmount)

    println("Transfer amount: $transferAmount rubles")
    println("Commission: $commission rubles")
}
