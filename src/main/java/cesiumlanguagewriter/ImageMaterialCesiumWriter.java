package cesiumlanguagewriter;


import agi.foundation.compatibility.*;
import agi.foundation.compatibility.DisposeHelper;
import agi.foundation.compatibility.Func1;
import agi.foundation.compatibility.Lazy;
import cesiumlanguagewriter.advanced.*;
import cesiumlanguagewriter.DoubleCesiumWriter;
import cesiumlanguagewriter.RepeatCesiumWriter;
import cesiumlanguagewriter.UriCesiumWriter;
import java.awt.image.RenderedImage;
import java.net.URI;
import java.util.List;

/**
 *  
 Writes a <code>ImageMaterial</code> to a  {@link CesiumOutputStream}.  A <code>ImageMaterial</code> fills the surface with an image.
 

 */
public class ImageMaterialCesiumWriter extends CesiumPropertyWriter<ImageMaterialCesiumWriter> {
	/**
	 *  
	The name of the <code>image</code> property.
	

	 */
	public static final String ImagePropertyName = "image";
	/**
	 *  
	The name of the <code>alpha</code> property.
	

	 */
	public static final String AlphaPropertyName = "alpha";
	/**
	 *  
	The name of the <code>repeat</code> property.
	

	 */
	public static final String RepeatPropertyName = "repeat";
	private Lazy<UriCesiumWriter> m_image = new Lazy<UriCesiumWriter>(new Func1<UriCesiumWriter>() {
		public UriCesiumWriter invoke() {
			return new UriCesiumWriter(ImagePropertyName);
		}
	}, false);
	private Lazy<DoubleCesiumWriter> m_alpha = new Lazy<DoubleCesiumWriter>(new Func1<DoubleCesiumWriter>() {
		public DoubleCesiumWriter invoke() {
			return new DoubleCesiumWriter(AlphaPropertyName);
		}
	}, false);
	private Lazy<RepeatCesiumWriter> m_repeat = new Lazy<RepeatCesiumWriter>(new Func1<RepeatCesiumWriter>() {
		public RepeatCesiumWriter invoke() {
			return new RepeatCesiumWriter(RepeatPropertyName);
		}
	}, false);

	/**
	 *  
	Initializes a new instance.
	

	 */
	public ImageMaterialCesiumWriter(String propertyName) {
		super(propertyName);
	}

	/**
	 *  
	Initializes a new instance as a copy of an existing instance.
	
	

	 * @param existingInstance The existing instance to copy.
	 */
	protected ImageMaterialCesiumWriter(ImageMaterialCesiumWriter existingInstance) {
		super(existingInstance);
	}

	@Override
	public ImageMaterialCesiumWriter clone() {
		return new ImageMaterialCesiumWriter(this);
	}

	/**
	 *  Gets the writer for the <code>image</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>image</code> property defines the image to display on the surface.
	

	 */
	public final UriCesiumWriter getImageWriter() {
		return m_image.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>image</code> property.  The <code>image</code> property defines the image to display on the surface.
	

	 */
	public final UriCesiumWriter openImageProperty() {
		openIntervalIfNecessary();
		return this.<UriCesiumWriter> openAndReturn(getImageWriter());
	}

	/**
	 *  
	Writes a value for the <code>image</code> property as a <code>uri</code> value.  The <code>image</code> property specifies the image to display on the surface.
	
	

	 * @param resource A resource object describing external data.
	 */
	public final void writeImageProperty(CesiumResource resource) {
		{
			UriCesiumWriter writer = openImageProperty();
			try {
				writer.writeUri(resource);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>image</code> property as a <code>uri</code> value.  The <code>image</code> property specifies the image to display on the surface.
	
	
	

	 * @param uri The URI of the data.
	 * @param resourceBehavior An enumeration describing how to include the URI in the document. For even more control, use the overload that takes a ICesiumUriResolver.
	 */
	public final void writeImageProperty(URI uri, CesiumResourceBehavior resourceBehavior) {
		{
			UriCesiumWriter writer = openImageProperty();
			try {
				writer.writeUri(uri, resourceBehavior);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>image</code> property as a <code>uri</code> value.  The <code>image</code> property specifies the image to display on the surface.
	
	
	

	 * @param uri The URI of the data.
	 * @param resourceBehavior An enumeration describing how to include the URI in the document. For even more control, use the overload that takes a ICesiumUriResolver.
	 */
	public final void writeImageProperty(String uri, CesiumResourceBehavior resourceBehavior) {
		{
			UriCesiumWriter writer = openImageProperty();
			try {
				writer.writeUri(uri, resourceBehavior);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>image</code> property as a <code>uri</code> value.  The <code>image</code> property specifies the image to display on the surface.
	
	
	

	 * @param uri The URI of the data.  The provided ICesiumUriResolver will be used to build the final URI embedded in the document.
	 * @param resolver An ICesiumUriResolver used to build the final URI that will be embedded in the document.
	 */
	public final void writeImageProperty(URI uri, ICesiumUriResolver resolver) {
		{
			UriCesiumWriter writer = openImageProperty();
			try {
				writer.writeUri(uri, resolver);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>image</code> property as a <code>uri</code> value.  The <code>image</code> property specifies the image to display on the surface.
	
	
	

	 * @param uri The URI of the data.  The provided ICesiumUriResolver will be used to build the final URI embedded in the document.
	 * @param resolver An ICesiumUriResolver used to build the final URI that will be embedded in the document.
	 */
	public final void writeImageProperty(String uri, ICesiumUriResolver resolver) {
		{
			UriCesiumWriter writer = openImageProperty();
			try {
				writer.writeUri(uri, resolver);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>image</code> property as a <code>uri</code> value.  The <code>image</code> property specifies the image to display on the surface.
	
	

	 * @param image The image.  A data URI will be created for this image, using PNG encoding.
	 */
	public final void writeImageProperty(RenderedImage image) {
		{
			UriCesiumWriter writer = openImageProperty();
			try {
				writer.writeUri(image);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>image</code> property as a <code>uri</code> value.  The <code>image</code> property specifies the image to display on the surface.
	
	
	

	 * @param image The image.  A data URI will be created for this image.
	 * @param imageFormat The image format to use to encode the image in the data URI.
	 */
	public final void writeImageProperty(RenderedImage image, CesiumImageFormat imageFormat) {
		{
			UriCesiumWriter writer = openImageProperty();
			try {
				writer.writeUri(image, imageFormat);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>image</code> property as a <code>reference</code> value.  The <code>image</code> property specifies the image to display on the surface.
	
	

	 * @param value The reference.
	 */
	public final void writeImagePropertyReference(Reference value) {
		{
			UriCesiumWriter writer = openImageProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>image</code> property as a <code>reference</code> value.  The <code>image</code> property specifies the image to display on the surface.
	
	

	 * @param value The earliest date of the interval.
	 */
	public final void writeImagePropertyReference(String value) {
		{
			UriCesiumWriter writer = openImageProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>image</code> property as a <code>reference</code> value.  The <code>image</code> property specifies the image to display on the surface.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyName The property on the referenced object.
	 */
	public final void writeImagePropertyReference(String identifier, String propertyName) {
		{
			UriCesiumWriter writer = openImageProperty();
			try {
				writer.writeReference(identifier, propertyName);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>image</code> property as a <code>reference</code> value.  The <code>image</code> property specifies the image to display on the surface.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
	 */
	public final void writeImagePropertyReference(String identifier, String[] propertyNames) {
		{
			UriCesiumWriter writer = openImageProperty();
			try {
				writer.writeReference(identifier, propertyNames);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  Gets the writer for the <code>alpha</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>alpha</code> property defines the alpha value for the whole image.  This will be multiplied with alpha values within the image, if any.
	

	 */
	public final DoubleCesiumWriter getAlphaWriter() {
		return m_alpha.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>alpha</code> property.  The <code>alpha</code> property defines the alpha value for the whole image.  This will be multiplied with alpha values within the image, if any.
	

	 */
	public final DoubleCesiumWriter openAlphaProperty() {
		openIntervalIfNecessary();
		return this.<DoubleCesiumWriter> openAndReturn(getAlphaWriter());
	}

	/**
	 *  
	Writes a value for the <code>alpha</code> property as a <code>number</code> value.  The <code>alpha</code> property specifies the alpha value for the whole image.  This will be multiplied with alpha values within the image, if any.
	
	

	 * @param value The value.
	 */
	public final void writeAlphaProperty(double value) {
		{
			DoubleCesiumWriter writer = openAlphaProperty();
			try {
				writer.writeNumber(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>alpha</code> property as a <code>number</code> value.  The <code>alpha</code> property specifies the alpha value for the whole image.  This will be multiplied with alpha values within the image, if any.
	
	
	
	
	

	 * @param dates The dates at which the value is specified.
	 * @param values The value corresponding to each date.
	 * @param startIndex The index of the first element to use in the `values` collection.
	 * @param length The number of elements to use from the `values` collection.
	 */
	public final void writeAlphaProperty(List<JulianDate> dates, List<Double> values, int startIndex, int length) {
		{
			DoubleCesiumWriter writer = openAlphaProperty();
			try {
				writer.writeNumber(dates, values, startIndex, length);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>alpha</code> property as a <code>reference</code> value.  The <code>alpha</code> property specifies the alpha value for the whole image.  This will be multiplied with alpha values within the image, if any.
	
	

	 * @param value The reference.
	 */
	public final void writeAlphaPropertyReference(Reference value) {
		{
			DoubleCesiumWriter writer = openAlphaProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>alpha</code> property as a <code>reference</code> value.  The <code>alpha</code> property specifies the alpha value for the whole image.  This will be multiplied with alpha values within the image, if any.
	
	

	 * @param value The earliest date of the interval.
	 */
	public final void writeAlphaPropertyReference(String value) {
		{
			DoubleCesiumWriter writer = openAlphaProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>alpha</code> property as a <code>reference</code> value.  The <code>alpha</code> property specifies the alpha value for the whole image.  This will be multiplied with alpha values within the image, if any.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyName The property on the referenced object.
	 */
	public final void writeAlphaPropertyReference(String identifier, String propertyName) {
		{
			DoubleCesiumWriter writer = openAlphaProperty();
			try {
				writer.writeReference(identifier, propertyName);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>alpha</code> property as a <code>reference</code> value.  The <code>alpha</code> property specifies the alpha value for the whole image.  This will be multiplied with alpha values within the image, if any.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
	 */
	public final void writeAlphaPropertyReference(String identifier, String[] propertyNames) {
		{
			DoubleCesiumWriter writer = openAlphaProperty();
			try {
				writer.writeReference(identifier, propertyNames);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  Gets the writer for the <code>repeat</code> property.  The returned instance must be opened by calling the  {@link CesiumElementWriter#open} method before it can be used for writing.  The <code>repeat</code> property defines the number of times the image repeats along each axis.
	

	 */
	public final RepeatCesiumWriter getRepeatWriter() {
		return m_repeat.getValue();
	}

	/**
	 *  
	Opens and returns the writer for the <code>repeat</code> property.  The <code>repeat</code> property defines the number of times the image repeats along each axis.
	

	 */
	public final RepeatCesiumWriter openRepeatProperty() {
		openIntervalIfNecessary();
		return this.<RepeatCesiumWriter> openAndReturn(getRepeatWriter());
	}

	/**
	 *  
	Writes a value for the <code>repeat</code> property as a <code>cartesian2</code> value.  The <code>repeat</code> property specifies the number of times the image repeats along each axis.
	
	

	 * @param value The value.
	 */
	public final void writeRepeatProperty(Rectangular value) {
		{
			RepeatCesiumWriter writer = openRepeatProperty();
			try {
				writer.writeCartesian2(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>repeat</code> property as a <code>cartesian2</code> value.  The <code>repeat</code> property specifies the number of times the image repeats along each axis.
	
	
	

	 * @param x The X component.
	 * @param y The Y component.
	 */
	public final void writeRepeatProperty(double x, double y) {
		{
			RepeatCesiumWriter writer = openRepeatProperty();
			try {
				writer.writeCartesian2(x, y);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>repeat</code> property as a <code>cartesian2</code> value.  The <code>repeat</code> property specifies the number of times the image repeats along each axis.
	
	
	

	 * @param dates The dates at which the vector is specified.
	 * @param values The values corresponding to each date.
	 */
	public final void writeRepeatProperty(List<JulianDate> dates, List<Rectangular> values) {
		{
			RepeatCesiumWriter writer = openRepeatProperty();
			try {
				writer.writeCartesian2(dates, values);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>repeat</code> property as a <code>cartesian2</code> value.  The <code>repeat</code> property specifies the number of times the image repeats along each axis.
	
	
	
	
	

	 * @param dates The dates at which the vector is specified.
	 * @param values The values corresponding to each date.
	 * @param startIndex The index of the first element to use in the `values` collection.
	 * @param length The number of elements to use from the `values` collection.
	 */
	public final void writeRepeatProperty(List<JulianDate> dates, List<Rectangular> values, int startIndex, int length) {
		{
			RepeatCesiumWriter writer = openRepeatProperty();
			try {
				writer.writeCartesian2(dates, values, startIndex, length);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>repeat</code> property as a <code>reference</code> value.  The <code>repeat</code> property specifies the number of times the image repeats along each axis.
	
	

	 * @param value The reference.
	 */
	public final void writeRepeatPropertyReference(Reference value) {
		{
			RepeatCesiumWriter writer = openRepeatProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>repeat</code> property as a <code>reference</code> value.  The <code>repeat</code> property specifies the number of times the image repeats along each axis.
	
	

	 * @param value The earliest date of the interval.
	 */
	public final void writeRepeatPropertyReference(String value) {
		{
			RepeatCesiumWriter writer = openRepeatProperty();
			try {
				writer.writeReference(value);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>repeat</code> property as a <code>reference</code> value.  The <code>repeat</code> property specifies the number of times the image repeats along each axis.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyName The property on the referenced object.
	 */
	public final void writeRepeatPropertyReference(String identifier, String propertyName) {
		{
			RepeatCesiumWriter writer = openRepeatProperty();
			try {
				writer.writeReference(identifier, propertyName);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}

	/**
	 *  
	Writes a value for the <code>repeat</code> property as a <code>reference</code> value.  The <code>repeat</code> property specifies the number of times the image repeats along each axis.
	
	
	

	 * @param identifier The identifier of the object which contains the referenced property.
	 * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
	 */
	public final void writeRepeatPropertyReference(String identifier, String[] propertyNames) {
		{
			RepeatCesiumWriter writer = openRepeatProperty();
			try {
				writer.writeReference(identifier, propertyNames);
			} finally {
				DisposeHelper.dispose(writer);
			}
		}
	}
}