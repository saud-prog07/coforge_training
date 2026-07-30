import { Component } from '@angular/core';

@Component({
  selector: 'app-pipe-component',
  standalone: false,
  templateUrl: './pipe-component.html',
  styleUrl: './pipe-component.css',
})
export class PipeComponent {
  name : string;
  date: Date;

  constructor() {
    this.name = "Abhiram";
    this.date = new Date();
  }
}
