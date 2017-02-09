package main.com.springinaction.config;

import main.com.springinaction.soundsystem.CompactDisc;
import main.com.springinaction.soundsystem.SgtPeppers;
import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan(basePackageClasses={CompactDisc.class})
public class CDPlayerConfig {
}

@Bean(name="lonelyHeartsClubBand")
public CompactDisc sgtPeppers() {
    return new SgtPeppers();
}