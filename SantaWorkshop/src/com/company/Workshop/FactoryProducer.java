package com.company.Workshop;

public class FactoryProducer {

    public static AbstractFactory getFactory(String factoryName) {

        if (factoryName.equals("dwarf")) {
            return new DwarfFactory();
        } else {
            System.out.println("unknown factory");
            return null;
        }
    }
}
