import { Component, signal } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.html',
  standalone: false,
  styleUrl: './app.css'
})
export class App {
  name : string;
  age : number;
  email : string;
  imagePath : string;
  height : number;
  width : number;
  myStyle = {};
  myClass : string;
  fname : string = "";

  constructor() {
    this.name = "Abhiram";
    this.age = 21;
    this.email = "abc@gmail.com";
    this.imagePath = "image.png";
    this.height = 100;
    this.width = 200;
    this.myClass = "ZoomIn";
    this.myStyle = {
      "color" : "brown",
      "font-size" : "5px"
    }
  }  

  getAddition(a : number, b : number) : number {
    return a + b;
  }

  changeName() {
    if(this.name === "Abhiram") {
      this.name = "Abhi";
    }
    else {
      this.name = "Abhiram";
    }
  }

  zoomInOut() {
    if(this.myClass === "ZoomIn") {
      this.myClass = "ZoomOut";
    }
    else {
      this.myClass = "ZoomIn";
    }
  }
}
