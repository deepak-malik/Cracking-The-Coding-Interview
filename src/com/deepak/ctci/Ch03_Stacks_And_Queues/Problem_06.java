/**
 * Cracking-The-Coding-Interview
 * Problem_06.java
 */
package com.deepak.ctci.Ch03_Stacks_And_Queues;

import java.util.LinkedList;

/**
 * <br> Problem Statement :
 * 
 * An animal shelter, which holds only dogs and cats, operates
 * on a strictly "first in, first out" basis. People must adopt
 * either the "oldest" (based on arrival time) of all animals at
 * the shelter, or they can select whether they would prefer a dog
 * or a cat (and will receive the oldest animal of that type). They
 * cannot select which specific animal they would like. Create a data
 * structure to maintain this system and implement operations such as
 * enqueue, dequeueAny, dequeueDog and dequeueCat. You may use the
 * built in linked list data structure.
 * 
 * </br>
 * 
 * @author Deepak
 */
public class Problem_06 {

	/**
	 * Class for Animal Shelter
	 * 
	 * @author Deepak
	 */
	public static class AnimalShelter {

		/* Two queues created, one each for dog and cat */
		private static LinkedList<Dog> dogs = new LinkedList<>();
		private static LinkedList<Cat> cats = new LinkedList<>();
		/* Counter to assign order for each Animal */
		private static int order = 0;

		/**
		 * Method to enqueue the animal 
		 * 
		 * @param animal
		 */
		public void enqueue(Animal animal) {
			/* If Animal is present, set order and increase the order size */
			if (animal != null) {
				animal.setOrder(order);
				order++;
				/* Check what type of Animal it is, and
				 * add to that specific queue */
				if (animal instanceof Dog) {
					dogs.addLast((Dog) animal);
				} else if (animal instanceof Cat) {
					cats.addLast((Cat) animal);
				}
			}
		}

		/**
		 * Method to dequeue any animal
		 * 
		 * @return {@link Animal}
		 */
		public Animal dequeueAny() {
			/* If there are no dogs, dequeue cats
			 * and vice versa */
			if (dogs.size() == 0) {
				dequeueCat();
			} else if (cats.size() == 0) {
				dequeueDog();
			}
			/* Find the first dog and cat in the queue */
			Dog dog = dogs.peek();
			Cat cat = cats.peek();
			/* Whichever is older entry, return that */
			if (dog.isOlderThen(cat)) {
				return dogs.poll();
			} else {
				return cats.poll();
			}
		}

		/**
		 * Method to dequeue dog 
		 * 
		 * @return {@link Dog}
		 */
		public Dog dequeueDog() {
			return dogs.poll();
		}

		/**
		 * Method to dequeue cat
		 * 
		 * @return {@link Cat}
		 */
		public Cat dequeueCat() {
			return cats.poll();
		}

		/**
		 * Method to get the size of Animal shelter
		 * 
		 * @return {@link int}
		 */
		public int size() {
			return dogs.size() + cats.size();
		}

		/**
		 * Abstract class Animal
		 * 
		 * @author Deepak
		 */
		public static abstract class Animal {

			/* Order of the animal and name */
			private int order;
			protected String name;

			/**
			 * Constructor
			 * 
			 * @param name
			 */
			public Animal(String name) {
				this.name = name;
			}

			public int getOrder() {
				return order;
			}
			public void setOrder(int order) {
				this.order = order;
			}

			/**
			 * Compare two animals and find out which is older
			 */
			public boolean isOlderThen(Animal animal) {
				return this.order < animal.getOrder();
			}

		}

		/**
		 * Class Cat which extends Animal
		 * 
		 * @author Deepak
		 */
		public static class Cat extends Animal {

			/**
			 * Constructor to add a cat
			 * 
			 * @param name
			 */
			public Cat(String name) {
				super(name);
			}

			public String name() {
				return "Cat : " + name;
			}

		}

		/**
		 * Class Dog which extends Animal
		 * 
		 * @author Deepak
		 */
		public static class Dog extends Animal {

			/**
			 * Constructor to add a Dog
			 * 
			 * @param name
			 */
			public Dog(String name) {
				super(name);
			}

			public String name() {
				return "Dog : " + name;
			}
		}

	}

}
