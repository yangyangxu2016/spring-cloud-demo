
## 启动步骤：

-  1、在hosts文件中加入如下配置:C:\Windows\System32\drivers\etc
  
```$xslt
127.0.0.1 peer1  
127.0.0.1 peer2  
```
                
- 2、分别启动test目录下两个启动类也可以

```$xslt
     com.xuyy.SpringCloudEurekaApplicationPeer1
     com.xuyy.SpringCloudEurekaApplicationPeer2
```
   
    
                                
-  3、线上部署时打包启动依次执行下面命令

```$xslt
#打包
mvn clean package

# 分别以peer1和peeer2 配置信息启动eureka
java -jar spring-cloud-eureka-cluster-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer1
java -jar spring-cloud-eureka-cluster-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer2
```





