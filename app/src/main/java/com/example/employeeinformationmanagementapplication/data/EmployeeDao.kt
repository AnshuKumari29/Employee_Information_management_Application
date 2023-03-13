package com.example.employeeinformationmanagementapplication.data

import androidx.lifecycle.LiveData
import androidx.room.*


@Dao
interface EmployeeDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)     //if same user ia added again it will be ignored
    suspend fun addEmployee(employee: Employee)

    @Delete()
    suspend fun deleteEmployee(employee: Employee)

    @Update
    suspend fun updateEmployee(employee: Employee)

    @Query("SELECT * FROM Employee_data" )
    fun readAllData(): LiveData<List<Employee>>
}