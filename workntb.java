import java.util.LinkedList;
import java.util.Scanner;

public class workntb {
    public static void main(String [] args) {
        Notebook lt1 = new Notebook(101,
                "Acer", "AMD", "NVIDIA GeForce RTX 3050 Ti", 830, 16, 14);
        Notebook lt2 = new Notebook(102,
                "Lenovo", "Intel", "Intel UHD Graphics", 386, 8, 15.6);
        Notebook lt3 = new Notebook(103,
                "ASUS", "AMD", "NVIDIA GeForce RTX 3050 Ti", 1744, 32, 16);
        Notebook lt4 = new Notebook(104,
                "Dell", "Intel", "Intel Iris Xe Graphics", 1199, 16, 14);
        Notebook lt5 = new Notebook(105,
                "ASUS", "Intel", "NVIDIA GeForce RTX 3060", 1249, 16, 15.6);

        Notebook[] laptops = new Notebook[] {lt1, lt2, lt3, lt4, lt5};


        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите цифру, соответствующую необходимому критерию:\n" +
                "1 - Показать все ноутбуки\n" +
                "Выбрать фильтр:\n" +
                "2 - Производитель процессора\n" +
                "3 - Видеокарта\n" +
                "4 - Цена\n" +
                "5 - Оперативная память\n" +
                "6 - Диагональ дисплея\n" +
                ":");
        String choice = iScanner.nextLine();

        if(choice.contains("1")) {
            for (Notebook c: laptops) {
                System.out.println(c.toString());
            }
        }
        if(choice.contains("2")) {
            System.out.printf("Укажите производителя процессора:");
            String cpu_brand = iScanner.nextLine().toLowerCase();
            LinkedList<StringBuilder> res = Notebook.FilterCPU(laptops,cpu_brand);
            if(res.isEmpty()) {
                System.out.println("Ноутбуков с таким процессором не найдено");
            }
            else {
                System.out.printf("Ноутбуки с процессром %s :\n", cpu_brand);
                res.forEach(System.out::println);
            }
        }
        if(choice.contains("3")) {
            System.out.printf("Укажите производителя видеокарты:");
            String graphP_brand = iScanner.nextLine().toLowerCase();
            LinkedList<StringBuilder> res = Notebook.FilterGPU(laptops,graphP_brand);
            if(res.isEmpty()) {
                System.out.println("Ноутбуков с такой видеокартой не найдено");
            }
            else {
                System.out.printf("Ноутбуки с видеокартой %s :\n", graphP_brand);
                res.forEach(System.out::println);
            }
        }
        if(choice.contains("4")) {
            System.out.printf("Цена, $ (386 - 1744)\n" +
                    "Искать до:");
            int price_max = Integer.parseInt(iScanner.nextLine());
            System.out.printf("Ноутбуки стоимостью до $ %d :\n", price_max);
            Notebook.FilterPrice(laptops,price_max).forEach(System.out::println);
        }
        if(choice.contains("5")) {
            System.out.printf("Оперативная память, гб\n" +
                    "Искать от:");
            int ram_min = Integer.parseInt(iScanner.nextLine());
            System.out.printf("Ноутбуки с оперативной памятью от %d GB:\n", ram_min);
            Notebook.FilterRAM(laptops,ram_min).forEach(System.out::println);
        }
        if(choice.contains("6")) {
            System.out.printf("Размер дисплея, дюймы\n" +
                    "Искать от: ");
            double displ_min = Double.parseDouble(iScanner.nextLine());
            System.out.printf("до: ");
            double displ_max = Double.parseDouble(iScanner.nextLine());
            System.out.printf("Ноутбуки с дисплеем от %.1f до %.1f дюймов:\n", displ_min, displ_max);
            Notebook.FilterDisplay(laptops,displ_min, displ_max).forEach(System.out::println);
        }







    }
}
