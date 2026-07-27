import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-employee-component',
  standalone: false,
  templateUrl: './employee-component.html',
  styleUrl: './employee-component.css',
})
export class EmployeeComponent implements OnInit {
  employees: any[] = [];
  errorMessage: string = '';

  private apiUrl = 'http://localhost:1111/api/v1/ems/employees';

  constructor(private http: HttpClient) {}

  ngOnInit(): void {
    this.getEmployees();
  }

  getEmployees(): void {
    this.http.get<any[]>(this.apiUrl).subscribe({
      next: (data) => {
        this.employees = data;
      },
      error: (err) => {
        this.errorMessage = 'Failed to fetch employees from backend (http://localhost:1111/api/v1/ems/employees).';
        console.error('Error fetching employees:', err);
      }
    });
  }
}

