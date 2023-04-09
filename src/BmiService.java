public class BmiService {
    public int calculate(int bodyМass, double height) {
        double result = bodyМass / (height * height);
        return(int) result;
    }
}
