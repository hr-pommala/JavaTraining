package java8features;

import java.io.Serializable;

public  class Person implements Serializable {
    
  	private String name;
     private int age;

     public  Test test = new Test();
     
      public Person(String name, int age, int id) {
          this.name = name;
          this.age = age;
          this.test.employeeID = id;
      }

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
  }

class Test implements Serializable{
	
	int employeeID;

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	
}
