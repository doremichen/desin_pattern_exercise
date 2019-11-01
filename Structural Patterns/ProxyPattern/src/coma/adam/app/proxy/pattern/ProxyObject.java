/**
 * Proxy of the real object
 */

package coma.adam.app.proxy.pattern;

public class ProxyObject implements IInterface {

    private RealObject mReal;

    @Override
    public void doSomething() {
        Utils.print(this, "doSomething");
        if (this.mReal == null) {
            mReal = new RealObject();
        }

        mReal.doSomething();
    }

}
