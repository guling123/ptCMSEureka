1.官方文档地址：https://spring.io/projects/spring-cloud

2.中文文档地址：https://github.com/Netflix/eureka

3.Eureka是Netflix开发的服务发现框架，SpringCloud将它集成在自己的子项目spring-cloud-netflix中，实现SpringCloud的服务发现功能。
为什么要使用Eureka，因为在一个完整的系统架构中，任何单点的服务都不能保证不会中断，因此我们需要服务发现机制，在某个节点中断后，其它的节点能够继续提供服务，从而保证整个系统是高可用的。
服务发现有两种模式：一种是客户端发现模式，一种是服务端发现模式。Erueka采用的是客户端发现模式。
Eureka通过心跳检测、健康检查、客户端缓存等机制，保证了系统具有高可用和灵活性。

