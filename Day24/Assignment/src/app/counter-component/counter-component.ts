import { Component } from '@angular/core';

@Component({
  selector: 'app-counter-component',
  standalone: false,
  templateUrl: './counter-component.html',
  styleUrl: './counter-component.css',
})
export class CounterComponent {
    Counter : number = 0;

    incrementCounter() {
        this.Counter = this.Counter + 1;
    }
    
    decrementCounter() {
        this.Counter = this.Counter - 1;
    }

    resetCounter() {
        this.Counter = 0;
    }
}
