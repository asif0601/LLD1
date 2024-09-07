package Enum.constant;

public enum Day {
    // There is only one SUNDAY and MONDAY in JVM //
    //    SUNDAY, MONDAY;
    // Static + final
    SUNDAY("sunday"), MONDAY("monday");


    private Day(String sunday){
        System.out.println("date : "+ this.name());
    }
}
