FROM openjdk:11-jdk-slim
VOLUME /tmp

# ディレクトリ追加
RUN mkdir /app
WORKDIR /app

# エントリーポイントの設定
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "./gradlew build && java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar build/libs/refcheck-0.0.1-SNAPSHOT.jar" ]