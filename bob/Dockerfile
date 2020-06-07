# 使用JDK11.0.7
FROM openjdk:11.0.7

# 拷贝JAR包
COPY build/libs/bob-0.0.1-SNAPSHOT.jar app.jar

# 容器启动时执行
ENTRYPOINT ["java", "-jar", "/app.jar"]

# 暴露端口
EXPOSE 8081