package com.ma.homework17

class Discipline(
    var nameOfDiscipline: String? = null,
    var idOfDiscipline: Int? = null
) {
    fun getId(): Int = if (idOfDiscipline == null) {
        0
    } else {
        idOfDiscipline!!
    }

    fun getSafeNameOfDiscipline(): String = if (nameOfDiscipline == null) {
        "No discipline"
    } else {
        nameOfDiscipline!!
    }
}