package cesiumlanguagewriter;


import agi.foundation.compatibility.*;
import agi.foundation.compatibility.Func1;
import agi.foundation.compatibility.Lazy;
import cesiumlanguagewriter.advanced.*;
import cesiumlanguagewriter.Reference;
import cesiumlanguagewriter.UnitQuaternion;
import java.util.List;

/**
 *  
 Writes a <code>Orientation</code> to a  {@link CesiumOutputStream}.  A <code>Orientation</code> defines an orientation.  An orientation is a rotation that takes a vector expressed in the "body" axes of the object and transforms it to the Earth fixed axes.
 

 */
public class OrientationCesiumWriter extends CesiumInterpolatablePropertyWriter<OrientationCesiumWriter> {
	/**
	 *  
	The name of the <code>unitQuaternion</code> property.
	

	 */
	public static final String UnitQuaternionPropertyName = "unitQuaternion";
	/**
	 *  
	The name of the <code>reference</code> property.
	

	 */
	public static final String ReferencePropertyName = "reference";
	private Lazy<ICesiumInterpolatableValuePropertyWriter<UnitQuaternion>> m_asUnitQuaternion;
	private Lazy<ICesiumValuePropertyWriter<Reference>> m_asReference;

	/**
	 *  
	Initializes a new instance.
	

	 */
	public OrientationCesiumWriter(String propertyName) {
		super(propertyName);
		m_asUnitQuaternion = new Lazy<ICesiumInterpolatableValuePropertyWriter<UnitQuaternion>>(
				new Func1<ICesiumInterpolatableValuePropertyWriter<UnitQuaternion>>(this, "createUnitQuaternionAdaptor", new Class[] {}) {
					public ICesiumInterpolatableValuePropertyWriter<UnitQuaternion> invoke() {
						return createUnitQuaternionAdaptor();
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
	protected OrientationCesiumWriter(OrientationCesiumWriter existingInstance) {
		super(existingInstance);
		m_asUnitQuaternion = new Lazy<ICesiumInterpolatableValuePropertyWriter<UnitQuaternion>>(
				new Func1<ICesiumInterpolatableValuePropertyWriter<UnitQuaternion>>(this, "createUnitQuaternionAdaptor", new Class[] {}) {
					public ICesiumInterpolatableValuePropertyWriter<UnitQuaternion> invoke() {
						return createUnitQuaternionAdaptor();
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
	public OrientationCesiumWriter clone() {
		return new OrientationCesiumWriter(this);
	}

	/**
	 *  
	Writes the <code>unitQuaternion</code> property.  The <code>unitQuaternion</code> property specifies the orientation represented as a 4-dimensional quaternion, specified as `[X, Y, Z, W]`.  If the array has four elements, the value is constant.  If it has five or more elements, they are time-tagged samples arranged as `[Time, X, Y, Z, W, Time, X, Y, Z, W, ...]`, where Time is an ISO 8601 date and time string or seconds since epoch.
	
	

	 * @param value The value.
	 */
	public final void writeUnitQuaternion(UnitQuaternion value) {
		String PropertyName = UnitQuaternionPropertyName;
		openIntervalIfNecessary();
		getOutput().writePropertyName(PropertyName);
		CesiumWritingHelper.writeUnitQuaternion(getOutput(), value);
	}

	/**
	 *  
	Writes the <code>unitQuaternion</code> property.  The <code>unitQuaternion</code> property specifies the orientation represented as a 4-dimensional quaternion, specified as `[X, Y, Z, W]`.  If the array has four elements, the value is constant.  If it has five or more elements, they are time-tagged samples arranged as `[Time, X, Y, Z, W, Time, X, Y, Z, W, ...]`, where Time is an ISO 8601 date and time string or seconds since epoch.
	
	
	

	 * @param dates The dates at which the rotation is specified.
	 * @param values The values corresponding to each date.
	 */
	public final void writeUnitQuaternion(List<JulianDate> dates, List<UnitQuaternion> values) {
		writeUnitQuaternion(dates, values, 0, dates.size());
	}

	/**
	 *  
	Writes the <code>unitQuaternion</code> property.  The <code>unitQuaternion</code> property specifies the orientation represented as a 4-dimensional quaternion, specified as `[X, Y, Z, W]`.  If the array has four elements, the value is constant.  If it has five or more elements, they are time-tagged samples arranged as `[Time, X, Y, Z, W, Time, X, Y, Z, W, ...]`, where Time is an ISO 8601 date and time string or seconds since epoch.
	
	
	
	
	

	 * @param dates The dates at which the rotation is specified.
	 * @param values The values corresponding to each date.
	 * @param startIndex The index of the first element to use in the `values` collection.
	 * @param length The number of elements to use from the `values` collection.
	 */
	public final void writeUnitQuaternion(List<JulianDate> dates, List<UnitQuaternion> values, int startIndex, int length) {
		String PropertyName = UnitQuaternionPropertyName;
		openIntervalIfNecessary();
		CesiumWritingHelper.writeUnitQuaternion(getOutput(), PropertyName, dates, values, startIndex, length);
	}

	/**
	 *  
	Writes the <code>reference</code> property.  The <code>reference</code> property specifies the orientation specified as a reference to another property.
	
	

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
	Writes the <code>reference</code> property.  The <code>reference</code> property specifies the orientation specified as a reference to another property.
	
	

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
	Writes the <code>reference</code> property.  The <code>reference</code> property specifies the orientation specified as a reference to another property.
	
	
	

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
	Writes the <code>reference</code> property.  The <code>reference</code> property specifies the orientation specified as a reference to another property.
	
	
	

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
	Returns a wrapper for this instance that implements  {@link ICesiumInterpolatableValuePropertyWriter} to write a value in <code>UnitQuaternion</code> format.  Because the returned instance is a wrapper for this instance, you may call  {@link ICesiumElementWriter#close} on either this instance or the wrapper, but you must not call it on both.
	
	

	 * @return The wrapper.
	 */
	public final ICesiumInterpolatableValuePropertyWriter<UnitQuaternion> asUnitQuaternion() {
		return m_asUnitQuaternion.getValue();
	}

	final private ICesiumInterpolatableValuePropertyWriter<UnitQuaternion> createUnitQuaternionAdaptor() {
		return new CesiumInterpolatableWriterAdaptor<OrientationCesiumWriter, UnitQuaternion>(this,
				new CesiumWriterAdaptorWriteCallback<OrientationCesiumWriter, UnitQuaternion>() {
					public void invoke(OrientationCesiumWriter me, UnitQuaternion value) {
						me.writeUnitQuaternion(value);
					}
				}, new CesiumWriterAdaptorWriteSamplesCallback<OrientationCesiumWriter, UnitQuaternion>() {
					public void invoke(OrientationCesiumWriter me, List<JulianDate> dates, List<UnitQuaternion> values, int startIndex, int length) {
						me.writeUnitQuaternion(dates, values, startIndex, length);
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
		return new CesiumWriterAdaptor<OrientationCesiumWriter, Reference>(this,
				new CesiumWriterAdaptorWriteCallback<OrientationCesiumWriter, Reference>() {
					public void invoke(OrientationCesiumWriter me, Reference value) {
						me.writeReference(value);
					}
				});
	}
}