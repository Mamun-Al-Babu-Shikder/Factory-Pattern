package com.mcubes.phone;

/**
 * Created by A.A.MAMUN on 7/12/2020.
 */
/**
 * Create concrete classes 'Samsung'
 * implementing the 'Phone' interface.
 */
public class Samsung implements Phone {

    /**
     * Override the methods of
     * 'Phone' interface
     */
    @Override
    public void configuration() {
        System.out.println("Samsung A50 :");
        System.out.println("OS : Android 9.0 (Pie), upgradable to Android 10, One UI 2.0\n" +
                "CPU : Octa-core (4x2.3 GHz Cortex-A73 & 4x1.7 GHz Cortex-A53)\n" +
                "CAMERA : Triple(25 MP, 8MP, 5MP)\n" +
                "SELFIE CAMERA : single 25 MP, f/2.0, 25mm (wide), 1/2.8\", 0.9µm\n");
    }
}
