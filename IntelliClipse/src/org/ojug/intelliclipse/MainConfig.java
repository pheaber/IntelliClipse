package org.ojug.intelliclipse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig {

	@Bean
	public Main main() {
		return new Main();
	}
}
