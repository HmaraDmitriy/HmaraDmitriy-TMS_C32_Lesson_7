package task_1.employee;

import task_1.interfaceJobTitle.JobTitle;

public class Worker implements JobTitle {

    @Override
    public void printJobTitle() {
        System.out.println("Worker");
    }
}
