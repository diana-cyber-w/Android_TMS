package com.ma.homework17

data class Student(
    var nameOfStudent: String? = null,
    var idOfStudent: Int? = null
) {
    fun getId(): Int = if (idOfStudent == null) {
        0
    } else {
        idOfStudent!!
    }

    fun getSafeName(): String = if (nameOfStudent == null) {
        "No name"
    } else {
        nameOfStudent!!
    }
}