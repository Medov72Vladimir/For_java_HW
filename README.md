Решение домашних заданий на JAVA.

Task_1.
Создайте массив, в котором будут храниться кубы чисел от 1 до 1000. Затем вводятся 2 числа из этого диапазона. Используя данные из массива найдите их кубы.

Task_2.
Вводится число n, затем n чисел целых, по одному на каждой строке. Затем вводится число, на которое нужно умножить все введённые выше числа. Выведите на экран результат умножения построчно.

Task_3.
Реализовать простой калькулятор (+,-,=,*), только с целыми числами.

Task_2_0.
Посчитайте сколько драгоценных камней в куче обычных камней.

Task_2_1.
Вам дается строка S и целочисленный массив индексов int index[s.length].
Напишите программу, которая перетасует символы в S таким образом,
что символ c i-й позиции переместится на индекс index[i] в результирующей строке.

Пример: s = “cba”, index = [3,2,1] result “abc”.

Task_2_2.
На первой строке записывается натуральное число n - количество строчек в книге. Затем вводится n строк - строки книги. потом вводится натуральное число m - количество продуктов, на которые у человека аллергия. Потом вводится m строк - вида "продукт1 - продукт2", где продукт1 - продукт, на который у человека аллергия и продукт2 - продукт, на который следует заменить продукт1. Гарантируется что любой продукт состоит из 1 слова. название продуктов написаны строчными буквами. Гарантируется, что продукты, на которые нужно выполнить замену, не встречаются изначально в тексте.

Выходные данные
Замените все продукты в поваренной книге Васи и выведите их построчно на экран. На окончания не обращайте внимание. ВАЖНО!!! Если продукт, который следует заменить написан с большой буквы, то и замена тоже должна начинаться с большой буквы!

Sample Input:

2
Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. Посыпьте измельчённый арахис на мороженое.
Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.
3
арахис - колбаса
клубника - вишня
сгущенка - молоко
Sample Output:

Рецепт 1. Колбаса 100гр, мороженое 200гр. Возьмите колбаса и измелчите его. Посыпьте измельчённый колбаса на мороженое.
Рецепт 2. Вишня 100гр, молоко 3кг. Смешать, есть) Радоваться жизни.

Task_3_1.
Реализовать алгоритм сортировки слиянием.

Task_3_2.
Пусть дан произвольный список целых чисел, удалить из него чётные числа.

Task_3_3.
Задан целочисленный список ArrayList. Найти минимальное, 
максимальное и среднее из этого списка.

Task_3_3_1.
Алгоритм сортировки выборкой.

Task_4_3.
Дан Deque состоящий из последовательности цифр.
Необходимо проверить, что последовательность цифр является палиндромом.

Task_4_4.
Даны два Deque представляющие два неотрицательных целых числа. Цифры хранятся в обратном порядке,
и каждый из их узлов содержит одну цифру.
Сложите два числа и верните сумму в виде связанного списка.

Task_4_5.
Дана строка содержащая только символы '(', ')', '{', '}', '[' и ']', определите,
является ли входная строка логически правильной.
Входная строка логически правильная, если:
 1) Открытые скобки должны быть закрыты скобками того же типа.
 2) Открытые скобки должны быть закрыты в правильном порядке. Каждая закрывающая скобка имеет соответствующую открытую скобку того же типа.
 ()[] = true
 () = true
 {[()]} = true
 ()() = true
 )()( = false

Task_5.
Реализуйте структуру телефонной книги с помощью HashMap, 
учитывая, что 1 человек может иметь несколько телефонов.
Пусть дан список сотрудников:
Иван Иванов
Светлана Петрова
Кристина Белова
Анна Мусина
Анна Крутова
Иван Юрин
Петр Лыков
Павел Чернов
Петр Чернышов
Мария Федорова
Марина Светлова
Мария Савина
Мария Рыкова
Марина Лугова
Анна Владимирова
Иван Мечников
Петр Петин
Иван Ежов
Написать программу, которая найдёт и выведет повторяющиеся 
имена с количеством повторений. Отсортировать по убыванию популярности.

Task_6.
Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы. Реализовать в Java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объём ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев — сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.