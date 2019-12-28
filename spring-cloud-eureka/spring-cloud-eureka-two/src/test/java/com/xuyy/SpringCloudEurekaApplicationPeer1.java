package com.xuyy;

/**
 * @author xuyangyang
 */
public class SpringCloudEurekaApplicationPeer1 {

    public static void main(String[] args) {
        String[] strs = new String[]{"--spring.profiles.active=peer1"};
        SpringCloudEurekaApplication.main(strs);
    }
}
