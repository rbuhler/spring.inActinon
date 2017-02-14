package main.com.springinaction.soundsystem;

import static org.junit.Assert.*;

import main.com.springinaction.config.CDPlayerConfig;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.nio.charset.StandardCharsets;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerTest {
    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    private MediaPlayer player;

    @Autowired
    private CompactDisc randomBeatlesCD;

    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(randomBeatlesCD);
    }

    @Test
    public void play(){
        player.play();
        assertEquals(
                "Playing Sgt.Peppers Lonely Hearts Club Band" +
                " by The Beatles\n",
                log.getLog());
    }

}
