import { Component, OnInit,Input } from '@angular/core';
import { Task } from '../task/task';
import { TaskComponent } from '../task/task.component';

@Component({
 selector: 'app-todolist',
 templateUrl: './todolist.component.html',
 styleUrls: ['./todolist.component.css']
})

export class ToDoListComponent implements OnInit{
    @Input()
    tasks:Task[];
    title:string;
    name:string='';
    description:string='';
    intId: number=3;
    enabledID: number = 0;

    ngOnInit(): void{}
    constructor(){
        this.tasks = [];
        this.tasks.push({
            id: 1,
            name: 'Test3',
            description: 'Test description3'
          });
          this.tasks.push({
            id: 2,
            name: 'Test',
            description: 'Test description'
          });
       

    }
    

    deleteTask(task: Task) {
      this.tasks.splice(this.tasks.indexOf(task),1)
    }
    
    addTask() {
      this.tasks.push({
        id: this.intId,
        name: this.name,
        description: this.description
      });
      this.intId++;
    }

    toggleTask(taskItem: Task) {
  
      if (this.enabledID === taskItem.id) {
        this.enabledID = 0;
        this.name = '';
        this.description = '';
      } else {
        this.enabledID = taskItem.id;
        this.name = taskItem.name;
        this.description = taskItem.description;
      }
    }
}