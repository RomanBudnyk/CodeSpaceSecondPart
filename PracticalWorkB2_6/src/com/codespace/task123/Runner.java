package com.codespace.task123;

public class Runner {
    public void run(){
        //1
        Derive derive = new Derive("AA1110", "Sony", 554.5);
        System.out.println(derive);
        System.out.println("-------------------------------------------------");

        //2
        Derive[] devices = {new Monitor("AB1234567C", "Samsung", 515.54,1024,1024),
                new Derive("FDF33423","Asus",3432.3),
                new Monitor("DD34fFF","Dell", 233.2,2048,3221),
                new EthernetAdapter("FF33Fgr", "Philips",324.3,233,"FDD34322f"),
                new EthernetAdapter("FF33Fgr", "Philips",324.3,233,"FDD34322f"),
                new EthernetAdapter("RRA33445","Nokia",875.54,2445,"DF3434fe"),
                new Derive("FDF33423","Asus",3432.3),
                new EthernetAdapter("RRA33445","Nokia",875.54,2445,"DF3434fe")};
        for (Derive elem : devices)
        System.out.println(elem);

        //3
        System.out.println("-------------------------------------------------");
        System.out.println(devices[3].equals(devices[4]));
        System.out.println(devices[3].hashCode());
        System.out.println(devices[4].hashCode());
        System.out.println(devices[3].hashCode()==devices[4].hashCode());
    }
}
