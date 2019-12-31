package com.xuyy;

/**
 * @author xuyangyang
 */
public class SpringCloudProducerApplicationPeer2 {

    public static void main(String[] args) {
        String[] strs = new String[]{"--spring.profiles.active=peer2"};
        SpringCloudProducerApplication.main(strs);
    }
}
