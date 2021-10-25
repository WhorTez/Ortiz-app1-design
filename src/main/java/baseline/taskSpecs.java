package baseline;

public class taskSpecs {
    String task;
    String description;
    String date;
    boolean completion = false;

    public String getTask(){
        //will get the name of the task to do from user
        return null;
    }

    public String getDescription(){
        //gets a brief description of the task to do from the user
        return null;
    }

    public String getDate(){
        //gets the date of when the task should be completed by in the format YYYY-MM-DD
        return null;
    }

    public taskSpecs createTask(){
        //will set the name, date and description for a new task
        //completion is false by default
        return null;
    }

    public void editDescription(){
        //takes a new description and replaces the previous one
    }

    public void editDate(){
        //takes a new due date from the user and replaces the old one
    }

    public void changesComplete(){
        //will change completion from false to true or true to false when activated
    }
}
