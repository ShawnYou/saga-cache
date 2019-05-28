package com.shawny;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by shawn_lin on 2019/5/28.
 */

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = Test.class)
public class AutoInitTest {
    @Before
    public void init(){

    }

}
