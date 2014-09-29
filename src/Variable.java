import java.util.Map;
import java.util.Set;

public class Variable extends Expr {
	String name;

	public Variable(String name) {
		this.name = name;
	}


	@Override
	public boolean value(Map<Variable, Boolean> map) {
		if (map.containsKey(this)) {
			return map.get(this);
		}else throw new IllegalArgumentException("Expression does not exist");
		
	}

	@Override
	protected void collectVariables(Set<Variable> set) {
		set.add(this);

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Variable other = (Variable) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		
		return name;
	}

}
