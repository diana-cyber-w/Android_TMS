package com.ma.homework16

data class Order(
    var id: Int,
    var name: String? = null,
    var address: String? = null,
    var dateOfOrder: String? = null,
    val kindOfDelivery: Delivery
) {
    fun setOrderId(value: Int) {
        var idCounter: Int = 0
        id = if (value > 0) {
            value
        } else {
            idCounter++
        }
    }

    fun getSafeName(): String = if (name == null) {
        "Без названия"
    } else {
        name!!
    }

    fun getSafeAddress(): String = if (address == null) {
        "Адрес не указан"
    } else {
        address!!
    }

    fun getSafeDateOfOrder(): String = if (dateOfOrder == null) {
        "Дата заказа неизвестна"
    } else {
        dateOfOrder!!
    }
}