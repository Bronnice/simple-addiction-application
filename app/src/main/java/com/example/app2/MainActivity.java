package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.app2.classes.Employee;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayList<Employee> employees = new ArrayList<>();
    TextView name, surname, function;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.editTextPersonName);
        surname = findViewById(R.id.editTextPersonSurname);
        function = findViewById(R.id.editTextPersonFunction);
    }

    public void addEmployee(View view){
        Employee item = new Employee(name.getText().toString(), surname.getText().toString(), function.getText().toString());
        employees.add(item);
        if(employees.contains(item)){
            System.out.println("Сотрудник добавлен");
            Toast toast = Toast.makeText(this, "Сотрудник добавлен",Toast.LENGTH_LONG);
            toast.show();
        }
    }
}