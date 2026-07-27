import { Component } from '@angular/core';
import { CalculatorService } from '../calculator-service';

@Component({
  selector: 'app-addition-component',
  standalone: false,
  templateUrl: './addition-component.html',
  styleUrl: './addition-component.css',
})
export class AdditionComponent {
  result: string;
  constructor(private calculatorService: CalculatorService) {
    this.result = 'Addition : ' + this.calculatorService.add(10, 20).toString();
  }
}
