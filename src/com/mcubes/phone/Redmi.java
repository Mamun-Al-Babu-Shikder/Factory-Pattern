package com.mcubes.phone;

/**
 * Created by A.A.MAMUN on 7/12/2020.
 */
/**
 * Create concrete classes 'Redmi'
 * implementing the 'Phone' interface.
 */
public class Redmi implements Phone {

    /**
     * Override the methods of
     * 'Phone' interface
     */
    @Override
    public void configuration() {
        System.out.println("Redmi 8 :");
        System.out.println("OS : Android 9.0 (Pie), MIUI 11\n" +
                "CPU : Octa-core (4x1.95 GHz Cortex-A53 & 4x1.45 GHz Cortex A53)\n" +
                "CAMERA : Single 12 MP, f/1.8, 1/2.55\", 1.4µm, Dual Pixel PDAF\n" +
                "SELFIE CAMERA : single 8 MP, f/2.0, 1/4\", 1.12µm\n");
    }
}
