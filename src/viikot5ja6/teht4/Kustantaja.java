package viikot5ja6.teht4;

public class Kustantaja {

    // === Properties === //
    private String publisherName;
    private String address;
    private String phoneNumber;

    // === Constructors === //
    public Kustantaja() {
    }

    public Kustantaja(String publisherName) {
        this.publisherName = publisherName;
    }

    public Kustantaja(String name, String address, String phoneNumber) {
        this.publisherName = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // === Getters / Setters === //
    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // === toString === //
    @Override
    public String toString() {
        return "Kustantaja{" +
                "publisherName='" + publisherName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
