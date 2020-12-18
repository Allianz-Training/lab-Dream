import { HttpClient } from '@angular/common/http';
import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-exchang-rate-api',
  templateUrl: './exchang-rate-api.component.html',
  styleUrls: ['./exchang-rate-api.component.css']
})
export class ExchangRateApiComponent implements OnInit {
  @Input()
  currencyRate: number;
  resultRate:number;
  currency1: string;
  currency2: string;
  amount: number;


  constructor(private httpClient: HttpClient) {
    
   }

  doExchange() {
    this.httpClient
    .get(`https://api.exchangeratesapi.io/latest?base=${this.currency1}&symbols=${this.currency2}`)
    //.get(`https://api.exchangeratesapi.io/latest?symbols=CAD,USD`)
    .subscribe(result => {

      this.currencyRate = result['rates'][this.currency2]
      this.resultRate = this.currencyRate * this.amount;      
    })
  }
  doCalculate(){
    
  }
  ngOnInit(){}
}
