import { Component } from '@angular/core';

@Component({
  selector: 'app-event-registration-form',
  standalone: false,
  templateUrl: './event-registration-form.html',
  styleUrl: './event-registration-form.css',
})
export class EventRegistrationForm {
  Name: string;
  Email: string;
  Course: string;
  message: string;

  constructor() {
    this.Name = "";
    this.Email = "";
    this.Course = "";
    this.message = "";
  }

  register() {
    console.log(this.Name);
    console.log(this.Email);
    console.log(this.Course);
    this.message = "Registration Successful";
  }

  reset() {
    this.Name = "";
    this.Email = "";
    this.Course = "";
    this.message = "";
  }
}
