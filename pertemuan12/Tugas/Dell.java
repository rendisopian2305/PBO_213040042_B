package pertemuan12.Tugas;

public class Dell extends Laptop implements Spesifikasi {
    private String os;

    public Dell(String model, String processor, int ramSize, int storageSize, String os) {
        super("Dell", model, processor, ramSize, storageSize);
        this.os = os;
    }

    @Override
    public void bootUp() {
        System.out.println("Dell " + model + " is booting up...");
    }

    @Override
    public void tampilkanSpesifikasi() {
        System.out.println("Merek: " + merek);
        System.out.println("Model: " + model);
        System.out.println("Processor: " + processor);
        System.out.println("RAM Size: " + ramSize + " GB");
        System.out.println("Storage Size: " + storageSize + " GB");
        System.out.println("Operating System: " + os);
    }
}

