package com.mmall;

import com.mmall.dao.ProductMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MmallApplicationTests {

    @Autowired
    private ProductMapper productMapper;

    @Test
    public void contextLoads() {

    }

}
