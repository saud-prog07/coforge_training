import { Component } from '@angular/core';

@Component({
  selector: 'app-student-component',
  standalone: false,
  templateUrl: './student-component.html',
  styleUrl: './student-component.css',
})
export class StudentComponent {
    ImageUrl : string;
    Name : string;
    Course : string;
    College : string;
    height : number = 100;
    width : number = 200;

    constructor() {
      this.ImageUrl = 'image.png';
      this.Name = "Bunny";
      this.Course = "AIML";
      this.College = "VNR VJIET";
    }
}
