# aikam-test

<b>Описание задачи:</b><br>

Имеется 2 таблицы Товары(Наименование, Цена) и Заказы(Номер заказа, ID товара, количество) - заполнить самостоятельно<br>
В графическом интерфейсе реализовать выбор Номера заказа, по выбранному номеру отобразить: 
- Номер заказа
- Заказ(Наименование товара, Количество, Цена, Сумма)
- Итого по заказу

==============================================================

БД: MySQL (параметры подключения в application.properties)

dump БД: store.sql (в корневом каталоге проекта) 

Сборщик: Maven

<b>Запуск приложения:</b> 

Вариант 1: mvn clean package, java -jar target/store-1.0.jar

Вариант 2: mvn spring-boot:run

Вариант 3: mvn clean package, в IDE - запуск Application.class

<b>URL: http://localhost:8080/index<b>
