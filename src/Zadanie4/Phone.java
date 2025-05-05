package Zadanie4;

abstract class Phone {
    private long number;
    
    public abstract String getCountryCode();
    public void setNumber(long number) { this.number = number; }
    public long getNumber() { return number; }
}

class PhoneUS extends Phone {
    private static final String COUNTRY_CODE="1";
    private static final long NUM=(long)1E10;
    
    public String getCountryCode() { return COUNTRY_CODE; }
    
    public void setNumber(long number) {
        if ((number>=NUM/10)&&(number<NUM))
            super.setNumber(number);
    }
}

class PhoneFR extends Phone {
    private static final String COUNTRY_CODE="33";
    private static final long NUM=(long)1E9;
    
    public String getCountryCode() { return COUNTRY_CODE; }
    
    public void setNumber(long number) {
        if ((number>=NUM/10)&&(number<NUM))
            super.setNumber(number);
    }
} 