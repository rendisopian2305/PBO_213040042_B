package pertemuan12.Tugas;

public class Acer extends Laptop implements Spesifikasi {
    private boolean gaming;

    public Acer(String model, String processor, int ramSize, int storageSize, boolean gaming) {
        super("Acer", model, processor, ramSize, storageSize);
        this.gaming = gaming;
    }

    @Override
    public void bootUp() {
        System.out.println("Acer " + model + " is booting up...");
    }

    @Override
    public void tampilkanSpesifikasi() {
        System.out.println("Merek: " + merek);
        System.out.println("Model: " + model);
        System.out.println("Processor: " + processor);
        System.out.println("RAM Size: " + ramSize + " GB");
        System.out.println("Storage Size: " + storageSize + " GB");
        System.out.println("Gaming Laptop: " + (gaming ? "Yes" : "No"));
    }
}

