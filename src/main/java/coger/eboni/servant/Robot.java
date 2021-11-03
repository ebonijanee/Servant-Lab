package coger.eboni.servant;

public class Robot {
    private String name;
    private String modelNumber;

    public Robot(String name, String modelNumber){
        this.name= name;
        this.modelNumber= modelNumber;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getmodelNumber(){
        return modelNumber;
    }

    public void modelNumber(String modelNumber){
        this.modelNumber=modelNumber;
    }
}
