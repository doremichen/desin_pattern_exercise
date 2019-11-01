/**
 * Real object
 */

package coma.adam.app.proxy.pattern;

public class RealObject implements IInterface {

    public RealObject() {
        init();
    }

    private void init() {
        Utils.print(this, "init");
    }

    @Override
    public void doSomething() {
        Utils.print(this, "doSomething");
    }

}
