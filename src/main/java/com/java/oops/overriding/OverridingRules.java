package com.java.oops.overriding;

public class OverridingRules
{
	// 1. Method names and argument types must be same i.e. method signatures must be same.
}

// 2. In Overriding, return types must be same but this rule is applicable until 1.4v only. From 1.5v onwards, we
// can take covarient return types. According to this, child class method return type need not be same as parent
// method return type. Its child type also allowed.
class Parent1
{
	public Object mehtod1()
	{
		return null;
	}
}

class Child extends Parent1
{
	public String method1()
	{
		return null;
	}
}

// 3. Covarient return type concept applicable only for Object types but not for primitive types.

// Consider below example:
/** Valid Examples **/
// Parent class return type: Object > Child class return type: Object or String or StringBuffer
// Parent class return type: Number > Child class return type: Number or Integer or Float
/** Invalid Examples **/
// Parent class return type: String > Child class return type: Object
// Parent class return type: double > Child class return type: int
