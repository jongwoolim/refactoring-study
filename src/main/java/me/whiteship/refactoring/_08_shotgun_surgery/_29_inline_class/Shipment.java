package me.whiteship.refactoring._08_shotgun_surgery._29_inline_class;

public class Shipment {

//    private TrackingInformation trackingInformation;
    private String shippingCompany;

    private String trackingNumber;

//    public Shipment(TrackingInformation trackingInformation) {
//        this.trackingInformation = trackingInformation;
//    }

    public Shipment(String shippingCompany, String trackingNumber) {
        this.shippingCompany = shippingCompany;
        this.trackingNumber = trackingNumber;
    }

    public String getTrackingInfo() {
        return this.shippingCompany + ": " + this.trackingNumber;
    }

//    public void setTrackingInformation(TrackingInformation trackingInformation) {
//        this.trackingInformation = trackingInformation;
//    }

//    public String getTrackingInfo() {
//        return this.trackingInformation.display();
//    }

    public String getShippingCompany() {
        return shippingCompany;
    }

    public void setShippingCompany(String shippingCompany) {
        this.shippingCompany = shippingCompany;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }
}
