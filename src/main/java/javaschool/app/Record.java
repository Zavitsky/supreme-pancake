package javaschool.app;

public class Record {
    private static int count = 1;
    private int id;

    private String name;
    private String phone;
    private String address;
    private String email;

    public Record() {
        this.id = count++;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return
                "id: " + getId() +
                        ", name: " + this.name +
                        ", phone: " + this.phone +
                        ", address: " + this.address +
                        ", email: " + this.email;
    }

    public int getId() {
        return id;
    }
}
