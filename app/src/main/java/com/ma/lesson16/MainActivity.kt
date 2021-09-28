package com.ma.lesson16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ma.discounts.Discount
import com.ma.discounts.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

fun main() {
    val discount = Discount(
        "Cat", "The best Cat Discount", 0, "http", DiscountType.FixAmount(1)
    )
    println(discount.discountType.calculate(5))

    val discountCopy = discount.copy(discountType = DiscountType.RangeAmount(1, 3))
    println(discountCopy.discountType.calculate(5))

    val discountCopyWithNoDiscountType = discount.copy(discountType = DiscountType.NoDiscount)
    println(discountCopyWithNoDiscountType.discountType.calculate(5))

}