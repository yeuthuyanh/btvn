public class Saler{
    private String name;
    private double sales;
    public Saler (){
    }
    public Saler (String name, double sales){
    }
    public String getName (){
        return name;
    public void setName (){
        this.name=name;
    public String getSales (){
        return sales;
    }
    public void setSales (){
        this.sales=sales;
    }
    public double getBonus (){
        return this.sales 5/100;
    }
public class Trainee extend Salerstatic {
    
    public Trainee(){
        
    }   
    
    public Trainee(String name, double sales){
        super(name, sales);
    }

    @Override
    public double getBonus(){
        return 0;
    }
    
}
