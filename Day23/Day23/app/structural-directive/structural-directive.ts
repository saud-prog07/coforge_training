import { Component } from '@angular/core';

@Component({
  selector: 'app-structural-directive',
  standalone: false,
  templateUrl: './structural-directive.html',
  styleUrl: './structural-directive.css',
})
export class StructuralDirective {
  myDivStyle: string;
  myButtonStyle: {};
  message: string;
  flag: boolean;
  vehicles: string[];
  selectedVehicle: string;
  constructor() {
    this.myDivStyle = "MyDiv";
    this.myButtonStyle = { backgroundColor: 'Red', color: "White", width: "200px", height: "50px", border: "2px solid green" };
    this.message = "Angular Structural Directive";
    this.flag = true;
    this.vehicles = ["Car", "Bike", "Truck", "Ship", "Aeroplane"];
    this.selectedVehicle = "";
  }

  showHideDev() {
    this.flag = !this.flag;
  }
  onSelectVehicle(vehicle: string) {
    this.selectedVehicle = vehicle;
  }
}
