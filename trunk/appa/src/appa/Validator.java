package appa;

/**
 * 값을 검증한다.
 * 
 * @author 최범균
 * 
 */
public interface Validator {

	/**
	 * obj의 값을 검증한다. 검증에 통과하지 못할 경우 예외를 발생시킨다.
	 * 
	 * @param obj
	 */
	void validate(Object obj);
}
