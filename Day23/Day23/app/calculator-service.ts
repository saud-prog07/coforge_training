import { Injectable } from '@angular/core';

@Injectable()
export class CalculatorService {
    add(n1: number, n2: number): number {
        return n1 + n2;
    }
    sub(n1: number, n2: number): number {
        return n1 - n2;
    }
    mul(n1: number, n2: number): number {
        return n1 * n2;
    }
    div(n1: number, n2: number): number {
        if (n2 === 0) {
            throw new Error('Cannot divide by zero');
        }
        return n1 / n2;
    }
}
