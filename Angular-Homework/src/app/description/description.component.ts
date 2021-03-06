import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-description',
  templateUrl: './description.component.html',
  styleUrls: ['./description.component.css']
})
export class DescriptionComponent implements OnInit {
  @Input()
  taskName: string;
  @Input()
  description : string;
  constructor() { }

  ngOnInit(): void {
  }

}
