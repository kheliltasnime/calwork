package com.example.pfe.Service;

import com.example.pfe.Dto.Employee.RequestEmployee;
import com.example.pfe.Dto.Employee.RequestEmployeeUpdate;
import com.example.pfe.Dto.Employee.ResponseEmployee;
import com.example.pfe.Dto.LoginDTO;
import com.example.pfe.Dto.LoginMessage;
import com.example.pfe.Entities.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<ResponseEmployee> getAllEmployee();
    Boolean deleteEmployee(Long id);
    void createEmployee(RequestEmployee employeeRequest);
    Employee updateEmployee(Long id, RequestEmployeeUpdate employeeRequest);
    ResponseEmployee getEmployeeById(Long id);
   // ResponseEmployee getEmployeeByIdwithTask(Long id);
    LoginMessage loginEmployee(LoginDTO loginDTO);
    Optional<Employee> getEmployeeByEmail(String email);
}
