package main.com.springinaction.config;

import main.com.springinaction.soundsystem.CompactDisc;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses={CompactDisc.class})
public class CDPlayerConfig {
}
