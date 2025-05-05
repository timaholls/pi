package Zadanie4;

abstract class Address {
    private String code;
    private String region;
    private String city;
    private String street;
    public static final String SPACE=" ";
    public static final String EOL=System.getProperty("line.separator");
    public static final String COMMA=", ";
    
    public String getCode() { return code; }
    public String getRegion() { return region; }
    public String getCity() { return city; }
    public String getStreet() { return street; }
    
    public void setCode(String code) { this.code = code; }
    public void setRegion(String region) { this.region = region; }
    public void setCity(String city) { this.city = city; }
    public void setStreet(String street) { this.street = street; }
    
    public abstract String getCountry();
    public abstract String getAddress();
}

class AddressUS extends Address {
    private static final String COUNTRY="US";
    
    public String getCountry() { return COUNTRY; }
    
    public String getAddress() {
        return getStreet()+COMMA+getCity()+COMMA+SPACE+getRegion()+
                SPACE+getCode()+EOL+COUNTRY+EOL;
    }
}

class AddressFR extends Address {
    private static final String COUNTRY="France";
    
    public String getCountry() { return COUNTRY; }
    
    public String getAddress() {
        return getStreet()+EOL+getCode()+SPACE+getCity()+EOL+COUNTRY+EOL;
    }
} 