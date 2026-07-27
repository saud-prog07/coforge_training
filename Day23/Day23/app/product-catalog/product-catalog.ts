import { Component } from '@angular/core';

@Component({
  selector: 'app-product-catalog',
  standalone: false,
  templateUrl: './product-catalog.html',
  styleUrl: './product-catalog.css',
})
export class ProductCatalog {
  ProductName: string;
  Price: number;
  Category: string;
  Brand: string;
  Image: string;
  Availability: string;
  width: number;
  length: number;

  constructor() {
    this.ProductName = "Fooball Boots";
    this.Price = 5000;
    this.Category = "Shoes";
    this.Brand = "Nike";
    this.Image = "product.jpg";
    this.Availability = "In Stock";
    this.width = 150;
    this.length = 100;
  }

}
