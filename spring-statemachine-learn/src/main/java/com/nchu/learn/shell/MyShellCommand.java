package com.nchu.learn.shell;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

/**
 * Spring shell command class
 *
 * @author fujianjian
 * @project self-learn
 * @date 2018/4/6 20:39
 */
@ShellComponent
public class MyShellCommand {

    @ShellMethod("add two integers together.")
    public int add(int a, int b) {
        return a + b;
    }

    @ShellMethod(key = "moreadd", value = "add  more than two number together.")
    public int add(@ShellOption(arity = 4) int[] counts) {
        int sum = 0;
        for (int a : counts) {
            sum += a;
        }
        return sum;
    }

    @ShellMethod(key = "sum", value = "add  more than two number together.")
    public float add(float[] counts) {
        float sum = 0;
        for (float a : counts) {
            sum += a;
        }
        return sum;
    }
}
