package com.leyou.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName:  <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date:   <br/>
 *
 * @author
 * @since JDK 1.6
 */
@SpringBootApplication
@EnableDiscoveryClient
public class LyInterfaceApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(LyInterfaceApplication.class,args);
    }
}
