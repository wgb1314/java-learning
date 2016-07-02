package com.cookie.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Filter {

	public static <T> List<T> filter(List<T> list, Predicate<T> p) {
		List<T> result = new ArrayList<T>();
		for (T e : list) {
			if (p.test(e)) {
				result.add(e);
			}
		}
		return result;
	}

}
