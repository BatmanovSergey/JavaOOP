Добрый день, Александр.
В процессе выполнения домашнего задания было выбрано решение через переопределения методов, чтобы как можно меньше прописывать условий для каждого нового класса, хотя это решение и не является оптимальным, 
но позволяет хотя бы частитчно испоользовать концепцию DRY и при масштабировании проекта проще будет добавлять переопределения в новых классах.
В качестве возможного, но крайне не оптимального решения, оставил вариант метода через условие с использованием instanceof, но при масштабировании проекта и добаваления новых классов, такое решение будет неверным.
Была мысль как-то ограничить видимость методов для разных классов, но поискав информацию, понял что в рамках Java, изменить видимость унаследованного метода нельзя, но можно применить дополнительную инкапсуляцию и создайть интерфейс, 
который будет предлагает только необходимые методы. После изучения интерфейсов, можно будет доработать данное задание.

Также возник вопрос наследование при инициалиции экземпляра через общий класс Animal вместо, например, класса Dog или Cat? просьба ещё раз объяснить, какие дополнительные преимущества в работе мы от этого получаем.

Заранее, спасибо!
