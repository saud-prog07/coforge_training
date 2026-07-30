import { Component } from '@angular/core';

@Component({
  selector: 'app-company-component',
  standalone: false,
  templateUrl: './company-component.html',
  styleUrl: './company-component.css',
})
export class CompanyComponent {
    Name : string;
    CEO : string;
    Location : string;
    Employees_count : number;
    Revenue : number;

    constructor() {
      this.Name = "Google";
      this.CEO = "Sundar Pichai";
      this.Location = "California, USA";
      this.Employees_count = 156500;
      this.Revenue = 257;
    }
}
