import java.util.Map;
import java.util.Set;

public class Negation extends Expr {

	private Expr expr;

	public Negation(Expr p) {
		this.expr = p;

	}

	@Override
	public boolean value(Map<Variable, Boolean> map) {
		return !expr.value(map);
	}

	@Override
	protected void collectVariables(Set<Variable> set) {
		expr.collectVariables(set);
	}

	@Override
	public String toString() {
		return expr.toString() + "'";
	}

}
