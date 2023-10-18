package nl.novi;

public class Main {

    public static void main(String[] args) {

        Person father = new Person("Harold", "Lenssen", 'm', 59);
        Person mother = new Person("Maureen", "Van den Berk", 'f', 57);
        Person me = new Person("Mandy", "Odilia", "Lenssen", 'f', 34);


        me.addParents(father, mother, me);
            test
    }
}
