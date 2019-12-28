1. 启动工程后访问 http://localhost:9001/hystrix，将会看到如下界面：
2. 如果没有请求会先显示Loading ...，访问http://localhost:9001/hystrix.stream 也会不断的显示ping。

3. 请求服务http://localhost:9001/hello/neo，就可以看到监控的效果了，首先访问http://localhost:9001/hystrix.stream，显示如下：
 
 