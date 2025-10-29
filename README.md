# Web Mini Project
**Open API / 카카오맵 활용 관광 명소 찾기 서비스 구축**

## 프로젝트 개요
본 프로젝트는 Spring Boot, MyBatis, Kakao Maps API를 활용하여 사용자가 원하는 관광 명소를 쉽고 직관적으로 탐색할 수 있는 웹 서비스를 구축하는 것을 목적으로 합니다.  
Travel DB와 Kakao 지도 API를 연동하여 관광지 정보 조회와 지도 시각화를 동시에 지원합니다.

## 프로젝트 내용
- 키워드 검색을 통해 관광 명소 조회, 검색 결과를 리스트와 지도에 동기화
- 관광지 선택 시 상세 정보(주소, 전화번호, 대표 이미지) 확인 가능
- 주변 관광지 탐색 지원
- MyBatis를 활용한 DB 연동 및 페이징 기능 구현
- 다중 이미지 모달 갤러리와 썸네일 미리보기 기능 제공

## 개발 환경 / 기술 스택
- **Backend:** Java 17, Spring Boot, MyBatis, Lombok
- **Database:** MySQL
- **Frontend:** HTML5, CSS3, JavaScript(jQuery), Kakao Maps API
- **Build Tool:** Gradle
- **Server:** Spring Boot 내장 Tomcat

## 활용 기술

### 백엔드
- Spring Web(MVC)로 RESTful API 구현
- MyBatis를 통한 데이터베이스 연동
- Lombok으로 코드 자동 생성 및 가독성 향상

### 프론트엔드
- HTML/CSS, JavaScript로 웹 UI 구성
- Thymeleaf와 jQuery로 서버 데이터 렌더링 및 AJAX 처리
- Kakao Maps API로 관광지 지도 시각화 및 주변 정보 제공

### 데이터베이스
- MySQL을 활용하여 관광지 정보 저장 및 관리

## 주요 기능
- **검색:** 관광지명, 주소 등 키워드 검색, 리스트와 지도 동기화
- **페이징 처리:** 대용량 데이터 효율적 탐색 지원
- **REST & Open API:** 내부 DB와 외부 공공데이터 API 연동, JSON 형태 제공
- **Kakao Map API:** 지도 시각화, 마커 표시, 정보창 제공
- **동적 상호작용:** 지도 마커 클릭 시 상세 정보 표시, 이미지 모달 갤러리 지원, 지도-리스트 양방향 연동

## 실행 결과
- 관광지 검색 및 페이징 처리
- 메인 관광지 위치 표시 및 상세 정보 확인
- 주변 관광지 표시 및 이미지 갤러리 기능
