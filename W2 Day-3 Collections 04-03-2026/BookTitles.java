import java.util.LinkedHashSet;
class BookTitles{
    public static void main(String args[]){
        LinkedHashSet<String> book = new LinkedHashSet<>();
        book.add("Psychology of Money");
        book.add("Ikigai");
        book.add("Atomic Habits");
        book.add("48 Laws of Power");
        book.add("Ikigai");
        book.add("You can win");
        book.add("Atomic Habits");
        System.out.println(book);
    }
}