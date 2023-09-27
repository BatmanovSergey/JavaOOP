package sem04;

import java.util.List;
public class Example {
    private List<? extends Number> obj; // постановочный знак <?> wild cast, позволяет проводит инициализацию любыми типами
    // но если заменить на List<? extends Number> например,
    // то уже инициализация экземплара класса будет только наследниками класса Number
    // также можно делать extends интерфейсы

    public Example(List<? extends Number> obj) {
        this.obj = obj;
    }
}
