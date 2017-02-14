package main.com.springinaction.config;

import main.com.springinaction.soundsystem.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackageClasses={CompactDisc.class})
public class CDPlayerConfig {

    @Bean
    public CDPlayer cdPlayer() {
        return new CDPlayer(sgtPeppers());
    }

    @Bean
    public CompactDisc whiteAlbum() {
        return new WhiteAlbum();
    }
    @Bean(name="lonelyHeartsClubBand")
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }
    @Bean
    public CompactDisc hardDaysNight() {
        return new HardDaysNight();
    }
    @Bean
    public CompactDisc revolver() {
        return new Revolver();
    }

    @Bean
    public CompactDisc randomBeatlesCD() {
        int choice = (int) Math.floor(Math.random() * 4);
        if (choice == 0) {
            return new SgtPeppers();
        } else if (choice == 1) {
            return new WhiteAlbum();
        } else if (choice == 2) {
            return new HardDaysNight();
        } else {
            return new Revolver();
        }
    }
}