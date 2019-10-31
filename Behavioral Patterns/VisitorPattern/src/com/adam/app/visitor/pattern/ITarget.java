/**
 * Interface of target
 */
package com.adam.app.visitor.pattern;

public interface ITarget {
    int accept(IVisitor visitor);
}
