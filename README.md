# AI Chatbot

AI chatbot with a web interface, built with Java and Spring Boot. It uses the LLaMA 3.3 70B model through the Groq API to answer in real time.

## About the project

The user opens the chat in the browser, types a message and gets AI-generated answers in real time. The Java backend handles the request and talks to the Groq API, which runs Meta's LLaMA 3.3 70B model.

## Features

- Browser-based chat interface
- AI-generated answers (LLaMA 3.3 70B)
- Real-time responses with a "typing..." indicator
- Formatted answers with bold text and line breaks
- Send messages with a button or the Enter key

## Tech stack

- **Java 17+**
- **Spring Boot 3.5**
- **Groq API** (LLaMA 3.3 70B)
- **HTML + CSS + JavaScript** (web interface)
- **Maven**

## Architecture

```
Browser (HTML/CSS/JS)
        ↓ POST /chat
ChatController (Spring Boot)
        ↓
GroqService
        ↓ HTTP request
Groq API (LLaMA 3.3 70B)
        ↓
Response
```

## Running locally

### Requirements
- Java 17 or later
- Maven
- A Groq API key (free)

### Steps

1. Clone the repository:
```bash
git clone https://github.com/tiagobanzato/ai-chatbot.git
```

2. Go to the project folder:
```bash
cd ai-chatbot
```

3. Add your Groq API key to `application.properties`:
```properties
groq.api.key=YOUR_KEY_HERE
```
> You can get a free key at [console.groq.com](https://console.groq.com)

4. Run the project:
```bash
./mvnw spring-boot:run
```

5. Open in your browser:
```
http://localhost:8080
```

## Usage

1. Open `http://localhost:8080` in your browser
2. Type your message in the text field
3. Press **Enter** or click **Enviar** (Send)
4. Wait for the AI's answer

## About the AI model

The project uses Meta's **LLaMA 3.3 70B Versatile** model, available for free on the Groq platform. The assistant is currently configured to answer in Portuguese, clearly and concisely.

## Author

**Tiago Banzato**  
Software developer · Dublin, Ireland  
[![GitHub](https://img.shields.io/badge/GitHub-tiagobanzato-black?logo=github)](https://github.com/tiagobanzato)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-banzato-0A66C2?logo=linkedin)](https://www.linkedin.com/in/banzato)
