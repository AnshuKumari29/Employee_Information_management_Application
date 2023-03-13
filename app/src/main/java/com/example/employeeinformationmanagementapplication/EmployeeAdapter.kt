package com.example.employeeinformationmanagementapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.employeeinformationmanagementapplication.data.Employee
import androidx.recyclerview.widget.RecyclerView

class EmployeeAdapter(
    var list: List<Employee>,
    val EmployeeClickInterface: EmployeeClickInterface,
    employeeView: Any
):
    RecyclerView.Adapter<EmployeeAdapter.EmployeeViewHolder>() {



    inner class EmployeeViewHolder(employeeView: View):RecyclerView.ViewHolder(employeeView)

    val name = employeeView.findViewById<TextView>(R.id.idEditEmployeeName)
    val email= employeeView.findViewById<TextView>(R.id.idEditEmployeeEmail)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmployeeViewHolder {
        TODO("Not yet implemented")
        val view = LayoutInflater.from(parent.context).
        inflate(R.layout.employee_details,parent,false)
        return EmployeeViewHolder(view)
    }

    override fun onBindViewHolder(holder: EmployeeViewHolder, position: Int) {
        TODO("Not yet implemented")
        holder.name.text= list.get(position).EmployeeName
        holder.email.text= list.get(position).EmployeeEmail
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }


}



interface EmployeeClickInterface {
    fun onEmplyeeClick(employee: Employee)

}
