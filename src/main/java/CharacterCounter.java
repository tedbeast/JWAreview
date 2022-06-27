public class CharacterCounter {
    int count;
//    public - the method is accessible outside of this class file
//    int - we need to tell java the thing that is returned from the method
//    getCount - the name of method
//    () - within the parentheses, we may add variables that are required for some operation
//    return - the method can give some variable back to whatever called it
    public int getCount(){
        return count;
    }
    public void setCount(int n){
        count = n;
    }
}
