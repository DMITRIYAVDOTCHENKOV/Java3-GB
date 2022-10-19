package ru.avdotchenkov.lesson1.homework.dz1_2;

import java.util.ArrayList;
import java.util.List;

public class Dz1_2 {
	public static <T> List <T> transform(T[] array) {
		List<T> list = new ArrayList <>();
		for (T value : array) {
			list.add(value);
		}
		return list;
//        return Arrays.asList(array); можно и так.
	}
	
	
	public static void main(String[] args) {
		String[] strArr = {"s", "t", "r"};
		List <String> strList = transform(strArr);
		System.out.println(strList.getClass().getSimpleName() + " - " + strList);
	}
}