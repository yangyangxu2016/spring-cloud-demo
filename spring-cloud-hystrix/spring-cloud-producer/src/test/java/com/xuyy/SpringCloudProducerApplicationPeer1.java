package com.xuyy;

/**
 * @author xuyangyang
 */
public class SpringCloudProducerApplicationPeer1 {

    public static void main(String[] args) {
        String[] strs = new String[]{"--spring.profiles.active=peer1"};
        SpringCloudProducerApplication.main(strs);
    }
}
