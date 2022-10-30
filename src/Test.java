public class Test {
    public static void main(String[] args) {
        Book masterMargarita = new Book("Master and Margarita", "Michael Bylgakov", 1929);
        Book deadSouls = new Book("Dead Souls", "Nikolai Gogol", 1842);

        Author NikolaiGogol = new Author("Nikolai","Gogol");
        Author MichaelBylgakov = new Author("Michael", "Bylgakov");

        masterMargarita.setYear(1940);
        System.out.println(masterMargarita.getYear());
    }
}
