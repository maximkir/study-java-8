package org.maximkir.java8.lambda;

import java.util.function.Function;

/**
 * Taken from: http://stackoverflow.com/questions/43523276/why-does-this-method-reference-assignment-compile
 * This example emphasizes the difference between static & non-static methods references
 *
 */
public class StaticVsNonStaticMethodRefs {

    public static void main(String[] args) {
        Function<StaticVsNonStaticMethodRefs, String> f;

        f = StaticVsNonStaticMethodRefs::getValueStatic;

        // equals to (StaticVsNonStaticMethodRefs m) -> m.getValue();
        // For non static methods there is always an implicit argument which is represented as this in the callee.
        f = StaticVsNonStaticMethodRefs::getValue;
    }

    public static String getValueStatic(StaticVsNonStaticMethodRefs smt) {
        return smt.getValue();
    }

    public String getValue() {
        return "4";
    }

}
