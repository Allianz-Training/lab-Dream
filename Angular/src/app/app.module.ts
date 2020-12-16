import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
//import { ProductListComponent } from './product/product-list/product-list.component';
//import { ProductItemComponent } from './product/product-item/product-item.component';
import { BackendService} from './backend.service'
import { FormsModule } from '@angular/forms';
import { CatalogModule } from './catalog/catalog.module';
import { HomeModule } from './home/home.module';
  
@NgModule({
  declarations: [
    AppComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    CatalogModule,
    HomeModule
  ],
  providers: [BackendService],
  bootstrap: [AppComponent]
})
export class AppModule { }
