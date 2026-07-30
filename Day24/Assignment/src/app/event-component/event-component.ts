import { Component } from '@angular/core';

@Component({
  selector: 'app-event-component',
  standalone: false,
  templateUrl: './event-component.html',
  styleUrl: './event-component.css',
})
export class EventComponent {
    Name : string='';
    Email : string='';
    Course : string='';
    message : string='';

    register() {
      this.message = "Registration Successful";

      console.log("Name : " + this.Name);
      console.log("Email : " + this.Email);
      console.log("Course : " + this.Course);
    }

    clear() {
      this.Name = '';
      this.Email = '';
      this.Course = '';
      this.message = '';
    }
}
