
# Todo List

A small full-stack project in Spring Boot and Angular 9.
## Information about the project

The project was built as a result of a Angular training course :
-   Design and implement a simple API for Todo itens (CRUD)
-   Implement security with JWT (also there's example with basic auth)
-   There should be some form of persistent storage (H2)
-   Front-end in Angular 9
-   Connect both projects


### Installing

Clone or download the repository:
```
$ git clone https://github.com/jeantravassos/todolist-angular-springboot.git
```

### Running
1 - Open two tabs in the Terminal:
1.1 - Run the service in the first tab:
* Navigate to [todolist-angular-springboot](https://github.com/jeantravassos/todolist-angular-springboot)/[backend](https://github.com/jeantravassos/todolist-angular-springboot/tree/master/backend)/**objectivesss-service**/ 
* Run: mvn clean install

1.2 - Run the Angular application in the second tab:
* Navigate to [todolist-angular-springboot](https://github.com/jeantravassos/todolist-angular-springboot)/[frontend](https://github.com/jeantravassos/todolist-angular-springboot/tree/master/frontend)/**objectivesss**/ 
* Run: ng serve

2 - Open a browser:
* http://localhost:4200
* Login: jean / NewSafePassword!


## APIs




| Action | URI | Request Method | Body |
| --- | --- | --- | --- |
| New Todo | http://localhost:8080/users/{username}/todos | POST | {{"id": 3,"username": "jean","description": "Learn Angular 9","targetDate":"2020-03-22T19:09:00.342+0000","done": false}} |
| Update Todo | http://localhost:8080/users/{username}/todos/{id} | PUT | {{"id": 3,"username": "jean","description": "Learn Angular 9 and practice","targetDate":"2020-03-22T19:09:00.342+0000","done": false}} |
| Get Todos | http://localhost:8080/users/{username}/todos | GET | - |
| Delete Todo | http://localhost:8080/users/{username}/todos/{id} | DELETE | - |


## Built With

* [Spring boot](https://spring.io/projects/spring-boot)
* [H2](https://www.h2database.com/html/main.html)
* [Project Lombok](https://projectlombok.org/)
* [Swagger](https://swagger.io/)
* [Angular](https://angular.io/)
* [JWT](https://jwt.io/)
* [Maven](https://maven.apache.org/)


## Abstract Design
1 - Application Service layer (serves the requests)
* Todos service

2 - Data Storage layer 
* Stores all todos

3 - Front-end
* Allows user interaction with the application


## Author

* **Jean Travassos** - *Senior Software Engineer* - [LinkedIn](https://www.linkedin.com/in/jeantravassos/)

