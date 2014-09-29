import java.util.Map;
import java.util.Set;

public class Diskonjuktion extends Expr {

	private Expr expr1, expr2;

	public Diskonjuktion (Expr a, Expr b) {
		this.expr1 = a;
		this.expr2 = b;
	}

	public boolean value(Map<Variable, Boolean> map) {
		return (expr1.value(map) || expr2.value(map));
	}

	protected void collectVariables(Set<Variable> set) {
		expr1.collectVariables(set);
		expr2.collectVariables(set);
	}

	@Override
	public String toString() {
		return expr1.toString() + "v" + expr2.toString();
	}

}
