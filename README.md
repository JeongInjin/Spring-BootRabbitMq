# Srping Boot - RabbitMQ 연동
```
Dependencies
* Spring Boot DevTools
* Lombok
* Spring Web
* Spring for RabbitMQ
```


* RabbitMQ 설치
* Sender 개발
* 테스트
* Receiver 개발
* 테스트
* Receiver, Sender 수정 테스트

* docker 설치
  * 도커허브 https://hub.docker.com/editions/community/docker-ce-desktop-mac 에서 다운받는다.

* rabbitMQ docker 설치 
~~~
sudo docker run -d --name rabbitmq -p 5672:5672 -p 15672:15672 \
  --restart=unless-stopped \
  -e RABBITMQ_DEFAULT_USER=root \
  -e RABBITMQ_DEFAULT_PASS=root \
  rabbitmq:management
  
  * p 5672:5672 - > 주고받을 port 번호
* -p 15672:15672 -> 어드민 port 큐가 잘 들어오는지 관리하는 포트
  -e RABBITMQ_DEFAULT_USER=root \ -> 로그인 아이디 
  -e RABBITMQ_DEFAULT_PASS=root \ -> 로그인 비밀번호
~~~



* 접속
  * http://192.168.0.22:15672/ 또는 http://localhost:15672/ -> 로그인 (자신의 host ip)
    * 맥 : ipconfig getifaddr e0, 윈도우 : ipconfig
    

---

* 작업 방식
* SenderApplication 쪽에 @EnableScheduling 추가 SenderModule 생성후, Scheduled 1초 딜레이 테스트
* application.yml 설정
* 

