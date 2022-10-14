# docker_gradle_springboot_springbatch_flyway
docker+그레이들+스프링부트+스프링배치+flyway조합으로 간단한 샘플 프로젝트 작성  
이 프로젝트는 복수의 DB가 아닌 SingleDB 일 경우를 전제로 함  
DB Unit Test 샘플코드도 포함되어 있음  

### 도커 컨테이너 기동
```git
docker-compose up -d
```
- dbname : springjpadb
- port : 3309

### 터미널에서 Gradle flyway마이그레이션
```git
./gradlew flywayClean
or
./gradlew flywayMigrate
or
./gradlew flywayInfo
```

### 빌드
```
./gradlew build
```

### 실행
```git
java -Dspring.profiles.active=local -jar ./build/libs/batchsample-0.0.1-SNAPSHOT.jar --JOB_NAME=BATCH1
```

### IntelliJ에서 실행

> 실행환경 구성 Active Profile 에서 local 을 적고, 실행인자값으로 --JOB_NAME=BATCH1 을 해줄것.



### 버전 정보  
- Java : 17
- SpringBoot : 2.6.2
- Mysql : 8.0
- Flyway : 8.0.0