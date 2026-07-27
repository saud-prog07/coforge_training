import { Component } from '@angular/core';
import { CalculatorService } from '../calculator-service';

@Component({
  selector: 'app-subtraction-component',
  standalone: false,
  templateUrl: './subtraction-component.html',
  styleUrl: './subtraction-component.css',
})
export class SubtractionComponent {
  result: string;
  num1: number = 0;
  num2: number = 0;
  constructor(private calculateService: CalculatorService) {

    this.result = "";
  }
  dosub() {
    this.result = "Subtraction is " + this.calculateService.sub(this.num1, this.num2).toString();
  }
}
