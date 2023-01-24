import java.util.ArrayList;
import java.util.List;

public class MainWorkers {

    public static void main(String[] args) {
        List<Worker> workers = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            Worker worker = new Worker();
            worker.setName(String.valueOf(i));
            worker.setYears(i);
            worker.setMinSalary(i * 2);
            worker.setMaxSalary(i * 3);

            workers.add(worker);
        }

        System.out.println(workers);

        for (Worker worker : workers) {
            System.out.println("Меня зовут: " + worker.getName());
            double result = worker.requestFundToCalculatePension();
            System.out.println("и я получу пенсию в размере: " + result);
        }

    }
}
