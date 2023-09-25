package ru.geekbrains.lesson7.observer;

public class Vacancy {
    private Type vacancyType;

//    public Vacancy(Type vacancy) {
//        vacancyType = vacancy;
//    }


    public Vacancy(Type vacancyType) {
        this.vacancyType = vacancyType;
    }

    public enum Type{
        Boss,
        Worker,
        HR,
        IT
    }

    @Override
    public String toString() {
        return vacancyType.toString();
    }
}
