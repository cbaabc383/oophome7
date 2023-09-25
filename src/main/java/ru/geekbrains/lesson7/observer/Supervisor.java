package ru.geekbrains.lesson7.observer;

public class Supervisor implements Observer{

    private String name;
    private int salary = 2000;

    public Supervisor(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary, Vacancy vacancy) {
        if (this.salary <= salary){
            System.out.printf("Руководитель %s: Мне нужна эта работа! (компания: %s; заработная плата: %d; вакансия: %s)\n",
                    name, nameCompany, salary, vacancy);
            this.salary = salary;
        }
        else {
            System.out.printf("Руководитель %s: Я найду работу получше! (компания: %s; заработная плата: %d; вакансия: %s)\n",
                    name, nameCompany, salary, vacancy);
        }
    }
}
