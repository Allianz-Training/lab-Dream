import { Injectable } from '@angular/core';
import { TestBed } from '@angular/core/testing';
import { Product } from './product/product';

@Injectable({
 providedIn: 'root'
})
export class BackendService {
 constructor() {}

 getProducts(): Product[] {
  
   return [{name: 'Test', price: 1,amount:1}];
 }

 getProductById(productId: number): Product {
   return;
 }
}
