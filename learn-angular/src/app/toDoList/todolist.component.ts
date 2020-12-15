import { Component, Input } from '@angular/core';

@Component({
 selector: 'app-todolist',
 templateUrl: './todolist.component.html',
 styleUrls: ['./todolist.component.css']
})

export class ToDoListComponent{
    @Input()
    tasks=['Coffee','Breakfast'];
    constructor(){}
    title:string;
    addTasks(){
        this.tasks.push(this.title)
    }
    deleteTasks(task){
        this.tasks.splice(this.tasks.indexOf(task),1)
    }
}