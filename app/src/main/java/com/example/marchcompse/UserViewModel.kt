package com.example.marchcompse

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import jakarta.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor() : ViewModel() {

    @Inject
    lateinit var userRepository: UserRepository

    fun getSessionName() : String{
        return userRepository.getCourseName()
    }
}