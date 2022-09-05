FROM artifacts.iflytek.com/docker-private/paas/base:pure
#FROM openjdk:8-jdk
MAINTAINER djduan

ADD target/*.jar  iflytek-cloud-caas-demo-provider.jar

ENTRYPOINT ["java","-jar","iflytek-cloud-caas-demo-provider.jar","--spring.cloud.nacos.config.server-addr=${NACOS_ADDR}", "--spring.cloud.nacos.discovery.server-addr=${NACOS_ADDR}"]
