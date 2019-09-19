package kodillaStream;

import kodillaStream.forumuser.Forum;
import kodillaStream.forumuser.ForumUser;
import kodillaStream.forumuser.Sex;
import kodillaStream.library.Book;
import kodillaStream.library.BookDirectory;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        //list
        BookDirectory bookDirectory = new BookDirectory();
//        List<Book> collect = bookDirectory.getTheBookList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
////                .collect(Collectors.toList());
////
////        System.out.println("# elements: " + collect.size());
////        collect.stream()
////                .forEach(System.out::println);
//        //map
//
//        Map<String, Book> theResultMapOfBooks = bookDirectory.getTheBookList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .collect(Collectors.toMap(Book::getSignature, book -> book));
//
//        System.out.println("# elements: " + theResultMapOfBooks.size());
//
//        theResultMapOfBooks.entrySet().stream()
//                .map(entry -> entry.getKey() + ": " + entry.getValue())
//                .forEach(System.out::println);
//
//        BookDirectory theBookDirectory = new BookDirectory();
//        String theResultStringOfBooks = theBookDirectory.getTheBookList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .map(Book::toString)
//                .collect(Collectors.joining(",\n", "<<", ">>"));
//
//        System.out.println(theResultStringOfBooks);

        Forum forum = new Forum();

        Map<Integer, ForumUser> collect = forum.getForumUsers().stream()
                .filter(e -> e.getSex() == Sex.M && e.getDateOfBirth().getYear() > 1999 && e.getPostCount() > 1)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));

        collect.entrySet().stream()
                .map(entry -> entry.getKey() +": " + entry.getValue())
                .forEach(System.out::println);


    }
}
