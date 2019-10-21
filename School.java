public class School {
public static void main(String args [])
{
 Book book = new Book();//default call constructor 
 book.setName("Let Us A");
 System.out.println(book.getName());
 Book book2 = new Book("Let Us B");
 System.out.println(book2);
 book2.setName("Let Us C");
 System.out.println(book2.getName());
}

}
