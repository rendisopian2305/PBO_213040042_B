package pertemuan12.Tugas;

public abstract class Laptop {
    protected String merek;
    protected String model;
    protected String processor;
    protected int ramSize;
    protected int storageSize;

    public Laptop(String merek, String model, String processor, int ramSize, int storageSize) {
        this.merek = merek;
        this.model = model;
        this.processor = processor;
        this.ramSize = ramSize;
        this.storageSize = storageSize;
    }

    public abstract void bootUp();

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }
}

