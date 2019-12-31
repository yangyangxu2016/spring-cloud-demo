package com.xuyy;

import com.xuyy.springcloudconsumer.SpringCloudConsumerApplication;

/**
 * @author xuyangyang
 */
public class SpringCloudConsumerApplicationPeer1 {

    public static void main(String[] args) {
        String[] strs = new String[]{"--spring.profiles.active=peer1"};
        SpringCloudConsumerApplication.main(strs);
    }
}
