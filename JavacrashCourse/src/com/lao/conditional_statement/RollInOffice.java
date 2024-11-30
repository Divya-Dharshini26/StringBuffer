package com.lao.conditional_statement;
// Switch Statement
public class RollInOffice {
	String myRole = "Software Tester";
	public void roleIs() {
		
		switch (myRole) {
		case "Developer":
			System.out.println("Developer is not my role");
			break;
			
		case "Data analyst":
			System.out.println("Data analyst is not my role");
			break;
			
		case "Software Tester":
		System.out.println("Software Tester");
		break;
		
		default:
			System.out.println("you are wrong");
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RollInOffice role= new RollInOffice();
		role.roleIs();

	}

}
