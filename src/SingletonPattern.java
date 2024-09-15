public class SingletonPattern {


    private static SingletonPattern instance = null;

    private SingletonPattern() {
    }

    public static SingletonPattern getInstance() {
        if (instance == null) {
            instance = new SingletonPattern();
        }
        return instance;
    }

}

class TestingClass {

    public static void main(String[] args) {

//        SingletonPattern obj = new SingletonPattern();

        System.out.println("HashCode of the instance 1" + SingletonPattern.getInstance().hashCode());
        System.out.println("HashCode of the instance 1" + SingletonPattern.getInstance().hashCode());


    }
}
