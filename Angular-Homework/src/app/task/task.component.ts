import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import {Task} from './task';
@Component({
  selector: 'app-task',
  templateUrl: './task.component.html',
  styleUrls: ['./task.component.css']
})
export class TaskComponent implements OnInit {
  @Input()
  task:Task;
  @Input()
  enabledID: number;
  constructor() {
   }
  
  @Output()
  OnDelete: EventEmitter<Task> = new EventEmitter();
  
  @Output()
  OnToggle: EventEmitter<Task> = new EventEmitter();

  ngOnInit(): void {
  }

  deleteTask() {
    this.OnDelete.emit(this.task);
  }
 
  toggle() {
    this.OnToggle.emit(this.task);
    console.log('toggle');
  }
}
