import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.scss'],
})
export class ProfileComponent implements OnInit {

  public uid: string='@username';
  public name: string='Acupace';
  public email: string='acupace@gmail.com';
  public pass: string='********';
  public phone: string='9876543210';
  public address: string='India';


  constructor() { }

  ngOnInit() {}

}
