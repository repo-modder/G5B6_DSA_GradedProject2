package com.gl.client;

import java.util.ArrayList;
import java.util.Scanner;

import com.gl.service.ConstructionService;
import com.gl.service.ConstructionServiceImpl;

public class Main {
	public static void main(String[] args) {
		ConstructionService cs = new ConstructionServiceImpl();
		Scanner sc = new Scanner(System.in);
		int totalFloors = 0;
		ArrayList<Integer> floorSize = new ArrayList<>();
		System.out.println("enter the total no of floors in the building");
		totalFloors = sc.nextInt();
		for(int i=1;i<=totalFloors;++i) {
			System.out.println("enter the floor size given on day : "+ i);
			int size = sc.nextInt();
			floorSize.add(size);
		}
		if(totalFloors > 0)
			cs.constructionOrder(totalFloors, floorSize);
	}
}
