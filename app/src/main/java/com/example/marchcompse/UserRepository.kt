package com.example.marchcompse

import javax.inject.Inject

class UserRepository @Inject constructor() {

    fun getCourseName(): String {
        return "Android"
    }
}
