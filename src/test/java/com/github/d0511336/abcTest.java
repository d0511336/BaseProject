package com.github.d0511336;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class abcTest {

    @Test
    public void getType() throws Exception {
        abc ab = new abc( 5 ,10 ,  2 );


        String result = ab.getType();

        Assert.assertEquals("不是三角形",result);
    }

}
