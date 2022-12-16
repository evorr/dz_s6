import java.util.LinkedList;

public class Notebook {
    int id;
    String brand, cpu, graphPrcs;
    int price, ram_size;
    double displ_size;

    public Notebook(int id, String brand, String cpu, String graphPrcs, int price, int ram_size, double displ_size) {
        this.id = id;
        this.brand = brand;
        this.cpu = cpu;
        this.graphPrcs = graphPrcs;
        this.price = price;
        this.ram_size = ram_size;
        this.displ_size = displ_size;
    }

    public String toString() {
        return "Laptop's id: " + id + "\n" +
                "Brand: " + brand + "\n" +
                "CPU: " + cpu + "\n" +
                "Graphics Coprocessor: " + graphPrcs + "\n" +
                "Price: $" + price + "\n" +
                "RAM: " + ram_size + "GB\n" +
                "Screen Size: " + displ_size + "inches\n";
    }

    public static LinkedList FilterCPU(Notebook [] laptops, String cpu_brand) {
        LinkedList<StringBuilder> result = new LinkedList<>();
        for (Notebook c: laptops) {
            if(c.cpu.toLowerCase().contains(cpu_brand)) {
                StringBuilder mod = new StringBuilder();
                mod.append(c.brand);
                mod.append(", ");
                mod.append(c.cpu);
                mod.append(", ");
                mod.append(c.graphPrcs);
                mod.append(", ");
                mod.append("$ " + c.price);
                mod.append(", ");
                mod.append(c.ram_size + "GB");
                mod.append(", ");
                mod.append(c.displ_size + " inches");
                mod.append(" ");
                result.add(mod);
            }
        }
        return result;
    }

    public static LinkedList FilterGPU(Notebook [] laptops, String graphP_brand) {
        LinkedList<StringBuilder> result = new LinkedList<>();
        for (Notebook c: laptops) {
            if(c.graphPrcs.toLowerCase().contains(graphP_brand)) {
                StringBuilder mod = new StringBuilder();
                mod.append(c.brand);
                mod.append(", ");
                mod.append(c.cpu);
                mod.append(", ");
                mod.append(c.graphPrcs);
                mod.append(", ");
                mod.append("$ " + c.price);
                mod.append(", ");
                mod.append(c.ram_size + "GB");
                mod.append(", ");
                mod.append(c.displ_size + " inches");
                mod.append(" ");
                result.add(mod);
            }
        }
        return result;
    }

    public static LinkedList FilterPrice(Notebook [] laptops, int price_max) {
        LinkedList<StringBuilder> result = new LinkedList<>();
        for (Notebook c: laptops) {
            if(c.price <= price_max) {
                StringBuilder mod = new StringBuilder();
                mod.append(c.brand);
                mod.append(", ");
                mod.append(c.cpu);
                mod.append(", ");
                mod.append(c.graphPrcs);
                mod.append(", ");
                mod.append("$ " + c.price);
                mod.append(", ");
                mod.append(c.ram_size + "GB");
                mod.append(", ");
                mod.append(c.displ_size + " inches");
                mod.append(" ");
                result.add(mod);
            }
        }
        return result;
    }
    public static LinkedList FilterRAM(Notebook [] laptops, int ram_min) {
        LinkedList<StringBuilder> result = new LinkedList<>();
        for (Notebook c: laptops) {
            if(c.ram_size >= ram_min) {
                StringBuilder mod = new StringBuilder();
                mod.append(c.brand);
                mod.append(", ");
                mod.append(c.cpu);
                mod.append(", ");
                mod.append(c.graphPrcs);
                mod.append(", ");
                mod.append("$ " + c.price);
                mod.append(", ");
                mod.append(c.ram_size + "GB");
                mod.append(", ");
                mod.append(c.displ_size + " inches");
                mod.append(" ");
                result.add(mod);
            }
        }
        return result;
    }
    public static LinkedList FilterDisplay(Notebook [] laptops, double displ_min, double displ_max) {
        LinkedList<StringBuilder> result = new LinkedList<>();
        for (Notebook c: laptops) {
            if(c.displ_size >= displ_min && c.displ_size <= displ_max) {
                StringBuilder mod = new StringBuilder();
                mod.append(c.brand);
                mod.append(", ");
                mod.append(c.cpu);
                mod.append(", ");
                mod.append(c.graphPrcs);
                mod.append(", ");
                mod.append("$ " + c.price);
                mod.append(", ");
                mod.append(c.ram_size + "GB");
                mod.append(", ");
                mod.append(c.displ_size + " inches");
                mod.append(" ");
                result.add(mod);
            }
        }
        return result;
    }
}
