package com.mcubes.factory;

import com.mcubes.phone.IPhone;
import com.mcubes.phone.Phone;
import com.mcubes.phone.Redmi;
import com.mcubes.phone.Samsung;

/**
 * Created by A.A.MAMUN on 7/12/2020.
 */

/**
 * Create a Factory to generate object of
 * concrete class based on given information.
 */
public class PhoneFactory {

    /**
     * Return object by phone type
     */
    public Phone getPhone(String phoneType){
        if(phoneType.equalsIgnoreCase("IPHONE"))
            return new IPhone();
        else if(phoneType.equalsIgnoreCase("SAMSUNG"))
            return new Samsung();
        else if(phoneType.equalsIgnoreCase("REDMI"))
            return new Redmi();
        return null;
    }
}
