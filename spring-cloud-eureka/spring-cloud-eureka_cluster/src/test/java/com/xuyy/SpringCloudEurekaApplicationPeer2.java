package com.xuyy;

/**
 * @author xuyangyang
 */
public class SpringCloudEurekaApplicationPeer2 {

    public static void main(String[] args) {
        String[] strs = new String[]{"--spring.profiles.active=peer2"};
        SpringCloudEurekaApplication.main(strs);
    }
}
