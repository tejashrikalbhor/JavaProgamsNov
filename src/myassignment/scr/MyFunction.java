package myassignment.scr;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class MyFunction {
    private String name;
    private String status;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM dd,yyyy hh:mm:ss a");
    LocalDateTime now = LocalDateTime.now();
    private String timestamp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DateTimeFormatter getDtf() {
        return dtf;
    }

    public void setDtf(DateTimeFormatter dtf) {
        this.dtf = dtf;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public LocalDateTime getNow() {
        return now;
    }

    public void setNow(LocalDateTime now) {
        this.now = now;
    }

    public void addIterationData(String name, String status){
        this.name =name;
        this.timestamp=dtf.format(now);
        this.status=status;
        System.out.println(getName());
        System.out.println(getTimestamp());
        System.out.println(getStatus());

    }

    public MyFunction(String name, String status){
        this.name =name;
        this.timestamp=dtf.format(now);
        this.status=status;
        System.out.println(getName() +" "+ getTimestamp() +" " +getStatus());
    }

    @Override
    public String toString() {
        return "MyFunction{" +
                "name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", dtf=" + dtf +
                ", now=" + now +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }

    public MyFunction(){

    }
}
