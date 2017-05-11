/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Jan 15 10:28:58 GMT 2017
 */

package org.jfree.chart.renderer.category;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class AbstractCategoryItemRenderer_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer"; 
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

  public static void setSystemProperties() {
 
    /*No java.lang.System property to set*/
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AbstractCategoryItemRenderer_ESTest_scaffolding.class.getClassLoader() ,
      "org.jfree.chart.entity.AxisEntity",
      "org.jfree.data.resources.DataPackageResources",
      "org.jfree.chart.labels.CategorySeriesLabelGenerator",
      "com.lowagie.text.Jpeg2000",
      "org.jfree.chart.Effect3D",
      "org.jfree.chart.renderer.xy.XYAreaRenderer",
      "com.lowagie.text.pdf.PdfOCG",
      "com.lowagie.text.Element",
      "org.jfree.data.general.ValueDataset",
      "com.lowagie.text.pdf.interfaces.PdfViewerPreferences",
      "com.lowagie.text.pdf.PdfEncodings$SymbolTTConversion",
      "org.jfree.data.category.CategoryDatasetSelectionState",
      "org.jfree.chart.axis.MarkerAxisBand",
      "com.lowagie.text.pdf.PdfPCellEvent",
      "org.jfree.data.general.AbstractSeriesDataset",
      "com.lowagie.text.xml.xmp.XmpWriter",
      "org.jfree.chart.LegendItemCollection",
      "org.jfree.chart.axis.CategoryAxis",
      "org.jfree.chart.renderer.xy.XYItemRenderer",
      "com.lowagie.text.pdf.ExtraEncoding",
      "org.jfree.data.RangeInfo",
      "org.jfree.chart.renderer.RendererState",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "com.lowagie.text.xml.xmp.PdfA1Schema",
      "org.jfree.chart.entity.StandardEntityCollection",
      "org.jfree.data.general.DatasetSelectionState",
      "com.lowagie.text.pdf.PdfBoolean",
      "com.lowagie.text.TextElementArray",
      "org.jfree.chart.renderer.category.BarPainter",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.data.jdbc.JDBCXYDataset",
      "org.jfree.chart.labels.StandardXYSeriesLabelGenerator",
      "org.jfree.chart.labels.ItemLabelPosition",
      "org.jfree.chart.renderer.category.GroupedStackedBarRenderer",
      "org.jfree.chart.plot.CategoryPlot",
      "org.jfree.chart.event.MarkerChangeListener",
      "org.jfree.chart.event.PlotChangeEvent",
      "com.lowagie.text.pdf.interfaces.PdfPageActions",
      "org.jfree.chart.plot.PiePlot",
      "org.jfree.chart.labels.ItemLabelAnchor",
      "org.jfree.chart.util.PaintList",
      "org.jfree.chart.labels.StandardXYToolTipGenerator",
      "org.jfree.chart.annotations.Annotation",
      "org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator",
      "com.lowagie.text.HeaderFooter",
      "org.jfree.chart.renderer.category.LayeredBarRenderer",
      "org.jfree.chart.event.RendererChangeEvent",
      "org.jfree.data.xy.XYDatasetSelectionState",
      "com.lowagie.text.LargeElement",
      "org.jfree.chart.util.RectangleAnchor",
      "com.lowagie.text.pdf.PdfException",
      "com.lowagie.text.pdf.PdfIndirectReference",
      "org.jfree.chart.labels.PieSectionLabelGenerator",
      "org.jfree.chart.axis.Tick",
      "org.jfree.data.statistics.BoxAndWhiskerItem",
      "org.jfree.chart.axis.Axis",
      "org.jfree.chart.plot.CategoryCrosshairState",
      "org.jfree.chart.urls.PieURLGenerator",
      "com.lowagie.text.pdf.PdfPattern",
      "com.lowagie.text.pdf.PdfRectangle",
      "org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer",
      "com.lowagie.text.pdf.PdfArray",
      "org.jfree.chart.util.ShapeList",
      "org.jfree.data.statistics.BoxAndWhiskerCategoryDataset",
      "org.jfree.chart.util.UnitType",
      "com.lowagie.text.pdf.PdfPageEvent",
      "com.lowagie.text.pdf.collection.PdfCollection",
      "org.jfree.chart.urls.XYURLGenerator",
      "org.jfree.chart.annotations.XYAnnotation",
      "org.jfree.chart.util.ObjectUtilities",
      "com.lowagie.text.pdf.OutputStreamCounter",
      "org.jfree.chart.util.HorizontalAlignment",
      "org.jfree.chart.util.ShadowGenerator",
      "org.jfree.chart.plot.Selectable",
      "com.lowagie.text.DocWriter",
      "org.jfree.chart.util.PaintMap",
      "com.lowagie.text.pdf.PdfOutline",
      "org.jfree.chart.axis.CategoryAnchor",
      "org.jfree.chart.plot.DatasetRenderingOrder",
      "org.jfree.chart.event.RendererChangeListener",
      "org.jfree.chart.util.HashUtilities",
      "org.jfree.data.KeyedValues",
      "org.jfree.chart.plot.CombinedRangeCategoryPlot",
      "org.jfree.chart.labels.CategoryToolTipGenerator",
      "org.jfree.chart.labels.StandardCategoryToolTipGenerator",
      "org.jfree.chart.renderer.category.GradientBarPainter",
      "org.jfree.data.general.DefaultKeyedValues2DDataset",
      "org.jfree.chart.entity.XYItemEntity",
      "org.jfree.chart.axis.CategoryLabelPositions",
      "org.jfree.chart.text.TextMeasurer",
      "org.jfree.chart.LegendItemSource",
      "com.lowagie.text.pdf.PdfAction",
      "org.jfree.data.category.AbstractCategoryDataset",
      "org.jfree.chart.util.SortOrder",
      "org.jfree.chart.renderer.PolarItemRenderer",
      "org.jfree.chart.renderer.RenderAttributes",
      "org.jfree.chart.renderer.AreaRendererEndType",
      "org.jfree.chart.plot.PieLabelLinkStyle",
      "org.jfree.data.statistics.MultiValueCategoryDataset",
      "org.jfree.chart.renderer.category.BarRenderer3D",
      "org.jfree.data.gantt.TaskSeries",
      "org.jfree.chart.annotations.CategoryAnnotation",
      "org.jfree.chart.axis.AxisSpace",
      "org.jfree.chart.plot.PolarPlot",
      "org.jfree.chart.renderer.category.WaterfallBarRenderer",
      "org.jfree.chart.RenderingSource",
      "org.jfree.data.category.SelectableCategoryDataset",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.chart.event.AnnotationChangeListener",
      "org.jfree.chart.axis.CyclicNumberAxis$CycleBoundTick",
      "org.jfree.chart.event.ChartChangeEventType",
      "org.jfree.chart.util.Rotation",
      "org.jfree.chart.plot.PieSelectionAttributes",
      "com.lowagie.text.pdf.PdfNull",
      "com.lowagie.text.pdf.PdfOCProperties",
      "org.jfree.data.xy.OHLCDataset",
      "com.lowagie.text.xml.xmp.PdfSchema",
      "org.jfree.chart.axis.ExtendedCategoryAxis",
      "org.jfree.chart.util.GradientPaintTransformType",
      "com.lowagie.text.pdf.PdfDocument",
      "org.jfree.chart.renderer.category.CategoryItemRenderer",
      "com.lowagie.text.pdf.ByteBuffer",
      "com.lowagie.text.pdf.PdfBorderDictionary",
      "org.jfree.chart.annotations.AbstractAnnotation",
      "org.jfree.chart.annotations.CategoryTextAnnotation",
      "org.jfree.chart.renderer.category.LineAndShapeRenderer",
      "com.lowagie.text.pdf.PdfAnnotation",
      "org.jfree.chart.util.ShapeUtilities",
      "com.lowagie.text.pdf.PdfSignature",
      "com.lowagie.text.pdf.PdfMediaClipData",
      "org.jfree.chart.labels.CategoryItemLabelGenerator",
      "org.jfree.chart.renderer.xy.StackedXYAreaRenderer$StackedXYAreaRendererState",
      "org.jfree.data.RangeType",
      "org.jfree.chart.renderer.category.CategoryStepRenderer",
      "org.jfree.chart.axis.TickUnits",
      "com.lowagie.text.pdf.PdfWriter",
      "com.lowagie.text.pdf.PdfLiteral",
      "org.jfree.data.category.CategoryRangeInfo",
      "com.lowagie.text.pdf.collection.PdfCollectionField",
      "com.lowagie.text.pdf.PdfPrinterGraphics2D",
      "com.lowagie.text.pdf.GrayColor",
      "org.jfree.chart.util.VerticalAlignment",
      "org.jfree.chart.renderer.category.StackedBarRenderer",
      "org.jfree.chart.renderer.category.GanttRenderer",
      "org.jfree.chart.renderer.category.ScatterRenderer",
      "org.jfree.data.general.Dataset",
      "org.jfree.chart.plot.SeriesRenderingOrder",
      "org.jfree.chart.urls.CustomCategoryURLGenerator",
      "org.jfree.chart.renderer.category.StackedAreaRenderer",
      "org.jfree.chart.event.AnnotationChangeEvent",
      "org.jfree.chart.plot.PlotOrientation",
      "com.lowagie.text.pdf.PdfXConformanceException",
      "org.jfree.chart.axis.NumberAxis",
      "com.lowagie.text.DocListener",
      "org.jfree.chart.renderer.category.AreaRenderer",
      "org.jfree.chart.axis.NumberTick",
      "com.lowagie.text.pdf.collection.PdfCollectionSchema",
      "com.lowagie.text.ImgCCITT",
      "org.jfree.chart.renderer.category.CategoryStepRenderer$State",
      "org.jfree.chart.axis.ValueTick",
      "com.lowagie.text.pdf.FontMapper",
      "com.lowagie.text.pdf.PdfFormField",
      "org.jfree.chart.plot.Marker",
      "com.lowagie.text.pdf.PdfDestination",
      "org.jfree.data.pie.PieDatasetChangeInfo",
      "com.lowagie.text.pdf.PdfTable",
      "com.lowagie.text.pdf.PdfGraphics2D$HyperLinkKey",
      "org.jfree.chart.renderer.category.CategoryItemRendererState",
      "com.lowagie.text.pdf.PdfNumber",
      "org.jfree.chart.renderer.category.DefaultCategoryItemRenderer",
      "org.jfree.data.pie.PieDataset",
      "org.jfree.data.DataUtilities",
      "org.jfree.chart.axis.ValueAxis",
      "org.jfree.chart.ChartRenderingInfo",
      "org.jfree.data.event.DatasetChangeListener",
      "org.jfree.data.Value",
      "org.jfree.chart.event.MarkerChangeEvent",
      "org.jfree.chart.util.StrokeMap",
      "org.jfree.chart.block.BlockFrame",
      "com.lowagie.text.pdf.PdfGraphics2D$FakeComponent",
      "org.jfree.chart.event.AxisChangeListener",
      "org.jfree.data.general.DefaultValueDataset",
      "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer",
      "com.lowagie.text.pdf.BadPdfFormatException",
      "com.lowagie.text.Cell",
      "com.lowagie.text.pdf.ExtendedColor",
      "org.jfree.chart.entity.PlotEntity",
      "com.lowagie.text.pdf.PdfDocument$PdfInfo",
      "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
      "org.jfree.data.KeyedObjects",
      "com.lowagie.text.pdf.PdfAcroForm",
      "org.jfree.chart.plot.CrosshairState",
      "org.jfree.chart.labels.XYSeriesLabelGenerator",
      "org.jfree.chart.renderer.category.StackedBarRenderer3D",
      "org.jfree.data.DomainOrder",
      "org.jfree.chart.axis.AxisState",
      "org.jfree.chart.renderer.AbstractRenderer",
      "com.lowagie.text.pdf.PdfTransparencyGroup",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.chart.renderer.DefaultPolarItemRenderer",
      "org.jfree.chart.plot.Zoomable",
      "org.jfree.chart.title.Title",
      "com.lowagie.text.pdf.PdfEncodings$SymbolConversion",
      "com.lowagie.text.pdf.PdfBorderArray",
      "org.jfree.chart.labels.IntervalCategoryToolTipGenerator",
      "org.jfree.data.gantt.SlidingGanttCategoryDataset",
      "org.jfree.chart.labels.PieToolTipGenerator",
      "com.lowagie.text.pdf.PdfGraphics2D",
      "com.lowagie.text.pdf.PdfFormXObject",
      "org.jfree.chart.util.ObjectList",
      "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer",
      "com.lowagie.text.Image",
      "com.lowagie.text.pdf.PdfContentByte",
      "org.jfree.chart.plot.CombinedDomainXYPlot",
      "com.lowagie.text.pdf.PdfEncodings$Cp437Conversion",
      "org.jfree.chart.plot.XYCrosshairState",
      "org.jfree.chart.renderer.category.StatisticalBarRenderer",
      "org.jfree.chart.labels.StandardCategoryItemLabelGenerator",
      "org.jfree.data.general.SeriesDataset",
      "com.lowagie.text.ImgTemplate",
      "org.jfree.data.xy.XYDataset",
      "org.jfree.data.SelectableValue",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset",
      "org.jfree.chart.plot.Plot",
      "com.lowagie.text.pdf.IntHashtable$Entry",
      "com.lowagie.text.pdf.PdfDocument$PdfCatalog",
      "org.jfree.data.category.SlidingCategoryDataset",
      "com.lowagie.text.pdf.PdfICCBased",
      "org.jfree.chart.plot.ValueAxisPlot",
      "org.jfree.chart.renderer.category.IntervalBarRenderer",
      "org.jfree.data.UnknownKeyException",
      "org.jfree.chart.labels.XYToolTipGenerator",
      "org.jfree.chart.renderer.category.BarRenderer",
      "org.jfree.data.event.SeriesChangeListener",
      "org.jfree.chart.event.AxisChangeEvent",
      "org.jfree.chart.LegendItem",
      "org.jfree.chart.renderer.xy.StackedXYAreaRenderer",
      "org.jfree.chart.urls.CategoryURLGenerator",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.chart.util.LengthAdjustmentType",
      "org.jfree.chart.block.Block",
      "com.lowagie.text.pdf.PdfDate",
      "org.jfree.chart.entity.TickLabelEntity",
      "com.lowagie.text.pdf.interfaces.PdfEncryptionSettings",
      "com.lowagie.text.ExceptionConverter",
      "com.lowagie.text.pdf.PdfEncodings$WingdingsConversion",
      "org.jfree.chart.renderer.category.MinMaxCategoryRenderer$2",
      "com.lowagie.text.xml.xmp.XmpBasicSchema",
      "org.jfree.chart.renderer.category.LineRenderer3D",
      "com.lowagie.text.pdf.PdfRendition",
      "com.lowagie.text.pdf.PdfDashPattern",
      "org.jfree.chart.labels.XYItemLabelGenerator",
      "org.jfree.chart.entity.CategoryItemEntity",
      "com.lowagie.text.xml.xmp.XmpSchema",
      "org.jfree.data.KeyToGroupMap",
      "org.jfree.chart.renderer.category.MinMaxCategoryRenderer$1",
      "com.lowagie.text.Table",
      "org.jfree.chart.entity.AxisLabelEntity",
      "org.jfree.chart.plot.AbstractPieLabelDistributor",
      "org.jfree.data.general.DatasetUtilities",
      "org.jfree.chart.util.BooleanList",
      "org.jfree.chart.annotations.TextAnnotation",
      "com.lowagie.text.pdf.PdfDictionary",
      "org.jfree.chart.util.AbstractObjectList",
      "org.jfree.chart.axis.AxisLocation",
      "org.jfree.chart.labels.StandardCategorySeriesLabelGenerator",
      "org.jfree.data.xy.IntervalXYDataset",
      "com.lowagie.text.pdf.PdfStream",
      "org.jfree.chart.entity.CategoryLabelEntity",
      "org.jfree.data.general.KeyedValues2DDataset",
      "org.jfree.chart.util.RectangleEdge",
      "com.lowagie.text.pdf.PdfTemplate",
      "org.jfree.chart.plot.DefaultDrawingSupplier",
      "org.jfree.data.category.DefaultIntervalCategoryDataset",
      "org.jfree.chart.plot.PieLabelDistributor",
      "com.lowagie.text.pdf.PdfObject",
      "com.lowagie.text.ElementListener",
      "com.lowagie.text.pdf.PdfEncodings",
      "org.jfree.data.category.CategoryDataset",
      "org.jfree.data.Range",
      "org.jfree.data.statistics.DefaultMultiValueCategoryDataset",
      "org.jfree.chart.util.RectangleInsets",
      "org.jfree.chart.plot.CombinedDomainCategoryPlot",
      "org.jfree.data.statistics.DefaultStatisticalCategoryDataset",
      "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator",
      "org.jfree.chart.text.TextAnchor",
      "org.jfree.data.category.IntervalCategoryDataset",
      "org.jfree.chart.plot.PlotState",
      "org.jfree.chart.axis.TickUnit",
      "org.jfree.chart.ChartColor",
      "org.jfree.chart.Drawable",
      "org.jfree.chart.util.GradientPaintTransformer",
      "org.jfree.data.event.SeriesChangeEvent",
      "com.lowagie.text.pdf.collection.PdfCollectionSort",
      "org.jfree.chart.axis.CategoryLabelPosition",
      "org.jfree.data.gantt.TaskSeriesCollection",
      "org.jfree.chart.renderer.xy.XYAreaRenderer$XYAreaRendererState",
      "org.jfree.chart.annotations.CategoryPointerAnnotation",
      "com.lowagie.text.pdf.PdfImage",
      "org.jfree.chart.util.StrokeList",
      "com.lowagie.text.pdf.interfaces.PdfVersion",
      "org.jfree.chart.util.StandardGradientPaintTransformer",
      "com.lowagie.text.pdf.interfaces.PdfAnnotations",
      "com.lowagie.text.pdf.interfaces.PdfRunDirection",
      "org.jfree.chart.axis.CategoryAxis3D",
      "com.lowagie.text.pdf.PdfPage",
      "org.jfree.chart.axis.TickUnitSource",
      "org.jfree.chart.plot.CategoryMarker",
      "org.jfree.chart.block.AbstractBlock",
      "org.jfree.chart.plot.XYPlot",
      "org.jfree.data.xy.TableXYDataset",
      "com.lowagie.text.pdf.PdfName",
      "org.jfree.chart.entity.ChartEntity",
      "com.lowagie.text.pdf.PdfGState",
      "org.jfree.chart.entity.EntityCollection",
      "org.jfree.chart.plot.Pannable",
      "org.jfree.data.gantt.GanttCategoryDataset",
      "com.lowagie.text.Rectangle",
      "org.jfree.data.Values2D",
      "com.lowagie.text.ImgWMF",
      "org.jfree.data.KeyedObject",
      "com.lowagie.text.pdf.PdfAppearance",
      "com.lowagie.text.pdf.interfaces.PdfDocumentActions",
      "org.jfree.chart.renderer.category.MinMaxCategoryRenderer",
      "org.jfree.data.category.DefaultCategoryDataset",
      "com.lowagie.text.pdf.PdfColor",
      "org.jfree.chart.renderer.xy.XYItemRendererState",
      "org.jfree.chart.entity.PieSectionEntity",
      "org.jfree.data.xy.XYBarDataset",
      "com.lowagie.text.Jpeg",
      "org.jfree.chart.plot.ThermometerPlot",
      "org.jfree.chart.util.Layer",
      "com.lowagie.text.ImgRaw",
      "org.jfree.chart.event.PlotChangeListener",
      "org.jfree.chart.util.DefaultShadowGenerator",
      "com.lowagie.text.pdf.IntHashtable",
      "org.jfree.chart.title.PaintScaleLegend",
      "com.lowagie.text.pdf.PdfPTableEvent",
      "org.jfree.data.general.Series",
      "org.jfree.chart.labels.AbstractXYItemLabelGenerator",
      "org.jfree.chart.axis.SubCategoryAxis",
      "com.lowagie.text.pdf.PdfString",
      "com.lowagie.text.BadElementException",
      "com.lowagie.text.pdf.collection.PdfTargetDictionary",
      "org.jfree.chart.axis.NumberTickUnit",
      "com.lowagie.text.pdf.PdfContents",
      "org.jfree.chart.plot.DrawingSupplier",
      "org.jfree.data.event.DatasetChangeEvent",
      "com.lowagie.text.pdf.PRIndirectReference",
      "org.jfree.data.statistics.StatisticalCategoryDataset",
      "org.jfree.chart.urls.StandardCategoryURLGenerator",
      "com.lowagie.text.pdf.interfaces.PdfXConformance",
      "org.jfree.chart.util.PublicCloneable",
      "org.jfree.chart.event.DatasetChangeInfo",
      "com.lowagie.text.DocumentException",
      "org.jfree.chart.event.ChartChangeEvent",
      "com.lowagie.text.Document",
      "org.jfree.data.KeyedValues2D",
      "org.jfree.data.Values",
      "com.lowagie.text.pdf.PdfPSXObject",
      "org.jfree.chart.axis.CyclicNumberAxis",
      "org.jfree.data.KeyedObjects2D",
      "com.lowagie.text.xml.xmp.DublinCoreSchema",
      "org.jfree.chart.annotations.CategoryLineAnnotation",
      "org.jfree.chart.text.TextBlockAnchor",
      "org.jfree.chart.util.ResourceBundleWrapper",
      "com.lowagie.text.pdf.OutputStreamEncryption",
      "org.jfree.chart.renderer.category.LevelRenderer",
      "org.jfree.chart.axis.CategoryLabelWidthType",
      "org.jfree.chart.util.PaintUtilities"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AbstractCategoryItemRenderer_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jfree.chart.renderer.AbstractRenderer",
      "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer",
      "org.jfree.chart.renderer.category.GradientBarPainter",
      "org.jfree.chart.renderer.category.BarRenderer",
      "org.jfree.chart.renderer.category.BarRenderer3D",
      "org.jfree.chart.renderer.category.LineAndShapeRenderer",
      "org.jfree.chart.renderer.category.LineRenderer3D",
      "org.jfree.chart.util.Layer",
      "org.jfree.chart.plot.PlotOrientation",
      "org.jfree.chart.util.ObjectUtilities",
      "org.jfree.chart.text.TextUtilities",
      "org.jfree.chart.text.TextAnchor",
      "org.jfree.chart.util.LengthAdjustmentType",
      "org.jfree.chart.util.RectangleAnchor",
      "org.jfree.chart.util.SortOrder",
      "org.jfree.chart.renderer.category.LevelRenderer",
      "org.jfree.chart.util.AbstractObjectList",
      "org.jfree.chart.util.BooleanList",
      "org.jfree.chart.util.PaintList",
      "org.jfree.chart.util.StrokeList",
      "org.jfree.chart.util.ShapeList",
      "org.jfree.chart.util.ObjectList",
      "org.jfree.chart.labels.ItemLabelPosition",
      "org.jfree.chart.labels.ItemLabelAnchor",
      "org.jfree.chart.renderer.RenderAttributes",
      "org.jfree.chart.labels.StandardCategorySeriesLabelGenerator",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.chart.event.RendererChangeEvent",
      "org.jfree.chart.event.ChartChangeEventType",
      "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
      "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer",
      "org.jfree.chart.renderer.xy.DefaultXYItemRenderer",
      "org.jfree.chart.labels.StandardXYSeriesLabelGenerator",
      "org.jfree.chart.renderer.category.StatisticalBarRenderer",
      "org.jfree.chart.util.StandardGradientPaintTransformer",
      "org.jfree.chart.util.GradientPaintTransformType",
      "org.jfree.chart.annotations.AbstractAnnotation",
      "org.jfree.chart.annotations.TextAnnotation",
      "org.jfree.chart.annotations.CategoryTextAnnotation",
      "org.jfree.chart.annotations.CategoryPointerAnnotation",
      "org.jfree.chart.axis.CategoryAnchor",
      "org.jfree.chart.renderer.xy.CandlestickRenderer",
      "org.jfree.chart.labels.HighLowItemLabelGenerator",
      "org.jfree.chart.renderer.category.ScatterRenderer",
      "org.jfree.chart.renderer.category.WaterfallBarRenderer",
      "org.jfree.chart.renderer.category.StackedBarRenderer",
      "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer",
      "org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer",
      "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator",
      "org.jfree.chart.labels.StandardCategoryToolTipGenerator",
      "org.jfree.chart.labels.IntervalCategoryToolTipGenerator",
      "org.jfree.chart.labels.StandardCategoryItemLabelGenerator",
      "org.jfree.chart.renderer.category.GroupedStackedBarRenderer",
      "org.jfree.data.KeyToGroupMap",
      "org.jfree.chart.renderer.category.StackedBarRenderer3D",
      "org.jfree.chart.renderer.category.MinMaxCategoryRenderer",
      "org.jfree.chart.renderer.category.IntervalBarRenderer",
      "org.jfree.chart.renderer.category.GanttRenderer",
      "com.lowagie.text.pdf.PdfGraphics2D$HyperLinkKey",
      "org.jfree.chart.util.ResourceBundleWrapper",
      "org.jfree.chart.resources.JFreeChartResources",
      "org.jfree.chart.ui.Licences",
      "org.jfree.chart.JFreeChart",
      "org.jfree.chart.ChartPanel",
      "org.jfree.chart.ChartRenderingInfo",
      "org.jfree.chart.entity.StandardEntityCollection",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.chart.renderer.category.AreaRenderer",
      "org.jfree.chart.renderer.category.StackedAreaRenderer",
      "org.jfree.chart.renderer.AreaRendererEndType",
      "org.jfree.chart.renderer.category.CategoryStepRenderer",
      "com.lowagie.text.pdf.PdfObject",
      "com.lowagie.text.pdf.ByteBuffer",
      "com.lowagie.text.pdf.PdfName",
      "com.lowagie.text.pdf.PdfDictionary",
      "com.lowagie.text.pdf.PdfAnnotation",
      "com.lowagie.text.pdf.PdfFormField",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.statistics.DefaultStatisticalCategoryDataset",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.data.KeyedObjects2D",
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.util.RectangleInsets",
      "org.jfree.chart.axis.Axis",
      "org.jfree.chart.axis.CategoryAxis",
      "org.jfree.chart.axis.CategoryAxis3D",
      "org.jfree.chart.axis.CategoryLabelPosition",
      "org.jfree.chart.text.TextBlockAnchor",
      "org.jfree.chart.axis.CategoryLabelWidthType",
      "org.jfree.chart.axis.CategoryLabelPositions",
      "org.jfree.chart.plot.Plot",
      "org.jfree.chart.plot.CategoryPlot",
      "org.jfree.chart.plot.CombinedDomainCategoryPlot",
      "org.jfree.chart.ChartColor",
      "org.jfree.chart.plot.DefaultDrawingSupplier",
      "org.jfree.chart.plot.DatasetRenderingOrder",
      "org.jfree.chart.axis.AxisLocation",
      "org.jfree.data.event.DatasetChangeEvent",
      "org.jfree.chart.event.PlotChangeEvent",
      "org.jfree.chart.util.DefaultShadowGenerator",
      "org.jfree.chart.util.RectangleEdge",
      "org.jfree.chart.renderer.category.LayeredBarRenderer",
      "org.jfree.data.category.AbstractCategoryDataset",
      "org.jfree.data.category.DefaultCategoryDataset",
      "org.jfree.data.jdbc.JDBCCategoryDataset",
      "org.jfree.data.Range",
      "org.jfree.chart.axis.ValueAxis",
      "org.jfree.chart.axis.TickUnit",
      "org.jfree.chart.axis.NumberTickUnit",
      "org.jfree.chart.axis.NumberAxis",
      "org.jfree.chart.axis.CyclicNumberAxis",
      "org.jfree.chart.axis.TickUnits",
      "org.jfree.data.RangeType",
      "org.jfree.chart.event.AxisChangeEvent",
      "org.jfree.chart.plot.CombinedRangeCategoryPlot",
      "org.jfree.chart.block.AbstractBlock",
      "org.jfree.chart.util.HorizontalAlignment",
      "org.jfree.chart.util.VerticalAlignment",
      "org.jfree.chart.title.Title",
      "org.jfree.chart.title.LegendTitle",
      "org.jfree.chart.block.FlowArrangement",
      "org.jfree.chart.block.ColumnArrangement",
      "org.jfree.chart.block.BlockBorder",
      "org.jfree.chart.block.BlockContainer",
      "org.jfree.chart.block.LineBorder",
      "org.jfree.chart.event.TitleChangeEvent",
      "org.jfree.chart.title.TextTitle",
      "org.jfree.chart.axis.ExtendedCategoryAxis",
      "org.jfree.chart.renderer.DefaultPolarItemRenderer",
      "com.lowagie.text.Document",
      "com.lowagie.text.Rectangle",
      "com.lowagie.text.PageSize",
      "org.jfree.chart.plot.XYPlot",
      "org.jfree.chart.plot.CombinedRangeXYPlot",
      "org.jfree.chart.plot.SeriesRenderingOrder",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.category.DefaultIntervalCategoryDataset",
      "org.jfree.data.resources.DataPackageResources",
      "org.jfree.chart.axis.LogAxis",
      "org.jfree.chart.util.LogFormat",
      "org.jfree.chart.plot.ThermometerPlot",
      "org.jfree.data.general.DefaultValueDataset",
      "org.jfree.chart.renderer.category.DefaultCategoryItemRenderer",
      "com.lowagie.text.DocWriter",
      "com.lowagie.text.pdf.PdfWriter",
      "com.lowagie.text.pdf.PdfDocument",
      "com.lowagie.text.pdf.PdfDate",
      "com.lowagie.text.pdf.internal.PdfViewerPreferencesImp",
      "com.lowagie.text.pdf.internal.PdfVersionImp",
      "com.lowagie.text.pdf.internal.PdfXConformanceImp",
      "com.lowagie.text.pdf.PdfContentByte",
      "org.jfree.chart.plot.MultiplePiePlot",
      "org.jfree.chart.plot.PiePlot",
      "org.jfree.chart.plot.PieLabelLinkStyle",
      "org.jfree.chart.util.Rotation",
      "org.jfree.chart.util.PaintMap",
      "org.jfree.chart.util.StrokeMap",
      "org.jfree.chart.labels.AbstractPieItemLabelGenerator",
      "org.jfree.chart.labels.StandardPieSectionLabelGenerator",
      "org.jfree.chart.plot.AbstractPieLabelDistributor",
      "org.jfree.chart.plot.PieLabelDistributor",
      "org.jfree.chart.plot.PieSelectionAttributes",
      "org.jfree.chart.util.TableOrder",
      "org.jfree.chart.plot.SpiderWebPlot",
      "com.lowagie.text.pdf.PdfTemplate",
      "com.lowagie.text.SimpleCell",
      "org.jfree.chart.plot.FastScatterPlot",
      "org.jfree.data.gantt.TaskSeriesCollection",
      "org.jfree.chart.axis.SubCategoryAxis",
      "org.jfree.data.category.SlidingCategoryDataset",
      "org.jfree.chart.needle.MeterNeedle",
      "org.jfree.chart.needle.ArrowNeedle",
      "org.jfree.chart.annotations.AbstractXYAnnotation",
      "org.jfree.chart.annotations.XYTextAnnotation",
      "org.jfree.chart.util.ShapeUtilities",
      "org.jfree.data.general.DefaultKeyedValues2DDataset",
      "org.jfree.chart.axis.NumberAxis3D",
      "org.jfree.chart.plot.CombinedDomainXYPlot",
      "org.jfree.chart.axis.PeriodAxis",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.time.Day",
      "org.jfree.data.time.SerialDate",
      "org.jfree.data.time.SpreadsheetDate",
      "org.jfree.data.time.Year",
      "org.jfree.data.time.Quarter",
      "org.jfree.data.time.Month",
      "org.jfree.data.time.Hour",
      "org.jfree.chart.axis.PeriodAxisLabelInfo",
      "org.jfree.data.time.DateRange",
      "org.jfree.chart.axis.DateTickUnit",
      "org.jfree.chart.axis.DateTickUnitType",
      "org.jfree.chart.axis.DateAxis$DefaultTimeline",
      "org.jfree.chart.axis.DateAxis",
      "org.jfree.chart.axis.DateTickMarkPosition",
      "org.jfree.chart.urls.StandardCategoryURLGenerator",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset",
      "org.jfree.chart.entity.ChartEntity",
      "org.jfree.chart.entity.CategoryItemEntity",
      "com.lowagie.text.Image",
      "com.lowagie.text.pdf.codec.PngImage",
      "org.jfree.data.general.WaferMapDataset",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.chart.renderer.WaferMapRenderer",
      "org.jfree.chart.plot.WaferMapPlot",
      "org.jfree.data.gantt.SlidingGanttCategoryDataset",
      "org.jfree.chart.PolarChartPanel",
      "org.jfree.chart.event.ChartProgressEvent",
      "org.jfree.chart.entity.JFreeChartEntity",
      "org.jfree.chart.block.LengthConstraintType",
      "org.jfree.chart.block.RectangleConstraint",
      "org.jfree.chart.text.TextBlock",
      "org.jfree.chart.text.TextLine",
      "org.jfree.chart.text.TextFragment",
      "org.jfree.chart.util.Size2D",
      "org.jfree.chart.entity.TitleEntity",
      "org.jfree.data.statistics.DefaultMultiValueCategoryDataset",
      "org.jfree.chart.annotations.CategoryLineAnnotation",
      "org.jfree.chart.labels.AbstractXYItemLabelGenerator",
      "org.jfree.chart.labels.StandardXYToolTipGenerator",
      "org.jfree.chart.renderer.xy.XYAreaRenderer",
      "org.jfree.chart.renderer.xy.StackedXYAreaRenderer",
      "org.jfree.chart.plot.Marker",
      "org.jfree.chart.plot.IntervalMarker",
      "org.jfree.chart.event.MarkerChangeEvent",
      "org.jfree.chart.plot.CompassPlot",
      "org.jfree.data.time.TimePeriodFormatException",
      "org.jfree.chart.urls.CustomCategoryURLGenerator",
      "org.jfree.chart.text.TextBox",
      "org.jfree.chart.plot.MeterPlot",
      "org.jfree.chart.plot.DialShape",
      "com.lowagie.text.pdf.BaseFont",
      "org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator",
      "org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator",
      "org.jfree.data.time.Millisecond",
      "org.jfree.chart.needle.WindNeedle",
      "com.lowagie.text.DocumentException",
      "com.lowagie.text.BadElementException",
      "org.jfree.chart.event.AnnotationChangeEvent",
      "org.jfree.chart.LegendItemCollection",
      "org.jfree.data.time.FixedMillisecond",
      "org.jfree.data.UnknownKeyException",
      "org.jfree.chart.plot.Crosshair",
      "org.jfree.chart.labels.StandardCrosshairLabelGenerator",
      "org.jfree.data.general.Series",
      "org.jfree.data.xy.XYSeries",
      "org.jfree.chart.urls.TimeSeriesURLGenerator",
      "org.jfree.chart.labels.IntervalCategoryItemLabelGenerator",
      "com.lowagie.text.pdf.PdfGraphics2D",
      "com.lowagie.text.pdf.Type1Font",
      "com.lowagie.text.ExceptionConverter",
      "org.jfree.chart.axis.LogarithmicAxis",
      "org.jfree.chart.plot.CategoryMarker",
      "org.jfree.chart.plot.PiePlot3D",
      "org.jfree.chart.renderer.xy.XYAreaRenderer2",
      "org.jfree.chart.renderer.xy.StackedXYAreaRenderer2",
      "org.jfree.chart.plot.RingPlot",
      "org.jfree.chart.labels.StandardXYZToolTipGenerator",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset",
      "com.lowagie.text.Phrase",
      "com.lowagie.text.Paragraph",
      "com.lowagie.text.Font",
      "com.lowagie.text.Jpeg2000",
      "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer",
      "com.lowagie.text.Section",
      "com.lowagie.text.Chapter",
      "com.lowagie.text.ListItem",
      "org.jfree.chart.urls.StandardXYURLGenerator",
      "org.jfree.chart.renderer.xy.StandardXYItemRenderer",
      "org.jfree.chart.renderer.xy.CyclicXYItemRenderer",
      "org.jfree.data.pie.AbstractPieDataset",
      "org.jfree.data.pie.DefaultPieDataset",
      "org.jfree.data.jdbc.JDBCPieDataset",
      "org.jfree.data.KeyedObjects",
      "org.jfree.chart.axis.SegmentedTimeline",
      "org.jfree.chart.util.PaintUtilities",
      "org.jfree.data.ComparableObjectSeries",
      "org.jfree.data.xy.XYIntervalSeries",
      "org.jfree.chart.axis.AxisSpace",
      "org.jfree.chart.entity.AxisEntity",
      "org.jfree.chart.renderer.xy.HighLowRenderer",
      "com.lowagie.text.pdf.PdfAppearance",
      "org.jfree.chart.renderer.LookupPaintScale",
      "org.jfree.chart.title.PaintScaleLegend",
      "org.jfree.data.xy.DefaultWindDataset",
      "org.jfree.chart.labels.MultipleXYSeriesLabelGenerator",
      "org.jfree.chart.axis.ModuloAxis",
      "org.jfree.chart.renderer.xy.XYLine3DRenderer",
      "org.jfree.chart.labels.CustomXYToolTipGenerator",
      "org.jfree.chart.renderer.xy.XYStepAreaRenderer",
      "com.lowagie.text.pdf.AsianFontMapper",
      "org.jfree.data.SelectableValue",
      "org.jfree.data.KeyedObject",
      "com.lowagie.text.pdf.CJKFont",
      "org.jfree.chart.renderer.GrayPaintScale",
      "org.jfree.chart.renderer.xy.GradientXYBarPainter",
      "org.jfree.chart.renderer.xy.XYBarRenderer",
      "org.jfree.chart.renderer.xy.ClusteredXYBarRenderer",
      "com.lowagie.text.Chunk",
      "org.jfree.data.general.SeriesChangeType",
      "org.jfree.data.event.SeriesChangeEvent",
      "com.lowagie.text.Jpeg",
      "org.jfree.data.time.Second",
      "org.jfree.chart.renderer.xy.XYBlockRenderer",
      "org.jfree.data.general.DefaultKeyedValuesDataset",
      "org.jfree.chart.LegendItem",
      "org.jfree.chart.plot.PolarPlot",
      "org.jfree.chart.axis.Tick",
      "org.jfree.chart.axis.ValueTick",
      "org.jfree.chart.axis.NumberTick",
      "org.jfree.chart.axis.TickType",
      "org.jfree.chart.axis.SymbolAxis",
      "org.jfree.data.xy.DefaultOHLCDataset",
      "org.jfree.data.xy.YIntervalSeries",
      "org.jfree.data.jdbc.JDBCXYDataset",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.data.xy.XYBarDataset",
      "com.lowagie.text.pdf.PdfEncodings$WingdingsConversion",
      "com.lowagie.text.pdf.PdfEncodings$SymbolConversion",
      "com.lowagie.text.pdf.PdfEncodings$Cp437Conversion",
      "com.lowagie.text.pdf.PdfEncodings",
      "com.lowagie.text.pdf.PdfReader",
      "org.jfree.data.time.Minute",
      "com.lowagie.text.pdf.ExtendedColor",
      "org.jfree.chart.plot.ValueMarker",
      "org.jfree.data.time.SimpleTimePeriod"
    );
  }
}
