package nl.novi;

import java.util.ArrayList;
import java.util.List;

public class Person {

    // attributen
    private String name;
    private String middleName;
    private String lastName;
    private char sex;
    private int age;
    private Person mother;
    private Person father;
    private List<Person> siblings;
    private List<Person> children;
    private List<Pet> pets;

    // constructors
    public Person(String name, String lastName, char sex, int age) {
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    public Person(String name, String middleName, String lastName, char sex, int age) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    // methodes
    public void addParents(Person father, Person mother, Person child) {
        child.setFather(father);
        child.setMother(mother);
        father.addChild(child);
        mother.addChild(child);
    }

    public void addChild(Person child){
        List<Person> children = new ArrayList<>();
        if(this.getChildren() != null) {
            children.addAll(this.getChildren());
        }
        children.add(child);
        this.setChildren(children);
    }

    public void addPet(Pet pet) {
        List<Pet> pets = new ArrayList<>();
        if (this.getPets() != null) {
            pets.addAll(this.getPets());
        }
        pets.add(pet);
        this.setPets(pets);
    }


    public void addSibling(Person sibling){
        List<Person> siblings = new ArrayList<>();
        if (this.getSiblings() != null) {
            siblings.addAll(this.getSiblings());
        }
        siblings.add(sibling);
        this.setSiblings(siblings);
    }

    public List<Person> getGrandChildren(){
        List<Person> grandChildren = new ArrayList<>();
        if (this.getChildren() != null) {
            for (Person child : this.getChildren()) {
                if (child.getChildren() != null) {
                    grandChildren.addAll(child.getChildren());
                }
            }
        }
            return grandChildren;
    }

    // getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public List<Person> getSiblings() {
        return siblings;
    }

    public void setSiblings(List<Person> siblings) {
        this.siblings = siblings;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }


}
