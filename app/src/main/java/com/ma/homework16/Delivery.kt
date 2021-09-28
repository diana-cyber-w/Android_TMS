package com.ma.homework16

sealed class Delivery(
    var deliver: (Order) -> String
) {
    data class DeliveryByCourier(val nameOfCourier: String) : Delivery({
        "Курьер $nameOfCourier доставит Ваш заказ '${it.name}'. Ожидайте!"
    })

    data class DeliveryByPostalService(val addressOfPostOffice: String) : Delivery({
        "Ваш заказ '${it.name}' уже отправлен. Вы можете забрать его по адресу: $addressOfPostOffice"
    })

    object PickUp : Delivery({
        "Ваш заказ '${it.name}' готов. Ждем Вас в нашем магазине!"
    })
}
