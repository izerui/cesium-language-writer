package cesiumlanguagewriter;


import agi.foundation.compatibility.*;
import agi.foundation.compatibility.DisposeHelper;
import agi.foundation.compatibility.Func1;
import agi.foundation.compatibility.Lazy;
import cesiumlanguagewriter.advanced.*;
import cesiumlanguagewriter.BooleanCesiumWriter;
import cesiumlanguagewriter.ColorCesiumWriter;
import cesiumlanguagewriter.DoubleCesiumWriter;
import cesiumlanguagewriter.MaterialCesiumWriter;
import cesiumlanguagewriter.SensorVolumePortionToDisplayCesiumWriter;
import java.awt.Color;
import java.util.List;

/**
 *  
 Writes a <code>ConicSensor</code> to a  {@link CesiumOutputStream}.  A <code>ConicSensor</code> a conical sensor volume taking into account occlusion of an ellipsoid, i.e., the globe.
 

 */
public class ConicSensorCesiumWriter extends CesiumPropertyWriter<ConicSensorCesiumWriter> {
	/**
	 *  
	The name of the <code>show</code> property.
	

	 */
	public static final String ShowPropertyName = "show";
	/**
	 *  
	The name of the <code>innerHalfAngle</code> property.
	

	 */
	public static final String InnerHalfAnglePropertyName = "innerHalfAngle";
	/**
	 *  
	The name of the <code>outerHalfAngle</code> property.
	

	 */
	public static final String OuterHalfAnglePropertyName = "outerHalfAngle";
	/**
	 *  
	The name of the <code>minimumClockAngle</code> property.
	

	 */
	public static final String MinimumClockAnglePropertyName = "minimumClockAngle";
	/**
	 *  
	The name of the <code>maximumClockAngle</code> property.
	

	 */
	public static final String MaximumClockAnglePropertyName = "maximumClockAngle";
	/**
	 *  
	The name of the <code>radius</code> property.
	

	 */
	public static final String RadiusPropertyName = "radius";
	/**
	 *  
	The name of the <code>showIntersection</code> property.
	

	 */
	public static final String ShowIntersectionPropertyName = "showIntersection";
	/**
	 *  
	The name of the <code>intersectionColor</code> property.
	

	 */
	public static final String IntersectionColorPropertyName = "intersectionColor";
	/**
	 *  
	The name of the <code>intersectionWidth</code> property.
	

	 */
	public static final String IntersectionWidthPropertyName = "intersectionWidth";
	/**
	 *  
	The name of the <code>showLateralSurfaces</code> property.
	

	 */
	public static final String ShowLateralSurfacesPropertyName = "showLateralSurfaces";
	/**
	 *  
	The name of the <code>lateralSurfaceMaterial</code> property.
	

	 */
	public static final String LateralSurfaceMaterialPropertyName = "lateralSurfaceMaterial";
	/**
	 *  
	The name of the <code>showEllipsoidSurfaces</code> property.
	

	 */
	public static final String ShowEllipsoidSurfacesPropertyName = "showEllipsoidSurfaces";
	/**
	 *  
	The name of the <code>ellipsoidSurfaceMaterial</code> property.
	

	 */
	public static final String EllipsoidSurfaceMaterialPropertyName = "ellipsoidSurfaceMaterial";
	/**
	 *  
	The name of the <code>showEllipsoidHorizonSurfaces</code> property.
	

	 */
	public static final String ShowEllipsoidHorizonSurfacesPropertyName = "showEllipsoidHorizonSurfaces";
	/**
	 *  
	The name of the <code>ellipsoidHorizonSurfaceMaterial</code> property.
	

	 */
	public static final String EllipsoidHorizonSurfaceMaterialPropertyName = "ellipsoidHorizonSurfaceMaterial";
	/**
	 *  
	The name of the <code>showDomeSurfaces</code> property.
	

	 */
	public static final String ShowDomeSurfacesPropertyName = "showDomeSurfaces";
	/**
	 *  
	The name of the <code>domeSurfaceMaterial</code> property.
	

	 */
	public static final String DomeSurfaceMaterialPropertyName = "domeSurfaceMaterial";
	/**
	 *  
	The name of the <code>portionToDisplay</code> property.
	

	 */
	public static final String PortionToDisplayPropertyName = "portionToDisplay";
	private Lazy<BooleanCesiumWriter> m_show = new Lazy<BooleanCesiumWriter>(new Func1<BooleanCesiumWriter>() {
		public BooleanCesiumWriter invoke() {
			return new BooleanCesiumWriter(ShowPropertyName);
		}
	}, false);
	private Lazy<DoubleCesiumWriter> m_innerHalfAngle = new Lazy<DoubleCesiumWriter>(new Func1<DoubleCesiumWriter>() {
		public DoubleCesiumWriter invoke() {
			return new DoubleCesiumWriter(InnerHalfAnglePropertyName);
		}
	}, false);
	private Lazy<DoubleCesiumWriter> m_outerHalfAngle = new Lazy<DoubleCesiumWriter>(new Func1<DoubleCesiumWriter>() {
		public DoubleCesiumWriter invoke() {
			return new DoubleCesiumWriter(OuterHalfAnglePropertyName);
		}
	}, false);
	private Lazy<DoubleCesiumWriter> m_minimumClockAngle = new Lazy<DoubleCesiumWriter>(new Func1<DoubleCesiumWriter>() {
		public DoubleCesiumWriter invoke() {
			return new DoubleCesiumWriter(MinimumClockAnglePropertyName);
		}
	}, false);
	private Lazy<DoubleCesiumWriter> m_maximumClockAngle = new Lazy<DoubleCesiumWriter>(new Func1<DoubleCesiumWriter>() {
		public DoubleCesiumWriter invoke() {
			return new DoubleCesiumWriter(MaximumClockAnglePropertyName);
		}
	}, false);
	private Lazy<DoubleCesiumWriter> m_radius = new Lazy<DoubleCesiumWriter>(new Func1<DoubleCesiumWriter>() {
		public DoubleCesiumWriter invoke() {
			return new DoubleCesiumWriter(RadiusPropertyName);
		}
	}, false);
	private Lazy<BooleanCesiumWriter> m_showIntersection = new Lazy<BooleanCesiumWriter>(new Func1<BooleanCesiumWriter>() {
		public BooleanCesiumWriter invoke() {
			return new BooleanCesiumWriter(ShowIntersectionPropertyName);
		}
	}, false);
	private Lazy<ColorCesiumWriter> m_intersectionColor = new Lazy<ColorCesiumWriter>(new Func1<ColorCesiumWriter>() {
		public ColorCesiumWriter invoke() {
			return new ColorCesiumWriter(IntersectionColorPropertyName);
		}
	}, false);
	private Lazy<DoubleCesiumWriter> m_intersectionWidth = new Lazy<DoubleCesiumWriter>(new Func1<DoubleCesiumWriter>() {
		public DoubleCesiumWriter invoke() {
			return new DoubleCesiumWriter(IntersectionWidthPropertyName);
		}
	}, false);
	private Lazy<BooleanCesiumWriter> m_showLateralSurfaces = new Lazy<BooleanCesiumWriter>(new Func1<BooleanCesiumWriter>() {
		public BooleanCesiumWriter invoke() {
			return new BooleanCesiumWriter(ShowLateralSurfacesPropertyName);
		}
	}, false);
	private Lazy<MaterialCesiumWriter> m_lateralSurfaceMaterial = new Lazy<MaterialCesiumWriter>(new Func1<MaterialCesiumWriter>() {
		public MaterialCesiumWriter invoke() {
			return new MaterialCesiumWriter(LateralSurfaceMaterialPropertyName);
		}
	}, false);
	private Lazy<BooleanCesiumWriter> m_showEllipsoidSurfaces = new Lazy<BooleanCesiumWriter>(new Func1<BooleanCesiumWriter>() {
		public BooleanCesiumWriter invoke() {
			return new BooleanCesiumWriter(ShowEllipsoidSurfacesPropertyName);
		}
	}, false);
	private Lazy<MaterialCesiumWriter> m_ellipsoidSurfaceMaterial = new Lazy<MaterialCesiumWriter>(new Func1<MaterialCesiumWriter>() {
		public MaterialCesiumWriter invoke() {
			return new MaterialCesiumWriter(EllipsoidSurfaceMaterialPropertyName);
		}
	}, false);
	private Lazy<BooleanCesiumWriter> m_showEllipsoidHorizonSurfaces = new Lazy<BooleanCesiumWriter>(new Func1<BooleanCesiumWriter>() {
		public BooleanCesiumWriter invoke() {
			return new BooleanCesiumWriter(ShowEllipsoidHorizonSurfacesPropertyName);
		}
	}, false);
	private Lazy<MaterialCesiumWriter> m_ellipsoidHorizonSurfaceMaterial = new Lazy<MaterialCesiumWriter>(new Func1<MaterialCesiumWriter>() {
		public MaterialCesiumWriter invoke() {
			return new MaterialCesiumWriter(EllipsoidHorizonSurfaceMaterialPropertyName);
		}
	}, false);
	private Lazy<BooleanCesiumWriter> m_showDomeSurfaces = new Lazy<BooleanCesiumWriter>(new Func1<BooleanCesiumWriter>() {
		public BooleanCesiumWriter invoke() {
			return new BooleanCesiumWriter(ShowDomeSurfacesPropertyName);
		}
	}, false);
	private Lazy<MaterialCesiumWriter> m_domeSurfaceMaterial = new Lazy<MaterialCesiumWriter>(new Func1<MaterialCesiumWriter>() {
		public MaterialCesiumWriter invoke() {
			return new MaterialCesiumWriter(DomeSurfaceMaterialPropertyName);
		}
	}, false);
	private Lazy<SensorVolumePortionToDisplayCesiumWriter> m_portionToDisplay = new Lazy<cesiumlanguagewriter.SensorVolumePortionToDisplayCesiumWriter>(
			new Func1<cesiumlanguagewriter.SensorVolumePortionToDisplayCesiumWriter>() {
				public cesiumlanguagewriter.SensorVolumePortionToDisplayCesiumWriter invoke() {
					return new SensorVolumePortionToDisplayCesiumWriter(PortionToDisplayPropertyName);
				}
			}, false);

	/**
	 *  
	Initializes a new instance.
	

	 */
	public ConicSensorCesiumWriter(String propertyName) {
		super(propertyName);
	}

	/**
	 *  
	Initializes a new instance as a copy of an existing instance.
	
	

	 * @param existingInstance The existing instance to copy.
	 */
	protected ConicSensorCesiumWriter(ConicSensorCesiumWriter existingInstance) {
		super(existingInstance);
	}

	@Override
	public ConicSensorCesiumWriter clone() {
		return new ConicSensorCesiumWriter(this);
	}

	/**
	 *  Gets the writer for the <code>show</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>show</code> property defines whether or not the entire conical sensor is shown.
	

	 */
	public final BooleanCesiumWriter getShowWriter() {
		return m_show.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>show</code> property.  The <code>show</code> property defines whether or not the entire conical sensor is shown.
	

	 */
	public final BooleanCesiumWriter openShowProperty() {
		openIntervalIfNecessary();
		return this.<BooleanCesiumWriter> openAndReturn(getShowWriter());
	}

	/**
	 *  
	Writes a value for the <code>show</code> property as a <code>boolean</code> value.  The <code>show</code> property specifies whether or not the entire conical sensor is shown.
	
	

	 * @param value The value.
	 */
	public final void writeShowProperty(boolean value) {
		{
			BooleanCesiumWriter writer = openShowProperty();
			try {
				writer.writeBoolean(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>show</code> property as a <code>reference</code> value.  The <code>show</code> property specifies whether or not the entire conical sensor is shown.
	
	

	 * @param value The reference.
	 */
	public final void writeShowPropertyReference(Reference value) {
		{
			BooleanCesiumWriter writer = openShowProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>show</code> property as a <code>reference</code> value.  The <code>show</code> property specifies whether or not the entire conical sensor is shown.
	
	

	 * @param value The earliest date of the interval.
	 */
	public final void writeShowPropertyReference(String value) {
		{
			BooleanCesiumWriter writer = openShowProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>show</code> property as a <code>reference</code> value.  The <code>show</code> property specifies whether or not the entire conical sensor is shown.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyName The property on the referenced object.
	 */
	public final void writeShowPropertyReference(String identifier, String propertyName) {
		{
			BooleanCesiumWriter writer = openShowProperty();
			try {
				writer.writeReference(identifier, propertyName);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>show</code> property as a <code>reference</code> value.  The <code>show</code> property specifies whether or not the entire conical sensor is shown.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
	 */
	public final void writeShowPropertyReference(String identifier, String[] propertyNames) {
		{
			BooleanCesiumWriter writer = openShowProperty();
			try {
				writer.writeReference(identifier, propertyNames);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  Gets the writer for the <code>innerHalfAngle</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>innerHalfAngle</code> property defines the inner half angle of the cone.
	

	 */
	public final DoubleCesiumWriter getInnerHalfAngleWriter() {
		return m_innerHalfAngle.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>innerHalfAngle</code> property.  The <code>innerHalfAngle</code> property defines the inner half angle of the cone.
	

	 */
	public final DoubleCesiumWriter openInnerHalfAngleProperty() {
		openIntervalIfNecessary();
		return this.<DoubleCesiumWriter> openAndReturn(getInnerHalfAngleWriter());
	}

	/**
	 *  
	Writes a value for the <code>innerHalfAngle</code> property as a <code>number</code> value.  The <code>innerHalfAngle</code> property specifies the inner half angle of the cone.
	
	

	 * @param value The value.
	 */
	public final void writeInnerHalfAngleProperty(double value) {
		{
			DoubleCesiumWriter writer = openInnerHalfAngleProperty();
			try {
				writer.writeNumber(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>innerHalfAngle</code> property as a <code>number</code> value.  The <code>innerHalfAngle</code> property specifies the inner half angle of the cone.
	
	
	
	
	

	 * @param dates The dates at which the value is specified.
	 * @param values The value corresponding to each date.
	 * @param startIndex The index of the first element to use in the `values` collection.
	 * @param length The number of elements to use from the `values` collection.
	 */
	public final void writeInnerHalfAngleProperty(List<JulianDate> dates, List<Double> values, int startIndex, int length) {
		{
			DoubleCesiumWriter writer = openInnerHalfAngleProperty();
			try {
				writer.writeNumber(dates, values, startIndex, length);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>innerHalfAngle</code> property as a <code>reference</code> value.  The <code>innerHalfAngle</code> property specifies the inner half angle of the cone.
	
	

	 * @param value The reference.
	 */
	public final void writeInnerHalfAnglePropertyReference(Reference value) {
		{
			DoubleCesiumWriter writer = openInnerHalfAngleProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>innerHalfAngle</code> property as a <code>reference</code> value.  The <code>innerHalfAngle</code> property specifies the inner half angle of the cone.
	
	

	 * @param value The earliest date of the interval.
	 */
	public final void writeInnerHalfAnglePropertyReference(String value) {
		{
			DoubleCesiumWriter writer = openInnerHalfAngleProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>innerHalfAngle</code> property as a <code>reference</code> value.  The <code>innerHalfAngle</code> property specifies the inner half angle of the cone.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyName The property on the referenced object.
	 */
	public final void writeInnerHalfAnglePropertyReference(String identifier, String propertyName) {
		{
			DoubleCesiumWriter writer = openInnerHalfAngleProperty();
			try {
				writer.writeReference(identifier, propertyName);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>innerHalfAngle</code> property as a <code>reference</code> value.  The <code>innerHalfAngle</code> property specifies the inner half angle of the cone.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
	 */
	public final void writeInnerHalfAnglePropertyReference(String identifier, String[] propertyNames) {
		{
			DoubleCesiumWriter writer = openInnerHalfAngleProperty();
			try {
				writer.writeReference(identifier, propertyNames);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  Gets the writer for the <code>outerHalfAngle</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>outerHalfAngle</code> property defines the outer half angle of the cone.
	

	 */
	public final DoubleCesiumWriter getOuterHalfAngleWriter() {
		return m_outerHalfAngle.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>outerHalfAngle</code> property.  The <code>outerHalfAngle</code> property defines the outer half angle of the cone.
	

	 */
	public final DoubleCesiumWriter openOuterHalfAngleProperty() {
		openIntervalIfNecessary();
		return this.<DoubleCesiumWriter> openAndReturn(getOuterHalfAngleWriter());
	}

	/**
	 *  
	Writes a value for the <code>outerHalfAngle</code> property as a <code>number</code> value.  The <code>outerHalfAngle</code> property specifies the outer half angle of the cone.
	
	

	 * @param value The value.
	 */
	public final void writeOuterHalfAngleProperty(double value) {
		{
			DoubleCesiumWriter writer = openOuterHalfAngleProperty();
			try {
				writer.writeNumber(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>outerHalfAngle</code> property as a <code>number</code> value.  The <code>outerHalfAngle</code> property specifies the outer half angle of the cone.
	
	
	
	
	

	 * @param dates The dates at which the value is specified.
	 * @param values The value corresponding to each date.
	 * @param startIndex The index of the first element to use in the `values` collection.
	 * @param length The number of elements to use from the `values` collection.
	 */
	public final void writeOuterHalfAngleProperty(List<JulianDate> dates, List<Double> values, int startIndex, int length) {
		{
			DoubleCesiumWriter writer = openOuterHalfAngleProperty();
			try {
				writer.writeNumber(dates, values, startIndex, length);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>outerHalfAngle</code> property as a <code>reference</code> value.  The <code>outerHalfAngle</code> property specifies the outer half angle of the cone.
	
	

	 * @param value The reference.
	 */
	public final void writeOuterHalfAnglePropertyReference(Reference value) {
		{
			DoubleCesiumWriter writer = openOuterHalfAngleProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>outerHalfAngle</code> property as a <code>reference</code> value.  The <code>outerHalfAngle</code> property specifies the outer half angle of the cone.
	
	

	 * @param value The earliest date of the interval.
	 */
	public final void writeOuterHalfAnglePropertyReference(String value) {
		{
			DoubleCesiumWriter writer = openOuterHalfAngleProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>outerHalfAngle</code> property as a <code>reference</code> value.  The <code>outerHalfAngle</code> property specifies the outer half angle of the cone.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyName The property on the referenced object.
	 */
	public final void writeOuterHalfAnglePropertyReference(String identifier, String propertyName) {
		{
			DoubleCesiumWriter writer = openOuterHalfAngleProperty();
			try {
				writer.writeReference(identifier, propertyName);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>outerHalfAngle</code> property as a <code>reference</code> value.  The <code>outerHalfAngle</code> property specifies the outer half angle of the cone.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
	 */
	public final void writeOuterHalfAnglePropertyReference(String identifier, String[] propertyNames) {
		{
			DoubleCesiumWriter writer = openOuterHalfAngleProperty();
			try {
				writer.writeReference(identifier, propertyNames);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  Gets the writer for the <code>minimumClockAngle</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>minimumClockAngle</code> property defines the minimum clock angle limit of the cone.
	

	 */
	public final DoubleCesiumWriter getMinimumClockAngleWriter() {
		return m_minimumClockAngle.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>minimumClockAngle</code> property.  The <code>minimumClockAngle</code> property defines the minimum clock angle limit of the cone.
	

	 */
	public final DoubleCesiumWriter openMinimumClockAngleProperty() {
		openIntervalIfNecessary();
		return this.<DoubleCesiumWriter> openAndReturn(getMinimumClockAngleWriter());
	}

	/**
	 *  
	Writes a value for the <code>minimumClockAngle</code> property as a <code>number</code> value.  The <code>minimumClockAngle</code> property specifies the minimum clock angle limit of the cone.
	
	

	 * @param value The value.
	 */
	public final void writeMinimumClockAngleProperty(double value) {
		{
			DoubleCesiumWriter writer = openMinimumClockAngleProperty();
			try {
				writer.writeNumber(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>minimumClockAngle</code> property as a <code>number</code> value.  The <code>minimumClockAngle</code> property specifies the minimum clock angle limit of the cone.
	
	
	
	
	

	 * @param dates The dates at which the value is specified.
	 * @param values The value corresponding to each date.
	 * @param startIndex The index of the first element to use in the `values` collection.
	 * @param length The number of elements to use from the `values` collection.
	 */
	public final void writeMinimumClockAngleProperty(List<JulianDate> dates, List<Double> values, int startIndex, int length) {
		{
			DoubleCesiumWriter writer = openMinimumClockAngleProperty();
			try {
				writer.writeNumber(dates, values, startIndex, length);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>minimumClockAngle</code> property as a <code>reference</code> value.  The <code>minimumClockAngle</code> property specifies the minimum clock angle limit of the cone.
	
	

	 * @param value The reference.
	 */
	public final void writeMinimumClockAnglePropertyReference(Reference value) {
		{
			DoubleCesiumWriter writer = openMinimumClockAngleProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>minimumClockAngle</code> property as a <code>reference</code> value.  The <code>minimumClockAngle</code> property specifies the minimum clock angle limit of the cone.
	
	

	 * @param value The earliest date of the interval.
	 */
	public final void writeMinimumClockAnglePropertyReference(String value) {
		{
			DoubleCesiumWriter writer = openMinimumClockAngleProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>minimumClockAngle</code> property as a <code>reference</code> value.  The <code>minimumClockAngle</code> property specifies the minimum clock angle limit of the cone.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyName The property on the referenced object.
	 */
	public final void writeMinimumClockAnglePropertyReference(String identifier, String propertyName) {
		{
			DoubleCesiumWriter writer = openMinimumClockAngleProperty();
			try {
				writer.writeReference(identifier, propertyName);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>minimumClockAngle</code> property as a <code>reference</code> value.  The <code>minimumClockAngle</code> property specifies the minimum clock angle limit of the cone.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
	 */
	public final void writeMinimumClockAnglePropertyReference(String identifier, String[] propertyNames) {
		{
			DoubleCesiumWriter writer = openMinimumClockAngleProperty();
			try {
				writer.writeReference(identifier, propertyNames);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  Gets the writer for the <code>maximumClockAngle</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>maximumClockAngle</code> property defines the maximum clock angle limit of the cone.
	

	 */
	public final DoubleCesiumWriter getMaximumClockAngleWriter() {
		return m_maximumClockAngle.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>maximumClockAngle</code> property.  The <code>maximumClockAngle</code> property defines the maximum clock angle limit of the cone.
	

	 */
	public final DoubleCesiumWriter openMaximumClockAngleProperty() {
		openIntervalIfNecessary();
		return this.<DoubleCesiumWriter> openAndReturn(getMaximumClockAngleWriter());
	}

	/**
	 *  
	Writes a value for the <code>maximumClockAngle</code> property as a <code>number</code> value.  The <code>maximumClockAngle</code> property specifies the maximum clock angle limit of the cone.
	
	

	 * @param value The value.
	 */
	public final void writeMaximumClockAngleProperty(double value) {
		{
			DoubleCesiumWriter writer = openMaximumClockAngleProperty();
			try {
				writer.writeNumber(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>maximumClockAngle</code> property as a <code>number</code> value.  The <code>maximumClockAngle</code> property specifies the maximum clock angle limit of the cone.
	
	
	
	
	

	 * @param dates The dates at which the value is specified.
	 * @param values The value corresponding to each date.
	 * @param startIndex The index of the first element to use in the `values` collection.
	 * @param length The number of elements to use from the `values` collection.
	 */
	public final void writeMaximumClockAngleProperty(List<JulianDate> dates, List<Double> values, int startIndex, int length) {
		{
			DoubleCesiumWriter writer = openMaximumClockAngleProperty();
			try {
				writer.writeNumber(dates, values, startIndex, length);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>maximumClockAngle</code> property as a <code>reference</code> value.  The <code>maximumClockAngle</code> property specifies the maximum clock angle limit of the cone.
	
	

	 * @param value The reference.
	 */
	public final void writeMaximumClockAnglePropertyReference(Reference value) {
		{
			DoubleCesiumWriter writer = openMaximumClockAngleProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>maximumClockAngle</code> property as a <code>reference</code> value.  The <code>maximumClockAngle</code> property specifies the maximum clock angle limit of the cone.
	
	

	 * @param value The earliest date of the interval.
	 */
	public final void writeMaximumClockAnglePropertyReference(String value) {
		{
			DoubleCesiumWriter writer = openMaximumClockAngleProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>maximumClockAngle</code> property as a <code>reference</code> value.  The <code>maximumClockAngle</code> property specifies the maximum clock angle limit of the cone.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyName The property on the referenced object.
	 */
	public final void writeMaximumClockAnglePropertyReference(String identifier, String propertyName) {
		{
			DoubleCesiumWriter writer = openMaximumClockAngleProperty();
			try {
				writer.writeReference(identifier, propertyName);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>maximumClockAngle</code> property as a <code>reference</code> value.  The <code>maximumClockAngle</code> property specifies the maximum clock angle limit of the cone.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
	 */
	public final void writeMaximumClockAnglePropertyReference(String identifier, String[] propertyNames) {
		{
			DoubleCesiumWriter writer = openMaximumClockAngleProperty();
			try {
				writer.writeReference(identifier, propertyNames);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  Gets the writer for the <code>radius</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>radius</code> property defines the radial limit of the cone.
	

	 */
	public final DoubleCesiumWriter getRadiusWriter() {
		return m_radius.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>radius</code> property.  The <code>radius</code> property defines the radial limit of the cone.
	

	 */
	public final DoubleCesiumWriter openRadiusProperty() {
		openIntervalIfNecessary();
		return this.<DoubleCesiumWriter> openAndReturn(getRadiusWriter());
	}

	/**
	 *  
	Writes a value for the <code>radius</code> property as a <code>number</code> value.  The <code>radius</code> property specifies the radial limit of the cone.
	
	

	 * @param value The value.
	 */
	public final void writeRadiusProperty(double value) {
		{
			DoubleCesiumWriter writer = openRadiusProperty();
			try {
				writer.writeNumber(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>radius</code> property as a <code>number</code> value.  The <code>radius</code> property specifies the radial limit of the cone.
	
	
	
	
	

	 * @param dates The dates at which the value is specified.
	 * @param values The value corresponding to each date.
	 * @param startIndex The index of the first element to use in the `values` collection.
	 * @param length The number of elements to use from the `values` collection.
	 */
	public final void writeRadiusProperty(List<JulianDate> dates, List<Double> values, int startIndex, int length) {
		{
			DoubleCesiumWriter writer = openRadiusProperty();
			try {
				writer.writeNumber(dates, values, startIndex, length);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>radius</code> property as a <code>reference</code> value.  The <code>radius</code> property specifies the radial limit of the cone.
	
	

	 * @param value The reference.
	 */
	public final void writeRadiusPropertyReference(Reference value) {
		{
			DoubleCesiumWriter writer = openRadiusProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>radius</code> property as a <code>reference</code> value.  The <code>radius</code> property specifies the radial limit of the cone.
	
	

	 * @param value The earliest date of the interval.
	 */
	public final void writeRadiusPropertyReference(String value) {
		{
			DoubleCesiumWriter writer = openRadiusProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>radius</code> property as a <code>reference</code> value.  The <code>radius</code> property specifies the radial limit of the cone.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyName The property on the referenced object.
	 */
	public final void writeRadiusPropertyReference(String identifier, String propertyName) {
		{
			DoubleCesiumWriter writer = openRadiusProperty();
			try {
				writer.writeReference(identifier, propertyName);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>radius</code> property as a <code>reference</code> value.  The <code>radius</code> property specifies the radial limit of the cone.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
	 */
	public final void writeRadiusPropertyReference(String identifier, String[] propertyNames) {
		{
			DoubleCesiumWriter writer = openRadiusProperty();
			try {
				writer.writeReference(identifier, propertyNames);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  Gets the writer for the <code>showIntersection</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>showIntersection</code> property defines whether or not the intersection of the cone with the Earth is shown.
	

	 */
	public final BooleanCesiumWriter getShowIntersectionWriter() {
		return m_showIntersection.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>showIntersection</code> property.  The <code>showIntersection</code> property defines whether or not the intersection of the cone with the Earth is shown.
	

	 */
	public final BooleanCesiumWriter openShowIntersectionProperty() {
		openIntervalIfNecessary();
		return this.<BooleanCesiumWriter> openAndReturn(getShowIntersectionWriter());
	}

	/**
	 *  
	Writes a value for the <code>showIntersection</code> property as a <code>boolean</code> value.  The <code>showIntersection</code> property specifies whether or not the intersection of the cone with the Earth is shown.
	
	

	 * @param value The value.
	 */
	public final void writeShowIntersectionProperty(boolean value) {
		{
			BooleanCesiumWriter writer = openShowIntersectionProperty();
			try {
				writer.writeBoolean(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>showIntersection</code> property as a <code>reference</code> value.  The <code>showIntersection</code> property specifies whether or not the intersection of the cone with the Earth is shown.
	
	

	 * @param value The reference.
	 */
	public final void writeShowIntersectionPropertyReference(Reference value) {
		{
			BooleanCesiumWriter writer = openShowIntersectionProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>showIntersection</code> property as a <code>reference</code> value.  The <code>showIntersection</code> property specifies whether or not the intersection of the cone with the Earth is shown.
	
	

	 * @param value The earliest date of the interval.
	 */
	public final void writeShowIntersectionPropertyReference(String value) {
		{
			BooleanCesiumWriter writer = openShowIntersectionProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>showIntersection</code> property as a <code>reference</code> value.  The <code>showIntersection</code> property specifies whether or not the intersection of the cone with the Earth is shown.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyName The property on the referenced object.
	 */
	public final void writeShowIntersectionPropertyReference(String identifier, String propertyName) {
		{
			BooleanCesiumWriter writer = openShowIntersectionProperty();
			try {
				writer.writeReference(identifier, propertyName);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>showIntersection</code> property as a <code>reference</code> value.  The <code>showIntersection</code> property specifies whether or not the intersection of the cone with the Earth is shown.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
	 */
	public final void writeShowIntersectionPropertyReference(String identifier, String[] propertyNames) {
		{
			BooleanCesiumWriter writer = openShowIntersectionProperty();
			try {
				writer.writeReference(identifier, propertyNames);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  Gets the writer for the <code>intersectionColor</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>intersectionColor</code> property defines the color of the intersection of the cone with the Earth.
	

	 */
	public final ColorCesiumWriter getIntersectionColorWriter() {
		return m_intersectionColor.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>intersectionColor</code> property.  The <code>intersectionColor</code> property defines the color of the intersection of the cone with the Earth.
	

	 */
	public final ColorCesiumWriter openIntersectionColorProperty() {
		openIntervalIfNecessary();
		return this.<ColorCesiumWriter> openAndReturn(getIntersectionColorWriter());
	}

	/**
	 *  
	Writes a value for the <code>intersectionColor</code> property as a <code>rgba</code> value.  The <code>intersectionColor</code> property specifies the color of the intersection of the cone with the Earth.
	
	

	 * @param color The color.
	 */
	public final void writeIntersectionColorProperty(Color color) {
		{
			ColorCesiumWriter writer = openIntersectionColorProperty();
			try {
				writer.writeRgba(color);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>intersectionColor</code> property as a <code>rgba</code> value.  The <code>intersectionColor</code> property specifies the color of the intersection of the cone with the Earth.
	
	
	
	
	

	 * @param red The red component in the range 0 to 255.
	 * @param green The green component in the range 0 to 255.
	 * @param blue The blue component in the range 0 to 255.
	 * @param alpha The alpha component in the range 0 to 255.
	 */
	public final void writeIntersectionColorProperty(int red, int green, int blue, int alpha) {
		{
			ColorCesiumWriter writer = openIntersectionColorProperty();
			try {
				writer.writeRgba(red, green, blue, alpha);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>intersectionColor</code> property as a <code>rgba</code> value.  The <code>intersectionColor</code> property specifies the color of the intersection of the cone with the Earth.
	
	
	
	
	

	 * @param dates The dates at which the value is specified.
	 * @param colors The color corresponding to each date.
	 * @param startIndex The index of the first element to use in the `colors` collection.
	 * @param length The number of elements to use from the `colors` collection.
	 */
	public final void writeIntersectionColorProperty(List<JulianDate> dates, List<Color> colors, int startIndex, int length) {
		{
			ColorCesiumWriter writer = openIntersectionColorProperty();
			try {
				writer.writeRgba(dates, colors, startIndex, length);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>intersectionColor</code> property as a <code>rgbaf</code> value.  The <code>intersectionColor</code> property specifies the color of the intersection of the cone with the Earth.
	
	
	
	
	

	 * @param red The red component in the range 0 to 1.0.
	 * @param green The green component in the range 0 to 1.0.
	 * @param blue The blue component in the range 0 to 1.0.
	 * @param alpha The alpha component in the range 0 to 1.0.
	 */
	public final void writeIntersectionColorPropertyRgbaf(float red, float green, float blue, float alpha) {
		{
			ColorCesiumWriter writer = openIntersectionColorProperty();
			try {
				writer.writeRgbaf(red, green, blue, alpha);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>intersectionColor</code> property as a <code>reference</code> value.  The <code>intersectionColor</code> property specifies the color of the intersection of the cone with the Earth.
	
	

	 * @param value The reference.
	 */
	public final void writeIntersectionColorPropertyReference(Reference value) {
		{
			ColorCesiumWriter writer = openIntersectionColorProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>intersectionColor</code> property as a <code>reference</code> value.  The <code>intersectionColor</code> property specifies the color of the intersection of the cone with the Earth.
	
	

	 * @param value The earliest date of the interval.
	 */
	public final void writeIntersectionColorPropertyReference(String value) {
		{
			ColorCesiumWriter writer = openIntersectionColorProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>intersectionColor</code> property as a <code>reference</code> value.  The <code>intersectionColor</code> property specifies the color of the intersection of the cone with the Earth.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyName The property on the referenced object.
	 */
	public final void writeIntersectionColorPropertyReference(String identifier, String propertyName) {
		{
			ColorCesiumWriter writer = openIntersectionColorProperty();
			try {
				writer.writeReference(identifier, propertyName);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>intersectionColor</code> property as a <code>reference</code> value.  The <code>intersectionColor</code> property specifies the color of the intersection of the cone with the Earth.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
	 */
	public final void writeIntersectionColorPropertyReference(String identifier, String[] propertyNames) {
		{
			ColorCesiumWriter writer = openIntersectionColorProperty();
			try {
				writer.writeReference(identifier, propertyNames);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  Gets the writer for the <code>intersectionWidth</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>intersectionWidth</code> property defines the width of the intersection in pixels.
	

	 */
	public final DoubleCesiumWriter getIntersectionWidthWriter() {
		return m_intersectionWidth.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>intersectionWidth</code> property.  The <code>intersectionWidth</code> property defines the width of the intersection in pixels.
	

	 */
	public final DoubleCesiumWriter openIntersectionWidthProperty() {
		openIntervalIfNecessary();
		return this.<DoubleCesiumWriter> openAndReturn(getIntersectionWidthWriter());
	}

	/**
	 *  
	Writes a value for the <code>intersectionWidth</code> property as a <code>number</code> value.  The <code>intersectionWidth</code> property specifies the width of the intersection in pixels.
	
	

	 * @param value The value.
	 */
	public final void writeIntersectionWidthProperty(double value) {
		{
			DoubleCesiumWriter writer = openIntersectionWidthProperty();
			try {
				writer.writeNumber(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>intersectionWidth</code> property as a <code>number</code> value.  The <code>intersectionWidth</code> property specifies the width of the intersection in pixels.
	
	
	
	
	

	 * @param dates The dates at which the value is specified.
	 * @param values The value corresponding to each date.
	 * @param startIndex The index of the first element to use in the `values` collection.
	 * @param length The number of elements to use from the `values` collection.
	 */
	public final void writeIntersectionWidthProperty(List<JulianDate> dates, List<Double> values, int startIndex, int length) {
		{
			DoubleCesiumWriter writer = openIntersectionWidthProperty();
			try {
				writer.writeNumber(dates, values, startIndex, length);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>intersectionWidth</code> property as a <code>reference</code> value.  The <code>intersectionWidth</code> property specifies the width of the intersection in pixels.
	
	

	 * @param value The reference.
	 */
	public final void writeIntersectionWidthPropertyReference(Reference value) {
		{
			DoubleCesiumWriter writer = openIntersectionWidthProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>intersectionWidth</code> property as a <code>reference</code> value.  The <code>intersectionWidth</code> property specifies the width of the intersection in pixels.
	
	

	 * @param value The earliest date of the interval.
	 */
	public final void writeIntersectionWidthPropertyReference(String value) {
		{
			DoubleCesiumWriter writer = openIntersectionWidthProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>intersectionWidth</code> property as a <code>reference</code> value.  The <code>intersectionWidth</code> property specifies the width of the intersection in pixels.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyName The property on the referenced object.
	 */
	public final void writeIntersectionWidthPropertyReference(String identifier, String propertyName) {
		{
			DoubleCesiumWriter writer = openIntersectionWidthProperty();
			try {
				writer.writeReference(identifier, propertyName);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>intersectionWidth</code> property as a <code>reference</code> value.  The <code>intersectionWidth</code> property specifies the width of the intersection in pixels.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
	 */
	public final void writeIntersectionWidthPropertyReference(String identifier, String[] propertyNames) {
		{
			DoubleCesiumWriter writer = openIntersectionWidthProperty();
			try {
				writer.writeReference(identifier, propertyNames);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  Gets the writer for the <code>showLateralSurfaces</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>showLateralSurfaces</code> property defines whether or not the lateral surfaces of the cone are shown.
	

	 */
	public final BooleanCesiumWriter getShowLateralSurfacesWriter() {
		return m_showLateralSurfaces.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>showLateralSurfaces</code> property.  The <code>showLateralSurfaces</code> property defines whether or not the lateral surfaces of the cone are shown.
	

	 */
	public final BooleanCesiumWriter openShowLateralSurfacesProperty() {
		openIntervalIfNecessary();
		return this.<BooleanCesiumWriter> openAndReturn(getShowLateralSurfacesWriter());
	}

	/**
	 *  
	Writes a value for the <code>showLateralSurfaces</code> property as a <code>boolean</code> value.  The <code>showLateralSurfaces</code> property specifies whether or not the lateral surfaces of the cone are shown.
	
	

	 * @param value The value.
	 */
	public final void writeShowLateralSurfacesProperty(boolean value) {
		{
			BooleanCesiumWriter writer = openShowLateralSurfacesProperty();
			try {
				writer.writeBoolean(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>showLateralSurfaces</code> property as a <code>reference</code> value.  The <code>showLateralSurfaces</code> property specifies whether or not the lateral surfaces of the cone are shown.
	
	

	 * @param value The reference.
	 */
	public final void writeShowLateralSurfacesPropertyReference(Reference value) {
		{
			BooleanCesiumWriter writer = openShowLateralSurfacesProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>showLateralSurfaces</code> property as a <code>reference</code> value.  The <code>showLateralSurfaces</code> property specifies whether or not the lateral surfaces of the cone are shown.
	
	

	 * @param value The earliest date of the interval.
	 */
	public final void writeShowLateralSurfacesPropertyReference(String value) {
		{
			BooleanCesiumWriter writer = openShowLateralSurfacesProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>showLateralSurfaces</code> property as a <code>reference</code> value.  The <code>showLateralSurfaces</code> property specifies whether or not the lateral surfaces of the cone are shown.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyName The property on the referenced object.
	 */
	public final void writeShowLateralSurfacesPropertyReference(String identifier, String propertyName) {
		{
			BooleanCesiumWriter writer = openShowLateralSurfacesProperty();
			try {
				writer.writeReference(identifier, propertyName);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>showLateralSurfaces</code> property as a <code>reference</code> value.  The <code>showLateralSurfaces</code> property specifies whether or not the lateral surfaces of the cone are shown.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
	 */
	public final void writeShowLateralSurfacesPropertyReference(String identifier, String[] propertyNames) {
		{
			BooleanCesiumWriter writer = openShowLateralSurfacesProperty();
			try {
				writer.writeReference(identifier, propertyNames);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  Gets the writer for the <code>lateralSurfaceMaterial</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>lateralSurfaceMaterial</code> property defines the material to use for the cone's lateral surfaces.
	

	 */
	public final MaterialCesiumWriter getLateralSurfaceMaterialWriter() {
		return m_lateralSurfaceMaterial.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>lateralSurfaceMaterial</code> property.  The <code>lateralSurfaceMaterial</code> property defines the material to use for the cone's lateral surfaces.
	

	 */
	public final MaterialCesiumWriter openLateralSurfaceMaterialProperty() {
		openIntervalIfNecessary();
		return this.<MaterialCesiumWriter> openAndReturn(getLateralSurfaceMaterialWriter());
	}

	/**
	 *  Gets the writer for the <code>showEllipsoidSurfaces</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>showEllipsoidSurfaces</code> property defines whether or not ellipsoid surfaces are shown.
	

	 */
	public final BooleanCesiumWriter getShowEllipsoidSurfacesWriter() {
		return m_showEllipsoidSurfaces.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>showEllipsoidSurfaces</code> property.  The <code>showEllipsoidSurfaces</code> property defines whether or not ellipsoid surfaces are shown.
	

	 */
	public final BooleanCesiumWriter openShowEllipsoidSurfacesProperty() {
		openIntervalIfNecessary();
		return this.<BooleanCesiumWriter> openAndReturn(getShowEllipsoidSurfacesWriter());
	}

	/**
	 *  
	Writes a value for the <code>showEllipsoidSurfaces</code> property as a <code>boolean</code> value.  The <code>showEllipsoidSurfaces</code> property specifies whether or not ellipsoid surfaces are shown.
	
	

	 * @param value The value.
	 */
	public final void writeShowEllipsoidSurfacesProperty(boolean value) {
		{
			BooleanCesiumWriter writer = openShowEllipsoidSurfacesProperty();
			try {
				writer.writeBoolean(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>showEllipsoidSurfaces</code> property as a <code>reference</code> value.  The <code>showEllipsoidSurfaces</code> property specifies whether or not ellipsoid surfaces are shown.
	
	

	 * @param value The reference.
	 */
	public final void writeShowEllipsoidSurfacesPropertyReference(Reference value) {
		{
			BooleanCesiumWriter writer = openShowEllipsoidSurfacesProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>showEllipsoidSurfaces</code> property as a <code>reference</code> value.  The <code>showEllipsoidSurfaces</code> property specifies whether or not ellipsoid surfaces are shown.
	
	

	 * @param value The earliest date of the interval.
	 */
	public final void writeShowEllipsoidSurfacesPropertyReference(String value) {
		{
			BooleanCesiumWriter writer = openShowEllipsoidSurfacesProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>showEllipsoidSurfaces</code> property as a <code>reference</code> value.  The <code>showEllipsoidSurfaces</code> property specifies whether or not ellipsoid surfaces are shown.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyName The property on the referenced object.
	 */
	public final void writeShowEllipsoidSurfacesPropertyReference(String identifier, String propertyName) {
		{
			BooleanCesiumWriter writer = openShowEllipsoidSurfacesProperty();
			try {
				writer.writeReference(identifier, propertyName);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>showEllipsoidSurfaces</code> property as a <code>reference</code> value.  The <code>showEllipsoidSurfaces</code> property specifies whether or not ellipsoid surfaces are shown.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
	 */
	public final void writeShowEllipsoidSurfacesPropertyReference(String identifier, String[] propertyNames) {
		{
			BooleanCesiumWriter writer = openShowEllipsoidSurfacesProperty();
			try {
				writer.writeReference(identifier, propertyNames);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  Gets the writer for the <code>ellipsoidSurfaceMaterial</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>ellipsoidSurfaceMaterial</code> property defines the material to use for the cone's ellipsoid surfaces.
	

	 */
	public final MaterialCesiumWriter getEllipsoidSurfaceMaterialWriter() {
		return m_ellipsoidSurfaceMaterial.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>ellipsoidSurfaceMaterial</code> property.  The <code>ellipsoidSurfaceMaterial</code> property defines the material to use for the cone's ellipsoid surfaces.
	

	 */
	public final MaterialCesiumWriter openEllipsoidSurfaceMaterialProperty() {
		openIntervalIfNecessary();
		return this.<MaterialCesiumWriter> openAndReturn(getEllipsoidSurfaceMaterialWriter());
	}

	/**
	 *  Gets the writer for the <code>showEllipsoidHorizonSurfaces</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>showEllipsoidHorizonSurfaces</code> property defines whether or not ellipsoid horizon surfaces are shown.
	

	 */
	public final BooleanCesiumWriter getShowEllipsoidHorizonSurfacesWriter() {
		return m_showEllipsoidHorizonSurfaces.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>showEllipsoidHorizonSurfaces</code> property.  The <code>showEllipsoidHorizonSurfaces</code> property defines whether or not ellipsoid horizon surfaces are shown.
	

	 */
	public final BooleanCesiumWriter openShowEllipsoidHorizonSurfacesProperty() {
		openIntervalIfNecessary();
		return this.<BooleanCesiumWriter> openAndReturn(getShowEllipsoidHorizonSurfacesWriter());
	}

	/**
	 *  
	Writes a value for the <code>showEllipsoidHorizonSurfaces</code> property as a <code>boolean</code> value.  The <code>showEllipsoidHorizonSurfaces</code> property specifies whether or not ellipsoid horizon surfaces are shown.
	
	

	 * @param value The value.
	 */
	public final void writeShowEllipsoidHorizonSurfacesProperty(boolean value) {
		{
			BooleanCesiumWriter writer = openShowEllipsoidHorizonSurfacesProperty();
			try {
				writer.writeBoolean(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>showEllipsoidHorizonSurfaces</code> property as a <code>reference</code> value.  The <code>showEllipsoidHorizonSurfaces</code> property specifies whether or not ellipsoid horizon surfaces are shown.
	
	

	 * @param value The reference.
	 */
	public final void writeShowEllipsoidHorizonSurfacesPropertyReference(Reference value) {
		{
			BooleanCesiumWriter writer = openShowEllipsoidHorizonSurfacesProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>showEllipsoidHorizonSurfaces</code> property as a <code>reference</code> value.  The <code>showEllipsoidHorizonSurfaces</code> property specifies whether or not ellipsoid horizon surfaces are shown.
	
	

	 * @param value The earliest date of the interval.
	 */
	public final void writeShowEllipsoidHorizonSurfacesPropertyReference(String value) {
		{
			BooleanCesiumWriter writer = openShowEllipsoidHorizonSurfacesProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>showEllipsoidHorizonSurfaces</code> property as a <code>reference</code> value.  The <code>showEllipsoidHorizonSurfaces</code> property specifies whether or not ellipsoid horizon surfaces are shown.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyName The property on the referenced object.
	 */
	public final void writeShowEllipsoidHorizonSurfacesPropertyReference(String identifier, String propertyName) {
		{
			BooleanCesiumWriter writer = openShowEllipsoidHorizonSurfacesProperty();
			try {
				writer.writeReference(identifier, propertyName);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>showEllipsoidHorizonSurfaces</code> property as a <code>reference</code> value.  The <code>showEllipsoidHorizonSurfaces</code> property specifies whether or not ellipsoid horizon surfaces are shown.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
	 */
	public final void writeShowEllipsoidHorizonSurfacesPropertyReference(String identifier, String[] propertyNames) {
		{
			BooleanCesiumWriter writer = openShowEllipsoidHorizonSurfacesProperty();
			try {
				writer.writeReference(identifier, propertyNames);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  Gets the writer for the <code>ellipsoidHorizonSurfaceMaterial</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>ellipsoidHorizonSurfaceMaterial</code> property defines the material to use for the cone's ellipsoid horizon surfaces.
	

	 */
	public final MaterialCesiumWriter getEllipsoidHorizonSurfaceMaterialWriter() {
		return m_ellipsoidHorizonSurfaceMaterial.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>ellipsoidHorizonSurfaceMaterial</code> property.  The <code>ellipsoidHorizonSurfaceMaterial</code> property defines the material to use for the cone's ellipsoid horizon surfaces.
	

	 */
	public final MaterialCesiumWriter openEllipsoidHorizonSurfaceMaterialProperty() {
		openIntervalIfNecessary();
		return this.<MaterialCesiumWriter> openAndReturn(getEllipsoidHorizonSurfaceMaterialWriter());
	}

	/**
	 *  Gets the writer for the <code>showDomeSurfaces</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>showDomeSurfaces</code> property defines whether or not dome surfaces are shown.
	

	 */
	public final BooleanCesiumWriter getShowDomeSurfacesWriter() {
		return m_showDomeSurfaces.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>showDomeSurfaces</code> property.  The <code>showDomeSurfaces</code> property defines whether or not dome surfaces are shown.
	

	 */
	public final BooleanCesiumWriter openShowDomeSurfacesProperty() {
		openIntervalIfNecessary();
		return this.<BooleanCesiumWriter> openAndReturn(getShowDomeSurfacesWriter());
	}

	/**
	 *  
	Writes a value for the <code>showDomeSurfaces</code> property as a <code>boolean</code> value.  The <code>showDomeSurfaces</code> property specifies whether or not dome surfaces are shown.
	
	

	 * @param value The value.
	 */
	public final void writeShowDomeSurfacesProperty(boolean value) {
		{
			BooleanCesiumWriter writer = openShowDomeSurfacesProperty();
			try {
				writer.writeBoolean(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>showDomeSurfaces</code> property as a <code>reference</code> value.  The <code>showDomeSurfaces</code> property specifies whether or not dome surfaces are shown.
	
	

	 * @param value The reference.
	 */
	public final void writeShowDomeSurfacesPropertyReference(Reference value) {
		{
			BooleanCesiumWriter writer = openShowDomeSurfacesProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>showDomeSurfaces</code> property as a <code>reference</code> value.  The <code>showDomeSurfaces</code> property specifies whether or not dome surfaces are shown.
	
	

	 * @param value The earliest date of the interval.
	 */
	public final void writeShowDomeSurfacesPropertyReference(String value) {
		{
			BooleanCesiumWriter writer = openShowDomeSurfacesProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>showDomeSurfaces</code> property as a <code>reference</code> value.  The <code>showDomeSurfaces</code> property specifies whether or not dome surfaces are shown.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyName The property on the referenced object.
	 */
	public final void writeShowDomeSurfacesPropertyReference(String identifier, String propertyName) {
		{
			BooleanCesiumWriter writer = openShowDomeSurfacesProperty();
			try {
				writer.writeReference(identifier, propertyName);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>showDomeSurfaces</code> property as a <code>reference</code> value.  The <code>showDomeSurfaces</code> property specifies whether or not dome surfaces are shown.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
	 */
	public final void writeShowDomeSurfacesPropertyReference(String identifier, String[] propertyNames) {
		{
			BooleanCesiumWriter writer = openShowDomeSurfacesProperty();
			try {
				writer.writeReference(identifier, propertyNames);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  Gets the writer for the <code>domeSurfaceMaterial</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>domeSurfaceMaterial</code> property defines the material to use for the cone's dome surfaces.
	

	 */
	public final MaterialCesiumWriter getDomeSurfaceMaterialWriter() {
		return m_domeSurfaceMaterial.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>domeSurfaceMaterial</code> property.  The <code>domeSurfaceMaterial</code> property defines the material to use for the cone's dome surfaces.
	

	 */
	public final MaterialCesiumWriter openDomeSurfaceMaterialProperty() {
		openIntervalIfNecessary();
		return this.<MaterialCesiumWriter> openAndReturn(getDomeSurfaceMaterialWriter());
	}

	/**
	 *  Gets the writer for the <code>portionToDisplay</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>portionToDisplay</code> property defines indicates what part of the sensor should be displayed.
	

	 */
	public final SensorVolumePortionToDisplayCesiumWriter getPortionToDisplayWriter() {
		return m_portionToDisplay.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>portionToDisplay</code> property.  The <code>portionToDisplay</code> property defines indicates what part of the sensor should be displayed.
	

	 */
	public final SensorVolumePortionToDisplayCesiumWriter openPortionToDisplayProperty() {
		openIntervalIfNecessary();
		return this.<SensorVolumePortionToDisplayCesiumWriter> openAndReturn(getPortionToDisplayWriter());
	}

	/**
	 *  
	Writes a value for the <code>portionToDisplay</code> property as a <code>portionToDisplay</code> value.  The <code>portionToDisplay</code> property specifies indicates what part of the sensor should be displayed.
	
	

	 * @param value The portion of the sensor to display.
	 */
	public final void writePortionToDisplayProperty(CesiumSensorVolumePortionToDisplay value) {
		{
			cesiumlanguagewriter.SensorVolumePortionToDisplayCesiumWriter writer = openPortionToDisplayProperty();
			try {
				writer.writePortionToDisplay(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>portionToDisplay</code> property as a <code>reference</code> value.  The <code>portionToDisplay</code> property specifies indicates what part of the sensor should be displayed.
	
	

	 * @param value The reference.
	 */
	public final void writePortionToDisplayPropertyReference(Reference value) {
		{
			cesiumlanguagewriter.SensorVolumePortionToDisplayCesiumWriter writer = openPortionToDisplayProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>portionToDisplay</code> property as a <code>reference</code> value.  The <code>portionToDisplay</code> property specifies indicates what part of the sensor should be displayed.
	
	

	 * @param value The earliest date of the interval.
	 */
	public final void writePortionToDisplayPropertyReference(String value) {
		{
			cesiumlanguagewriter.SensorVolumePortionToDisplayCesiumWriter writer = openPortionToDisplayProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>portionToDisplay</code> property as a <code>reference</code> value.  The <code>portionToDisplay</code> property specifies indicates what part of the sensor should be displayed.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyName The property on the referenced object.
	 */
	public final void writePortionToDisplayPropertyReference(String identifier, String propertyName) {
		{
			cesiumlanguagewriter.SensorVolumePortionToDisplayCesiumWriter writer = openPortionToDisplayProperty();
			try {
				writer.writeReference(identifier, propertyName);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>portionToDisplay</code> property as a <code>reference</code> value.  The <code>portionToDisplay</code> property specifies indicates what part of the sensor should be displayed.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
	 */
	public final void writePortionToDisplayPropertyReference(String identifier, String[] propertyNames) {
		{
			cesiumlanguagewriter.SensorVolumePortionToDisplayCesiumWriter writer = openPortionToDisplayProperty();
			try {
				writer.writeReference(identifier, propertyNames);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}
}