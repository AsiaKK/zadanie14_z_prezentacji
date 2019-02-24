package utils;

import com.sun.xml.internal.ws.encoding.soap.SOAP12Constants;
import domain.Computer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputerCreator {

    public static void main(String[] args) {

        List<Computer> computers = new ArrayList<>();
        computers.add(new Computer("Lenovo", 2000, 64));
        computers.add(new Computer("HP", 2000, 32));
        computers.add(new Computer("HP", 2000, 64));
        computers.add(new Computer("HP", 1500, 128));

        System.out.println("Rozpoczynamy sortowanie:");
        Collections.sort(computers);
        System.out.println(computers);

    }
}
