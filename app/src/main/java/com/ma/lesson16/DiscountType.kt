package com.ma.lesson16

sealed class DiscountType(
    val calculate: (Int) -> String
) {
    data class FixAmount(val value: Int) : DiscountType({
        (it * value).toString()
    })

    data class RangeAmount(val startValue: Int, val endValue: Int) : DiscountType({
        (it * (startValue + endValue) / 2).toString()
    })

    object NoDiscount : DiscountType({
        "Zero"
    })

}