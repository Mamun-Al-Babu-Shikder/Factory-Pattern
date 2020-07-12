package com.mcubes.test;

import com.mcubes.factory.PhoneFactory;
import com.mcubes.phone.Phone;

/**
 * Created by A.A.MAMUN on 7/12/2020.
 */

/**
 * A Factory Pattern or Factory Method Pattern
 * says that just define an interface or abstract
 * class for creating an object but let the
 * subclasses decide which class to instantiate.
 * In other words, subclasses are responsible to
 * create the instance of the class.
 * The Factory Method Pattern is also known as Virtual Constructor.
 */
public class Main {

    public static void main(String[] args) {

        PhoneFactory phoneFactory = new PhoneFactory();

        Phone iPone = phoneFactory.getPhone("IPHONE");
        iPone.configuration();

        Phone samsung = phoneFactory.getPhone("SAMSUNG");
        samsung.configuration();

        Phone redmi = phoneFactory.getPhone("REDMI");
        redmi.configuration();
    }
}
