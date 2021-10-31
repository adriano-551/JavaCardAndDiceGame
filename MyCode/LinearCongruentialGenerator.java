//Simply taking the same code from the previous iteration

public class LinearCongruentialGenerator implements RandomInterface {

  private long a, c, m, seed;

  public LinearCongruentialGenerator(long a_value, long c_value, long m_value, long s_value) {
    a=a_value; c=c_value; m=m_value; seed=s_value;
  }

  public LinearCongruentialGenerator(long seed) {
    this(1664525, 1013904223, 4294967296l, seed);
  }

  public LinearCongruentialGenerator() {
    this(0);

    seed=System.currentTimeMillis() % m;
  }

  public double next() {
    seed = (a * seed + c) % m;
    return (double) seed/m;
  }
}