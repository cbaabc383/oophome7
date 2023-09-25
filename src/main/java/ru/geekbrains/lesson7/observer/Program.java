package ru.geekbrains.lesson7.observer;

public class Program {

    /**
     * TODO: Доработать приложение, которое разрабатывалось на семинаре, поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Только после этого вы можете усложнить ваше приложение (при желании), например, добавить тип вакансии (enum),
     *  учитывать тип вакансии при отправке предложения соискателю.
     * @param args
     */
    public static void main(String[] args) {

        Vacancy vacancy1 = new Vacancy(Vacancy.Type.HR);
        Vacancy vacancy2 = new Vacancy(Vacancy.Type.Worker);

        Publisher jobAgency = new JobAgency();
        Company google = new Company("Google", jobAgency, 120000);
        Company yandex = new Company("Yandex", jobAgency, 95000);
        Company geekBrains = new Company("GeekBrains", jobAgency, 98000);

        Student student1 = new Student("Petrov");
        Master master1 = new Master("Ivanov");
        Master master2 = new Master("Sidorov");
        Supervisor supervisor1 = new Supervisor("Semyonov", 10000);

        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(master1);
        jobAgency.registerObserver(master2);
        jobAgency.registerObserver(supervisor1);

        for (int i = 0; i < 3; i++){
            google.needEmployee(vacancy1);
            yandex.needEmployee(vacancy2);
            geekBrains.needEmployee(vacancy2);
        }

    }

}
