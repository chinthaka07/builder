public class ComputerShop {
    public static void main(String[] args) {
        Computer samanC = new ComputerBuilder().setBrand("Lenovo").setDiskSpace(256L).getComputer();
        Computer kamalC = new ComputerBuilder().setRam(32).getComputer();

        System.out.println(samanC);
        System.out.println(kamalC);
    }
}
