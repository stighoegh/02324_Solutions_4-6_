import java.io.Serializable;

public class Complex implements Serializable	{
	private static final long serialVersionUID = 1L;
	protected  double re;
	protected double im;
	public Complex(double x,double y){
		this.re=x;
		this.im=y;
	}

	public String toString(){
		if (im == 0) return re + "";
        if (re == 0) return im + "i";
        if (im <  0) return re + " - " + (-im) + "i";
        return re + " + " + im + "i";
	}
}
