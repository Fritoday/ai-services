package com.ai.api.dto;

public class AIResponse {
    private String id;
    private String content;
    private String model;
    private Long usageTokens;
    private Long completionTokens;
    private Long promptTokens;
    private Long created;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Long getUsageTokens() {
        return usageTokens;
    }

    public void setUsageTokens(Long usageTokens) {
        this.usageTokens = usageTokens;
    }

    public Long getCompletionTokens() {
        return completionTokens;
    }

    public void setCompletionTokens(Long completionTokens) {
        this.completionTokens = completionTokens;
    }

    public Long getPromptTokens() {
        return promptTokens;
    }

    public void setPromptTokens(Long promptTokens) {
        this.promptTokens = promptTokens;
    }

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }
}