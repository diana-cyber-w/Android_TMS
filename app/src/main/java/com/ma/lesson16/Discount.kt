package com.ma.discounts

data class Discount(
    val title: String,
    var description: String,
    var amount: Int? = null,
    val url: String? = null,
    val discountType: DiscountType
) {
    fun getUppercaseTitle() = title.uppercase()

    fun updateDescription(description: String) {
        this.description = if (description.length >= 100) {
            description.substring(0, 100)
        } else {
            description
        }
    }

    fun setMyAmount(value: Int) {
        amount = try {
            1 / value
        } catch (exception: ArithmeticException) {
            0
        }
    }

    fun getSafeUrl(): String = if (url == null) {
        "Google.com"
    } else {
        url!!
    }

    fun temp(url: String?): String {
        return url ?: "Google.com"
    }
}
