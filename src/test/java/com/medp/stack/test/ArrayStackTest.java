package com.medp.stack.test;

import com.medp.stack.ArrayStack;
import org.junit.Test;

/**
 * @author MEDP
 * @date 2022/2/22 21:30
 */

public class ArrayStackTest {

    /**
     * 测试顺序栈的入栈和出栈功能
     */
    @Test
    public void ArrayStackTest(){
        ArrayStack stack = new ArrayStack(4);
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");

        System.out.println(stack.pop());

    }

}
