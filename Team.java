/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package lab5;

/**
 * This is a class encapsulating the concept of a team such as FCB,Real Madrid etc,
 * assuming a team has only team name as an attribute. Include a constructor,
 * the accessor and mutator, and methods toString and equals. Write a client
 * class to test all methods.
 * @author Uzair Ahmed 
 */
	public class Team {

	private String name;
	
    public Team() {

    setName(name);
	
    }

    public void setName(String name) {

    this.name = name;
  
	}
	
    public String getName() {

    return name;
    }
	
	public String toString(){

    return ("\nThe team name is " + this.name);
    }
	
	public boolean equals(Team other) {
    return name.equals(other.name);
  }	
	
        }
	 





	