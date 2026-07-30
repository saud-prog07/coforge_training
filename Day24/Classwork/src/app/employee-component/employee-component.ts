import { Component } from '@angular/core';

@Component({
  selector: 'app-employee-component',
  standalone: false,
  templateUrl: './employee-component.html',
  styleUrl: './employee-component.css',
})
export class EmployeeComponent {
  result: string;

  constructor() {
    this.result = "";
  }

  saveEmployee(data : any) {
    this.result = "Employee saved successfully with ID: " + data.eid + ", name: " + data.ename + ", salary: " + data.salary + ", department: " + data.dno;
  }
}
