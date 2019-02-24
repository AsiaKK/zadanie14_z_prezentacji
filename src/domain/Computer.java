package domain;

import java.util.StringJoiner;

public class Computer implements Comparable<Computer> {

    private String name;
    private double processorSpeed;
    private int ram;

    public Computer(String name, double processorSpeed, int ram) {
        this.name = name;
        this.processorSpeed = processorSpeed;
        this.ram = ram;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getProcessorSpeed() {
        return processorSpeed;
    }

    public void setProcessorSpeed(double processorSpeed) {
        this.processorSpeed = processorSpeed;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Computer.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("processorSpeed=" + processorSpeed)
                .add("ram=" + ram)
                .toString();
    }

    @Override
    public int compareTo(Computer c) {
        if (this.processorSpeed > c.getProcessorSpeed()) {
            return 1;
        } else if (this.processorSpeed == c.getProcessorSpeed()) {
            if (this.ram > c.getRam()) {
                return 1;
            } else if (this.ram == c.getRam()){
                return this.name.compareTo(c.name);
            }
        }
        return -1;
    }
}
