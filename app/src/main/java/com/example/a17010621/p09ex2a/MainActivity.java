package com.example.a17010621.p09ex2a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvEmployee;
    ArrayList<Employee> employeeList;
    CustomAdapter caEmployee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEmployee = findViewById(R.id.listViewEmployee);
        employeeList = new ArrayList<>();
        Employee item1 = new Employee("John", "Software Technical Engineer", "3400.00");
        Employee item2 = new Employee("May", "Programmer", "2200.00");

        employeeList.add(item1);
        employeeList.add(item2);


        caEmployee = new CustomAdapter(this, R.layout.employee, employeeList);

        lvEmployee.setAdapter(caEmployee);

    }
}