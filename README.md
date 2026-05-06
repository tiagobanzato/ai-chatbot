# 🤖 Chatbot IA

Chatbot com Inteligência Artificial desenvolvido com Java, Spring Boot e interface web, utilizando o modelo LLaMA 70B via API do Groq para respostas em tempo real em português.

## 💡 Sobre o Projeto

O usuário acessa a interface pelo navegador, digita uma mensagem e recebe respostas geradas por IA em tempo real. O backend em Java processa a requisição e se comunica com a API do Groq, que utiliza o modelo LLaMA 3.3 70B da Meta.

## ✨ Funcionalidades

- ✅ Interface de chat visual acessível pelo navegador
- ✅ Respostas geradas por IA (LLaMA 3.3 70B)
- ✅ Comunicação em tempo real com indicador "Digitando..."
- ✅ Respostas formatadas com suporte a negrito e quebras de linha
- ✅ Envio de mensagem por botão ou tecla Enter

## 🛠️ Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot 3.5**
- **Groq API** (LLaMA 3.3 70B)
- **HTML + CSS + JavaScript** (interface web)
- **Maven**

## 🏗️ Arquitetura

```
Navegador (HTML/CSS/JS)
        ↓ POST /chat
ChatController (Spring Boot)
        ↓
GroqService
        ↓ HTTP Request
Groq API (LLaMA 3.3 70B)
        ↓
Resposta em português
```

## 🚀 Como Rodar o Projeto

### Pré-requisitos
- Java 17 ou superior
- Maven
- Chave de API do Groq (gratuita)

### Passo a passo

1. Clone o repositório:
```bash
git clone https://github.com/tiagobanzato/chatbot-api.git
```

2. Entre na pasta do projeto:
```bash
cd chatbot-api
```

3. Configure sua chave da API do Groq no arquivo `application.properties`:
```properties
groq.api.key=SUA_CHAVE_AQUI
```
> Obtenha sua chave gratuitamente em [console.groq.com](https://console.groq.com)

4. Rode o projeto:
```bash
./mvnw spring-boot:run
```

5. Acesse no navegador:
```
http://localhost:8080
```

## 💬 Como Usar

1. Acesse `http://localhost:8080` no navegador
2. Digite sua mensagem no campo de texto
3. Pressione **Enter** ou clique em **Enviar**
4. Aguarde a resposta da IA

## 🤖 Sobre o Modelo de IA

O projeto utiliza o modelo **LLaMA 3.3 70B Versatile** da Meta, disponibilizado gratuitamente pela plataforma Groq. O assistente é configurado para responder sempre em português de forma clara e objetiva.

## 👨‍💻 Autor

**Tiago Banzato**
Estudante de Análise e Desenvolvimento de Sistemas 
[![GitHub](https://img.shields.io/badge/GitHub-tiagobanzato-black?logo=github)](https://github.com/tiagobanzato)
