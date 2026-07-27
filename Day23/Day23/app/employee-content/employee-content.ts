import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-employee-content',
  standalone: false,
  templateUrl: './employee-content.html',
  styleUrl: './employee-content.css',
})
export class EmployeeContent {
  result: string = '';
  private apiUrl = 'http://localhost:1111/api/v1/ems/employees';

  constructor(private http: HttpClient) {}

  saveEmployee(data: any) {
    this.http.post(this.apiUrl, data).subscribe({
      next: (response) => {
        this.result = `Employee saved successfully! Server response: ${JSON.stringify(response)}`;
      },
      error: (err) => {
        this.result = `Failed to save employee to backend (http://localhost:1111/api/v1/ems/employees).`;
        console.error('Error saving employee:', err);
      }
    });
  }

  updateEmployee(eid: number, data: any) {
    this.http.put(`${this.apiUrl}/${eid}`, data).subscribe({
      next: (response) => {
        this.result = `Employee ID ${eid} updated successfully! Server response: ${JSON.stringify(response)}`;
      },
      error: (err) => {
        this.result = `Failed to update employee ID ${eid}.`;
        console.error('Error updating employee:', err);
      }
    });
  }
}

