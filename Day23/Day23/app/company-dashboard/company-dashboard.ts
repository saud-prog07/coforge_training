import { Component } from '@angular/core';

@Component({
  selector: 'app-company-dashboard',
  standalone: false,
  templateUrl: './company-dashboard.html',
  styleUrl: './company-dashboard.css',
})
export class CompanyDashboard {
  CompanyName: string;
  CEO: string;
  Location: string;
  EmployeesCount: string;
  Revenue: string;

  constructor() {
    this.CompanyName = "Microsoft";
    this.CEO = "Satya Nadella";
    this.Location = "Redmond, Washington";
    this.EmployeesCount = "200000";
    this.Revenue = "2000000000";
  }

}
