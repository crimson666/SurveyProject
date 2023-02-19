import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { AppService } from 'src/app/app.service';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';

@Component({
  selector: 'app-adduser',
  templateUrl: './adduser.component.html',
  styleUrls: ['./adduser.component.css']
})
export class AdduserComponent implements OnInit {

  constructor(private service: AppService, private router: Router) { }

  data: any

  
  form = new FormGroup({
    name: new FormControl('', [Validators.required]),
    dop: new FormControl('', [Validators.required]),
    gender: new FormControl('', [Validators.required]),
    email: new FormControl('', [Validators.required]),
    pno: new FormControl('', [Validators.required]),
    address: new FormControl('', [Validators.required]),
    product: new FormControl('', [Validators.required]),
    rating: new FormControl('', [Validators.required]),
  })

  ngOnInit(): void {
  }

  
  submit(){
    this.data = this.form.value
    console.log(this.data)

    this.service.adduser(this.data).subscribe(data => {
      console.log(data)
    })

    
    
    this.router.navigate(['/']);
  }

}
