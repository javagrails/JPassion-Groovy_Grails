package mypackage

class Student {

  String name
  int age

}

def Students = [
	new Student(name: "John", age: 11),
	new Student(name: "Mary", age: 22),
	new Student(name: "Querie", age: 33),
]

Students.each {
	println("${it.name} ${it.age}" )
}

