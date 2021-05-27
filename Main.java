package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;
        // int occupies 32 bits and has a width of 32
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        // Overflow
        System.out.println("Busted Max value = " + (myMaxIntValue + 1));
        // Underflow
        System.out.println("Busted Min value " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;

        // byte occupies 8 bits an has a width of 8
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        // short occupies 16 bits and has a width of 16
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        // long occupies 64 bits and has a width of 64
        long myLongValue = 100;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

        // casting example as JAVA recognizes output value as an int by default
        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);

        // casting not needed with a long ato work with ints (maximum int value will always fit inside a long)
        byte testByte = 10;
        short testShort = 20;
        int testInt = 50;
        long testLong = 50000L + (10 * (testByte + testShort + testInt));
        System.out.println("Test Long value: " + testLong);

        // casting needed with shorts to work with ints (maximum int value will not always fit inside a short)
        short shortTotal = (short) (1000 + 10 * (testByte + testShort + testInt));
    }
}
