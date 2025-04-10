package objectclass;

import java.util.Objects;

public class student {
	private int id;
	private String name;
	private double percent;
	
	student(int id, String name, double percent){
		this.id=id;
		this.name= name;
		this.percent=percent;
	}
	@Override
	public boolean equals(Object obj) {
		student s= (student)obj;
		return this.id==s.id && this.name.equals(s.name) && this.percent==s.percent;
	}
	@Override
	public int hashCode() {
		return Objects.hash(this.id,this.name,this.percent);
	}
	@Override
	public String toString() {
		return "student "+" ["+"id : " + this.id +" name : " +  this.name +" percent: " + this.percent + "]";
		
	}

}

