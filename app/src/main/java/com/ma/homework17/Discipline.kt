package com.ma.homework17

data class Discipline(
    val name: String? = null,
    val id: Int? = null
) {
    fun getSafeId(): Int = id ?: 0

    fun getSafeNameOfDiscipline(): String = name ?: "No discipline"
}