package ch18;

import javax.jws.WebParam;

@ClassInfo(author = { "�ֹ���" }, value = "����")
public class MyClass {

	public void print(@WebParam(name="isbm") String isbn, String name) {}
}
