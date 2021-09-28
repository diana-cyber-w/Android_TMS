package com.ma.homework16

fun main() {
    val firstOrder = Order(
        21,
        "Мягкая игрушка",
        "г.Минск, ул.Чюрлёниса, д.1",
        "25 сентября 2021",
        Delivery.PickUp
    )
    val secondOrder =
        Order(1, "Кровать", "г.Минск, ул.Щорса, д.5", "25 сентября 2021", Delivery.PickUp)
    val thirdOrder =
        Order(12, "Канцелярия", "г.Минск, ул.Тимирязева, д.67", "25 сентября 2021", Delivery.PickUp)
    val listOfOrders = listOf<Order>(firstOrder, secondOrder, thirdOrder)
    val arrayOfDelivery = arrayOf(
        Delivery.DeliveryByCourier("Максим"),
        Delivery.DeliveryByPostalService("г.Минск, ул.Матусевича, д.5"),
        Delivery.PickUp
    )
    listOfOrders.forEach { orders ->
        arrayOfDelivery.forEach {
            val order = orders.copy(kindOfDelivery = it)
            println(it.deliver(order))
        }
    }
}