package nl.novi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetTest {

    Pet cat;
    Pet rabbit;
    Person owner;

    @BeforeEach
    void setUp() {
        cat = new Pet("Tika", 11, "British Shorthair");
        rabbit = new Pet("Flokke", 6, "dwarf rabbit");
        owner = new Person("Mandy", "Lenssen", 'f', 34);
    }



    @Test
    void getName() {
        String catName = cat.getName();
        assertEquals("Tika", catName);

    }

    @Test
    void setName() {
        cat.setName("Gnar");
        String getName = cat.getName();
        assertEquals("Gnar", getName);
    }

    @Test
    void getAge() {
        int age = cat.getAge();
        assertEquals(11, age);
    }

    @Test
    void setAge() {
        cat.setAge(12);
        int age = cat.getAge();
        assertEquals(12, age);
    }

    @Test
    void getSpecies() {
        String species = rabbit.getSpecies();
        assertEquals("dwarf rabbit", species);
    }

    @Test
    void setSpecies() {
        rabbit.setSpecies("flemish giant");
        String species = rabbit.getSpecies();
        assertEquals("flemish giant", species);
    }

    @Test
    void getOwner() {
        cat.setOwner(owner);
        Person owner1 = cat.getOwner();
        assertEquals(owner, owner1);
    }

    @Test
    void setOwner() {
        cat.setOwner(owner);
        Person owner1 = cat.getOwner();
        assertEquals(owner, owner1);
    }


}