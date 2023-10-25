package nl.novi;

public class Main {

    public static void main(String[] args) {

        Person father = new Person("Harold", "Lenssen", 'm', 59);
        Person mother = new Person("Maureen", "Van den Berk", 'f', 57);
        Person me = new Person("Mandy", "Odilia", "Lenssen", 'f', 34);
        Person jordy = new Person("Jordy", "Timmermans", 'm', 23);
        Pet cat = new Pet("Tika", 11, "British shorthair");

        me.addParents(father, mother, me);
        me.addPet(cat);


    }
}
