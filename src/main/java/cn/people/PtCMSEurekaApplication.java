/**
 *   
 *
 * @Title: PtCMSEurekaApplication.java 
 * @Package application 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author shidandan
 * @date 2018年11月27日 上午9:05:00 
 * @version V1.0   
 */
package cn.people;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 *  
 *
 * @author shidandan
 * @ClassName: PtCMSEurekaApplication 
 * @Description: 注册中心启动类 
 * @date 2018年11月27日 上午9:05:00 
 *   
 */
@EnableEurekaServer
@SpringBootApplication
public class PtCMSEurekaApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(PtCMSEurekaApplication.class).run(args);
    }
}
