# houseApp
Данное приложение служит для отработки навыков программирования на Java с использованием различных технологий.

Структура БД:
1) Комната (ID, тип, площадь, ID квартиры)
2) Квартира (ID, номер, ID этажа)
3) Этаж (ID, площадь, ID подъезда)
4) Подъезд (ID, площадь, наличие лифта, ID дома)
5) Дом (ID, адрес, площадь)

Архитектура:
1) Сервис-слой - для работы с БД (чтение, запись, удаление, поиск)
2) Бизнес-слой - для работы бизнес-логики
3) Представление - способ коммуникации с пользователем

Для сборки прораммы запустите команды "gradle build", потом для запуска - "gradle run".