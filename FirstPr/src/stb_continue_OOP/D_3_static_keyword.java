package stb_continue_OOP;

import Objects.Friend;

public class D_3_static_keyword {
	
	public static void main(String[] args) {
		// static = modifier. A single copy of a variable/method is created and shared
		//          The class "owns" the static member.
		
		Friend friend1 = new Friend("Sponegbob");
		Friend friend2 = new Friend("Spongebob");
		Friend friend3 = new Friend("Squidward");
		
		System.out.println(friend1.name);
		System.out.println(friend2.name);
		System.out.println(friend3.name);
		
		//'friend1,2,3' can be used below but not recommended
		// as 'numberOfFriends' is a static variables
		System.out.println(Friend.numberOfFriends); 
		Friend.displayFriends();
		
		
		 
	}
}
