package src.designPatterns.creational.builder_pattern;

public class Main {
    public static void main(String[] args) {
        EnrollmentForm form = new EnrollmentForm.EnrollmentBuilder("balaji", "Durshetti")
                .setAge(26)
                .setGender("male")
                .submit();
//        System.out.println(form.EnrollmentBuilder.setAge(12));
        System.out.println(form);
    }
}
