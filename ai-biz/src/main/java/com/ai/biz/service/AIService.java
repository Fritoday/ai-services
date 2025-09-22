package com.ai.biz.service;

import com.ai.api.dto.AIRequest;
import com.ai.api.dto.AIResponse;

public interface AIService {
    AIResponse processAIRequest(AIRequest request);
    
    AIResponse getAIResponseById(String id);
}