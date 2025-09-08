-- Inserindo categorias
INSERT INTO category (name) VALUES
  ('Ação'),
  ('Ficção Científica'),
  ('Suspense'),
  ('Aventura');

-- Inserindo streamings
INSERT INTO streaming (name) VALUES
  ('Claro'),
  ('Netflix'),
  ('Apple'),
  ('Prime Video');

-- Inserindo filmes
INSERT INTO movie (title, description, rating, created_at, updated_at)
VALUES
  ('Velozes e Furiosos', 'Dominic Toretto e Brian O''Conner voltam para enfrentar um inimigo perigoso. A equipe se envolve em uma corrida cheia de ação, velocidade e adrenalina, lutando para proteger tudo o que construíram.', 87, NOW(), NOW()),
  ('John Wick', 'John Wick, um ex-assassino de aluguel, retorna à ação após criminosos destruírem sua vida. Movido pela vingança, ele enfrenta desafios intensos em um filme repleto de lutas e tiroteios estilizados.', 86, NOW(), NOW()),
  ('Matrix', 'Neo descobre que o mundo é uma simulação criada por máquinas inteligentes. Com a ajuda de Morpheus e Trinity, ele embarca em uma jornada para libertar a humanidade e desafiar a realidade.', 88, NOW(), NOW()),
  ('Inception', 'Dom Cobb é especialista em extrair segredos do subconsciente durante o sono. Para apagar seu passado, ele precisa realizar o impossível: implantar uma ideia na mente de alguém, enfrentando desafios em sonhos dentro de sonhos.', 91, NOW(), NOW()),
  ('O Senhor dos Anéis: A Sociedade do Anel', 'Um grupo de heróis embarca em uma jornada épica para destruir um anel maligno e salvar a Terra Média.', 95, NOW(), NOW()),
  ('Interestelar', 'Exploradores viajam pelo espaço em busca de um novo lar para a humanidade, enfrentando desafios cósmicos e emocionais.', 92, NOW(), NOW());

-- Relacionando filmes com categorias
INSERT INTO movie_category (movie_id, category_id) VALUES
  (1, 1), -- Velozes e Furiosos: Ação
  (2, 1), -- John Wick: Ação
  (3, 2), -- Matrix: Ficção Científica
  (4, 3), -- Inception: Suspense
  (5, 4), -- O Senhor dos Anéis: Aventura
  (6, 2); -- Interestelar: Ficção Científica

-- Relacionando filmes com streamings
INSERT INTO movie_streaming (movie_id, streaming_id) VALUES
  (1, 1), -- Velozes e Furiosos: Claro
  (2, 2), -- John Wick: Netflix
  (3, 3), -- Matrix: Apple
  (4, 4), -- Inception: Prime Video
  (5, 4), -- O Senhor dos Anéis: Prime Video
  (6, 2); -- Interestelar: Netflix
