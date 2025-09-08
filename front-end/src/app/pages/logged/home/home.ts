import { Component } from '@angular/core';
import { Header } from '../../../components/logged/header/header';
import { Card } from '../../../components/logged/card/card';
import { Movie } from '../../../../interfaces/movie';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-home',
  imports: [Header, Card, CommonModule],
  templateUrl: './home.html',
  styleUrl: './home.css'
})
export class Home {
  movies: Movie[] = [
    {
      id: 1,
      title: "Velozes e Furiosos",
      description: "Dominic Toretto e Brian O'Conner voltam para enfrentar um inimigo perigoso. A equipe se envolve em uma corrida cheia de ação, velocidade e adrenalina, lutando para proteger tudo o que construíram.",
      duration: "2:17h",
      ageRating: "Somente +18",
      approvalRating: 87,
      providerLogo: "/images/patners/claro.png",
      isTop10: true
    },
    {
      id: 2,
      title: "John Wick",
      description: "John Wick, um ex-assassino de aluguel, retorna à ação após criminosos destruírem sua vida. Movido pela vingança, ele enfrenta desafios intensos em um filme repleto de lutas e tiroteios estilizados.",
      duration: "1:41h",
      ageRating: "Somente +18",
      approvalRating: 86,
      providerLogo: "/images/patners/netflix.png",
      isTop10: true
    },
    {
      id: 3,
      title: "Matrix",
      description: "Neo descobre que o mundo é uma simulação criada por máquinas inteligentes. Com a ajuda de Morpheus e Trinity, ele embarca em uma jornada para libertar a humanidade e desafiar a realidade.",
      duration: "2:16h",
      ageRating: "Somente +16",
      approvalRating: 88,
      providerLogo: "/images/patners/apple.png",
      isTop10: false
    },
    {
      id: 4,
      title: "Inception",
      description: "Dom Cobb é especialista em extrair segredos do subconsciente durante o sono. Para apagar seu passado, ele precisa realizar o impossível: implantar uma ideia na mente de alguém, enfrentando desafios em sonhos dentro de sonhos.",
      duration: "2:28h",
      ageRating: "Somente +14",
      approvalRating: 91,
      providerLogo: "/images/patners/Prime Video.png",
      isTop10: true
    }
  ]
}
