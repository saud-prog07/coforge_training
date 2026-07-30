import { Component } from '@angular/core';

@Component({
  selector: 'app-product-component',
  standalone: false,
  templateUrl: './product-component.html',
  styleUrl: './product-component.css',
})
export class ProductComponent {
    Name : string;
    Price : number;
    Category : string;
    Brand : string;
    ImageUrl : string;
    Availability : boolean;
    height : number = 100;
    width : number = 200;
    
    constructor() {
      this.Name = "Laptop";
      this.Price = 50000;
      this.Category = "Electronics";
      this.Brand = "Dell";
      this.ImageUrl = 'image1.png';
      this.Availability = true;
    }
}
