import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Controller
public class Complex {
    Restaurant teaRestaurant4;
    List list;
    Set set;
    Map map;

    public Complex(List list, Set set, Map map) {
        this.list = list;
        this.set = set;
        this.map = map;
    }

    public Complex() {
    }

    public Restaurant getTeaRestaurant4() {
        return teaRestaurant4;
    }
@Autowired
    public void setTeaRestaurant4(Restaurant teaRestaurant4) {
        this.teaRestaurant4 = teaRestaurant4;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Complex{" +
                "teaRestaurant4=" + teaRestaurant4 +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                '}';
    }
}


