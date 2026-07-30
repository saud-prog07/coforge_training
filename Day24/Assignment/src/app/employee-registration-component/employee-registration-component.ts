import { Component } from '@angular/core';

@Component({
  selector: 'app-employee-registration-component',
  standalone: false,
  templateUrl: './employee-registration-component.html',
  styleUrl: './employee-registration-component.css',
})
export class EmployeeRegistrationComponent {
   employee = {
    empId: '',
    empName: '',
    email: '',
    mobile: '',
    department: '',
    gender: '',
    doj: '',
    salary: ''
  };

  registerEmployee() {
    alert("Employee Registered Successfully!");
    console.log(this.employee);
  }
}
