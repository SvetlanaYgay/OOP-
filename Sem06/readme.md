> *Взять реализованный код в рамках семинара 4 и продемонстрировать применение принципов, усвоенных на семинаре.*
___
1. Принцип единственной ответственности (Single Responsibility Principle)
    - Каждый класс отвечает за одну операцию.
    - Student, Teacher, User для работы с соответствующими сущностями. Содержат конструкторы, геттеры и сеттеры.
    - Классы TeacherView, StudentView содержат методы для вывода в консоль.
    - Классы StudentController и TeacherController содержат функционал по созданию соответствующих сущностей и выводу в консоль.
2. Принцип открытости/закрытости (Open Closed Principle)
    - Каждый класс открыт для расширения.
    - User расширяется за счет классов Student и Teacher. В них добавляется ID.
    - Аналогично класс UserService расширяется классам StudentService и TeacherService. В них добавляется метод getStudentList() и getTeacherList().
3. Принцип подстановки Барбары Лисков (Liskov’s Substitution Principle)
    - Класс-потомок должен производить такие же операции, как и класс-родитель.
    - Например, классы Student(StudentView, StudentController) и Teacher(TeacherView, TeacherController) переопределяют методы класса User(UserView, UserController).
4. Принцип разделения интерфейса (Interface Segregation Principle)
    - Данный принцип выполняется, т.к. не классы не имплементируют ненужных операций.
5. Принцип инверсии зависимостей (Dependency Inversion Principle)
    - Модули верхнего уровня не зависят от модулей нижнего уровня и связываются через абстракции.
    - Например, классы StudentView и TeacherView имплементируют интерфейс UserView и реализуют его абстрактный метод sendOnConsole().


