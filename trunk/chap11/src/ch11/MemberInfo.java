package ch11;

public class MemberInfo implements Comparable {
	private Integer id;
	private String name;
	
	public MemberInfo(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Object o) {
		if (this == o) {
			return 0;
		}
		MemberInfo other = (MemberInfo) o;
		return this.id.intValue() - other.id.intValue();
	}
	
	@Override
	public String toString() {
		return "id="+id+", name="+name;
	}
}
