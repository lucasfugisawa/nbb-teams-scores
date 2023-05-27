# NBB Teams Scores!
Este programa foi feito como exemplo para ajudar um colega a resolver um problema / exercício em Java.


# Enunciado do problema / exercício:

Supondo que você tenha uma empresa de software, e que o NBB contrate sua empresa para escrever um programa que informe, automaticamente, quem são os primeiros k times dessa competição. Seu programa deve ler o arquivo de entrada uma ÚNICA vez, e a ordenação desses times é determinada a partir do número de vitórias obtidas, e caso os times tenham o mesmo número de vitórias, o critério de desempate é o número de pontos. Os dados de entrada são as datas, os horários, os times e os placares dos jogos. Se o usuário digitar o nome do arquivo que segue e k = 1, o melhor time do NBB deve ser mostrado. Se k = 2, o melhor e o vice times da competição devem ser apresentados. 

## Massa de dados para testes

```
14.04. 19:30/União Corinthians/Fortaleza B.C./91/75
13.04. 19:15/Corinthians Paulista/Cerrado/78/66
13.04. 19:00/Paulistano/Brasília/113/71
12.04. 20:00/Caxias do Sul/Fortaleza B.C./66/77
12.04. 20:00/Rio Claro/São José/80/92
11.04. 20:00/Paulistano/São Paulo/99/57
10.04. 20:00/Franca/Flamengo/83/70
10.04. 19:30/Bauru/União Corinthians/81/61
10.04. 19:30/Pato/Cerrado/98/91
08.04. 18:00/Bauru/Caxias do Sul/89/69
08.04. 18:00/Rio Claro/Flamengo/53/100
08.04. 15:00/Fortaleza B.C./Minas/85/94
08.04. 11:00/Pinheiros/União Corinthians/94/70
07.04. 19:30/Pato/Brasília/91/64
06.04. 20:00/Cerrado/Franca/68/106
06.04. 19:15/Unifacisa/Minas/79/69
05.04. 20:00/Flamengo/Paulistano/83/70
05.04. 19:00/Pinheiros/Caxias do Sul/89/82
04.04. 20:00/Brasília/Franca/72/87
03.04. 20:00/Corinthians Paulista/Caxias do Sul/75/76
03.04. 19:00/Minas/Paulistano/105/70
01.04. 19:00/União Corinthians/Unifacisa/82/85
01.04. 18:00/Flamengo/São Paulo/79/70
01.04. 18:00/Franca/São José/95/75
31.03. 19:00/Minas/Pato/82/90
30.03. 20:00/Caxias do Sul/Unifacisa/55/58
30.03. 19:30/Brasília/Rio Claro/74/92
30.03. 19:15/São José/São Paulo/97/84
29.03. 19:30/Bauru/Pinheiros/82/71
28.03. 20:00/Cerrado/Rio Claro/109/84
28.03. 20:00/Minas/Corinthians Paulista/88/86
27.03. 20:00/Flamengo/São José/96/68
27.03. 19:30/União Corinthians/Franca/83/86
25.03. 18:00/Caxias do Sul/Franca/76/89
24.03. 20:00/Corinthians Paulista/União Corinthians/82/78
24.03. 20:00/Fortaleza B.C./Pinheiros/78/92
24.03. 19:30/Unifacisa/Bauru/71/81
23.03. 20:00/Rio Claro/Minas/79/97
23.03. 19:30/São José/Paulistano/71/77
23.03. 19:15/Brasília/Flamengo/75/109
22.03. 20:00/Fortaleza B.C./Bauru/100/101
22.03. 19:30/Pato/União Corinthians/66/68
22.03. 19:30/Unifacisa/Pinheiros/69/80
21.03. 20:00/Cerrado/Flamengo/70/102
21.03. 20:00/Franca/Minas/94/90
14.03. 20:00/Minas/São Paulo/87/76
13.03. 19:30/União Corinthians/Rio Claro/95/83
13.03. 19:00/Paulistano/Cerrado/91/77
11.03. 18:00/Bauru/Pato/74/55
```
## Observações sobre a solução

Essa implementação tem o objetivo de exemplificar uma possível solução que envolva tanto manipulação de dados quanto orientação a objetos. Porém, como o foco é em manter uma didática acessível a iniciantes, não houve preocupação com boas práticas, padrões de projetos, clean code, SOLID, testes automatizados etc.
