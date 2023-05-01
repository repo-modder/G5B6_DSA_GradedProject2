package com.gl.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ConstructionServiceImpl implements ConstructionService {
	@Override
	public void constructionOrder(int totalFloors, ArrayList<Integer> floorSize) {

		Set<Integer> floors = new HashSet<>();
		int day = 1;
		System.out.println("The order of construction is as follows");
		for (int floor : floorSize) {
			floors.add(floor);
			System.out.println("Day: " + day);
			while (!floors.isEmpty() && floors.contains(totalFloors)) {
				System.out.print(totalFloors + " ");
				--totalFloors;
			}
			System.out.println();
			day++;
		}
	}
}
