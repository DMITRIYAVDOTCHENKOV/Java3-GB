package ru.avdotchenkov.lesson1.homework.dz1_3;

public class Dz1_3 {
	public static void main(String[] args) {
		Box<Apple> appleBox = new Box<>();
		Box<Apple> appleBox2 = new Box<>();
		
		
		Box<Orange> orangeBox = new Box<>();
		orangeBox.add(new Orange());
		orangeBox.add(new Orange());//3
//        orangeBox.add(new Apple());
		
		appleBox.add(new Apple());
		appleBox.add(new Apple());//2
//        appleBox.add(new Orange());
		System.out.println("Вес коробки с яблоками: " + appleBox.getWeight());
		
		appleBox2.add(new Apple());//1
		System.out.println("Вес 2 коробки: " + appleBox2.getWeight());

//        appleBox.moveAllTo(orangeBox);
		appleBox.moveAllTo(appleBox2);
		
		System.out.println("Вес коробки с яблоками: " + appleBox.getWeight());//0
		System.out.println("Вес 2 коробки: " + appleBox2.getWeight());//2+1=3
		
		System.out.println("Сравниваем апельсины и яблоки: " + appleBox.compareTo(orangeBox));
		System.out.println("Сравниваем апельсины и яблоки2: " + appleBox2.compareTo(orangeBox));
		
		Box testBox = new Box();
		testBox.add(new Fruit() {
			@Override
			public String getName() {
				return null;
			}
			
			@Override
			public double getWeight() {
				return 5.0;
			}
		});
		
		appleBox.compareTo(testBox);
	}
}
