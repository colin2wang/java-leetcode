package com.colin.leetcode;

import org.junit.Test;

import java.util.concurrent.Semaphore;

public class S1115_Print_Foobar_Alternately {
    class FooBar {
        private int n;

        private Semaphore foo = new Semaphore(1);
        private Semaphore bar = new Semaphore(0);

        public FooBar(int n) {
            this.n = n;
        }

        public void foo(Runnable printFoo) throws InterruptedException {

            for (int i = 0; i < n; i++) {
                foo.acquire();
                // printFoo.run() outputs "foo". Do not change or remove this line.
                printFoo.run();
                bar.release();
            }
        }

        public void bar(Runnable printBar) throws InterruptedException {

            for (int i = 0; i < n; i++) {
                bar.acquire();
                // printBar.run() outputs "bar". Do not change or remove this line.
                printBar.run();
                foo.release();
            }
        }
    }

    @Test
    public void test() {

    }
}
