package com.example.employeeinformationmanagementapplication.data

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class EmployeeViewModel(
    private val repository: EmployeeRepository): ViewModel(){



    fun addEmployee (employee: Employee)=
        GlobalScope.launch{
            repository.addEmployee(employee)
        }
    fun deleteEmployee (employee: Employee)=
        GlobalScope.launch {
            repository.deleteEmployee(employee)
        }

    fun readAllEmployee()=repository.readAllData
    }
