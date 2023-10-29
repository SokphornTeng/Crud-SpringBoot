package com.crudSpringBoot.CrudSpringBoot.Information;

public class InforSokphorn {
   
   public String id;
   public String name;
   public String position;
   public int age;
   public String workPlace;
   
public InforSokphorn(String id, String name, String position, int age, String workPlace) {
	this.id = id;
	this.name = name;
	this.position = position;
	this.age = age;
	this.workPlace = workPlace;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPosition() {
	return position;
}
public void setPosition(String position) {
	this.position = position;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getWorkPlace() {
	return workPlace;
}
public void setWorkPlace(String workPlace) {
	this.workPlace = workPlace;
}
@Override
public String toString() {
	return "InforSokphorn [id=" + id + ", name=" + name + ", postion=" + position + ", age=" + age + ", workPlace="
			+ workPlace + "]";
}
   

   

   
}
