package viikot5ja6.teht3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Auto {

    // === Properties === //
    private String model, brand, licenceNumber;
    private int modelYear;

    // === Constructors === //
    protected Auto() {
    }

    public Auto(String model, String brand, String licenceNumber, int modelYear) {
        this.model = model;
        this.brand = brand;
        this.licenceNumber = licenceNumber;
        this.modelYear = modelYear;
    }

    // === Getters / Setters === //
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public int getIka(){
        Date date = new Date();
        SimpleDateFormat fDate = new SimpleDateFormat("yyyy");

        int presentYear = Integer.parseInt(fDate.format(date));
        return presentYear - modelYear;
    }

    // === toString === //
    @Override
    public String toString() {
        return "Auto{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", licenceNumber='" + licenceNumber + '\'' +
                ", modelYear=" + modelYear +
                '}';
    }

    public static String toTitleCase(String input) {

        StringBuilder titleCase = new StringBuilder();
        boolean nextTitleCase = true;

        for (char c : input.toLowerCase().toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                nextTitleCase = true;
            } else if (nextTitleCase) {
                c = Character.toTitleCase(c);
                nextTitleCase = false;
            }
            titleCase.append(c);
        }

        return titleCase.toString();
    }

}
