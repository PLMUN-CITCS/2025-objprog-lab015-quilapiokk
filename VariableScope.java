public class VariableScope{
    static int global = 100;
    
    public static void main (String[] args){
        System.out.println("Global Count (from main): " + global);
        
        showScope();
    }
    public static void showScope() {
        int localCount = 50;
        
        System.out.println("Global Count (from showScope): " + global);
        System.out.println("Local Count (from showScope): " + localCount);
    }
}