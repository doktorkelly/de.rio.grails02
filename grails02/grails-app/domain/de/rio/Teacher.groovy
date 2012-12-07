package de.rio

class Teacher {

	String lastName;
	String firstName;
	String email;
	
    static constraints = {
		lastName(blank:false)
		firstName(black:false)
		email(nullable:true)
    }
}
