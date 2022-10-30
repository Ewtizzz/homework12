public class Test {
    public static void main(String[] args) {
        Author NikolaiGogol = new Author("Nikolai","Gogol");
        Author MichaelBylgakov = new Author("Michael", "Bylgakov");
        Book masterMargarita = new Book("Master and Margarita", MichaelBylgakov, 1929);
        Book deadSouls = new Book("Dead Souls", NikolaiGogol, 1842);

        masterMargarita.setYear(1940);
        System.out.println(masterMargarita.toString());
        System.out.println(deadSouls.toString());

        System.out.println(masterMargarita.equals(deadSouls));
        System.out.println(masterMargarita.hashCode() == deadSouls.hashCode());
    }
}
