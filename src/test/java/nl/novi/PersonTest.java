package nl.novi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person father;
    Person mother;
    Person me;
    Person jordy;
    Pet tika;
    Person colt;
    List<Person> children = new ArrayList<>();
    List<Person> siblings = new ArrayList<>();
    List<Pet> pets = new ArrayList<>();
    List<Person> grandChildren = new ArrayList<>();


    @BeforeEach // hier maken we een persoon aan
    void setUp() {
        father = new Person("Harold", "Lenssen", 'm', 59);
        mother = new Person("Maureen", "Van den Berk", 'f', 57);
        me = new Person("Mandy", "Odilia", "Lenssen", 'f', 34);
        jordy = new Person("Jordy", "Timmermans", 'm', 23);
        tika = new Pet("Tika", 11, "British Shorthair");
        colt = new Person("Colt", "Artemis", "Clemens", 'm', 1 );
    }

    @Test
    void getName() {
        String getName = father.getName(); // act
        assertEquals("Harold", getName); // assert
    }

    @Test
    void setName() {
        // act
    father.setName("Kikker");
    String getName = father.getName();
    // assert
        assertEquals("Kikker", getName);
    }

    @Test
    void getMiddleName() {
        String getName = me.getMiddleName(); // act
        assertEquals("Odilia", getName); // assert
    }

    @Test
    void setMiddleName() {
        me.setMiddleName("Artemis");
        String getName = me.getMiddleName();
        assertEquals("Artemis", getName);
    }

    @Test
    void getLastName() {
        String getLastName = father.getLastName(); // act
        assertEquals("Lenssen", getLastName); // assert
    }

    @Test
    void setLastName() {
        father.setLastName("Pipo");
        String getName = father.getLastName();
        assertEquals("Pipo", getName);
    }

    @Test
    void getSex() {
      char sex = father.getSex();
        assertEquals('m', sex);
    }

    @Test
    void setSex() {
        me.setSex('f');
        char getName = me.getSex();
        assertEquals('f', getName);
    }

    @Test
    void getAge() {
        int age = me.getAge();
        assertEquals(34, age);
    }

    @Test
    void setAge() {
        me.setAge(34);
        int age = me.getAge();
        assertEquals(34, age);
    }

    @Test
    void getMother() {
        me.setMother(mother);
        Person mother1 = me.getMother();
        assertEquals(mother, mother1);
    }

    @Test
    void setMother() {
        me.setMother(mother);
        Person mother1 = me.getMother();
        assertEquals(mother, mother1);
    }


    @Test
    void getFather() {
        me.setFather(father);
        Person father1 = me.getFather();
        assertEquals(father, father1);
    }

    @Test
    void setFather() {
        me.setFather(father);
        Person father1 = me.getFather();
        assertEquals(father, father1);
    }

    @Test
    void getSiblings() {
        siblings.add(jordy);
        me.setSiblings(siblings);
        List<Person> brother = me.getSiblings();
        assertEquals(siblings, brother);
    }

    @Test
    void setSiblings() {
        siblings.add(jordy);
        me.setSiblings(siblings);
        List<Person> brother = me.getSiblings();
        assertEquals(siblings, brother);
    }

    @Test
    void getChildren() {
        children.add(colt);
        me.setChildren(children);
       List<Person> child = me.getChildren();
        assertEquals(children, child);
    }

    @Test
    void setChildren() {
        children.add(colt);
        me.setChildren(children);
        List<Person> child = me.getChildren();
        assertEquals(children, child);
    }

    @Test
    void getPets() {
        pets.add(tika);
        me.setPets(pets);
        List<Pet> pet = me.getPets();
        assertEquals(pets, pet);
    }

    @Test
    void setPets() {
        pets.add(tika);
        me.setPets(pets);
        List<Pet> pet = me.getPets();
        assertEquals(pets, pet);
    }

    @Test
    void addParents() {
        me.addParents(father, mother, me);
        assertEquals(father, me.getFather());
        assertEquals(mother, me.getMother());

    }

    @Test
    void addChild() {
        father.addChild(me);
        father.addChild(jordy);
        assertEquals("Mandy", father.getChildren().get(0).getName());
        assertEquals(2,father.getChildren().size());
    }

    @Test
    void addPet() {
     me.addPet(tika);
     assertEquals("Tika", me.getPets().get(0).getName());
     assertEquals(1, me.getPets().size());
    }

    @Test
    void addSibling() {
        me.addSibling(jordy);
        assertEquals("Jordy", me.getSiblings().get(0).getName());
        assertEquals(1, me.getSiblings().size());

    }

    @Test
    void getGrandChildren() {
    grandChildren.add(colt);
    me.addChild(colt);
    mother.addChild(me);
    List<Person> list = mother.getGrandChildren();
    assertEquals(grandChildren, list);
    }
}
