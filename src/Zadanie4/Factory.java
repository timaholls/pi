package Zadanie4;

class Factory {
    public static AddressPhoneFactory getFactory(String nameOfFactory)
            throws AddressPhoneFactoryNotFoundException {
        switch (nameOfFactory) {
            case "US": return new AddressPhoneUS();
            case "France": return new AddressPhoneFrance();
            default: throw new AddressPhoneFactoryNotFoundException();
        }
    }
}

class AddressPhoneFactoryNotFoundException extends RuntimeException {
    public String toString() {
        return "Фабрики nameOfFactory " + "US, либо France";
    }
}

abstract class AddressPhoneFactory {
    public abstract Address createAddress();
    public abstract Phone createPhone();
}

class AddressPhoneUS extends AddressPhoneFactory {
    public Address createAddress() { return new AddressUS(); }
    public Phone createPhone() { return new PhoneUS(); }
}

class AddressPhoneFrance extends AddressPhoneFactory {
    public Address createAddress() { return new AddressFR(); }
    public Phone createPhone() { return new PhoneFR(); }
} 