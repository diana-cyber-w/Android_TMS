package com.ma.homework17

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.ma.discounts.R
import kotlin.collections.listOf

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val student1 = Student("Alex", 1)
        val student2 = Student("Peter", 2)
        val student3 = Student("John", 3)
        val student4 = Student("Masha", 4)
        val student5 = Student("Anna", 5)
        val student6 = Student("Helen", 6)
        val listOfStudents =
            listOf(student1, student2, student3, student4, student5, student6)
        val discipline1 = Discipline("Mathematics", 1)
        val discipline2 = Discipline("Physics", 2)
        val discipline3 = Discipline("Philosophy", 3)
        val discipline4 = Discipline("Economics", 4)
        val listOfDisciplines =
            listOf(discipline1, discipline2, discipline3, discipline4)
        val listOfMarks = arrayListOf<Mark>()

        listOfStudents.forEach { student ->
            listOfDisciplines.forEach {
                val mark = Mark()
                mark.student = student
                mark.discipline = it
                mark.value = (0..10).random()
                listOfMarks.add(mark)
            }
        }

        listOfStudents.forEach { student ->
            var countOfStudentMarks = 0
            val name: String = student.getSafeName()
            var marksSum = 0
            listOfMarks.forEach { mark ->
                if (mark.student.getSafeName() == name) {
                    marksSum += mark.value
                    countOfStudentMarks++
                }
            }
            val averageMarkOfStudent: Int = marksSum / countOfStudentMarks
            Log.i(
                "Средний балл ученика",
                "Средний балл ученика $name = $averageMarkOfStudent"
            )
        }

        listOfDisciplines.forEach { discipline ->
            var countOfDisciplineMarks = 0
            val name: String = discipline.getSafeNameOfDiscipline()
            var marksSum = 0
            listOfMarks.forEach { mark ->
                if (mark.discipline.getSafeNameOfDiscipline() == name) {
                    marksSum += mark.value
                    countOfDisciplineMarks++
                }
            }
            val averageMarkOfDiscipline: Int = marksSum / countOfDisciplineMarks
            Log.v(
                "Средний балл дисциплины",
                "Средний балл дисциплины $name = $averageMarkOfDiscipline"
            )
        }

        var marksSum = 0
        var countOfAverageMarks = 0
        listOfMarks.forEach {
            marksSum += it.value
            countOfAverageMarks++
        }
        val averageMark: Int = marksSum / countOfAverageMarks
        Log.e(
            "Общий средний балл",
            "Общий средний балл равен $averageMark"
        )
    }
}

