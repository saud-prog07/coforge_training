import { Component } from '@angular/core';

interface Student {
  id: number;
  name: string;
  marks: number;
}

@Component({
  selector: 'app-student-result-component',
  standalone: false,
  templateUrl: './student-result-component.html',
  styleUrl: './student-result-component.css',
})
export class StudentResultComponent {
  students: Student[] = [
    { id: 1, name: 'John Doe', marks: 85 },
    { id: 2, name: 'Jane Smith', marks: 92 },
    { id: 3, name: 'Alice Johnson', marks: 78 },
    { id: 4, name: 'Bob Brown', marks: 90 },
  ];
  totalStudents: number = this.students.length;

  passCount: number = this.students.filter(student => student.marks >= 35).length;

  failCount: number = this.students.filter(student => student.marks < 35).length;
}
