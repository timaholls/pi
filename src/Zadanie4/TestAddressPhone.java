package Zadanie4;

public class TestAddressPhone {
    public static void main(String[] args) {
        AddressPhoneFactory addressPhoneFactoryUS = Factory.getFactory("US");
        Address addressUS = addressPhoneFactoryUS.createAddress();
        
        addressUS.setCode("11201");
        addressUS.setRegion("NY");
        addressUS.setCity("New York");
        addressUS.setStreet("Manhattan Avenue");
        
        System.out.println(addressUS.getCountry());
        System.out.println(addressUS.getAddress());
        
        Phone phoneUS = addressPhoneFactoryUS.createPhone();
        phoneUS.setNumber(9173234567L);
        
        System.out.println(phoneUS.getCountryCode());
        System.out.println(phoneUS.getNumber());
        
        AddressPhoneFactory addressPhoneFactoryFR = Factory.getFactory("France");
        Address addressFR = addressPhoneFactoryFR.createAddress();
        
        addressFR.setCode("75008");
        addressFR.setCity("Paris");
        addressFR.setStreet("Avenue des Champs-Élysées");
        
        System.out.println(addressFR.getCountry());
        System.out.println(addressFR.getAddress());
        
        Phone phoneFR = addressPhoneFactoryFR.createPhone();
        phoneFR.setNumber(123456789L);
        
        System.out.println(phoneFR.getCountryCode());
        System.out.println(phoneFR.getNumber());
    }
} 