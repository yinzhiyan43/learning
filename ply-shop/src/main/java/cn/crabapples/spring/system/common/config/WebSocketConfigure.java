package cn.crabapples.spring.system.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

//@ConditionalOnWebApplication
@Configuration
public class WebSocketConfigure {

    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }

//    @Bean
//    public CustomSpringConfigure customSpringConfigurator() {
//        return new CustomSpringConfigure();
//    }
}
