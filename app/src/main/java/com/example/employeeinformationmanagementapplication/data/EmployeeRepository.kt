package com.example.employeeinformationmanagementapplication.data

import androidx.lifecycle.LiveData

class EmployeeRepository(private val employeeDao: EmployeeDao) {

     fun readAllData() = employeeDao.readAllData()

    suspend fun addEmployee(employee: Employee)
    {
        employeeDao.addEmployee(employee)
    }
    suspend fun deleteEmployee(employee: Employee)
    {
        employeeDao.deleteEmployee(employee)
    }
    suspend fun updateEmployee(employee: Employee)
    {
        employeeDao.updateEmployee(employee)
    }
}