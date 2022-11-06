import java.util.LinkedList;
import java.util.List;
/**
 * The MrCoxall stack.
 *
 * @author  Yiyun Qin
 * @version 1.0
 * @since   2022-11-06
 */

public class MrCoxallStack {
  /**
   * a list that contains the input number.
   *
   */
  LinkedList<String> stackAsList = new LinkedList<String>();

  /**
   * The getStack() getter.
   *
   * @return stackAsList
   */
  public List<String> getStack() {
    return stackAsList;
  }

  /**
   * The push() setter.
   *
   */

  public void push(int someNumber) {
    stackAsList.add(String.valueOf(someNumber));
  }

  /**
   * The pop() setter.
   *
   */
  public String pop() {
    int index = stackAsList.size() - 1;
    final String popNumber;
    if (index != 0) {
      popNumber = stackAsList.remove(index);
    } else {
      popNumber = "Nothing in the list!";
    }
    return popNumber;
  }

  /**
   * The peek() setter, show the number on the top of the list.
   *
   */
  public String peek() {
    int index = stackAsList.size() - 1;
    final String peekNumber;
    if (index != 0) {
      peekNumber = stackAsList.peekLast();
    } else {
      peekNumber = "Nothing in the list!";
    }
    return peekNumber;
  }
}
