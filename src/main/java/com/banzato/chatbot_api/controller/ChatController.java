package com.banzato.chatbot_api.controller;

import com.banzato.chatbot_api.service.GroqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chat")
@CrossOrigin(origins = "*")
public class ChatController {

    @Autowired
    private GroqService groqService;

    @PostMapping
    public String chat(@RequestBody String mensagem) {
        return groqService.chat(mensagem);
    }
}