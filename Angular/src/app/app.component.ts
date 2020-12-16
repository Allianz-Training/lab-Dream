import { Component, OnInit, ViewChild,AfterViewInit } from '@angular/core';
import { ProductListComponent } from './catalog/product-list/product-list.component';
import {BackendService} from './backend.service'
@Component({
 selector: 'app-root',
 templateUrl: './app.component.html',
 styles: []
})
export class AppComponent implements AfterViewInit {
  constructor(private backendService: BackendService) {}

 @ViewChild('productList')
 productList: ProductListComponent;


 
 ngAfterViewInit(): void {
  this.productList.products = this.backendService.getProducts();
}

}

