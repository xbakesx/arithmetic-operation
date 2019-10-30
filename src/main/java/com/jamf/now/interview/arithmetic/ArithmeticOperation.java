package com.jamf.now.interview.arithmetic;

import java.util.function.BiFunction;

public interface ArithmeticOperation<T extends Number> extends BiFunction<T, T, T> {

}
