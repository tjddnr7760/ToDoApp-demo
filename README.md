# ToDoApp-demo

## 핵심기능 정리 

- 할 일 목록을 등록한다.
- 목록을 조회한다.
- 목록을 특정 id로 조회할수 있다.
- 완료한 일은 완료표시를 한다.
- 일 내용을 수정할 수 있다.
- 등록된 할 일을 삭제할 수 있다.
- 특정 id를 통해서 할 일을 삭제할 수 있다.

### 도메인 모델 구축

<img src = "https://github.com/tjddnr7760/ToDoApp-demo/assets/42529087/e0a5c8b4-0bc6-41d2-9c06-5bff05550d44" width="" height=""> 

### 유스케이스 그림

<img src = "https://github.com/tjddnr7760/ToDoApp-demo/assets/42529087/59e83cce-4b98-483f-912f-4fc7e8cbcfb2" width="" height="">

### 기능별 유스케이스 정리

1. 할 일 목록 등록

<img src = "https://github.com/tjddnr7760/ToDoApp-demo/assets/42529087/df02ad68-a0ff-49ac-890f-ed53ab58ff29" width="400" height="">

2. 할 일 목록 조회

<img src = "https://github.com/tjddnr7760/ToDoApp-demo/assets/42529087/ea778d3b-4d41-4ff1-8744-e8d5d2c5b404" width="400" height="">

3. 할 일 목록 삭제

<img src = "https://github.com/tjddnr7760/ToDoApp-demo/assets/42529087/a791e37e-db8e-471a-bdb2-e2cb31d201d6" width="400" height="">

4. 할 일 목록 상태 변경

<img src = "https://github.com/tjddnr7760/ToDoApp-demo/assets/42529087/f866105f-24e7-48c9-9ee9-ccc9b7ff335a" width="400" height="">

5. 할 일 목록 수정

<img src = "https://github.com/tjddnr7760/ToDoApp-demo/assets/42529087/ddbcfa0b-e8c0-4d3c-a46f-0b9ddeb9f87a" width="400" height="">

### 유스케이스별 협력순서 정리

- 도메인 모델이 "할 일"객체 하나밖에 없음으로 본 객체에서 모든 협력을 처리한다.

### 도메인 협력관계 정의

<img src = "https://github.com/tjddnr7760/ToDoApp-demo/assets/42529087/eacf85be-e747-4bf1-8300-ac0e31578566">

### 클래스 다이어그램

<img src = "https://github.com/tjddnr7760/ToDoApp-demo/assets/42529087/fdf757c1-ff08-45ab-9008-2ddf94829c41">

### 객체 다이어그램

<img src = "https://github.com/tjddnr7760/ToDoApp-demo/assets/42529087/18f57a4f-0bfe-48a7-8717-eafa9b7d7101">

### api 설계

- 등록 : POST, /
- 조회 : GET, /
- 아이디 조회 : GET, /{id}
- 수정 : PATCH, /{id}
- 삭제 : DELETE, /
- 아이디 삭제 : DELETE, /{id}

### erd 설계

<img src = "https://github.com/tjddnr7760/ToDoApp-demo/assets/42529087/41a52789-b080-4829-ad25-5ca6df56100a">

### 기능별 flow

1. 할 일 목록 등록

<img src = "https://github.com/tjddnr7760/ToDoApp-demo/assets/42529087/130d7d3f-e99a-4e12-a52c-f801afff4ba9">

2. 할 일 목록 조회

- 전체 조회

<img src = "https://github.com/tjddnr7760/ToDoApp-demo/assets/42529087/be0d5241-45de-433d-9128-e12ef16b737d">

- 아이디 조회

<img src = "https://github.com/tjddnr7760/ToDoApp-demo/assets/42529087/be8245b4-2277-490f-b363-3a1021f20cd6">

3. 할 일 목록 삭제
4. 할 일 목록 상태 변경

<img src = "https://github.com/tjddnr7760/ToDoApp-demo/assets/42529087/e56fca8c-ce18-4f59-824d-da6f222163b0">
5. 할 일 목록 수정