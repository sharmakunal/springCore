import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {
    public static void main(String[] args) {

       /* Ques 1 and 2. Create a class Database with 2 instance variables port and name.
          Configure Database class bean in spring container through Spring XML. Initialize instance
          variables using setter method.
          Get the bean of the class from spring container and print the values of the instance variable.*/

        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        Database database = (Database) context.getBean("database");

        System.out.println(database.name + " : "+ database.port);

       /* Ques 3. Create a class Restaurant. Create an interface demo.HotDrink with an abstract method prepareHotDrink.
          Create two classes demo.Tea and demo.ExpressTea which implements demo.HotDrink Class. Create an instance variable
          of type demo.HotDrink in Restaurant class. Configure demo.Tea and demo.ExpressTea classes beans in Spring XML.
          create a bean with the name teaRestaurant of type Restaurant which inject demo.Tea object as
          dependency using setter method.*/

        Restaurant restuarant = (Restaurant)context.getBean("teaRestaurant");
        restuarant.getHotDrink().prepareHotDrink();

       /*Ques 4.Create a class Restaurant. Create an interface demo.HotDrink with an abstract method prepareHotDrink.
        Create two classes demo.Tea and demo.ExpressTea which implements demo.HotDrink Class. Create an instance variable of
        type demo.HotDrink in Restaurant class. Configure demo.Tea and demo.ExpressTea classes beans in Spring XML. create a
        bean with the name teaRestaurant of type Restaurant which inject demo.Tea object
        as dependency using setter method. */


        HotDrink hotDrinkTea=(HotDrink)context.getBean("tea");
        HotDrink hotDrinkExpressTea=(HotDrink)context.getBean("expressTea");
        hotDrinkTea.prepareHotDrink();
        hotDrinkExpressTea.prepareHotDrink();

        Restaurant restaurant2=(Restaurant)context.getBean("teaRestaurant1");
        restaurant2.getHotDrink().prepareHotDrink();

        /*
        Ques 5.Create Class Complex as follows: class complex {    List list;
           Set set;
          Map map;
          } Initialize all the instance variables of the complex class using Spring XML. Give bean name as
           complexBean. Get the bean and display the properties.
        */

       Complex complex=(Complex) context.getBean("complexBean");
       System.out.println(complex.getList());
       System.out.println(complex.getMap());
       System.out.println(complex.getSet());

        /*Ques 6.Autowire hotDrink in Restaurant with tea bean byName, byType and constructor.
          */
        Restaurant restaurant3=(Restaurant) context.getBean("teaRestaurant2");
        restaurant3.getHotDrink().prepareHotDrink();


        /* Ques 7.Set the scope of the teaRestaurant bean as proptotype and check the scope type
         after accessing the bean.*/

        System.out.println(context.isPrototype("teaRestaurant"));

       /*Que 8. Use @Required annotation for hotDrink setter method in Restaurant class.*/

       /*Que 9. Use @Autowired annotation to wire Tea with Restaurant class Using setter method,
        field and constructor.*/

        System.out.println(complex.getTeaRestaurant4());


       /*Que 10.Use @Component, @Controller, @Repository etc annotation to configure Tea and Restaurant
        in Spring Container.*/



    }
}