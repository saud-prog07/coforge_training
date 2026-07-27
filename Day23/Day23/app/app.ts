import { Component, signal } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.html',
  standalone: false,
  styleUrl: './app.css'
})
export class App {
  name: string;
  age: number;
  email: string;
  imagePath: string;
  width: number;
  height: number;
  myStyle: {};
  myClass: string;
  fname: string;

constructor() {
  this.name = "Saud";
  this.age = 20;
  this.email = "saud@gmail.com";
  this.imagePath = "image.png";
  this.width = 200;
  this.height = 200;
  this.myStyle = { 'color': 'purple', 'font-size': '40px' };
  this.myClass = "ZoomIn";
  this.fname = "";
}

getAddition(a: number, b: number): number {
  return a + b;
}

changename() {
  if (this.name == "Saud") {
    this.name = "SAUD";
  } else {
    this.name = "Saud";
  }
}

zoomInOut() {
  if (this.myClass == "ZoomIn") {
    this.myClass = "ZoomOut";
  } else {
    this.myClass = "ZoomIn";
  }
}
}
