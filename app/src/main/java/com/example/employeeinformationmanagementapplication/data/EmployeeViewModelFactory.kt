package com.example.employeeinformationmanagementapplication.data

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class EmployeeViewModelFactory(private val repository: EmployeeRepository):
    ViewModelProvider.NewInstanceFactory() {

        override fun <T: ViewModel> create (modelClass: Class<T>):T{
            return EmployeeViewModel(repository) as T
        }
}