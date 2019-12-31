package com.xuyy.springcloudeurekacluster;

import com.xuyy.SpringCloudEurekaApplication;

/**
 * @author xuyangyang
 */
public class SpringCloudEurekaApplicationPeer {

    public static void main(String[] args) {
        String[] strs = new String[]{"--spring.profiles.active"};
        SpringCloudEurekaApplication.main(strs);
    }
}
