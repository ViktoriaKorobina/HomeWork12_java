Программа, имитирующая работу склада.

Соответствует принципам SOLID.

1. Единственная ответственность -> Single Responsibility Principle:
Класс Product отвечает только за хранение информации о товаре.


2. Открыт для расширения, но закрыт для изменения -> Open-Closed Principle:
Класс CategoryProduct хранит информацию о категории товара и имплементируется от
интерфейса Category.


3. Принцип подстановки Барбары Лисков - >Liskov Substitution Principle:
Класс DiscountedGoods является наследником класса Product.
При этом на склад можно добавить как представителя Product, так и представителя DiscountedGoods.



4. Принцип разделения интерфейса -> Interface Segregation Principle:
Класс Warehouse имплементируетдва интерфейса: AddProduct, RemoveProduct,
каждый из которых определяет различные операции с товаром на складе.


5. Принцип инверсии зависимостей -> Dependency Inversion Principle:
Класс OrderProduct имплементируется от интерфейса Order.