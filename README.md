# ME_ENCAPSULATION_JAVA

> A Project Repository for Encapsulation Byte in Java

*Encapsulation is grouping all related functionality in one place. Apart from being cohesive (related fields and methods being together), it helps in securing the data fields of an object from being altered directly by external methods or objects. Interactions (reading or changing) with data fields of the object should happen only via methods that the object provides. This safeguards the data stored in the object from system-wide access.*

#### Summary of Encapsulation
-   **Why** is it useful? - Sets the stage to restrict access to data fields and keeps the object in control of what fields can be modified and how. Ensures consistent behavior across users of this object.
-   **Where** to apply? - While designing any class that has data fields and needs methods to be supported for their reading or modification.
-   **How** to apply? - Provide public methods for reading or updating the data fields in the class only as needed. E.g. get() or set() methods.
-   **What** is the drawback if we don’t use encapsulation? - Duplication of code. Low maintainability. Inconsistent behavior. Difficult to test. Possible inappropriate access/modification from external methods.

#### Practical Scenarios
-   Data gets passed between method/function calls all the time. With increasing complexity, we will end up passing more and more variables between methods which are related to a common cause. It is best to model these variables as a single object and pass the object between the methods. Encapsulation ensures only the necessary sections of the object are modifiable across all the methods.
-   Simple example: Passing variables to represent a matrix - a 2D array, number of rows, number of columns - can be replaced by a matrix object.
-   Another example: A product for sale has these fields - price, category, discount percentage, vendor name etc. These can be modeled as an object with methods to change the price, discount etc.
-   Having encapsulation ensures that situations like renaming of a variable doesn’t impact the external methods that are using the class method to get or set this variable.
-   Let’s say you want to withdraw money from your bank account through an ATM. The machine allows you to perform certain operations only after once the user identity is established. There are certain steps involved which take care to identify you with the help of an in hand debit/ credit card. There is no direct variable access provided to the user to manually change the amount in his/her account. There are methods which are restricted from doing such activity. End user won’t know the implementation details behind the login validations process as it is hidden. Here, Encapsulation plays an important role to protect unauthorized access to users and also perform its job correctly.

#### General rules of Encapsulation
1.  **Restrict access**: Declare all data members as private. In addition, keep all methods that do not need to be called by external program components private. Create public methods to provide a controlled interface between the object’s data and all external program components.
2.  **Know the limits:** Familiarize yourself with the range of valid values for each data element being stored in the class.
3.  **Initialize the data**: Set all the data elements to valid initial values for an empty or non-existent object using a default constructor.
4.  **Choose the data types wisely**: Be sure to choose integer types that are large enough to hold all the valid values that will be stored on each type of computer that will be used.
5.  **Validate the input:** Check input for validity before changing the data values stored in the object.
6.  **Double check all operations performed**: Be sure that any operations that change the data, such as incrementing the time, maintain the validity of all the data elements.

#### References

1.  [OOPS Concepts in Java - Encapsulation](https://raygun.com/blog/oop-concepts-java/%23encapsulation)
2.  [How to explain OOPS concepts to a 6-year old?](https://www.freecodecamp.org/news/object-oriented-programming-concepts-21bb035f7260/)
3.  [Why should Encapsulation be used?](https://medium.com/javarevisited/why-should-encapsulation-to-be-used-e82a81f5c47c)
4.  [What is the idea of encapsulation, since setter and getter methods are exposed?](https://www.quora.com/What-is-the-idea-of-encapsulation-since-setter-and-getter-methods-are-exposed)
5.  [Encapsulation – CS2 – Java (towson.edu)](https://cisserv1.towson.edu/~cssecinj/modules/other-modules/build-the-lab/build-the-lab-lab-module-1/encapsulation-java/)

#### Encapsulation and Abstraction vs Inheritance
-   Encapsulation and Abstraction are helpful to develop and maintain a big codebase.
-   When there are similar objects in this big codebase that share common functionality, the common functionality and fields can be separated out into a separate base class which is then inherited by child classes.
