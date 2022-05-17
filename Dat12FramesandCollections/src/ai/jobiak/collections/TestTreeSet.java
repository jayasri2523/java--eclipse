package ai.jobiak.collections;

import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		
		Course1 c1 = new Course1("BCLI","Computer Basics",60,500);
		Course1 c2 = new Course1("PGLI","Algorithms",40,2500);
		Course1 c3 = new Course1("BCLI","JavaProgramming",60,5000);
		Course1 c4 = new Course1("BCLI","JavaProgramming",60,5000);
		
		TreeSet courseTree = new TreeSet();
		courseTree.add(c1);
		courseTree.add(c2);
		courseTree.add(c3);
		courseTree.add(c4);
		
		System.out.println(courseTree);
	

	}

}
