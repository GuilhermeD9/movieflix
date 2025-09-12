import { Home } from './pages/logged/home/home';
import { Routes } from '@angular/router';
import { Registation } from './pages/not-logged/registration/registration';
import { CreateMovie } from './pages/logged/create-movie/create-movie';
import { Login } from './pages/not-logged/home/login';
import { authGuard } from './guards/auth.guard';

export const routes: Routes = [
    {
        path: '',
        component: Home,
        canActivate: [authGuard]
    },
    {
        path: 'novo-filme',
        component: CreateMovie,
        canActivate: [authGuard]
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
