class TV {
    String brand;
    String model;
    double screenSize;
    String resolution;
    boolean smartTV;

    TV(String brand, String model, double screenSize, String resolution, boolean smartTV) {
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
        this.resolution = resolution;
        this.smartTV = smartTV;
    }

    public void displayTV() {
        System.out.println("***** TV DETAILS ******");
        System.out.println("Brand :" + this.brand);
        System.out.println("Model :" + this.model);
        System.out.println("Screen Size :" + this.screenSize + " inches");
        System.out.println("Resolution :" + this.resolution);
        System.out.println("Smart TV :" + (this.smartTV ? "Yes" : "No"));
    }
}

class Electricity {
    String provider;
    double voltage;
    String phase;
    boolean renewable;
    double pricePerUnit;

    Electricity(String provider, double voltage, String phase, boolean renewable, double pricePerUnit) {
        this.provider = provider;
        this.voltage = voltage;
        this.phase = phase;
        this.renewable = renewable;
        this.pricePerUnit = pricePerUnit;
    }

    public void displayElectricity() {
        System.out.println();
        System.out.println("***** Electricity Details ******");
        System.out.println("Provider : " + this.provider);
        System.out.println("Voltage : " + this.voltage + " V");
        System.out.println("Phase : " + this.phase);
        System.out.println("Renewable : " + (this.renewable ? "Yes" : "No"));
        System.out.println("Price per Unit : $" + this.pricePerUnit);
    }
}

class TVDriver {
    public static void main(String[] args) {
        TV tvObj = new TV("Sony", "Bravia X8000G", 55, "4K Ultra HD", true);

        tvObj.displayTV();

        Electricity electricityObj = new Electricity("ABC Power", 220, "Single-phase", true, 0.12);

        electricityObj.displayElectricity();
    }
}
