package Chain;

public interface Chain {
    void setNextChain (Chain NextChain);
    void calculator (Numbers request);
}
/***************************
 * What's the Chain of Responsibility ?
 this pattern has a group of objects that are expected to
 between them be able to solve the problem.
 If first object can't solve it, then just simply passes the
 data to chain.
 *
 *  [Client] ---> [ Chain  interface ]
 *                    /         \
 *                   /           \
 *                  /             \
 *            ----------         ------------
 *             AddNumber          Subtract Num.
 *            ----------          -------------
 */
