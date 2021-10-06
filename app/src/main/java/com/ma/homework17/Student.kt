package com.ma.homework17

data class Student(
    val name: String? = null,
    val id: Int? = null
) {
    fun getSafeId(): Int = id ?: 0

    fun getSafeName(): String = name ?: "No name"
}