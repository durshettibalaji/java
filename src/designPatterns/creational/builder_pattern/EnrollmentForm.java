package src.designPatterns.creational.builder_pattern;

public class EnrollmentForm {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String gender;

    private EnrollmentForm(){
        this.firstName = null;
        this.lastName = null;
        this.age = 0;
        this.gender = null;
    }

    private EnrollmentForm(EnrollmentBuilder bUilder){
       this.firstName = bUilder.firstName;
       this.lastName = bUilder.lastName;
       this.age = bUilder.age;
       this.gender = bUilder.gender;
    }


    public static class EnrollmentBuilder{
        private final String firstName;
        private final String lastName;
        private  int age;
        private  String gender;

        public EnrollmentBuilder(String first, String last){
            this.firstName = first;
            this.lastName = last;
        }

        public  EnrollmentBuilder setAge(int age){
            this.age =age;
            return  this;
        }

        public  EnrollmentBuilder setGender(String gender){
            this.gender = gender;
            return this;
        }

        public EnrollmentForm  submit(){
            return new EnrollmentForm(this);
        }
    }
    @Override
    public  String toString(){
        return  this.firstName+"       "+this.lastName+"               "+this.age+"               "+this.gender;
    }
}
