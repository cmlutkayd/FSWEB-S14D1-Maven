package com.workintech.developers;

import java.util.Arrays;

public class HRManager extends  Employee {

    private JuniorDeveloper[] juniorDevelopers;

    private MidDeveloper[] midDevelopers;

    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
    }

    public HRManager(String name, double salary, long id, JuniorDeveloper[] juniorDevelopers,
                     MidDeveloper[] midDevelopers,
                     SeniorDeveloper[] seniorDevelopers) {
        this(id, name, salary);
        this.juniorDevelopers = juniorDevelopers;
        this.midDevelopers = midDevelopers;
        this.seniorDevelopers = seniorDevelopers;
    }

    public void addEmployee(int index, JuniorDeveloper juniorDeveloper) {
        try {
            if (juniorDevelopers[index] == null) {
                juniorDevelopers[index] = juniorDeveloper;

            } else {
                System.out.println("Index is full some record exists!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Index out of found: " + index);
        }
    }

public void addEmployee(int index, MidDeveloper midDeveloper) {
    try {
        if (midDevelopers[index] == null) {
            midDevelopers[index] = midDeveloper;

        } else {
            System.out.println("Index is full some record exists!");
        }
    } catch (ArrayIndexOutOfBoundsException e) {
        e.printStackTrace();
        System.out.println("Index out of found: " + index);
    }
}
public void addEmployee(int index, SeniorDeveloper seniorDeveloper) {
    try {
        if (seniorDevelopers[index] == null) {
            seniorDevelopers[index] = seniorDeveloper;

        } else {
            System.out.println("Index is full some record exists!");
        }
    } catch (ArrayIndexOutOfBoundsException e) {
        e.printStackTrace();
        System.out.println("Index out of found: " + index);
    }
}
    @Override
    public void work() {
        System.out.println(getName() + "hr manager starts to working...");
    }

    @Override
    public String toString() {
        return "HRManager{" +
                "juniorDevelopers=" + Arrays.toString(juniorDevelopers) +
                ", midDevelopers=" + Arrays.toString(midDevelopers) +
                ", seniorDevelopers=" + Arrays.toString(seniorDevelopers) +
                '}';
    }
}
