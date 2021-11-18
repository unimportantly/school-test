package models;

import java.util.ArrayList;
import java.util.List;

public class Course {

	
	private String name;
	private String program;
	private int nbOfStudents;
	
	/**
	 * full constructor
	 * @param name
	 * @param program
	 * @param nbOfStudents
	 */
	public Course(String name, String program, int nbOfStudents) {
		this.setName(name);
		this.setProgram(program);
		this.setNbOfStudents(nbOfStudents);
	
	}

	//getters & setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public int getNbOfStudents() {
		return nbOfStudents;
	}

	public void setNbOfStudents(int nbOfStudents) {
		this.nbOfStudents = nbOfStudents;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", program=" + program + ", nbOfStudents=" + nbOfStudents + "]";
	}



	
}
