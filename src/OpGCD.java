
public class OpGCD implements Operation {
    @Override
    public int exec(int a, int b) {
        if (b == 0)
            return Math.abs(a);
        return exec(b, a % b);
    }
}
