package com.shawny;

import com.shawny.sagacache.autoconfigure.SagaCacheAutoConfiguration;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by shawn_lin on 2019/6/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SagaCacheAutoConfiguration.class)
public class SpringBootTest {
}
