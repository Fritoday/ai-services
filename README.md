# AI Services Project

基于Spring Boot的分层架构AI服务项目

## 项目结构

- **ai-api**: 接口定义层，包含DTO和异常类
- **ai-dal**: 数据访问层，包含实体类和Repository
- **ai-biz**: 业务逻辑层，包含服务接口和实现
- **ai-web**: Web控制层，包含控制器和启动类

## 技术栈

- Spring Boot 3.x
- Spring Data JPA
- H2 Database (开发环境)
- Lombok
- Maven

## 快速开始

1. 克隆项目
2. 运行构建命令：
   ```bash
   mvn clean install
   ```

3. 启动应用：
   ```bash
   cd ai-web
   mvn spring-boot:run
   ```

4. 访问API：
   - POST http://localhost:8080/ai/api/ai/process
   - GET http://localhost:8080/ai/api/ai/response/{id}

## API说明

### 处理AI请求
```json
POST /api/ai/process
Content-Type: application/json

{
  "prompt": "你的问题",
  "maxTokens": 100,
  "model": "gpt-3.5-turbo"
}
```

### 获取AI响应
```
GET /api/ai/response/{id}
```

## 开发说明

项目采用标准Maven多模块结构，各模块职责清晰：

1. **ai-api**: 定义服务接口和数据传输对象
2. **ai-dal**: 负责数据持久化和数据库操作
3. **ai-biz**: 实现业务逻辑和核心算法
4. **ai-web**: 提供RESTful API和Web界面

## 配置说明

- 开发环境使用H2内存数据库
- 生产环境可配置MySQL或其他数据库
- 日志级别默认为DEBUG，便于开发调试