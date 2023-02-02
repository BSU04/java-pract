class CPU {
    double price;
    
    class Processor{ // nested class
        double cores;
        String manufacturer;

        double getCache(){
            return 4.3;
        }
    }

    protected class RAM{// nested protected class
        double memory;
        String manufacturer;

        double getClockSpeed(){
            return 5.5;
        }
    }
}

public class NonStaticNestedClass {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        CPU.Processor processor = cpu.new Processor();// create an object of inner class Processor using outer class

        CPU.RAM ram = cpu.new RAM();// create an object of inner class RAM using outer class CPU
        System.out.println("Processor Cache = " + processor.getCache());
        System.out.println("Ram Clock speed = " + ram.getClockSpeed());
    }
}