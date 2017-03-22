package javaschool.app;

import asg.cliche.Command;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Record> recordList = new ArrayList<>();
    private List<String> nameList = new ArrayList<>();

    @Command
    public void create(String name, String phone, String address, String email) {
        Record r = new Record();
        r.setName(name);
        r.setPhone(phone);
        r.setAddress(address);
        r.setEmail(email);
    }

    @Command
    public List<Record> list() {
        return recordList;
    }
}
