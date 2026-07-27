import { Component } from '@angular/core';

@Component({
  selector: 'app-student-component',
  standalone: false,
  templateUrl: './student-component.html',
  styleUrl: './student-component.css',
})
export class StudentComponent {
  StudentPhoto: string;
  Name: string;
  Course: string;
  College: string;
  width: number;
  height: number;
  constructor() {
    this.StudentPhoto = "image.png";
    this.Name = "Saud";
    this.Course = "Computer Science";
    this.College = "VNR VJIET";
    this.width = 200;
    this.height = 200;
  }

}
