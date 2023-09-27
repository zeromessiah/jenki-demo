# 基础镜像
FROM amazoncorretto:17.0.8-al2023

# 指定工作目录
WORKDIR /app

# 将 jar 包添加到工作目录，比如 target/yuoj-backend-user-service-0.0.1-SNAPSHOT.jar
ADD target/jenkins-demo-0.0.1-SNAPSHOT.jar .

# 暴露端口
EXPOSE 8880

# 启动命令
ENTRYPOINT ["java","-jar","/app/target/jenkins-demo-0.0.1-SNAPSHOT.jar"]