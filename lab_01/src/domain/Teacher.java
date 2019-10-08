package domain;

public class Teacher {
    private String name;
    private String status;
    private String email;

    public Teacher(String name, String status, String email) {
        this.name = name;
        this.status = status;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "domain.Teacher{" +
                "name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


}
