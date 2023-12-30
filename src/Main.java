public class Main {
    public static void main(String[] args) {
        Author bookOne = new Author("Лев", "Толстой");
        Author bookTwo = new Author("Джейн", "Остин");
        Book one = new Book("Детство. Отрочество. Юность", bookOne, 1852);
        Book two = new Book("Гордость и предубеждение", bookTwo, 1813);
        System.out.println("Название книги " + one.getBookName() + ". Автор " + bookOne.getFirstName() + " " + bookOne.getLastName() + ". Год выпуска " + one.getBookAge());
        System.out.println("Название книги " + two.getBookName() + ". Автор " + bookTwo.getFirstName() + " " + bookTwo.getLastName() + ". Год выпуска " + two.getBookAge());
        two.setbookAge(1814);
        System.out.println("Название книги " + two.getBookName() + ". Автор " + bookTwo.getFirstName() + " " + bookTwo.getLastName() + ". Год выпуска " + two.getBookAge());

// Задание второго урока
        System.out.println();
        System.out.println(one.toString());
        System.out.println(two.toString());
        System.out.println(one.equals(two));
    }
}