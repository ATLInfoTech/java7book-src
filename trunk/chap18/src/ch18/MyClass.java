package ch18;

import javax.jws.WebParam;

@ClassInfo(author = { "최범균" }, value = "정보")
public class MyClass {

	public void print(@WebParam(name="isbm") String isbn, String name) {}
}
