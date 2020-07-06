package innerClass;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by weixiao on 2018/9/19.
 * The reusable framework for control systems
 */
public class Controller {
    private List<Event> eventList = new ArrayList<Event>();
    public void addEvent(Event c){
        eventList.add(c);
    }
    public void run(){
        while(eventList.size() > 0){
            for(Event e:new ArrayList<Event>(eventList)){
                if(e.ready()){
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
            }
        }
    }
}
