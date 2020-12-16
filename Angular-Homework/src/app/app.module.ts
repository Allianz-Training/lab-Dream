import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { Lab4Component } from './lab4/lab4.component';
import { FormsModule } from '@angular/forms';
import { ToDoListComponent } from './toDoList/todolist.component';
import { CategotyMenuComponent } from './categoty-menu/categoty-menu.component';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import { SearchBarComponent } from './search-bar/search-bar.component';
import { TopBannerComponent } from './top-banner/top-banner.component';
import { HomeTestComponent } from './home-test/home-test.component';
import { TaskComponent } from './task/task.component';
import { DescriptionComponent } from './description/description.component';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    Lab4Component,
    ToDoListComponent,
    CategotyMenuComponent,
    NavBarComponent,
    SearchBarComponent,
    TopBannerComponent,
    HomeTestComponent,
    TaskComponent,
    DescriptionComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
