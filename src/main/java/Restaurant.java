import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

interface HotDrink  {
    public void prepareHotDrink();
}

 class Tea implements HotDrink{
     @Override
     public void prepareHotDrink() {
         System.out.println("Tea");
     }

     @Override
     public String toString() {
         return "Tea{}";
     }
 }

class ExpressTea implements HotDrink{

    @Override
    public void prepareHotDrink() {
        System.out.println("Express Tea");
    }
}
@Component
public class Restaurant{

    HotDrink hotDrink;

    public HotDrink getHotDrink() {
        return hotDrink;
    }

//    @Qualifier("Tea")

    @Required
    //@Qualifier("tea")
    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "hotDrink=" + hotDrink +
                '}';
    }
}
