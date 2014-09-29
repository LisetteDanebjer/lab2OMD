import java.util.Map;
import java.util.Set;

public class Implikation extends Expr {

	private Expr expr1, expr2;

	public Implikation(Expr a, Expr b) {
		this.expr1 = a;
		this.expr2 = b;
	}

	@Override
	public boolean value(Map<Variable, Boolean> map) {
		if (expr1.value(map) && !expr2.value(map)) {
			return false;
		} else
			return true;

	}

	@Override
	protected void collectVariables(Set<Variable> set) {
		expr1.collectVariables(set);
		expr2.collectVariables(set);
	}

	@Override
	public String toString() {
		return expr1.toString() + "->" + expr2.toString();
	}

}
