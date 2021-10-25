package baseline;

import java.util.ArrayList;
import java.util.List;

public class taskManagement {
    List<ToDoListFunctions> manager = new ArrayList<>();

    public void deleteLists(ToDoListFunctions s){
        //gets the list selected from the GUI to make sure it exists and removes it
    }

    public ToDoListFunctions createNewList(){
        ToDoListFunctions s = new ToDoListFunctions();
        //gets title, description and date from GUI
        return s;
    }

    public void editTitle(ToDoListFunctions s){
        //changes the title of the list by asking for a new name
    }
}
