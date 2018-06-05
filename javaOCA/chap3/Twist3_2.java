package chap3;

class Employee {
    String name;
    int age;

    Employee() {
      //Two or more methods calling each other, in a circular manner, is called circular method calling.
        //this (); //It fails to compile, recursive constructor calling
    }
    //It fails to compile, recursive method invocation
    //Only for constructors
    Employee (String newName, int newAge) {
      this(newName);
      name = newName;
      age = newAge;
    }

    Employee(String newName) {
      this(newName, 0);

    }
}
