package Lesson_7;

public class Java17Switch {

    enum Pet {
        DOG, CAT, PARROT
    }

    public static void main(String[] args) {
        // старый вариант
        Pet pet = Pet.CAT;
        int legs;
        switch (pet){
            case DOG :
            case CAT :
                legs = 4;
                break;
            case PARROT :
                legs = 2;
                break;
            default:
                throw new AssertionError();
        }











        // 1 шаг склеиваем кейсы
        switch (pet){
            case DOG, CAT :
                legs = 4;
                break;
            case PARROT :
                legs = 2;
                break;
            default:
                throw new AssertionError();
        }

        // 2 шаг со стрелками, больше не нужно писать break
        switch (pet) {
            case DOG, CAT -> legs = 4;
            case PARROT -> legs = 2;
            default -> throw new AssertionError();
        }

        // 3 шаг switch expressions
        var leg = switch (pet) {
            case DOG, CAT -> legs = 4;
            case PARROT -> legs = 2;
            default -> throw new AssertionError();
        };

        // 4 шаг switch expressions
        var manyLegs = switch (pet) {
            case DOG, CAT -> legs = 4;
            case PARROT -> {
                System.out.println("Непонятно");
                yield 2;
            }
            default -> throw new AssertionError();
        };

    }
}
