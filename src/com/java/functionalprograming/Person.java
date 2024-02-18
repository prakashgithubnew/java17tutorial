package com.java.functionalprograming;

public class Person {

	
		public Person(String fname, String lname, int age, int salary) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.salary = salary;
	}

		String fname;
		
		String lname;
		
		int age;
		
		int salary;

		public String getFname() {
			return fname;
		}

		public void setFname(String fname) {
			this.fname = fname;
		}

		public String getLname() {
			return lname;
		}

		public void setLname(String lname) {
			this.lname = lname;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + age;
			result = prime * result + ((fname == null) ? 0 : fname.hashCode());
			result = prime * result + ((lname == null) ? 0 : lname.hashCode());
			result = prime * result + salary;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Person other = (Person) obj;
			if (age != other.age)
				return false;
			if (fname == null) {
				if (other.fname != null)
					return false;
			} else if (!fname.equals(other.fname))
				return false;
			if (lname == null) {
				if (other.lname != null)
					return false;
			} else if (!lname.equals(other.lname))
				return false;
			if (salary != other.salary)
				return false;
			return true;
		}


	

}
