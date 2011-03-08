package ch11;

import java.util.Comparator;

public class MemberInfoComparator implements Comparator<MemberInfo> {

	@Override
	public int compare(MemberInfo o1, MemberInfo o2) {
		return o1.getId() - o2.getId();
	}

}
