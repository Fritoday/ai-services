package com.ai.biz.service.impl;

import com.ai.api.dto.AIRequest;
import com.ai.api.dto.AIResponse;
import com.ai.api.exception.AIServiceException;
import com.ai.biz.service.AIService;
import com.ai.dal.entity.AIRequestRecord;
import com.ai.dal.repository.AIRequestRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AIServiceImpl implements AIService {

    private final AIRequestRepository aiRequestRepository;

    public AIServiceImpl(AIRequestRepository aiRequestRepository) {
        this.aiRequestRepository = aiRequestRepository;
    }

    @Override
    @Transactional
    public AIResponse processAIRequest(AIRequest request) {
        try {
            // 模拟AI处理逻辑
            AIResponse response = new AIResponse();
            response.setId(java.util.UUID.randomUUID().toString());
            response.setContent("AI response for: " + request.getPrompt());
            response.setModel(request.getModel() != null ? request.getModel() : "gpt-3.5-turbo");
            response.setUsageTokens(100L);
            response.setCompletionTokens(80L);
            response.setPromptTokens(20L);
            response.setCreated(System.currentTimeMillis() / 1000);

            // 保存请求记录
            AIRequestRecord record = new AIRequestRecord();
            record.setPrompt(request.getPrompt());
            record.setMaxTokens(request.getMaxTokens());
            record.setTemperature(request.getTemperature());
            record.setModel(request.getModel());
            record.setResponse(response.getContent());
            record.setUsageTokens(response.getUsageTokens());
            
            aiRequestRepository.save(record);

            return response;
        } catch (Exception e) {
            throw new AIServiceException("Failed to process AI request", e);
        }
    }

    @Override
    public AIResponse getAIResponseById(String id) {
        // 这里可以扩展为从数据库或其他存储中获取响应
        throw new UnsupportedOperationException("Not implemented yet");
    }
}