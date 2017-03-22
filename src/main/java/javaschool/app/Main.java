package javaschool.app;

import asg.cliche.Command;
import asg.cliche.ShellFactory;

import java.io.IOException;

public class Main {
    @Command
    public String hello() {
        return "Hello world";
    }

    @Command
    public String hello(String name) {
        return "Hello " + name;
    }

    public static void main(String[] args) throws IOException {
        ShellFactory
                .createConsoleShell("hello", "Header text", new PhoneBook())
                .commandLoop();
    }

}
