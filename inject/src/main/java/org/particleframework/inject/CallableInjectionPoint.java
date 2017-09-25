package org.particleframework.inject;

/**
 * A callable injection point is an injection point that accepts {@link Argument} instances.
 *
 * @author Graeme Rocher
 * @since 1.0
 */
public interface CallableInjectionPoint extends InjectionPoint {
    /**
     * The required argument types
     */
    Argument[] getArguments();
}