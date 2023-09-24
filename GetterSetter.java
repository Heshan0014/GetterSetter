class GetterSetter{
    private String name;
    private int age;
    private char grade;



    public GetterSetter(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }





    public String getName() {
        return name;
    }


    public void setName(String newName) {
        name = newName;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int newAge) {
        age = newAge;
    }


    public char getGrade() {
        return grade;
    }


    public void setGrade(char newGrade) {
        grade = newGrade;
    }


    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}

class New{
    public static void main(String[] args) {

        GetterSetter student = new GetterSetter("Heshan",30,'A');


        student.setName("Heshan");
        student.setAge(30);
        student.setGrade('A');


        student.displayInfo();
}
}
