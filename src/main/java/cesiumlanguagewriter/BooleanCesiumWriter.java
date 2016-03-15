package cesiumlanguagewriter;


import agi.foundation.compatibility.*;
import agi.foundation.compatibility.Func1;
import agi.foundation.compatibility.Lazy;
import cesiumlanguagewriter.advanced.*;
import cesiumlanguagewriter.Reference;

/**
 *  
 Writes a <code>Boolean</code> to a  {@link CesiumOutputStream}.  A <code>Boolean</code> represents a boolean value.
 

 */
public class BooleanCesiumWriter extends CesiumPropertyWriter<BooleanCesiumWriter> {
	/**
	 *  
	The name of the <code>boolean</code> property.
	

	 */
	public static final String BooleanPropertyName = "boolean";
	/**
	 *  
	The name of the <code>reference</code> property.
	

	 */
	public static final String ReferencePropertyName = "reference";
	private Lazy<ICesiumValuePropertyWriter<Boolean>> m_asBoolean;
	private Lazy<ICesiumValuePropertyWriter<Reference>> m_asReference;

	/**
	 *  
	Initializes a new instance.
	

	 */
	public BooleanCesiumWriter(String propertyName) {
		super(propertyName);
		m_asBoolean = new Lazy<ICesiumValuePropertyWriter<Boolean>>(new Func1<ICesiumValuePropertyWriter<Boolean>>(this,
				"createBooleanAdaptor", new Class[] {}) {
			public ICesiumValuePropertyWriter<Boolean> invoke() {
				return createBooleanAdaptor();
			}
		}, false);
		m_asReference = new Lazy<ICesiumValuePropertyWriter<Reference>>(new Func1<ICesiumValuePropertyWriter<Reference>>(this,
				"createReferenceAdaptor", new Class[] {}) {
			public ICesiumValuePropertyWriter<Reference> invoke() {
				return createReferenceAdaptor();
			}
		}, false);
	}

	/**
	 *  
	Initializes a new instance as a copy of an existing instance.
	
	

	 * @param existingInstance The existing instance to copy.
	 */
	protected BooleanCesiumWriter(BooleanCesiumWriter existingInstance) {
		super(existingInstance);
		m_asBoolean = new Lazy<ICesiumValuePropertyWriter<Boolean>>(new Func1<ICesiumValuePropertyWriter<Boolean>>(this,
				"createBooleanAdaptor", new Class[] {}) {
			public ICesiumValuePropertyWriter<Boolean> invoke() {
				return createBooleanAdaptor();
			}
		}, false);
		m_asReference = new Lazy<ICesiumValuePropertyWriter<Reference>>(new Func1<ICesiumValuePropertyWriter<Reference>>(this,
				"createReferenceAdaptor", new Class[] {}) {
			public ICesiumValuePropertyWriter<Reference> invoke() {
				return createReferenceAdaptor();
			}
		}, false);
	}

	@Override
	public BooleanCesiumWriter clone() {
		return new BooleanCesiumWriter(this);
	}

	/**
	 *  
	Writes the <code>boolean</code> property.  The <code>boolean</code> property specifies the boolean value.
	
	

	 * @param value The value.
	 */
	public final void writeBoolean(boolean value) {
		String PropertyName = BooleanPropertyName;
		if (getForceInterval()) {
			openIntervalIfNecessary();
		}
		if (getIsInterval()) {
			getOutput().writePropertyName(PropertyName);
		}
		getOutput().writeValue(value);
	}

	/**
	 *  
	Writes the <code>reference</code> property.  The <code>reference</code> property specifies the boolean specified as a reference to another property.
	
	

	 * @param value The reference.
	 */
	public final void writeReference(Reference value) {
		String PropertyName = ReferencePropertyName;
		openIntervalIfNecessary();
		getOutput().writePropertyName(PropertyName);
		CesiumWritingHelper.writeReference(getOutput(), value);
	}

	/**
	 *  
	Writes the <code>reference</code> property.  The <code>reference</code> property specifies the boolean specified as a reference to another property.
	
	

	 * @param value The earliest date of the interval.
	 */
	public final void writeReference(String value) {
		String PropertyName = ReferencePropertyName;
		openIntervalIfNecessary();
		getOutput().writePropertyName(PropertyName);
		CesiumWritingHelper.writeReference(getOutput(), value);
	}

	/**
	 *  
	Writes the <code>reference</code> property.  The <code>reference</code> property specifies the boolean specified as a reference to another property.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyName The property on the referenced object.
	 */
	public final void writeReference(String identifier, String propertyName) {
		String PropertyName = ReferencePropertyName;
		openIntervalIfNecessary();
		getOutput().writePropertyName(PropertyName);
		CesiumWritingHelper.writeReference(getOutput(), identifier, propertyName);
	}

	/**
	 *  
	Writes the <code>reference</code> property.  The <code>reference</code> property specifies the boolean specified as a reference to another property.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
	 */
	public final void writeReference(String identifier, String[] propertyNames) {
		String PropertyName = ReferencePropertyName;
		openIntervalIfNecessary();
		getOutput().writePropertyName(PropertyName);
		CesiumWritingHelper.writeReference(getOutput(), identifier, propertyNames);
	}

	/**
	 *  
	Returns a wrapper for this instance that implements  {@link ICesiumValuePropertyWriter} to write a value in <code>Boolean</code> format.  Because the returned instance is a wrapper for this instance, you may call  {@link ICesiumElementWriter#close} on either this instance or the wrapper, but you must not call it on both.
	
	

	 * @return The wrapper.
	 */
	public final ICesiumValuePropertyWriter<Boolean> asBoolean() {
		return m_asBoolean.getValue();
	}

	final private ICesiumValuePropertyWriter<Boolean> createBooleanAdaptor() {
		return new CesiumWriterAdaptor<BooleanCesiumWriter, Boolean>(this, new CesiumWriterAdaptorWriteCallback<BooleanCesiumWriter, Boolean>() {
			public void invoke(BooleanCesiumWriter me, Boolean value) {
				me.writeBoolean(value);
			}
		});
	}

	/**
	 *  
	Returns a wrapper for this instance that implements  {@link ICesiumValuePropertyWriter} to write a value in <code>Reference</code> format.  Because the returned instance is a wrapper for this instance, you may call  {@link ICesiumElementWriter#close} on either this instance or the wrapper, but you must not call it on both.
	
	

	 * @return The wrapper.
	 */
	public final ICesiumValuePropertyWriter<Reference> asReference() {
		return m_asReference.getValue();
	}

	final private ICesiumValuePropertyWriter<Reference> createReferenceAdaptor() {
		return new CesiumWriterAdaptor<BooleanCesiumWriter, Reference>(this,
				new CesiumWriterAdaptorWriteCallback<BooleanCesiumWriter, Reference>() {
					public void invoke(BooleanCesiumWriter me, Reference value) {
						me.writeReference(value);
					}
				});
	}
}