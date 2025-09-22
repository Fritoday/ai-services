package com.ai.web.controller;

import com.ai.api.dto.AIRequest;
import com.ai.api.dto.AIResponse;
import com.ai.api.exception.AIServiceException;
import com.ai.biz.service.AIService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ai")
public class AIController {
    private final AIService aiService;

    public AIController(AIService aiService) {
        this.aiService = aiService;
    }

    @PostMapping("/process")
    public ResponseEntity<AIResponse> processAIRequest(@Valid @RequestBody AIRequest request) {
        try {
            AIResponse response = aiService.processAIRequest(request);
            return ResponseEntity.ok(response);
        } catch (AIServiceException e) {
            return ResponseEntity.badRequest().body(null);
        }
    }

    @GetMapping("/response/{id}")
    public ResponseEntity<AIResponse> getAIResponse(@PathVariable String id) {
        try {
            AIResponse response = aiService.getAIResponseById(id);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @ExceptionHandler(AIServiceException.class)
    public ResponseEntity<String> handleAIServiceException(AIServiceException e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }
}