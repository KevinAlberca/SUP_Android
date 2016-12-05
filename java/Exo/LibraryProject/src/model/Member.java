package model;

public class Member {
	public String name;
	public Status status;	
	
	public Member(String name, Status status){
		this.name = name;
		this.status = status;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", status=" + status + "]";
	}

}
