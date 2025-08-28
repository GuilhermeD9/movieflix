import { Routes } from '@angular/router';
import { Login } from './pages/not-logged/home/login';
import { Home } from './pages/logged/home/home';
import { Registation } from './pages/not-logged/registration/registration';

export const routes: Routes = [
    {
        path: '',
        component: Home
    },
    {
        path: 'login',
        component: Login
    },
    {
        path: 'cadastro',
        component: Registation
    }
];
