package AnonymousClass;

public class MainClassHere {
    public static void main(String[] args) {

//      создаю экземпляр анонимного класса,
//      инициализирую поле msg своим сообщением
//      и переопределяю метод, say() чтобы было понятно наверняка, что это именно анонимный класс
        Speaker anonymous = new Speaker() {
            {
                setMsg("Hello Vlad!");
            }

            @Override
            public void say() {
                System.out.println("It's fucking anonymous class!");
                super.say();
            }
        };

//      создаю экземпляр слушателя и отдаю ему наш анонимный класс
        Listener listener = new Listener(anonymous);
        listener.listen();
    }
}
