import { Component } from '@angular/core';
import { Header } from '../../../components/not-logged/header/header';
import { SignUp } from '../../../components/not-logged/sign-up/sign-up';

@Component({
  selector: 'app-registation',
  imports: [Header, SignUp],
  templateUrl: './registation.html',
  styleUrl: './registation.css'
})
export class Registation {

}
