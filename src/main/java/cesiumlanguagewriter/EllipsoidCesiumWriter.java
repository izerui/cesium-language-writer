package cesiumlanguagewriter;


import agi.foundation.compatibility.*;
import agi.foundation.compatibility.DisposeHelper;
import agi.foundation.compatibility.Func1;
import agi.foundation.compatibility.Lazy;
import cesiumlanguagewriter.advanced.*;
import cesiumlanguagewriter.BooleanCesiumWriter;
import cesiumlanguagewriter.ColorCesiumWriter;
import cesiumlanguagewriter.DoubleCesiumWriter;
import cesiumlanguagewriter.EllipsoidRadiiCesiumWriter;
import cesiumlanguagewriter.MaterialCesiumWriter;
import java.awt.Color;
import java.util.List;

/**
 *  
 Writes a <code>Ellipsoid</code> to a  {@link CesiumOutputStream}.  A <code>Ellipsoid</code> defines a closed quadric surface that is a three dimensional analogue of an ellipse.
 

 */
public class EllipsoidCesiumWriter extends CesiumPropertyWriter<EllipsoidCesiumWriter> {
	/**
	 *  
	The name of the <code>show</code> property.
	

	 */
	public static final String ShowPropertyName = "show";
	/**
	 *  
	The name of the <code>radii</code> property.
	

	 */
	public static final String RadiiPropertyName = "radii";
	/**
	 *  
	The name of the <code>fill</code> property.
	

	 */
	public static final String FillPropertyName = "fill";
	/**
	 *  
	The name of the <code>material</code> property.
	

	 */
	public static final String MaterialPropertyName = "material";
	/**
	 *  
	The name of the <code>outline</code> property.
	

	 */
	public static final String OutlinePropertyName = "outline";
	/**
	 *  
	The name of the <code>outlineColor</code> property.
	

	 */
	public static final String OutlineColorPropertyName = "outlineColor";
	/**
	 *  
	The name of the <code>outlineWidth</code> property.
	

	 */
	public static final String OutlineWidthPropertyName = "outlineWidth";
	/**
	 *  
	The name of the <code>stackPartitions</code> property.
	

	 */
	public static final String StackPartitionsPropertyName = "stackPartitions";
	/**
	 *  
	The name of the <code>slicePartitions</code> property.
	

	 */
	public static final String SlicePartitionsPropertyName = "slicePartitions";
	/**
	 *  
	The name of the <code>subdivisions</code> property.
	

	 */
	public static final String SubdivisionsPropertyName = "subdivisions";
	private Lazy<BooleanCesiumWriter> m_show = new Lazy<BooleanCesiumWriter>(new Func1<BooleanCesiumWriter>() {
		public BooleanCesiumWriter invoke() {
			return new BooleanCesiumWriter(ShowPropertyName);
		}
	}, false);
	private Lazy<EllipsoidRadiiCesiumWriter> m_radii = new Lazy<cesiumlanguagewriter.EllipsoidRadiiCesiumWriter>(new Func1<cesiumlanguagewriter.EllipsoidRadiiCesiumWriter>() {
		public cesiumlanguagewriter.EllipsoidRadiiCesiumWriter invoke() {
			return new EllipsoidRadiiCesiumWriter(RadiiPropertyName);
		}
	}, false);
	private Lazy<BooleanCesiumWriter> m_fill = new Lazy<BooleanCesiumWriter>(new Func1<BooleanCesiumWriter>() {
		public BooleanCesiumWriter invoke() {
			return new BooleanCesiumWriter(FillPropertyName);
		}
	}, false);
	private Lazy<MaterialCesiumWriter> m_material = new Lazy<MaterialCesiumWriter>(new Func1<MaterialCesiumWriter>() {
		public MaterialCesiumWriter invoke() {
			return new MaterialCesiumWriter(MaterialPropertyName);
		}
	}, false);
	private Lazy<BooleanCesiumWriter> m_outline = new Lazy<BooleanCesiumWriter>(new Func1<BooleanCesiumWriter>() {
		public BooleanCesiumWriter invoke() {
			return new BooleanCesiumWriter(OutlinePropertyName);
		}
	}, false);
	private Lazy<ColorCesiumWriter> m_outlineColor = new Lazy<ColorCesiumWriter>(new Func1<ColorCesiumWriter>() {
		public ColorCesiumWriter invoke() {
			return new ColorCesiumWriter(OutlineColorPropertyName);
		}
	}, false);
	private Lazy<DoubleCesiumWriter> m_outlineWidth = new Lazy<DoubleCesiumWriter>(new Func1<DoubleCesiumWriter>() {
		public DoubleCesiumWriter invoke() {
			return new DoubleCesiumWriter(OutlineWidthPropertyName);
		}
	}, false);
	private Lazy<DoubleCesiumWriter> m_stackPartitions = new Lazy<DoubleCesiumWriter>(new Func1<DoubleCesiumWriter>() {
		public DoubleCesiumWriter invoke() {
			return new DoubleCesiumWriter(StackPartitionsPropertyName);
		}
	}, false);
	private Lazy<DoubleCesiumWriter> m_slicePartitions = new Lazy<DoubleCesiumWriter>(new Func1<DoubleCesiumWriter>() {
		public DoubleCesiumWriter invoke() {
			return new DoubleCesiumWriter(SlicePartitionsPropertyName);
		}
	}, false);
	private Lazy<DoubleCesiumWriter> m_subdivisions = new Lazy<DoubleCesiumWriter>(new Func1<DoubleCesiumWriter>() {
		public DoubleCesiumWriter invoke() {
			return new DoubleCesiumWriter(SubdivisionsPropertyName);
		}
	}, false);

	/**
	 *  
	Initializes a new instance.
	

	 */
	public EllipsoidCesiumWriter(String propertyName) {
		super(propertyName);
	}

	/**
	 *  
	Initializes a new instance as a copy of an existing instance.
	
	

	 * @param existingInstance The existing instance to copy.
	 */
	protected EllipsoidCesiumWriter(EllipsoidCesiumWriter existingInstance) {
		super(existingInstance);
	}

	@Override
	public EllipsoidCesiumWriter clone() {
		return new EllipsoidCesiumWriter(this);
	}

	/**
	 *  Gets the writer for the <code>show</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>show</code> property defines whether or not the ellipsoid is shown.
	

	 */
	public final BooleanCesiumWriter getShowWriter() {
		return m_show.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>show</code> property.  The <code>show</code> property defines whether or not the ellipsoid is shown.
	

	 */
	public final BooleanCesiumWriter openShowProperty() {
		openIntervalIfNecessary();
		return this.<BooleanCesiumWriter> openAndReturn(getShowWriter());
	}

	/**
	 *  
	Writes a value for the <code>show</code> property as a <code>boolean</code> value.  The <code>show</code> property specifies whether or not the ellipsoid is shown.
	
	

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
	Writes a value for the <code>show</code> property as a <code>reference</code> value.  The <code>show</code> property specifies whether or not the ellipsoid is shown.
	
	

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
	Writes a value for the <code>show</code> property as a <code>reference</code> value.  The <code>show</code> property specifies whether or not the ellipsoid is shown.
	
	

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
	Writes a value for the <code>show</code> property as a <code>reference</code> value.  The <code>show</code> property specifies whether or not the ellipsoid is shown.
	
	
	

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
	Writes a value for the <code>show</code> property as a <code>reference</code> value.  The <code>show</code> property specifies whether or not the ellipsoid is shown.
	
	
	

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
	 *  Gets the writer for the <code>radii</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>radii</code> property defines the dimensions of the ellipsoid.
	

	 */
	public final EllipsoidRadiiCesiumWriter getRadiiWriter() {
		return m_radii.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>radii</code> property.  The <code>radii</code> property defines the dimensions of the ellipsoid.
	

	 */
	public final EllipsoidRadiiCesiumWriter openRadiiProperty() {
		openIntervalIfNecessary();
		return this.<EllipsoidRadiiCesiumWriter> openAndReturn(getRadiiWriter());
	}

	/**
	 *  
	Writes a value for the <code>radii</code> property as a <code>cartesian</code> value.  The <code>radii</code> property specifies the dimensions of the ellipsoid.
	
	

	 * @param value The value.
	 */
	public final void writeRadiiProperty(Cartesian value) {
		{
			cesiumlanguagewriter.EllipsoidRadiiCesiumWriter writer = openRadiiProperty();
			try {
				writer.writeCartesian(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>radii</code> property as a <code>cartesian</code> value.  The <code>radii</code> property specifies the dimensions of the ellipsoid.
	
	
	

	 * @param dates The dates at which the vector is specified.
	 * @param values The values corresponding to each date.
	 */
	public final void writeRadiiProperty(List<JulianDate> dates, List<Cartesian> values) {
		{
			cesiumlanguagewriter.EllipsoidRadiiCesiumWriter writer = openRadiiProperty();
			try {
				writer.writeCartesian(dates, values);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>radii</code> property as a <code>cartesian</code> value.  The <code>radii</code> property specifies the dimensions of the ellipsoid.
	
	
	
	
	

	 * @param dates The dates at which the vector is specified.
	 * @param values The values corresponding to each date.
	 * @param startIndex The index of the first element to use in the `values` collection.
	 * @param length The number of elements to use from the `values` collection.
	 */
	public final void writeRadiiProperty(List<JulianDate> dates, List<Cartesian> values, int startIndex, int length) {
		{
			cesiumlanguagewriter.EllipsoidRadiiCesiumWriter writer = openRadiiProperty();
			try {
				writer.writeCartesian(dates, values, startIndex, length);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>radii</code> property as a <code>reference</code> value.  The <code>radii</code> property specifies the dimensions of the ellipsoid.
	
	

	 * @param value The reference.
	 */
	public final void writeRadiiPropertyReference(Reference value) {
		{
			cesiumlanguagewriter.EllipsoidRadiiCesiumWriter writer = openRadiiProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>radii</code> property as a <code>reference</code> value.  The <code>radii</code> property specifies the dimensions of the ellipsoid.
	
	

	 * @param value The earliest date of the interval.
	 */
	public final void writeRadiiPropertyReference(String value) {
		{
			cesiumlanguagewriter.EllipsoidRadiiCesiumWriter writer = openRadiiProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>radii</code> property as a <code>reference</code> value.  The <code>radii</code> property specifies the dimensions of the ellipsoid.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyName The property on the referenced object.
	 */
	public final void writeRadiiPropertyReference(String identifier, String propertyName) {
		{
			cesiumlanguagewriter.EllipsoidRadiiCesiumWriter writer = openRadiiProperty();
			try {
				writer.writeReference(identifier, propertyName);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>radii</code> property as a <code>reference</code> value.  The <code>radii</code> property specifies the dimensions of the ellipsoid.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
	 */
	public final void writeRadiiPropertyReference(String identifier, String[] propertyNames) {
		{
			cesiumlanguagewriter.EllipsoidRadiiCesiumWriter writer = openRadiiProperty();
			try {
				writer.writeReference(identifier, propertyNames);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  Gets the writer for the <code>fill</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>fill</code> property defines whether or not the ellipsoid is filled.
	

	 */
	public final BooleanCesiumWriter getFillWriter() {
		return m_fill.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>fill</code> property.  The <code>fill</code> property defines whether or not the ellipsoid is filled.
	

	 */
	public final BooleanCesiumWriter openFillProperty() {
		openIntervalIfNecessary();
		return this.<BooleanCesiumWriter> openAndReturn(getFillWriter());
	}

	/**
	 *  
	Writes a value for the <code>fill</code> property as a <code>boolean</code> value.  The <code>fill</code> property specifies whether or not the ellipsoid is filled.
	
	

	 * @param value The value.
	 */
	public final void writeFillProperty(boolean value) {
		{
			BooleanCesiumWriter writer = openFillProperty();
			try {
				writer.writeBoolean(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>fill</code> property as a <code>reference</code> value.  The <code>fill</code> property specifies whether or not the ellipsoid is filled.
	
	

	 * @param value The reference.
	 */
	public final void writeFillPropertyReference(Reference value) {
		{
			BooleanCesiumWriter writer = openFillProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>fill</code> property as a <code>reference</code> value.  The <code>fill</code> property specifies whether or not the ellipsoid is filled.
	
	

	 * @param value The earliest date of the interval.
	 */
	public final void writeFillPropertyReference(String value) {
		{
			BooleanCesiumWriter writer = openFillProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>fill</code> property as a <code>reference</code> value.  The <code>fill</code> property specifies whether or not the ellipsoid is filled.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyName The property on the referenced object.
	 */
	public final void writeFillPropertyReference(String identifier, String propertyName) {
		{
			BooleanCesiumWriter writer = openFillProperty();
			try {
				writer.writeReference(identifier, propertyName);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>fill</code> property as a <code>reference</code> value.  The <code>fill</code> property specifies whether or not the ellipsoid is filled.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
	 */
	public final void writeFillPropertyReference(String identifier, String[] propertyNames) {
		{
			BooleanCesiumWriter writer = openFillProperty();
			try {
				writer.writeReference(identifier, propertyNames);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  Gets the writer for the <code>material</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>material</code> property defines the material to display on the surface of the ellipsoid.
	

	 */
	public final MaterialCesiumWriter getMaterialWriter() {
		return m_material.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>material</code> property.  The <code>material</code> property defines the material to display on the surface of the ellipsoid.
	

	 */
	public final MaterialCesiumWriter openMaterialProperty() {
		openIntervalIfNecessary();
		return this.<MaterialCesiumWriter> openAndReturn(getMaterialWriter());
	}

	/**
	 *  Gets the writer for the <code>outline</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>outline</code> property defines whether or not the ellipsoid is outlined.
	

	 */
	public final BooleanCesiumWriter getOutlineWriter() {
		return m_outline.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>outline</code> property.  The <code>outline</code> property defines whether or not the ellipsoid is outlined.
	

	 */
	public final BooleanCesiumWriter openOutlineProperty() {
		openIntervalIfNecessary();
		return this.<BooleanCesiumWriter> openAndReturn(getOutlineWriter());
	}

	/**
	 *  
	Writes a value for the <code>outline</code> property as a <code>boolean</code> value.  The <code>outline</code> property specifies whether or not the ellipsoid is outlined.
	
	

	 * @param value The value.
	 */
	public final void writeOutlineProperty(boolean value) {
		{
			BooleanCesiumWriter writer = openOutlineProperty();
			try {
				writer.writeBoolean(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>outline</code> property as a <code>reference</code> value.  The <code>outline</code> property specifies whether or not the ellipsoid is outlined.
	
	

	 * @param value The reference.
	 */
	public final void writeOutlinePropertyReference(Reference value) {
		{
			BooleanCesiumWriter writer = openOutlineProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>outline</code> property as a <code>reference</code> value.  The <code>outline</code> property specifies whether or not the ellipsoid is outlined.
	
	

	 * @param value The earliest date of the interval.
	 */
	public final void writeOutlinePropertyReference(String value) {
		{
			BooleanCesiumWriter writer = openOutlineProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>outline</code> property as a <code>reference</code> value.  The <code>outline</code> property specifies whether or not the ellipsoid is outlined.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyName The property on the referenced object.
	 */
	public final void writeOutlinePropertyReference(String identifier, String propertyName) {
		{
			BooleanCesiumWriter writer = openOutlineProperty();
			try {
				writer.writeReference(identifier, propertyName);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>outline</code> property as a <code>reference</code> value.  The <code>outline</code> property specifies whether or not the ellipsoid is outlined.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
	 */
	public final void writeOutlinePropertyReference(String identifier, String[] propertyNames) {
		{
			BooleanCesiumWriter writer = openOutlineProperty();
			try {
				writer.writeReference(identifier, propertyNames);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  Gets the writer for the <code>outlineColor</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>outlineColor</code> property defines the color of the ellipsoid outline.
	

	 */
	public final ColorCesiumWriter getOutlineColorWriter() {
		return m_outlineColor.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>outlineColor</code> property.  The <code>outlineColor</code> property defines the color of the ellipsoid outline.
	

	 */
	public final ColorCesiumWriter openOutlineColorProperty() {
		openIntervalIfNecessary();
		return this.<ColorCesiumWriter> openAndReturn(getOutlineColorWriter());
	}

	/**
	 *  
	Writes a value for the <code>outlineColor</code> property as a <code>rgba</code> value.  The <code>outlineColor</code> property specifies the color of the ellipsoid outline.
	
	

	 * @param color The color.
	 */
	public final void writeOutlineColorProperty(Color color) {
		{
			ColorCesiumWriter writer = openOutlineColorProperty();
			try {
				writer.writeRgba(color);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>outlineColor</code> property as a <code>rgba</code> value.  The <code>outlineColor</code> property specifies the color of the ellipsoid outline.
	
	
	
	
	

	 * @param red The red component in the range 0 to 255.
	 * @param green The green component in the range 0 to 255.
	 * @param blue The blue component in the range 0 to 255.
	 * @param alpha The alpha component in the range 0 to 255.
	 */
	public final void writeOutlineColorProperty(int red, int green, int blue, int alpha) {
		{
			ColorCesiumWriter writer = openOutlineColorProperty();
			try {
				writer.writeRgba(red, green, blue, alpha);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>outlineColor</code> property as a <code>rgba</code> value.  The <code>outlineColor</code> property specifies the color of the ellipsoid outline.
	
	
	
	
	

	 * @param dates The dates at which the value is specified.
	 * @param colors The color corresponding to each date.
	 * @param startIndex The index of the first element to use in the `colors` collection.
	 * @param length The number of elements to use from the `colors` collection.
	 */
	public final void writeOutlineColorProperty(List<JulianDate> dates, List<Color> colors, int startIndex, int length) {
		{
			ColorCesiumWriter writer = openOutlineColorProperty();
			try {
				writer.writeRgba(dates, colors, startIndex, length);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>outlineColor</code> property as a <code>rgbaf</code> value.  The <code>outlineColor</code> property specifies the color of the ellipsoid outline.
	
	
	
	
	

	 * @param red The red component in the range 0 to 1.0.
	 * @param green The green component in the range 0 to 1.0.
	 * @param blue The blue component in the range 0 to 1.0.
	 * @param alpha The alpha component in the range 0 to 1.0.
	 */
	public final void writeOutlineColorPropertyRgbaf(float red, float green, float blue, float alpha) {
		{
			ColorCesiumWriter writer = openOutlineColorProperty();
			try {
				writer.writeRgbaf(red, green, blue, alpha);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>outlineColor</code> property as a <code>reference</code> value.  The <code>outlineColor</code> property specifies the color of the ellipsoid outline.
	
	

	 * @param value The reference.
	 */
	public final void writeOutlineColorPropertyReference(Reference value) {
		{
			ColorCesiumWriter writer = openOutlineColorProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>outlineColor</code> property as a <code>reference</code> value.  The <code>outlineColor</code> property specifies the color of the ellipsoid outline.
	
	

	 * @param value The earliest date of the interval.
	 */
	public final void writeOutlineColorPropertyReference(String value) {
		{
			ColorCesiumWriter writer = openOutlineColorProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>outlineColor</code> property as a <code>reference</code> value.  The <code>outlineColor</code> property specifies the color of the ellipsoid outline.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyName The property on the referenced object.
	 */
	public final void writeOutlineColorPropertyReference(String identifier, String propertyName) {
		{
			ColorCesiumWriter writer = openOutlineColorProperty();
			try {
				writer.writeReference(identifier, propertyName);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>outlineColor</code> property as a <code>reference</code> value.  The <code>outlineColor</code> property specifies the color of the ellipsoid outline.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
	 */
	public final void writeOutlineColorPropertyReference(String identifier, String[] propertyNames) {
		{
			ColorCesiumWriter writer = openOutlineColorProperty();
			try {
				writer.writeReference(identifier, propertyNames);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  Gets the writer for the <code>outlineWidth</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>outlineWidth</code> property defines the width of the ellipsoid outline.
	

	 */
	public final DoubleCesiumWriter getOutlineWidthWriter() {
		return m_outlineWidth.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>outlineWidth</code> property.  The <code>outlineWidth</code> property defines the width of the ellipsoid outline.
	

	 */
	public final DoubleCesiumWriter openOutlineWidthProperty() {
		openIntervalIfNecessary();
		return this.<DoubleCesiumWriter> openAndReturn(getOutlineWidthWriter());
	}

	/**
	 *  
	Writes a value for the <code>outlineWidth</code> property as a <code>number</code> value.  The <code>outlineWidth</code> property specifies the width of the ellipsoid outline.
	
	

	 * @param value The value.
	 */
	public final void writeOutlineWidthProperty(double value) {
		{
			DoubleCesiumWriter writer = openOutlineWidthProperty();
			try {
				writer.writeNumber(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>outlineWidth</code> property as a <code>number</code> value.  The <code>outlineWidth</code> property specifies the width of the ellipsoid outline.
	
	
	
	
	

	 * @param dates The dates at which the value is specified.
	 * @param values The value corresponding to each date.
	 * @param startIndex The index of the first element to use in the `values` collection.
	 * @param length The number of elements to use from the `values` collection.
	 */
	public final void writeOutlineWidthProperty(List<JulianDate> dates, List<Double> values, int startIndex, int length) {
		{
			DoubleCesiumWriter writer = openOutlineWidthProperty();
			try {
				writer.writeNumber(dates, values, startIndex, length);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>outlineWidth</code> property as a <code>reference</code> value.  The <code>outlineWidth</code> property specifies the width of the ellipsoid outline.
	
	

	 * @param value The reference.
	 */
	public final void writeOutlineWidthPropertyReference(Reference value) {
		{
			DoubleCesiumWriter writer = openOutlineWidthProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>outlineWidth</code> property as a <code>reference</code> value.  The <code>outlineWidth</code> property specifies the width of the ellipsoid outline.
	
	

	 * @param value The earliest date of the interval.
	 */
	public final void writeOutlineWidthPropertyReference(String value) {
		{
			DoubleCesiumWriter writer = openOutlineWidthProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>outlineWidth</code> property as a <code>reference</code> value.  The <code>outlineWidth</code> property specifies the width of the ellipsoid outline.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyName The property on the referenced object.
	 */
	public final void writeOutlineWidthPropertyReference(String identifier, String propertyName) {
		{
			DoubleCesiumWriter writer = openOutlineWidthProperty();
			try {
				writer.writeReference(identifier, propertyName);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>outlineWidth</code> property as a <code>reference</code> value.  The <code>outlineWidth</code> property specifies the width of the ellipsoid outline.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
	 */
	public final void writeOutlineWidthPropertyReference(String identifier, String[] propertyNames) {
		{
			DoubleCesiumWriter writer = openOutlineWidthProperty();
			try {
				writer.writeReference(identifier, propertyNames);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  Gets the writer for the <code>stackPartitions</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>stackPartitions</code> property defines the number of times to partition the ellipsoid into stacks.
	

	 */
	public final DoubleCesiumWriter getStackPartitionsWriter() {
		return m_stackPartitions.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>stackPartitions</code> property.  The <code>stackPartitions</code> property defines the number of times to partition the ellipsoid into stacks.
	

	 */
	public final DoubleCesiumWriter openStackPartitionsProperty() {
		openIntervalIfNecessary();
		return this.<DoubleCesiumWriter> openAndReturn(getStackPartitionsWriter());
	}

	/**
	 *  
	Writes a value for the <code>stackPartitions</code> property as a <code>number</code> value.  The <code>stackPartitions</code> property specifies the number of times to partition the ellipsoid into stacks.
	
	

	 * @param value The value.
	 */
	public final void writeStackPartitionsProperty(double value) {
		{
			DoubleCesiumWriter writer = openStackPartitionsProperty();
			try {
				writer.writeNumber(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>stackPartitions</code> property as a <code>number</code> value.  The <code>stackPartitions</code> property specifies the number of times to partition the ellipsoid into stacks.
	
	
	
	
	

	 * @param dates The dates at which the value is specified.
	 * @param values The value corresponding to each date.
	 * @param startIndex The index of the first element to use in the `values` collection.
	 * @param length The number of elements to use from the `values` collection.
	 */
	public final void writeStackPartitionsProperty(List<JulianDate> dates, List<Double> values, int startIndex, int length) {
		{
			DoubleCesiumWriter writer = openStackPartitionsProperty();
			try {
				writer.writeNumber(dates, values, startIndex, length);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>stackPartitions</code> property as a <code>reference</code> value.  The <code>stackPartitions</code> property specifies the number of times to partition the ellipsoid into stacks.
	
	

	 * @param value The reference.
	 */
	public final void writeStackPartitionsPropertyReference(Reference value) {
		{
			DoubleCesiumWriter writer = openStackPartitionsProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>stackPartitions</code> property as a <code>reference</code> value.  The <code>stackPartitions</code> property specifies the number of times to partition the ellipsoid into stacks.
	
	

	 * @param value The earliest date of the interval.
	 */
	public final void writeStackPartitionsPropertyReference(String value) {
		{
			DoubleCesiumWriter writer = openStackPartitionsProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>stackPartitions</code> property as a <code>reference</code> value.  The <code>stackPartitions</code> property specifies the number of times to partition the ellipsoid into stacks.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyName The property on the referenced object.
	 */
	public final void writeStackPartitionsPropertyReference(String identifier, String propertyName) {
		{
			DoubleCesiumWriter writer = openStackPartitionsProperty();
			try {
				writer.writeReference(identifier, propertyName);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>stackPartitions</code> property as a <code>reference</code> value.  The <code>stackPartitions</code> property specifies the number of times to partition the ellipsoid into stacks.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
	 */
	public final void writeStackPartitionsPropertyReference(String identifier, String[] propertyNames) {
		{
			DoubleCesiumWriter writer = openStackPartitionsProperty();
			try {
				writer.writeReference(identifier, propertyNames);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  Gets the writer for the <code>slicePartitions</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>slicePartitions</code> property defines the number of times to partition the ellipsoid into radial slices.
	

	 */
	public final DoubleCesiumWriter getSlicePartitionsWriter() {
		return m_slicePartitions.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>slicePartitions</code> property.  The <code>slicePartitions</code> property defines the number of times to partition the ellipsoid into radial slices.
	

	 */
	public final DoubleCesiumWriter openSlicePartitionsProperty() {
		openIntervalIfNecessary();
		return this.<DoubleCesiumWriter> openAndReturn(getSlicePartitionsWriter());
	}

	/**
	 *  
	Writes a value for the <code>slicePartitions</code> property as a <code>number</code> value.  The <code>slicePartitions</code> property specifies the number of times to partition the ellipsoid into radial slices.
	
	

	 * @param value The value.
	 */
	public final void writeSlicePartitionsProperty(double value) {
		{
			DoubleCesiumWriter writer = openSlicePartitionsProperty();
			try {
				writer.writeNumber(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>slicePartitions</code> property as a <code>number</code> value.  The <code>slicePartitions</code> property specifies the number of times to partition the ellipsoid into radial slices.
	
	
	
	
	

	 * @param dates The dates at which the value is specified.
	 * @param values The value corresponding to each date.
	 * @param startIndex The index of the first element to use in the `values` collection.
	 * @param length The number of elements to use from the `values` collection.
	 */
	public final void writeSlicePartitionsProperty(List<JulianDate> dates, List<Double> values, int startIndex, int length) {
		{
			DoubleCesiumWriter writer = openSlicePartitionsProperty();
			try {
				writer.writeNumber(dates, values, startIndex, length);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>slicePartitions</code> property as a <code>reference</code> value.  The <code>slicePartitions</code> property specifies the number of times to partition the ellipsoid into radial slices.
	
	

	 * @param value The reference.
	 */
	public final void writeSlicePartitionsPropertyReference(Reference value) {
		{
			DoubleCesiumWriter writer = openSlicePartitionsProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>slicePartitions</code> property as a <code>reference</code> value.  The <code>slicePartitions</code> property specifies the number of times to partition the ellipsoid into radial slices.
	
	

	 * @param value The earliest date of the interval.
	 */
	public final void writeSlicePartitionsPropertyReference(String value) {
		{
			DoubleCesiumWriter writer = openSlicePartitionsProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>slicePartitions</code> property as a <code>reference</code> value.  The <code>slicePartitions</code> property specifies the number of times to partition the ellipsoid into radial slices.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyName The property on the referenced object.
	 */
	public final void writeSlicePartitionsPropertyReference(String identifier, String propertyName) {
		{
			DoubleCesiumWriter writer = openSlicePartitionsProperty();
			try {
				writer.writeReference(identifier, propertyName);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>slicePartitions</code> property as a <code>reference</code> value.  The <code>slicePartitions</code> property specifies the number of times to partition the ellipsoid into radial slices.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
	 */
	public final void writeSlicePartitionsPropertyReference(String identifier, String[] propertyNames) {
		{
			DoubleCesiumWriter writer = openSlicePartitionsProperty();
			try {
				writer.writeReference(identifier, propertyNames);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  Gets the writer for the <code>subdivisions</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>subdivisions</code> property defines the number of points per outline line, determining the granularity of the curvature.
	

	 */
	public final DoubleCesiumWriter getSubdivisionsWriter() {
		return m_subdivisions.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>subdivisions</code> property.  The <code>subdivisions</code> property defines the number of points per outline line, determining the granularity of the curvature.
	

	 */
	public final DoubleCesiumWriter openSubdivisionsProperty() {
		openIntervalIfNecessary();
		return this.<DoubleCesiumWriter> openAndReturn(getSubdivisionsWriter());
	}

	/**
	 *  
	Writes a value for the <code>subdivisions</code> property as a <code>number</code> value.  The <code>subdivisions</code> property specifies the number of points per outline line, determining the granularity of the curvature.
	
	

	 * @param value The value.
	 */
	public final void writeSubdivisionsProperty(double value) {
		{
			DoubleCesiumWriter writer = openSubdivisionsProperty();
			try {
				writer.writeNumber(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>subdivisions</code> property as a <code>number</code> value.  The <code>subdivisions</code> property specifies the number of points per outline line, determining the granularity of the curvature.
	
	
	
	
	

	 * @param dates The dates at which the value is specified.
	 * @param values The value corresponding to each date.
	 * @param startIndex The index of the first element to use in the `values` collection.
	 * @param length The number of elements to use from the `values` collection.
	 */
	public final void writeSubdivisionsProperty(List<JulianDate> dates, List<Double> values, int startIndex, int length) {
		{
			DoubleCesiumWriter writer = openSubdivisionsProperty();
			try {
				writer.writeNumber(dates, values, startIndex, length);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>subdivisions</code> property as a <code>reference</code> value.  The <code>subdivisions</code> property specifies the number of points per outline line, determining the granularity of the curvature.
	
	

	 * @param value The reference.
	 */
	public final void writeSubdivisionsPropertyReference(Reference value) {
		{
			DoubleCesiumWriter writer = openSubdivisionsProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>subdivisions</code> property as a <code>reference</code> value.  The <code>subdivisions</code> property specifies the number of points per outline line, determining the granularity of the curvature.
	
	

	 * @param value The earliest date of the interval.
	 */
	public final void writeSubdivisionsPropertyReference(String value) {
		{
			DoubleCesiumWriter writer = openSubdivisionsProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>subdivisions</code> property as a <code>reference</code> value.  The <code>subdivisions</code> property specifies the number of points per outline line, determining the granularity of the curvature.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyName The property on the referenced object.
	 */
	public final void writeSubdivisionsPropertyReference(String identifier, String propertyName) {
		{
			DoubleCesiumWriter writer = openSubdivisionsProperty();
			try {
				writer.writeReference(identifier, propertyName);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>subdivisions</code> property as a <code>reference</code> value.  The <code>subdivisions</code> property specifies the number of points per outline line, determining the granularity of the curvature.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
	 */
	public final void writeSubdivisionsPropertyReference(String identifier, String[] propertyNames) {
		{
			DoubleCesiumWriter writer = openSubdivisionsProperty();
			try {
				writer.writeReference(identifier, propertyNames);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}
}