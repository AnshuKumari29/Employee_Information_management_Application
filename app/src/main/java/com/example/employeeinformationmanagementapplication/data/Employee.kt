package com.example.employeeinformationmanagementapplication.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="Employee_data" )
data class Employee (

    @ColumnInfo(name= "employeeName")
        var EmployeeName: String,

    @ColumnInfo(name= "employeeName")
        var EmployeeEmail: String,


)
{
    @PrimaryKey(autoGenerate = true)
        var id:Int?= null
}