package four.cisco;

public class SalaryException1{
static void SalaryCheck(int sal) throws EffortException {
if(sal<2000){
throw new EffortException("need to Work hard");
}
else if(2100<sal && sal<5000){
throw new EffortException("Salary somehow good");
}
else if(5100<sal && sal<9000){
throw new EffortException("salary very nice");
}
}
public static void main(String[] args) {
try {
SalaryCheck(5500);
} catch(Exception m){
System.out.println("Exception occured: "+m.getMessage());
}
System.out.println("rest of the code");
}
}
class EffortException extends Exception {
EffortException(String s){
super(s);
}
}
