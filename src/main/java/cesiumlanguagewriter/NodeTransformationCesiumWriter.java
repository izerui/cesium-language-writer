package cesiumlanguagewriter;


import agi.foundation.compatibility.*;
import agi.foundation.compatibility.DisposeHelper;
import agi.foundation.compatibility.Func1;
import agi.foundation.compatibility.Lazy;
import cesiumlanguagewriter.advanced.*;
import cesiumlanguagewriter.OrientationCesiumWriter;
import cesiumlanguagewriter.ScaleCesiumWriter;
import cesiumlanguagewriter.TranslationCesiumWriter;
import java.util.List;

/**
 *  
 Writes a <code>NodeTransformation</code> to a  {@link CesiumOutputStream}.  A <code>NodeTransformation</code> transformations to apply to a particular node in a 3D model.
 

 */
public class NodeTransformationCesiumWriter extends CesiumPropertyWriter<NodeTransformationCesiumWriter> {
	/**
	 *  
	The name of the <code>scale</code> property.
	

	 */
	public static final String ScalePropertyName = "scale";
	/**
	 *  
	The name of the <code>translation</code> property.
	

	 */
	public static final String TranslationPropertyName = "translation";
	/**
	 *  
	The name of the <code>rotation</code> property.
	

	 */
	public static final String RotationPropertyName = "rotation";
	private Lazy<ScaleCesiumWriter> m_scale = new Lazy<ScaleCesiumWriter>(new Func1<ScaleCesiumWriter>() {
		public ScaleCesiumWriter invoke() {
			return new ScaleCesiumWriter(ScalePropertyName);
		}
	}, false);
	private Lazy<TranslationCesiumWriter> m_translation = new Lazy<TranslationCesiumWriter>(new Func1<TranslationCesiumWriter>() {
		public TranslationCesiumWriter invoke() {
			return new TranslationCesiumWriter(TranslationPropertyName);
		}
	}, false);
	private Lazy<OrientationCesiumWriter> m_rotation = new Lazy<OrientationCesiumWriter>(new Func1<OrientationCesiumWriter>() {
		public OrientationCesiumWriter invoke() {
			return new OrientationCesiumWriter(RotationPropertyName);
		}
	}, false);

	/**
	 *  
	Initializes a new instance.
	

	 */
	public NodeTransformationCesiumWriter(String propertyName) {
		super(propertyName);
	}

	/**
	 *  
	Initializes a new instance as a copy of an existing instance.
	
	

	 * @param existingInstance The existing instance to copy.
	 */
	protected NodeTransformationCesiumWriter(NodeTransformationCesiumWriter existingInstance) {
		super(existingInstance);
	}

	@Override
	public NodeTransformationCesiumWriter clone() {
		return new NodeTransformationCesiumWriter(this);
	}

	/**
	 *  Gets the writer for the <code>scale</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>scale</code> property defines the scaling applied to the model node.
	

	 */
	public final ScaleCesiumWriter getScaleWriter() {
		return m_scale.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>scale</code> property.  The <code>scale</code> property defines the scaling applied to the model node.
	

	 */
	public final ScaleCesiumWriter openScaleProperty() {
		openIntervalIfNecessary();
		return this.<ScaleCesiumWriter> openAndReturn(getScaleWriter());
	}

	/**
	 *  
	Writes a value for the <code>scale</code> property as a <code>cartesian</code> value.  The <code>scale</code> property specifies the scaling applied to the model node.
	
	

	 * @param value The value.
	 */
	public final void writeScaleProperty(Cartesian value) {
		{
			ScaleCesiumWriter writer = openScaleProperty();
			try {
				writer.writeCartesian(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>scale</code> property as a <code>cartesian</code> value.  The <code>scale</code> property specifies the scaling applied to the model node.
	
	
	

	 * @param dates The dates at which the vector is specified.
	 * @param values The values corresponding to each date.
	 */
	public final void writeScaleProperty(List<JulianDate> dates, List<Cartesian> values) {
		{
			ScaleCesiumWriter writer = openScaleProperty();
			try {
				writer.writeCartesian(dates, values);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>scale</code> property as a <code>cartesian</code> value.  The <code>scale</code> property specifies the scaling applied to the model node.
	
	
	
	
	

	 * @param dates The dates at which the vector is specified.
	 * @param values The values corresponding to each date.
	 * @param startIndex The index of the first element to use in the `values` collection.
	 * @param length The number of elements to use from the `values` collection.
	 */
	public final void writeScaleProperty(List<JulianDate> dates, List<Cartesian> values, int startIndex, int length) {
		{
			ScaleCesiumWriter writer = openScaleProperty();
			try {
				writer.writeCartesian(dates, values, startIndex, length);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>scale</code> property as a <code>reference</code> value.  The <code>scale</code> property specifies the scaling applied to the model node.
	
	

	 * @param value The reference.
	 */
	public final void writeScalePropertyReference(Reference value) {
		{
			ScaleCesiumWriter writer = openScaleProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>scale</code> property as a <code>reference</code> value.  The <code>scale</code> property specifies the scaling applied to the model node.
	
	

	 * @param value The earliest date of the interval.
	 */
	public final void writeScalePropertyReference(String value) {
		{
			ScaleCesiumWriter writer = openScaleProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>scale</code> property as a <code>reference</code> value.  The <code>scale</code> property specifies the scaling applied to the model node.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyName The property on the referenced object.
	 */
	public final void writeScalePropertyReference(String identifier, String propertyName) {
		{
			ScaleCesiumWriter writer = openScaleProperty();
			try {
				writer.writeReference(identifier, propertyName);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>scale</code> property as a <code>reference</code> value.  The <code>scale</code> property specifies the scaling applied to the model node.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
	 */
	public final void writeScalePropertyReference(String identifier, String[] propertyNames) {
		{
			ScaleCesiumWriter writer = openScaleProperty();
			try {
				writer.writeReference(identifier, propertyNames);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  Gets the writer for the <code>translation</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>translation</code> property defines the translation applied to the model node.
	

	 */
	public final TranslationCesiumWriter getTranslationWriter() {
		return m_translation.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>translation</code> property.  The <code>translation</code> property defines the translation applied to the model node.
	

	 */
	public final TranslationCesiumWriter openTranslationProperty() {
		openIntervalIfNecessary();
		return this.<TranslationCesiumWriter> openAndReturn(getTranslationWriter());
	}

	/**
	 *  
	Writes a value for the <code>translation</code> property as a <code>cartesian</code> value.  The <code>translation</code> property specifies the translation applied to the model node.
	
	

	 * @param value The value.
	 */
	public final void writeTranslationProperty(Cartesian value) {
		{
			TranslationCesiumWriter writer = openTranslationProperty();
			try {
				writer.writeCartesian(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>translation</code> property as a <code>cartesian</code> value.  The <code>translation</code> property specifies the translation applied to the model node.
	
	
	

	 * @param dates The dates at which the vector is specified.
	 * @param values The values corresponding to each date.
	 */
	public final void writeTranslationProperty(List<JulianDate> dates, List<Cartesian> values) {
		{
			TranslationCesiumWriter writer = openTranslationProperty();
			try {
				writer.writeCartesian(dates, values);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>translation</code> property as a <code>cartesian</code> value.  The <code>translation</code> property specifies the translation applied to the model node.
	
	
	
	
	

	 * @param dates The dates at which the vector is specified.
	 * @param values The values corresponding to each date.
	 * @param startIndex The index of the first element to use in the `values` collection.
	 * @param length The number of elements to use from the `values` collection.
	 */
	public final void writeTranslationProperty(List<JulianDate> dates, List<Cartesian> values, int startIndex, int length) {
		{
			TranslationCesiumWriter writer = openTranslationProperty();
			try {
				writer.writeCartesian(dates, values, startIndex, length);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>translation</code> property as a <code>reference</code> value.  The <code>translation</code> property specifies the translation applied to the model node.
	
	

	 * @param value The reference.
	 */
	public final void writeTranslationPropertyReference(Reference value) {
		{
			TranslationCesiumWriter writer = openTranslationProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>translation</code> property as a <code>reference</code> value.  The <code>translation</code> property specifies the translation applied to the model node.
	
	

	 * @param value The earliest date of the interval.
	 */
	public final void writeTranslationPropertyReference(String value) {
		{
			TranslationCesiumWriter writer = openTranslationProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>translation</code> property as a <code>reference</code> value.  The <code>translation</code> property specifies the translation applied to the model node.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyName The property on the referenced object.
	 */
	public final void writeTranslationPropertyReference(String identifier, String propertyName) {
		{
			TranslationCesiumWriter writer = openTranslationProperty();
			try {
				writer.writeReference(identifier, propertyName);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>translation</code> property as a <code>reference</code> value.  The <code>translation</code> property specifies the translation applied to the model node.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
	 */
	public final void writeTranslationPropertyReference(String identifier, String[] propertyNames) {
		{
			TranslationCesiumWriter writer = openTranslationProperty();
			try {
				writer.writeReference(identifier, propertyNames);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  Gets the writer for the <code>rotation</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>rotation</code> property defines the rotation to apply to the model node.
	

	 */
	public final OrientationCesiumWriter getRotationWriter() {
		return m_rotation.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>rotation</code> property.  The <code>rotation</code> property defines the rotation to apply to the model node.
	

	 */
	public final OrientationCesiumWriter openRotationProperty() {
		openIntervalIfNecessary();
		return this.<OrientationCesiumWriter> openAndReturn(getRotationWriter());
	}

	/**
	 *  
	Writes a value for the <code>rotation</code> property as a <code>unitQuaternion</code> value.  The <code>rotation</code> property specifies the rotation to apply to the model node.
	
	

	 * @param value The value.
	 */
	public final void writeRotationProperty(UnitQuaternion value) {
		{
			OrientationCesiumWriter writer = openRotationProperty();
			try {
				writer.writeUnitQuaternion(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>rotation</code> property as a <code>unitQuaternion</code> value.  The <code>rotation</code> property specifies the rotation to apply to the model node.
	
	
	

	 * @param dates The dates at which the rotation is specified.
	 * @param values The values corresponding to each date.
	 */
	public final void writeRotationProperty(List<JulianDate> dates, List<UnitQuaternion> values) {
		{
			OrientationCesiumWriter writer = openRotationProperty();
			try {
				writer.writeUnitQuaternion(dates, values);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>rotation</code> property as a <code>unitQuaternion</code> value.  The <code>rotation</code> property specifies the rotation to apply to the model node.
	
	
	
	
	

	 * @param dates The dates at which the rotation is specified.
	 * @param values The values corresponding to each date.
	 * @param startIndex The index of the first element to use in the `values` collection.
	 * @param length The number of elements to use from the `values` collection.
	 */
	public final void writeRotationProperty(List<JulianDate> dates, List<UnitQuaternion> values, int startIndex, int length) {
		{
			OrientationCesiumWriter writer = openRotationProperty();
			try {
				writer.writeUnitQuaternion(dates, values, startIndex, length);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>rotation</code> property as a <code>reference</code> value.  The <code>rotation</code> property specifies the rotation to apply to the model node.
	
	

	 * @param value The reference.
	 */
	public final void writeRotationPropertyReference(Reference value) {
		{
			OrientationCesiumWriter writer = openRotationProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>rotation</code> property as a <code>reference</code> value.  The <code>rotation</code> property specifies the rotation to apply to the model node.
	
	

	 * @param value The earliest date of the interval.
	 */
	public final void writeRotationPropertyReference(String value) {
		{
			OrientationCesiumWriter writer = openRotationProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>rotation</code> property as a <code>reference</code> value.  The <code>rotation</code> property specifies the rotation to apply to the model node.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyName The property on the referenced object.
	 */
	public final void writeRotationPropertyReference(String identifier, String propertyName) {
		{
			OrientationCesiumWriter writer = openRotationProperty();
			try {
				writer.writeReference(identifier, propertyName);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>rotation</code> property as a <code>reference</code> value.  The <code>rotation</code> property specifies the rotation to apply to the model node.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
	 */
	public final void writeRotationPropertyReference(String identifier, String[] propertyNames) {
		{
			OrientationCesiumWriter writer = openRotationProperty();
			try {
				writer.writeReference(identifier, propertyNames);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}
}