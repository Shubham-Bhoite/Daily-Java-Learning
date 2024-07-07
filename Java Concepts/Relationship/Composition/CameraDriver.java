class Camera {
    String brand;
    String model;
    double resolution;
    String sensorType;
    String videoResolution;

    Camera(String brand, String model, double resolution, String sensorType, String videoResolution) {
        this.brand = brand;
        this.model = model;
        this.resolution = resolution;
        this.sensorType = sensorType;
        this.videoResolution = videoResolution;
    }

    public void displayCamera() {
        System.out.println("***** CAMERA DETAILS ******");
        System.out.println("Brand :" + this.brand);
        System.out.println("Model :" + this.model);
        System.out.println("Resolution :" + this.resolution + " MP");
        System.out.println("Sensor Type :" + this.sensorType);
        System.out.println("Video Resolution :" + this.videoResolution);
    }
}

class Lens {
    String brand;
    String model;
    double focalLength;
    double maxAperture;
    boolean imageStabilization;

    Lens(String brand, String model, double focalLength, double maxAperture, boolean imageStabilization) {
        this.brand = brand;
        this.model = model;
        this.focalLength = focalLength;
        this.maxAperture = maxAperture;
        this.imageStabilization = imageStabilization;
    }

    public void displayLens() {
        System.out.println();
        System.out.println("***** Lens Details ******");
        System.out.println("Brand : " + this.brand);
        System.out.println("Model : " + this.model);
        System.out.println("Focal Length : " + this.focalLength + " mm");
        System.out.println("Max Aperture : f/" + this.maxAperture);
        System.out.println("Image Stabilization : " + (this.imageStabilization ? "Yes" : "No"));
    }
}

class CameraDriver {
    public static void main(String[] args) {
        Lens cameraLens = new Lens("Canon", "EF 24-70mm f/2.8L II USM", 24, 2.8, true);
        Camera cameraObj = new Camera("Canon", "EOS 5D Mark IV", 30.4, "Full-frame CMOS", "4K");

        cameraObj.displayCamera();
        cameraLens.displayLens();
    }
}
