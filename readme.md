# DealerTrack

## Introdução

O projeto foi criado sobre a seguinte Stack:
- Java 8
- Selenium WebDriver
- TestNG

## Repositório do Projeto
https://github.com/matheusfontinele/dealertrack

## Sobre o desafio
A página após carregada contém a URL: https://www.dealertrack.com.br/#/home diferente do especificado no documento do desafio. Sendo assim, considero dois caminhos válidos o desafio:
- Validar com o valor https://www.dealertrack.com.br/#/home
- Realizar asserção verificando se a url atual contém https://www.dealertrack.com.br

Optei pela primeira opção, e criei um caso de teste onde a valor https://www.dealertrack.com.br deve ser considerado como uma URL inválida.