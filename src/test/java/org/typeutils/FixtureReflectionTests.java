package org.typeutils;

import java.lang.reflect.TypeVariable;
import java.util.List;

import org.typeutils.typewrapper.TypeWrapper;

public class FixtureReflectionTests {

	public static class SimpleParameterizedClass<T> {}
	public static final TypeVariable unboundTypeVariable = TypeWrapper.wrap(SimpleParameterizedClass.class).getTypeParameters()[0];
	
	public static class BoundVariableParameterizedClass<T extends List> {}
	public static final TypeVariable boundTypeVariable = TypeWrapper.wrap(BoundVariableParameterizedClass.class).getTypeParameters()[0];
}
