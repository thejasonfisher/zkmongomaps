package org.github.simbo1905.zkmongogmaps.data;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "org.github.simbo1905.zkmongogmaps.data")
@Configuration
public class ZipcodeLoaderConfig {
	public @Bean
	ZipcodeLoaderApplicationListener cityLoaderApplicationListener() {
		return new ZipcodeLoaderApplicationListener();
	}
	
}
