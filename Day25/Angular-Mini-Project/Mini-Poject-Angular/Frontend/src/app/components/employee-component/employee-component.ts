import { Component } from '@angular/core';
import { EmployeeService } from '../../services/employee-service';
import { Employee } from '../../models/Employee';

@Component({
  selector: 'app-employee-component',
  standalone: false,
  templateUrl: './employee-component.html',
  styleUrl: './employee-component.css'
})
export class EmployeeComponent {

  employee: Employee;
  employees: Employee[] = [];   // <-- Add this
  result = '';

  constructor(private employeeService: EmployeeService) {
    this.employee = new Employee();
  }

  saveEmployee(data: any) {

    this.employee.eid = data.eid;
    this.employee.ename = data.ename;
    this.employee.esalary = data.salary;
    this.employee.dno = data.dno;

    this.employeeService.saveEmployee(this.employee).subscribe({
      next: (res) => {
        this.result = res;
      },
      error: (err) => {
        this.result = err.error;
      }
    });

  }

  updateEmployee(data: any) {

    this.employee.eid = data.eid;
    this.employee.ename = data.ename;
    this.employee.esalary = data.salary;
    this.employee.dno = data.dno;

    this.employeeService.updateEmployee(this.employee).subscribe({
      next: (res) => {
        this.result = res;
      },
      error: (err) => {
        this.result = err.error;
      }
    });

  }

  deleteEmployee(data: any) {

    this.employeeService.deleteEmployee(data.eid).subscribe({
      next: (res) => {
        this.result = res;
      },
      error: (err) => {
        this.result = err.error;
      }
    });

  }

  findEmployee(data: any) {

    this.employeeService.findEmployee(data.eid).subscribe({

      next: (res) => {

        this.employee = res;
        this.result = "Employee Found Successfully";

      },

      error: (err) => {

        this.result = err.error;

      }

    });

  }

  findAllEmployees() {

    this.employeeService.findAllEmployees().subscribe({

      next: (res) => {

        this.employees = res;
        this.result = "Employees Loaded Successfully";

      },

      error: (err) => {

        this.result = err.error;

      }

    });

  }

}