package com.programming.exercises;


class MathMagicImpl implements MathMagic {
    @Override
    public long factorial(int n) {
        long factorial = 1;
        for (int i = n; i > 1; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
