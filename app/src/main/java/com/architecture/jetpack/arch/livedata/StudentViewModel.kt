package com.architecture.jetpack.arch.livedata

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData

class StudentViewModel(application: Application): AndroidViewModel(application){
    private val db:RoomSingleton = RoomSingleton.getInstance(application)
    internal val allStudents : LiveData<List<Student>> = db.studentDao().allStudents()

    fun insert(student:Student){
        db.studentDao().insert(student)
    }
}