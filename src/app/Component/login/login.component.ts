import { Component, OnInit } from '@angular/core';
import { MessageServiceService } from '../../Services/message-service.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent implements OnInit {

  constructor(private messageService:MessageServiceService){}

  ngOnInit(): void {
    this.messageService.getSendEmail().subscribe(
      {
        next:data=> {
          console.log(data)
        },
        error:err=>{
        }
      }
    )
  }


}
