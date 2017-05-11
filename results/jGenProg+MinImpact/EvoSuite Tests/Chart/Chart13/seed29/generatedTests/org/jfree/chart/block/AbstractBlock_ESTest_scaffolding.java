/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Jan 29 21:19:20 GMT 2017
 */

package org.jfree.chart.block;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class AbstractBlock_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jfree.chart.block.AbstractBlock"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("user.dir", "/tmp/chart_13_Genprog_local_s1/outputMutation/AstorMain-Chart/src/evosuite/default"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AbstractBlock_ESTest_scaffolding.class.getClassLoader() ,
      "org.jfree.chart.event.ChartProgressListener",
      "org.jfree.chart.labels.StandardPieSectionLabelGenerator",
      "org.jfree.chart.labels.AbstractPieItemLabelGenerator",
      "com.lowagie.text.pdf.TrueTypeFontUnicode",
      "org.jfree.chart.renderer.xy.DeviationRenderer$State",
      "org.jfree.chart.text.TextBox",
      "org.jfree.chart.plot.ValueMarker",
      "org.jfree.chart.labels.CategorySeriesLabelGenerator",
      "com.lowagie.text.Jpeg2000",
      "com.lowagie.text.pdf.PdfOCG",
      "org.jfree.chart.renderer.xy.XYAreaRenderer",
      "com.lowagie.text.Element",
      "org.jfree.data.general.ValueDataset",
      "com.lowagie.text.pdf.collection.PdfCollectionItem",
      "com.lowagie.text.pdf.interfaces.PdfViewerPreferences",
      "com.lowagie.text.pdf.PdfEncodings$SymbolTTConversion",
      "com.lowagie.text.pdf.PdfPCellEvent",
      "com.lowagie.text.xml.xmp.XmpWriter",
      "org.jfree.chart.LegendItemCollection",
      "com.lowagie.text.pdf.PdfPatternPainter",
      "org.jfree.chart.renderer.xy.XYItemRenderer",
      "org.jfree.chart.axis.CategoryAxis",
      "com.lowagie.text.pdf.ExtraEncoding",
      "org.jfree.chart.ui.ProjectInfo",
      "org.jfree.chart.renderer.RendererState",
      "com.lowagie.text.xml.xmp.PdfA1Schema",
      "org.jfree.chart.text.TextFragment",
      "org.jfree.chart.entity.StandardEntityCollection",
      "com.lowagie.text.pdf.CJKFont",
      "com.lowagie.text.pdf.DefaultFontMapper$BaseFontParameters",
      "com.lowagie.text.pdf.PdfBoolean",
      "com.lowagie.text.TextElementArray",
      "org.jfree.chart.labels.StandardXYSeriesLabelGenerator",
      "org.jfree.chart.labels.ItemLabelPosition",
      "org.jfree.chart.annotations.XYPointerAnnotation",
      "org.jfree.chart.plot.CategoryPlot",
      "org.jfree.chart.event.MarkerChangeListener",
      "com.lowagie.text.pdf.interfaces.PdfPageActions",
      "org.jfree.chart.event.PlotChangeEvent",
      "com.lowagie.text.pdf.internal.PdfAnnotationsImp",
      "com.lowagie.text.pdf.AsianFontMapper",
      "org.jfree.chart.plot.PiePlot",
      "org.jfree.chart.util.PaintList",
      "org.jfree.chart.labels.ItemLabelAnchor",
      "com.lowagie.text.pdf.PageResources",
      "com.lowagie.text.HeaderFooter",
      "org.jfree.chart.ui.Contributor",
      "org.jfree.chart.event.RendererChangeEvent",
      "org.jfree.chart.text.G2TextMeasurer",
      "com.lowagie.text.pdf.PdfStructureElement",
      "org.jfree.chart.util.RectangleAnchor",
      "com.lowagie.text.pdf.PdfException",
      "com.lowagie.text.pdf.PdfIndirectReference",
      "org.jfree.chart.block.CenterArrangement",
      "org.jfree.chart.entity.XYAnnotationEntity",
      "com.lowagie.text.pdf.PdfPTable",
      "org.jfree.chart.labels.PieSectionLabelGenerator",
      "com.lowagie.text.pdf.DocumentFont",
      "org.jfree.chart.text.TextBlock",
      "com.lowagie.text.pdf.ColorDetails",
      "org.jfree.chart.axis.Axis",
      "org.jfree.chart.urls.PieURLGenerator",
      "com.lowagie.text.pdf.PdfPattern",
      "com.lowagie.text.pdf.PdfRectangle",
      "com.lowagie.text.pdf.PdfArray",
      "org.jfree.chart.util.ShapeList",
      "org.jfree.chart.block.BlockBorder",
      "com.lowagie.text.pdf.PdfPageEvent",
      "com.lowagie.text.pdf.collection.PdfCollection",
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.urls.XYURLGenerator",
      "org.jfree.chart.annotations.XYAnnotation",
      "org.jfree.chart.util.ObjectUtilities",
      "com.lowagie.text.pdf.OutputStreamCounter",
      "org.jfree.chart.util.HorizontalAlignment",
      "com.lowagie.text.DocWriter",
      "com.lowagie.text.pdf.PdfOutline",
      "org.jfree.chart.axis.CategoryAnchor",
      "org.jfree.chart.plot.DatasetRenderingOrder",
      "org.jfree.chart.event.RendererChangeListener",
      "org.jfree.data.KeyedValues",
      "org.jfree.chart.block.FlowArrangement",
      "org.jfree.chart.title.CompositeTitle",
      "com.lowagie.text.pdf.PdfSpotColor",
      "org.jfree.chart.entity.XYItemEntity",
      "org.jfree.chart.event.TitleChangeListener",
      "org.jfree.chart.axis.CategoryLabelPositions",
      "org.jfree.chart.plot.DialShape",
      "org.jfree.chart.text.TextMeasurer",
      "org.jfree.chart.LegendItemSource",
      "com.lowagie.text.pdf.PdfAction",
      "com.lowagie.text.pdf.PdfTransition",
      "org.jfree.chart.plot.PieLabelLinkStyle",
      "org.jfree.data.general.DatasetChangeListener",
      "com.lowagie.text.pdf.PdfPages",
      "org.jfree.chart.block.BlockParams",
      "org.jfree.chart.event.TitleChangeEvent",
      "org.jfree.chart.annotations.CategoryAnnotation",
      "org.jfree.chart.ui.ExtensionFileFilter",
      "org.jfree.chart.axis.AxisSpace",
      "org.jfree.chart.ui.Licences",
      "org.jfree.chart.plot.MeterInterval",
      "org.jfree.chart.block.EmptyBlock",
      "org.jfree.data.general.DatasetGroup",
      "com.lowagie.text.pdf.Type3Font",
      "org.jfree.chart.event.ChartChangeEventType",
      "org.jfree.chart.util.Rotation",
      "com.lowagie.text.pdf.PdfNull",
      "com.lowagie.text.pdf.PdfOCProperties",
      "org.jfree.chart.block.BlockResult",
      "com.lowagie.text.xml.xmp.PdfSchema",
      "org.jfree.chart.axis.ExtendedCategoryAxis",
      "com.lowagie.text.pdf.PdfDocument",
      "com.lowagie.text.pdf.ByteBuffer",
      "org.jfree.chart.renderer.category.CategoryItemRenderer",
      "com.lowagie.text.pdf.PdfBorderDictionary",
      "org.jfree.chart.util.Size2D",
      "org.jfree.chart.annotations.CategoryTextAnnotation",
      "com.lowagie.text.pdf.PdfAnnotation",
      "org.jfree.chart.util.ShapeUtilities",
      "com.lowagie.text.pdf.PdfSignature",
      "com.lowagie.text.pdf.PdfMediaClipData",
      "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer$State",
      "org.jfree.chart.ChartPanel",
      "org.jfree.chart.resources.JFreeChartResources",
      "org.jfree.data.RangeType",
      "com.lowagie.text.pdf.PdfStructureTreeRoot",
      "org.jfree.chart.axis.TickUnits",
      "com.lowagie.text.pdf.PdfWriter",
      "com.lowagie.text.pdf.PdfLiteral",
      "org.jfree.chart.title.DateTitle",
      "com.lowagie.text.pdf.PdfPrinterGraphics2D",
      "com.lowagie.text.pdf.collection.PdfCollectionField",
      "com.lowagie.text.pdf.GrayColor",
      "org.jfree.chart.util.VerticalAlignment",
      "org.jfree.chart.block.EntityBlockParams",
      "org.jfree.data.general.Dataset",
      "org.jfree.chart.plot.SeriesRenderingOrder",
      "org.jfree.chart.block.EntityBlockResult",
      "org.jfree.chart.block.LabelBlock",
      "org.jfree.chart.plot.PlotOrientation",
      "com.lowagie.text.pdf.PdfXConformanceException",
      "org.jfree.chart.axis.NumberAxis",
      "com.lowagie.text.DocListener",
      "org.jfree.chart.annotations.XYTextAnnotation",
      "org.jfree.chart.renderer.category.AreaRenderer",
      "com.lowagie.text.pdf.collection.PdfCollectionSchema",
      "com.lowagie.text.ImgCCITT",
      "com.lowagie.text.Phrase",
      "org.jfree.chart.block.BlockContainer",
      "com.lowagie.text.pdf.FontMapper",
      "org.jfree.chart.JFreeChart",
      "com.lowagie.text.pdf.PdfFormField",
      "org.jfree.chart.plot.Marker",
      "com.lowagie.text.pdf.PdfDestination",
      "org.jfree.chart.ChartMouseListener",
      "com.lowagie.text.pdf.PdfTable",
      "org.jfree.chart.title.LegendTitle",
      "com.lowagie.text.pdf.PdfImportedPage",
      "com.lowagie.text.pdf.PdfNumber",
      "com.lowagie.text.Paragraph",
      "org.jfree.chart.ChartRenderingInfo",
      "org.jfree.chart.axis.ValueAxis",
      "org.jfree.chart.renderer.xy.DeviationRenderer",
      "org.jfree.data.Value",
      "org.jfree.chart.JFreeChartInfo",
      "org.jfree.chart.event.MarkerChangeEvent",
      "org.jfree.chart.plot.MultiplePiePlot",
      "com.lowagie.text.pdf.internal.PdfXConformanceImp",
      "org.jfree.chart.block.BlockFrame",
      "org.jfree.chart.event.AxisChangeListener",
      "org.jfree.data.general.DefaultValueDataset",
      "com.lowagie.text.Cell",
      "com.lowagie.text.pdf.BadPdfFormatException",
      "com.lowagie.text.pdf.PdfPCell",
      "com.lowagie.text.pdf.ExtendedColor",
      "com.lowagie.text.pdf.PdfDocument$PdfInfo",
      "com.lowagie.text.pdf.BaseFont",
      "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
      "com.lowagie.text.pdf.PdfAcroForm",
      "org.jfree.chart.labels.XYSeriesLabelGenerator",
      "org.jfree.chart.plot.CrosshairState",
      "org.jfree.chart.ui.Library",
      "org.jfree.chart.block.ColorBlock",
      "org.jfree.chart.axis.AxisState",
      "org.jfree.chart.renderer.AbstractRenderer",
      "org.jfree.chart.block.ColumnArrangement",
      "com.lowagie.text.pdf.DefaultFontMapper",
      "com.lowagie.text.pdf.PdfTransparencyGroup",
      "org.jfree.chart.block.RectangleConstraint",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.chart.title.Title",
      "org.jfree.chart.plot.Zoomable",
      "com.lowagie.text.pdf.PdfEncodings$SymbolConversion",
      "com.lowagie.text.pdf.PdfBorderArray",
      "org.jfree.chart.labels.PieToolTipGenerator",
      "org.jfree.chart.block.LineBorder",
      "com.lowagie.text.pdf.PdfEncryption",
      "com.lowagie.text.pdf.PdfGraphics2D",
      "com.lowagie.text.pdf.PdfFormXObject",
      "com.lowagie.text.pdf.FontDetails",
      "org.jfree.chart.util.ObjectList",
      "com.lowagie.text.pdf.PRStream",
      "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer",
      "com.lowagie.text.pdf.PdfShading",
      "com.lowagie.text.Image",
      "com.lowagie.text.pdf.PdfContentByte",
      "org.jfree.chart.block.BorderArrangement",
      "org.jfree.chart.plot.CombinedDomainXYPlot",
      "com.lowagie.text.Meta",
      "com.lowagie.text.pdf.PdfEncodings$Cp437Conversion",
      "com.lowagie.text.pdf.PdfIndirectObject",
      "org.jfree.data.general.SeriesDataset",
      "com.lowagie.text.pdf.PdfReader",
      "com.lowagie.text.pdf.Type3Glyph",
      "org.jfree.chart.ui.BasicProjectInfo",
      "com.lowagie.text.ImgTemplate",
      "org.jfree.data.xy.XYDataset",
      "org.jfree.chart.block.Arrangement",
      "org.jfree.chart.plot.Plot",
      "com.lowagie.text.pdf.IntHashtable$Entry",
      "com.lowagie.text.pdf.PdfDocument$PdfCatalog",
      "com.lowagie.text.pdf.PdfICCBased",
      "org.jfree.chart.plot.ValueAxisPlot",
      "org.jfree.chart.labels.XYToolTipGenerator",
      "org.jfree.chart.event.AxisChangeEvent",
      "org.jfree.chart.LegendItem",
      "org.jfree.chart.plot.MeterPlot",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.chart.util.LengthAdjustmentType",
      "org.jfree.chart.block.Block",
      "com.lowagie.text.pdf.PdfDate",
      "com.lowagie.text.ExceptionConverter",
      "com.lowagie.text.pdf.interfaces.PdfEncryptionSettings",
      "org.jfree.chart.entity.TickLabelEntity",
      "com.lowagie.text.pdf.PdfEncodings$WingdingsConversion",
      "com.lowagie.text.xml.xmp.XmpBasicSchema",
      "com.lowagie.text.pdf.PdfPageLabels",
      "com.lowagie.text.pdf.PdfRendition",
      "com.lowagie.text.pdf.PdfDashPattern",
      "org.jfree.data.general.PieDataset",
      "org.jfree.chart.labels.XYItemLabelGenerator",
      "org.jfree.chart.entity.CategoryItemEntity",
      "com.lowagie.text.xml.xmp.XmpSchema",
      "com.lowagie.text.Table",
      "org.jfree.chart.plot.AbstractPieLabelDistributor",
      "org.jfree.chart.entity.AxisLabelEntity",
      "org.jfree.data.general.DatasetUtilities",
      "org.jfree.chart.util.BooleanList",
      "com.lowagie.text.pdf.PdfDictionary",
      "org.jfree.chart.annotations.TextAnnotation",
      "org.jfree.chart.util.AbstractObjectList",
      "org.jfree.chart.axis.AxisLocation",
      "com.lowagie.text.pdf.PdfStream",
      "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer",
      "org.jfree.data.xy.IntervalXYDataset",
      "org.jfree.chart.event.ChartProgressEvent",
      "org.jfree.chart.entity.CategoryLabelEntity",
      "org.jfree.chart.util.RectangleEdge",
      "com.lowagie.text.pdf.PdfTemplate",
      "org.jfree.chart.block.LengthConstraintType",
      "org.jfree.chart.plot.DefaultDrawingSupplier",
      "org.jfree.chart.plot.PieLabelDistributor",
      "com.lowagie.text.pdf.PdfGraphics2D$fakeComponent",
      "com.lowagie.text.pdf.PdfObject",
      "com.lowagie.text.ElementListener",
      "com.lowagie.text.pdf.PdfEncodings",
      "org.jfree.data.category.CategoryDataset",
      "org.jfree.data.Range",
      "org.jfree.chart.util.RectangleInsets",
      "org.jfree.chart.text.TextAnchor",
      "org.jfree.chart.plot.PlotState",
      "org.jfree.chart.axis.TickUnit",
      "com.lowagie.text.pdf.PdfShadingPattern",
      "org.jfree.chart.ChartColor",
      "org.jfree.chart.Drawable",
      "org.jfree.chart.util.GradientPaintTransformer",
      "com.lowagie.text.pdf.collection.PdfCollectionSort",
      "org.jfree.chart.axis.CategoryLabelPosition",
      "com.lowagie.text.pdf.internal.PdfVersionImp",
      "org.jfree.chart.renderer.xy.XYAreaRenderer$XYAreaRendererState",
      "org.jfree.chart.annotations.CategoryPointerAnnotation",
      "com.lowagie.text.pdf.PdfImage",
      "org.jfree.chart.util.StrokeList",
      "com.lowagie.text.pdf.interfaces.PdfVersion",
      "org.jfree.chart.text.TextLine",
      "com.lowagie.text.pdf.interfaces.PdfAnnotations",
      "org.jfree.chart.PaintMap",
      "com.lowagie.text.pdf.internal.PdfViewerPreferencesImp",
      "com.lowagie.text.pdf.interfaces.PdfRunDirection",
      "org.jfree.chart.text.TextUtilities",
      "com.lowagie.text.pdf.PdfContentByte$GraphicState",
      "com.lowagie.text.pdf.PdfPage",
      "org.jfree.chart.axis.TickUnitSource",
      "org.jfree.chart.plot.CategoryMarker",
      "com.lowagie.text.pdf.fonts.FontsResourceAnchor",
      "com.lowagie.text.pdf.PdfFileSpecification",
      "com.lowagie.text.pdf.PdfDocument$Indentation",
      "org.jfree.chart.block.AbstractBlock",
      "org.jfree.chart.plot.XYPlot",
      "org.jfree.chart.annotations.AbstractXYAnnotation",
      "com.lowagie.text.pdf.PdfName",
      "org.jfree.chart.util.TableOrder",
      "org.jfree.chart.title.ImageTitle",
      "org.jfree.chart.entity.ChartEntity",
      "com.lowagie.text.pdf.PdfGState",
      "org.jfree.chart.entity.EntityCollection",
      "com.lowagie.text.pdf.RandomAccessFileOrArray",
      "com.lowagie.text.Rectangle",
      "org.jfree.data.Values2D",
      "com.lowagie.text.ImgWMF",
      "com.lowagie.text.pdf.PdfAppearance",
      "org.jfree.data.general.DatasetChangeEvent",
      "com.lowagie.text.pdf.PdfTextArray",
      "com.lowagie.text.pdf.interfaces.PdfDocumentActions",
      "com.lowagie.text.pdf.PdfColor",
      "org.jfree.chart.renderer.xy.XYItemRendererState",
      "org.jfree.chart.entity.PieSectionEntity",
      "com.lowagie.text.Jpeg",
      "com.lowagie.text.pdf.PdfLayer",
      "org.jfree.chart.plot.ThermometerPlot",
      "org.jfree.chart.util.Layer",
      "com.lowagie.text.ImgRaw",
      "com.lowagie.text.pdf.IntHashtable",
      "org.jfree.chart.event.PlotChangeListener",
      "com.lowagie.text.pdf.PdfPTableEvent",
      "com.lowagie.text.pdf.Type1Font",
      "com.lowagie.text.BadElementException",
      "com.lowagie.text.pdf.PdfString",
      "org.jfree.chart.axis.SubCategoryAxis",
      "com.lowagie.text.pdf.collection.PdfTargetDictionary",
      "com.lowagie.text.pdf.PdfContents",
      "org.jfree.chart.axis.NumberTickUnit",
      "com.lowagie.text.pdf.TrueTypeFont",
      "org.jfree.chart.title.TextTitle",
      "org.jfree.chart.plot.DrawingSupplier",
      "com.lowagie.text.pdf.PRIndirectReference",
      "com.lowagie.text.pdf.interfaces.PdfXConformance",
      "org.jfree.chart.util.PublicCloneable",
      "com.lowagie.text.pdf.BaseFont$StreamFont",
      "com.lowagie.text.DocumentException",
      "com.lowagie.text.Font",
      "com.lowagie.text.Document",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.chart.StrokeMap",
      "com.lowagie.text.pdf.PdfPSXObject",
      "org.jfree.data.Values",
      "org.jfree.data.KeyedValues2D",
      "com.lowagie.text.pdf.PdfResources",
      "com.lowagie.text.xml.xmp.DublinCoreSchema",
      "org.jfree.chart.text.TextBlockAnchor",
      "com.lowagie.text.PageSize",
      "org.jfree.chart.event.ChartChangeListener",
      "com.lowagie.text.pdf.OutputStreamEncryption",
      "org.jfree.chart.axis.CategoryLabelWidthType"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AbstractBlock_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jfree.chart.block.AbstractBlock",
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.util.RectangleInsets",
      "org.jfree.chart.block.BlockBorder",
      "org.jfree.chart.block.LengthConstraintType",
      "org.jfree.chart.block.RectangleConstraint",
      "org.jfree.chart.util.SerialUtilities",
      "org.jfree.chart.plot.Plot",
      "org.jfree.chart.plot.CompassPlot",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.general.DefaultValueDataset",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.chart.ChartColor",
      "org.jfree.chart.plot.DefaultDrawingSupplier",
      "org.jfree.chart.needle.MeterNeedle",
      "org.jfree.chart.needle.ArrowNeedle",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.chart.event.PlotChangeEvent",
      "org.jfree.chart.event.ChartChangeEventType",
      "org.jfree.chart.resources.JFreeChartResources",
      "org.jfree.chart.ui.Licences",
      "org.jfree.chart.JFreeChart",
      "org.jfree.chart.util.RectangleEdge",
      "org.jfree.chart.util.HorizontalAlignment",
      "org.jfree.chart.util.VerticalAlignment",
      "org.jfree.chart.title.Title",
      "org.jfree.chart.title.LegendTitle",
      "org.jfree.chart.block.FlowArrangement",
      "org.jfree.chart.block.ColumnArrangement",
      "org.jfree.chart.block.BlockContainer",
      "org.jfree.chart.util.RectangleAnchor",
      "org.jfree.chart.block.LineBorder",
      "org.jfree.chart.event.TitleChangeEvent",
      "org.jfree.chart.renderer.LookupPaintScale",
      "org.jfree.chart.plot.SpiderWebPlot",
      "org.jfree.chart.util.TableOrder",
      "org.jfree.chart.util.Rotation",
      "org.jfree.chart.util.AbstractObjectList",
      "org.jfree.chart.util.PaintList",
      "org.jfree.chart.util.StrokeList",
      "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator",
      "org.jfree.chart.labels.StandardCategoryItemLabelGenerator",
      "org.jfree.chart.axis.Axis",
      "org.jfree.data.Range",
      "org.jfree.chart.axis.ValueAxis",
      "org.jfree.chart.axis.TickUnit",
      "org.jfree.chart.axis.NumberTickUnit",
      "org.jfree.chart.axis.NumberAxis",
      "org.jfree.chart.axis.CyclicNumberAxis",
      "org.jfree.chart.axis.TickUnits",
      "org.jfree.data.RangeType",
      "org.jfree.chart.event.AxisChangeEvent",
      "org.jfree.chart.title.PaintScaleLegend",
      "org.jfree.chart.axis.AxisLocation",
      "org.jfree.chart.renderer.GrayPaintScale",
      "org.jfree.chart.axis.LogAxis",
      "org.jfree.data.category.DefaultCategoryDataset",
      "org.jfree.data.general.DefaultKeyedValues2DDataset",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.chart.plot.MultiplePiePlot",
      "org.jfree.chart.plot.PiePlot",
      "org.jfree.chart.plot.PieLabelLinkStyle",
      "org.jfree.chart.PaintMap",
      "org.jfree.chart.StrokeMap",
      "org.jfree.chart.labels.AbstractPieItemLabelGenerator",
      "org.jfree.chart.labels.StandardPieSectionLabelGenerator",
      "org.jfree.chart.util.ObjectList",
      "org.jfree.chart.plot.AbstractPieLabelDistributor",
      "org.jfree.chart.plot.PieLabelDistributor",
      "org.jfree.chart.title.TextTitle",
      "org.jfree.chart.ChartRenderingInfo",
      "org.jfree.chart.entity.StandardEntityCollection",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.chart.needle.WindNeedle",
      "org.jfree.chart.block.BorderArrangement",
      "org.jfree.chart.title.CompositeTitle",
      "com.lowagie.text.Document",
      "com.lowagie.text.Rectangle",
      "com.lowagie.text.PageSize",
      "com.lowagie.text.DocWriter",
      "com.lowagie.text.pdf.PdfObject",
      "com.lowagie.text.pdf.ByteBuffer",
      "com.lowagie.text.pdf.PdfName",
      "com.lowagie.text.pdf.PdfWriter",
      "com.lowagie.text.pdf.PdfDocument",
      "com.lowagie.text.pdf.PdfDictionary",
      "com.lowagie.text.pdf.PdfDate",
      "com.lowagie.text.pdf.internal.PdfViewerPreferencesImp",
      "com.lowagie.text.pdf.internal.PdfVersionImp",
      "com.lowagie.text.pdf.internal.PdfXConformanceImp",
      "com.lowagie.text.pdf.PdfContentByte",
      "org.jfree.chart.text.TextAnchor",
      "org.jfree.chart.annotations.XYTextAnnotation",
      "org.jfree.chart.annotations.XYPointerAnnotation",
      "org.jfree.chart.block.LabelBlock",
      "org.jfree.chart.util.ObjectUtilities",
      "org.jfree.chart.text.TextUtilities",
      "org.jfree.chart.text.TextBlock",
      "org.jfree.chart.renderer.AbstractRenderer",
      "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
      "org.jfree.chart.renderer.xy.XYBlockRenderer",
      "org.jfree.chart.util.BooleanList",
      "org.jfree.chart.util.ShapeList",
      "org.jfree.chart.labels.ItemLabelPosition",
      "org.jfree.chart.labels.ItemLabelAnchor",
      "org.jfree.chart.labels.StandardXYSeriesLabelGenerator",
      "org.jfree.chart.annotations.TextAnnotation",
      "org.jfree.chart.annotations.CategoryTextAnnotation",
      "org.jfree.chart.annotations.CategoryPointerAnnotation",
      "org.jfree.chart.axis.CategoryAnchor",
      "org.jfree.chart.title.DateTitle",
      "com.lowagie.text.Image",
      "com.lowagie.text.ImgCCITT",
      "com.lowagie.text.DocumentException",
      "com.lowagie.text.BadElementException",
      "org.jfree.chart.plot.MeterPlot",
      "org.jfree.chart.plot.DialShape",
      "org.jfree.data.general.DatasetChangeEvent",
      "org.jfree.chart.renderer.xy.HighLowRenderer",
      "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer",
      "org.jfree.chart.renderer.xy.DeviationRenderer",
      "org.jfree.chart.event.RendererChangeEvent",
      "org.jfree.chart.text.TextLine",
      "org.jfree.chart.text.TextFragment",
      "org.jfree.chart.plot.RingPlot",
      "org.jfree.chart.renderer.xy.XYStepRenderer",
      "org.jfree.chart.block.ColorBlock",
      "org.jfree.chart.renderer.xy.CandlestickRenderer",
      "org.jfree.chart.labels.HighLowItemLabelGenerator",
      "org.jfree.chart.axis.CategoryAxis",
      "org.jfree.chart.axis.CategoryAxis3D",
      "org.jfree.chart.axis.CategoryLabelPosition",
      "org.jfree.chart.text.TextBlockAnchor",
      "org.jfree.chart.axis.CategoryLabelWidthType",
      "org.jfree.chart.axis.CategoryLabelPositions",
      "org.jfree.chart.plot.CategoryPlot",
      "org.jfree.chart.plot.CombinedDomainCategoryPlot",
      "org.jfree.chart.plot.DatasetRenderingOrder",
      "org.jfree.chart.util.SortOrder",
      "org.jfree.chart.plot.PlotOrientation",
      "org.jfree.chart.plot.Marker",
      "org.jfree.chart.plot.ValueMarker",
      "org.jfree.chart.util.LengthAdjustmentType",
      "org.jfree.chart.util.Layer",
      "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer",
      "org.jfree.chart.labels.AbstractXYItemLabelGenerator",
      "org.jfree.chart.labels.StandardXYToolTipGenerator",
      "org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator",
      "org.jfree.chart.plot.XYPlot",
      "org.jfree.chart.plot.CombinedDomainXYPlot",
      "org.jfree.chart.plot.SeriesRenderingOrder",
      "org.jfree.chart.block.EmptyBlock",
      "org.jfree.chart.util.ShapeUtilities",
      "org.jfree.chart.plot.CombinedRangeXYPlot",
      "org.jfree.chart.title.ImageTitle",
      "org.jfree.chart.plot.ThermometerPlot",
      "com.lowagie.text.pdf.PdfTemplate",
      "org.jfree.chart.renderer.DefaultPolarItemRenderer",
      "org.jfree.chart.plot.WaferMapPlot",
      "com.lowagie.text.pdf.PdfAppearance",
      "org.jfree.chart.plot.FastScatterPlot",
      "org.jfree.chart.ChartPanel",
      "org.jfree.chart.renderer.xy.XYErrorRenderer",
      "org.jfree.data.jdbc.JDBCCategoryDataset",
      "com.lowagie.text.pdf.PdfGraphics2D",
      "com.lowagie.text.pdf.BaseFont",
      "com.lowagie.text.pdf.Type1Font",
      "com.lowagie.text.ExceptionConverter",
      "org.jfree.chart.renderer.xy.XYSplineAndShapeRenderer",
      "com.lowagie.text.Jpeg2000",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.time.Quarter",
      "org.jfree.data.time.SerialDate",
      "org.jfree.chart.axis.PeriodAxis",
      "org.jfree.data.time.Year",
      "org.jfree.data.time.Month",
      "org.jfree.chart.axis.PeriodAxisLabelInfo",
      "org.jfree.data.general.DefaultPieDataset",
      "org.jfree.data.jdbc.JDBCPieDataset",
      "org.jfree.data.DefaultKeyedValues",
      "org.jfree.chart.axis.SubCategoryAxis",
      "org.jfree.chart.labels.StandardCategorySeriesLabelGenerator",
      "org.jfree.chart.renderer.AreaRendererEndType",
      "com.lowagie.text.SimpleCell",
      "org.jfree.chart.text.TextBox",
      "org.jfree.chart.renderer.category.CategoryStepRenderer",
      "org.jfree.chart.block.GridArrangement",
      "org.jfree.chart.renderer.category.LineAndShapeRenderer",
      "org.jfree.chart.renderer.category.DefaultCategoryItemRenderer",
      "org.jfree.chart.plot.PiePlot3D",
      "org.jfree.data.xy.XYDataItem",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.category.DefaultIntervalCategoryDataset",
      "org.jfree.data.resources.DataPackageResources",
      "org.jfree.chart.renderer.xy.XYBubbleRenderer",
      "org.jfree.data.general.WaferMapDataset",
      "org.jfree.chart.axis.ExtendedCategoryAxis",
      "org.jfree.chart.labels.StandardXYZToolTipGenerator",
      "org.jfree.chart.plot.PolarPlot",
      "org.jfree.chart.renderer.xy.XYDifferenceRenderer",
      "org.jfree.chart.axis.NumberAxis3D",
      "org.jfree.chart.event.ChartProgressEvent",
      "org.jfree.chart.util.Size2D",
      "com.lowagie.text.Jpeg",
      "org.jfree.chart.renderer.category.StackedAreaRenderer",
      "org.jfree.chart.PolarChartPanel",
      "org.jfree.chart.annotations.XYLineAnnotation",
      "org.jfree.chart.plot.CombinedRangeCategoryPlot",
      "org.jfree.chart.urls.TimeSeriesURLGenerator",
      "org.jfree.chart.renderer.xy.StandardXYItemRenderer",
      "org.jfree.chart.LegendItemCollection",
      "org.jfree.chart.plot.IntervalMarker",
      "org.jfree.data.general.Series",
      "org.jfree.data.time.TimePeriodValues",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.data.time.TimePeriodValuesCollection",
      "org.jfree.data.time.TimePeriodAnchor",
      "org.jfree.data.gantt.TaskSeriesCollection",
      "org.jfree.chart.block.CenterArrangement",
      "org.jfree.data.statistics.DefaultMultiValueCategoryDataset",
      "org.jfree.data.KeyedObjects2D",
      "org.jfree.data.xy.VectorSeriesCollection",
      "org.jfree.chart.renderer.category.BarRenderer",
      "org.jfree.chart.renderer.category.IntervalBarRenderer",
      "org.jfree.chart.renderer.category.GanttRenderer",
      "org.jfree.chart.util.StandardGradientPaintTransformer",
      "org.jfree.chart.util.GradientPaintTransformType",
      "org.jfree.data.general.DefaultKeyedValuesDataset",
      "org.jfree.data.time.Minute",
      "org.jfree.data.time.Day",
      "org.jfree.data.time.SpreadsheetDate",
      "org.jfree.data.time.Hour",
      "org.jfree.chart.plot.CategoryMarker",
      "org.jfree.data.time.DateRange",
      "org.jfree.chart.axis.DateTickUnit",
      "org.jfree.chart.axis.DateAxis$DefaultTimeline",
      "org.jfree.chart.axis.DateAxis",
      "org.jfree.chart.axis.DateTickMarkPosition",
      "org.jfree.chart.urls.StandardXYURLGenerator",
      "org.jfree.chart.urls.StandardXYZURLGenerator",
      "org.jfree.chart.labels.SymbolicXYItemLabelGenerator",
      "org.jfree.chart.renderer.WaferMapRenderer",
      "org.jfree.chart.renderer.xy.XYAreaRenderer",
      "org.jfree.data.statistics.DefaultStatisticalCategoryDataset",
      "org.jfree.chart.renderer.xy.DefaultXYItemRenderer",
      "org.jfree.chart.event.MarkerChangeEvent",
      "com.lowagie.text.pdf.AsianFontMapper",
      "com.lowagie.text.pdf.ColumnText",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset",
      "org.jfree.data.xy.AbstractXYZDataset",
      "org.jfree.data.xy.DefaultXYZDataset",
      "org.jfree.chart.renderer.xy.XYStepAreaRenderer",
      "org.jfree.data.KeyedValueComparatorType",
      "org.jfree.chart.renderer.xy.StackedXYAreaRenderer",
      "org.jfree.chart.renderer.category.LineRenderer3D",
      "org.jfree.chart.axis.LogarithmicAxis",
      "org.jfree.chart.labels.CustomXYToolTipGenerator",
      "org.jfree.chart.renderer.xy.XYLine3DRenderer",
      "org.jfree.chart.urls.CustomXYURLGenerator",
      "org.jfree.chart.axis.SymbolAxis",
      "org.jfree.chart.renderer.category.StackedBarRenderer",
      "org.jfree.data.jdbc.JDBCXYDataset",
      "org.jfree.chart.util.PaintUtilities",
      "com.lowagie.text.Phrase",
      "com.lowagie.text.Paragraph",
      "com.lowagie.text.Font",
      "org.jfree.chart.axis.ModuloAxis",
      "org.jfree.data.xy.YIntervalSeriesCollection",
      "com.lowagie.text.Chunk",
      "org.jfree.chart.renderer.xy.XYBarRenderer",
      "org.jfree.chart.renderer.xy.ClusteredXYBarRenderer",
      "org.jfree.chart.labels.IntervalCategoryItemLabelGenerator",
      "org.jfree.chart.renderer.xy.XYAreaRenderer2",
      "org.jfree.data.xy.XYIntervalSeriesCollection",
      "org.jfree.data.general.CombinedDataset",
      "org.jfree.chart.renderer.xy.WindItemRenderer",
      "org.jfree.chart.annotations.XYShapeAnnotation",
      "com.lowagie.text.pdf.CJKFont",
      "org.jfree.data.time.FixedMillisecond",
      "com.lowagie.text.pdf.PdfAnnotation",
      "com.lowagie.text.pdf.PdfFormField",
      "com.lowagie.text.pdf.PdfGState",
      "org.jfree.data.time.Week",
      "org.jfree.chart.urls.StandardCategoryURLGenerator",
      "org.jfree.chart.renderer.category.BarRenderer3D",
      "org.jfree.chart.renderer.category.StackedBarRenderer3D",
      "com.lowagie.text.pdf.PdfEncodings$WingdingsConversion",
      "com.lowagie.text.pdf.PdfEncodings$SymbolConversion",
      "com.lowagie.text.pdf.PdfEncodings$Cp437Conversion",
      "com.lowagie.text.pdf.PdfEncodings",
      "org.jfree.chart.axis.SegmentedTimeline",
      "org.jfree.chart.axis.AxisSpace",
      "org.jfree.chart.entity.ChartEntity",
      "org.jfree.chart.entity.AxisLabelEntity",
      "org.jfree.chart.labels.MultipleXYSeriesLabelGenerator",
      "org.jfree.data.time.Second",
      "org.jfree.data.time.Millisecond",
      "com.lowagie.text.List",
      "com.lowagie.text.factories.RomanNumberFactory",
      "org.jfree.chart.renderer.category.LevelRenderer",
      "com.lowagie.text.pdf.codec.PngImage",
      "org.jfree.chart.renderer.xy.CyclicXYItemRenderer",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset",
      "com.lowagie.text.Section",
      "com.lowagie.text.Chapter",
      "com.lowagie.text.ChapterAutoNumber",
      "org.jfree.data.xy.DefaultWindDataset",
      "org.jfree.data.xy.DefaultTableXYDataset",
      "org.jfree.data.xy.IntervalXYDelegate",
      "org.jfree.chart.renderer.category.StatisticalBarRenderer",
      "org.jfree.data.xy.XYSeries",
      "org.jfree.data.xy.XYSeriesCollection",
      "org.jfree.chart.renderer.xy.StackedXYAreaRenderer2",
      "org.jfree.data.xy.CategoryTableXYDataset",
      "org.jfree.data.xy.XYBarDataset",
      "org.jfree.data.time.TimeSeriesCollection",
      "org.jfree.data.xy.MatrixSeriesCollection",
      "org.jfree.data.time.DynamicTimeSeriesCollection",
      "org.jfree.data.xy.XIntervalSeriesCollection",
      "org.jfree.chart.renderer.xy.StackedXYBarRenderer",
      "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer",
      "org.jfree.data.time.TimeTableXYDataset"
    );
  }
}
