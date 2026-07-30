import { Component } from '@angular/core';

@Component({
  selector: 'app-ngif',
  standalone: false,
  templateUrl: './ngif.html',
  styleUrl: './ngif.css',
})
export class Ngif {
  myDivStyle : string;
  myButtonStyle : {};
  message : string;
  flag : boolean;
  vehicles : string[];
  selectedVehicle : string;

  constructor() {
    this.myDivStyle = "MyDiv";
    this.myButtonStyle = {
      'background-color': 'lightblue',
      'border': '2px solid blue',
      'color': 'white'
    };
    this.message = "Angular Structural Directive";
    this.flag = true;
    this.vehicles = ["Car", "Bus", "Truck", "Bike"];
    this.selectedVehicle = "";
  }
  showHideDiv() {
    this.flag = !this.flag;
  }
  setSelectedVehicle(vehicle : string) {
    this.selectedVehicle = vehicle;
  }
  
}
