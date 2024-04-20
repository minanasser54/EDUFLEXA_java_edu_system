# Eduflexa   
"Online Course Store"
# Features
1- flexability > "esacpe timing" 
2- no timing  > "only complete courses" 

# Project Structure   "will be Replaced by UML"
3 classes interface abstraction
{accounts (types)- courses - quizes - mentors }
abstract user (name - email - password - img - getters - setters - gender -  )
                mentor( courses[] - students[]  )
                student(id - enrolled_courses[] )
                staff (function on database (add , remove ,update ))
        course (title - price - duration - content"-1-string" -  chapters[] -students[] - published - complete)
        chapter(lessons [], title ,quiz[] )
        lesson()
        quiz(question[], duration - grade )
interfaces (
    comparbale > sorting 
    enrolable  "check that course is "published" and complete" impelemented by course
    is_mentor "check user has at least 1 course "   implemented by user  "only can create course"
    )

1 exception handling
1 java fx    "scene builder"
scheduling 
authication
json data storage    ""
imgs videos     >>  static"for site" dynamic"user"  resources  


TASKS [
    1 exeception  > 
    1 java fx  >   
    classes  كلنا          
    deadline   
]

]
@startuml

interface CourseManager {
    + listCourses(): List<Course>
    + addCourse(course: Course): void
    + removeCourse(course: Course): void
}

interface UserManager {
    + registerUser(user: User): void
    + updateUser(user: User): void
    + removeUser(user: User): void
}

class Course {
    - id: int
    - name: String
    - description: String
    - instructor: String
    - price: double
    - duration: int
    + Course(id: int, name: String, description: String, instructor: String, price: double, duration: int)
    + getId(): int
    + getName(): String
    + getDescription(): String
    + getInstructor(): String
    + getPrice(): double
    + getDuration(): int
}

class User {
    - id: int
    - name: String
    - email: String
    - password: String
    + User(id: int, name: String, email: String, password: String)
    + getId(): int
    + getName(): String
    + getEmail(): String
}

class Enrolment {
    - id: int
    - user: User
    - course: Course
    - enrolmentDate: Date
    + Enrolment(id: int, user: User, course: Course, enrolmentDate: Date)
    + getId(): int
    + getUser(): User
    + getCourse(): Course
    + getEnrolmentDate(): Date
}

Course -- CourseManager
User -- UserManager
Enrolment -- User
Enrolment -- Course

@enduml
