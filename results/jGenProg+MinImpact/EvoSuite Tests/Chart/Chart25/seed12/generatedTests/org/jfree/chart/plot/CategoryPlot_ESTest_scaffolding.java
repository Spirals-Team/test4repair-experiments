/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Jan 15 11:48:20 GMT 2017
 */

package org.jfree.chart.plot;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class CategoryPlot_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jfree.chart.plot.CategoryPlot"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(CategoryPlot_ESTest_scaffolding.class.getClassLoader() ,
      "org.jfree.chart.labels.StandardPieSectionLabelGenerator",
      "com.lowagie.text.pdf.TrueTypeFontUnicode",
      "org.jfree.chart.plot.ValueMarker",
      "org.jfree.data.resources.DataPackageResources",
      "org.jfree.chart.Effect3D",
      "com.lowagie.text.pdf.PdfOCG",
      "com.lowagie.text.Element",
      "org.jfree.data.general.ValueDataset",
      "com.lowagie.text.pdf.collection.PdfCollectionItem",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.chart.LegendItemCollection",
      "com.lowagie.text.pdf.ExtraEncoding",
      "org.jfree.data.RangeInfo",
      "org.jfree.chart.text.TextFragment",
      "com.lowagie.text.pdf.CJKFont",
      "org.jfree.chart.axis.AxisCollection",
      "org.jfree.chart.labels.ItemLabelPosition",
      "com.lowagie.text.pdf.internal.PdfAnnotationsImp",
      "org.jfree.chart.util.PaintList",
      "org.jfree.chart.labels.ItemLabelAnchor",
      "org.jfree.chart.axis.Timeline",
      "org.jfree.chart.ui.Contributor",
      "com.lowagie.text.pdf.PdfStructureElement",
      "org.jfree.chart.util.RectangleAnchor",
      "org.jfree.data.time.TimePeriodFormatException",
      "org.jfree.chart.text.TextBlock",
      "com.lowagie.text.pdf.ColorDetails",
      "org.jfree.chart.axis.Axis",
      "com.lowagie.text.pdf.PdfPattern",
      "com.lowagie.text.pdf.PdfRectangle",
      "org.jfree.chart.axis.NumberAxis3D",
      "org.jfree.chart.block.BlockBorder",
      "com.lowagie.text.pdf.PdfPageEvent",
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.annotations.XYAnnotation",
      "org.jfree.chart.util.ObjectUtilities",
      "org.jfree.chart.needle.MeterNeedle",
      "com.lowagie.text.pdf.PdfOutline",
      "org.jfree.chart.plot.DatasetRenderingOrder",
      "org.jfree.chart.event.RendererChangeListener",
      "org.jfree.chart.plot.CombinedRangeCategoryPlot",
      "org.jfree.data.KeyedValues",
      "org.jfree.chart.block.FlowArrangement",
      "org.jfree.chart.event.TitleChangeListener",
      "org.jfree.chart.text.TextMeasurer",
      "org.jfree.chart.LegendItemSource",
      "com.lowagie.text.pdf.PdfAction",
      "org.jfree.chart.renderer.AreaRendererEndType",
      "org.jfree.data.general.DatasetChangeListener",
      "org.jfree.chart.renderer.category.BarRenderer3D",
      "org.jfree.data.gantt.TaskSeries",
      "org.jfree.chart.event.TitleChangeEvent",
      "org.jfree.chart.ui.ExtensionFileFilter",
      "org.jfree.chart.renderer.category.WaterfallBarRenderer",
      "org.jfree.chart.ui.Licences",
      "org.jfree.chart.axis.CyclicNumberAxis$CycleBoundTick",
      "org.jfree.chart.event.ChartChangeEventType",
      "com.lowagie.text.pdf.PdfNull",
      "com.lowagie.text.pdf.PdfOCProperties",
      "com.lowagie.text.xml.xmp.PdfSchema",
      "org.jfree.chart.axis.ExtendedCategoryAxis",
      "com.lowagie.text.pdf.PdfWriter$PdfBody",
      "org.jfree.chart.util.GradientPaintTransformType",
      "com.lowagie.text.pdf.PdfDocument",
      "org.jfree.chart.renderer.category.CategoryItemRenderer",
      "com.lowagie.text.pdf.ByteBuffer",
      "com.lowagie.text.pdf.PdfBorderDictionary",
      "org.jfree.chart.annotations.CategoryTextAnnotation",
      "org.jfree.chart.util.Size2D",
      "org.jfree.chart.renderer.category.LineAndShapeRenderer",
      "org.jfree.chart.util.ShapeUtilities",
      "org.jfree.data.general.SeriesChangeEvent",
      "com.lowagie.text.pdf.PdfMediaClipData",
      "org.jfree.chart.ChartPanel",
      "org.jfree.chart.plot.FastScatterPlot",
      "org.jfree.chart.labels.CategoryItemLabelGenerator",
      "org.jfree.chart.axis.TickUnits",
      "com.lowagie.text.pdf.PdfWriter",
      "com.lowagie.text.pdf.PdfLiteral",
      "com.lowagie.text.pdf.PdfPrinterGraphics2D",
      "com.lowagie.text.pdf.collection.PdfCollectionField",
      "com.lowagie.text.pdf.GrayColor",
      "org.jfree.chart.renderer.category.StackedBarRenderer",
      "org.jfree.chart.renderer.category.GanttRenderer",
      "org.jfree.chart.util.VerticalAlignment",
      "org.jfree.chart.plot.SeriesRenderingOrder",
      "org.jfree.chart.renderer.category.StackedAreaRenderer",
      "com.lowagie.text.pdf.PdfXConformanceException",
      "org.jfree.chart.axis.NumberTick",
      "org.jfree.chart.block.BlockContainer",
      "org.jfree.chart.plot.Marker",
      "org.jfree.chart.ChartMouseListener",
      "com.lowagie.text.pdf.PdfImportedPage",
      "org.jfree.chart.renderer.category.CategoryItemRendererState",
      "org.jfree.chart.renderer.category.DefaultCategoryItemRenderer",
      "org.jfree.chart.axis.SegmentedTimeline",
      "org.jfree.chart.axis.ValueAxis",
      "org.jfree.data.Value",
      "org.jfree.chart.plot.MultiplePiePlot",
      "org.jfree.chart.block.BlockFrame",
      "org.jfree.data.general.DefaultValueDataset",
      "com.lowagie.text.Cell",
      "com.lowagie.text.pdf.ExtendedColor",
      "com.lowagie.text.pdf.PdfDocument$PdfInfo",
      "org.jfree.chart.plot.CrosshairState",
      "org.jfree.chart.renderer.category.StackedBarRenderer3D",
      "org.jfree.chart.axis.AxisState",
      "org.jfree.chart.renderer.AbstractRenderer",
      "com.lowagie.text.pdf.PdfTransparencyGroup",
      "org.jfree.chart.title.Title",
      "com.lowagie.text.pdf.PdfEncodings$SymbolConversion",
      "com.lowagie.text.pdf.PdfBorderArray",
      "org.jfree.chart.axis.DateTickMarkPosition",
      "org.jfree.chart.block.LineBorder",
      "com.lowagie.text.pdf.PdfFormXObject",
      "org.jfree.data.DefaultKeyedValues2D",
      "com.lowagie.text.pdf.FontDetails",
      "com.lowagie.text.pdf.PdfShading",
      "org.jfree.chart.plot.CombinedDomainXYPlot",
      "com.lowagie.text.pdf.PdfEncodings$Cp437Conversion",
      "org.jfree.data.time.Day",
      "org.jfree.data.general.SeriesDataset",
      "com.lowagie.text.pdf.PdfReader",
      "org.jfree.chart.ui.BasicProjectInfo",
      "org.jfree.data.xy.XYDataset",
      "org.jfree.chart.block.Arrangement",
      "org.jfree.chart.plot.Plot",
      "com.lowagie.text.pdf.IntHashtable$Entry",
      "com.lowagie.text.ImgPostscript",
      "org.jfree.chart.plot.ValueAxisPlot",
      "org.jfree.chart.renderer.category.IntervalBarRenderer",
      "org.jfree.chart.renderer.category.BarRenderer",
      "org.jfree.chart.event.AxisChangeEvent",
      "org.jfree.chart.LegendItem",
      "org.jfree.chart.urls.CategoryURLGenerator",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.chart.entity.TickLabelEntity",
      "com.lowagie.text.pdf.PdfPageLabels",
      "org.jfree.chart.renderer.category.LineRenderer3D",
      "com.lowagie.text.pdf.PdfDashPattern",
      "org.jfree.chart.entity.CategoryItemEntity",
      "org.jfree.chart.entity.AxisLabelEntity",
      "org.jfree.data.general.DatasetUtilities",
      "org.jfree.chart.plot.AbstractPieLabelDistributor",
      "org.jfree.chart.util.BooleanList",
      "com.lowagie.text.pdf.PdfDictionary",
      "org.jfree.chart.annotations.TextAnnotation",
      "org.jfree.chart.util.AbstractObjectList",
      "org.jfree.chart.labels.StandardCategorySeriesLabelGenerator",
      "org.jfree.data.xy.IntervalXYDataset",
      "org.jfree.data.general.DefaultPieDataset",
      "org.jfree.chart.entity.CategoryLabelEntity",
      "org.jfree.chart.util.RectangleEdge",
      "org.jfree.chart.plot.DefaultDrawingSupplier",
      "org.jfree.data.statistics.MeanAndStandardDeviation",
      "org.jfree.data.category.DefaultIntervalCategoryDataset",
      "org.jfree.chart.plot.PieLabelDistributor",
      "com.lowagie.text.ElementListener",
      "org.jfree.data.category.CategoryDataset",
      "org.jfree.chart.util.RectangleInsets",
      "org.jfree.chart.text.TextAnchor",
      "org.jfree.chart.axis.TickUnit",
      "org.jfree.chart.ChartColor",
      "org.jfree.chart.util.GradientPaintTransformer",
      "com.lowagie.text.pdf.internal.PdfVersionImp",
      "org.jfree.data.gantt.TaskSeriesCollection",
      "org.jfree.chart.annotations.CategoryPointerAnnotation",
      "com.lowagie.text.pdf.PdfImage",
      "org.jfree.chart.util.StrokeList",
      "com.lowagie.text.pdf.interfaces.PdfVersion",
      "org.jfree.chart.util.StandardGradientPaintTransformer",
      "com.lowagie.text.pdf.internal.PdfViewerPreferencesImp",
      "org.jfree.chart.axis.CategoryAxis3D",
      "com.lowagie.text.pdf.PdfPage",
      "org.jfree.chart.axis.TickUnitSource",
      "org.jfree.chart.plot.CategoryMarker",
      "org.jfree.data.time.SpreadsheetDate",
      "org.jfree.chart.plot.XYPlot",
      "org.jfree.chart.block.AbstractBlock",
      "com.lowagie.text.pdf.PdfName",
      "org.jfree.chart.util.TableOrder",
      "com.lowagie.text.pdf.PdfGState",
      "com.lowagie.text.pdf.RandomAccessFileOrArray",
      "com.lowagie.text.ImgWMF",
      "com.lowagie.text.pdf.PdfAppearance",
      "com.lowagie.text.pdf.PdfTextArray",
      "com.lowagie.text.Jpeg",
      "com.lowagie.text.pdf.PdfLayer",
      "org.jfree.chart.plot.ThermometerPlot",
      "com.lowagie.text.ImgRaw",
      "org.jfree.data.time.Hour",
      "org.jfree.chart.axis.PeriodAxisLabelInfo",
      "com.lowagie.text.pdf.PdfPTableEvent",
      "org.jfree.chart.axis.SubCategoryAxis",
      "com.lowagie.text.pdf.collection.PdfTargetDictionary",
      "org.jfree.chart.axis.NumberTickUnit",
      "com.lowagie.text.pdf.TrueTypeFont",
      "org.jfree.chart.title.TextTitle",
      "com.lowagie.text.pdf.PdfReaderInstance",
      "com.lowagie.text.pdf.PRIndirectReference",
      "org.jfree.data.statistics.StatisticalCategoryDataset",
      "com.lowagie.text.DocumentException",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.data.KeyedValues2D",
      "com.lowagie.text.pdf.PdfPSXObject",
      "org.jfree.data.Values",
      "org.jfree.chart.axis.CyclicNumberAxis",
      "com.lowagie.text.xml.xmp.DublinCoreSchema",
      "org.jfree.chart.text.TextBlockAnchor",
      "com.lowagie.text.PageSize",
      "org.jfree.chart.event.ChartChangeListener",
      "org.jfree.chart.renderer.category.LevelRenderer",
      "org.jfree.chart.util.PaintUtilities",
      "org.jfree.chart.event.ChartProgressListener",
      "org.jfree.chart.labels.AbstractPieItemLabelGenerator",
      "org.jfree.chart.plot.WaferMapPlot",
      "org.jfree.chart.labels.CategorySeriesLabelGenerator",
      "com.lowagie.text.pdf.interfaces.PdfViewerPreferences",
      "com.lowagie.text.pdf.PdfEncodings$SymbolTTConversion",
      "org.jfree.chart.axis.MarkerAxisBand",
      "com.lowagie.text.pdf.PdfPCellEvent",
      "com.lowagie.text.xml.xmp.XmpWriter",
      "org.jfree.chart.axis.CategoryAxis",
      "com.lowagie.text.pdf.PdfPatternPainter",
      "org.jfree.chart.renderer.xy.XYItemRenderer",
      "org.jfree.chart.ui.ProjectInfo",
      "org.jfree.chart.renderer.RendererState",
      "org.jfree.chart.entity.StandardEntityCollection",
      "org.jfree.chart.axis.LogarithmicAxis",
      "com.lowagie.text.pdf.PdfBoolean",
      "org.jfree.chart.axis.DateAxis$DefaultTimeline",
      "com.lowagie.text.TextElementArray",
      "org.jfree.chart.axis.DateAxis",
      "org.jfree.chart.plot.CategoryPlot",
      "org.jfree.chart.event.MarkerChangeListener",
      "org.jfree.chart.event.PlotChangeEvent",
      "com.lowagie.text.pdf.interfaces.PdfPageActions",
      "org.jfree.chart.plot.PiePlot",
      "com.lowagie.text.pdf.PageResources",
      "com.lowagie.text.HeaderFooter",
      "org.jfree.chart.event.RendererChangeEvent",
      "com.lowagie.text.pdf.PdfException",
      "com.lowagie.text.pdf.PdfIndirectReference",
      "com.lowagie.text.pdf.PdfPTable",
      "org.jfree.chart.labels.PieSectionLabelGenerator",
      "org.jfree.chart.axis.Tick",
      "org.jfree.data.statistics.BoxAndWhiskerItem",
      "com.lowagie.text.pdf.DocumentFont",
      "org.jfree.data.DefaultKeyedValues",
      "com.lowagie.text.pdf.PdfArray",
      "org.jfree.data.statistics.BoxAndWhiskerCategoryDataset",
      "org.jfree.chart.util.ShapeList",
      "com.lowagie.text.pdf.collection.PdfCollection",
      "com.lowagie.text.pdf.OutputStreamCounter",
      "org.jfree.chart.util.HorizontalAlignment",
      "com.lowagie.text.DocWriter",
      "org.jfree.chart.axis.CategoryAnchor",
      "org.jfree.chart.axis.SegmentedTimeline$BaseTimelineSegmentRange",
      "org.jfree.chart.labels.CategoryToolTipGenerator",
      "org.jfree.data.general.DefaultKeyedValues2DDataset",
      "com.lowagie.text.pdf.PdfSpotColor",
      "org.jfree.chart.axis.CategoryLabelPositions",
      "org.jfree.data.time.Quarter",
      "com.lowagie.text.pdf.PdfTransition",
      "org.jfree.chart.util.SortOrder",
      "com.lowagie.text.pdf.PdfPages",
      "org.jfree.chart.annotations.CategoryAnnotation",
      "org.jfree.chart.axis.AxisSpace",
      "org.jfree.chart.axis.SegmentedTimeline$SegmentRange",
      "org.jfree.data.time.DateRange",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.data.DefaultKeyedValue",
      "org.jfree.chart.util.Rotation",
      "com.lowagie.text.pdf.PdfAnnotation",
      "com.lowagie.text.pdf.PdfSignature",
      "org.jfree.chart.resources.JFreeChartResources",
      "org.jfree.data.RangeType",
      "com.lowagie.text.pdf.PdfStructureTreeRoot",
      "org.jfree.data.time.Month",
      "org.jfree.data.general.WaferMapDataset",
      "org.jfree.data.general.Dataset",
      "org.jfree.chart.plot.PlotOrientation",
      "org.jfree.chart.axis.NumberAxis",
      "com.lowagie.text.DocListener",
      "org.jfree.chart.renderer.category.AreaRenderer",
      "org.jfree.chart.axis.SymbolAxis",
      "com.lowagie.text.pdf.collection.PdfCollectionSchema",
      "com.lowagie.text.ImgCCITT",
      "org.jfree.chart.axis.ValueTick",
      "com.lowagie.text.pdf.FontMapper",
      "org.jfree.chart.JFreeChart",
      "com.lowagie.text.pdf.PdfFormField",
      "com.lowagie.text.pdf.PdfDestination",
      "com.lowagie.text.pdf.PdfTable",
      "org.jfree.chart.title.LegendTitle",
      "com.lowagie.text.pdf.PdfNumber",
      "org.jfree.data.DataUtilities",
      "org.jfree.chart.ChartRenderingInfo",
      "org.jfree.chart.JFreeChartInfo",
      "org.jfree.chart.event.MarkerChangeEvent",
      "org.jfree.data.time.MonthConstants",
      "com.lowagie.text.pdf.internal.PdfXConformanceImp",
      "org.jfree.chart.event.AxisChangeListener",
      "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer",
      "com.lowagie.text.pdf.BadPdfFormatException",
      "org.jfree.chart.axis.SegmentedTimeline$Segment",
      "com.lowagie.text.pdf.BaseFont",
      "org.jfree.data.KeyedObjects",
      "com.lowagie.text.pdf.PdfAcroForm",
      "org.jfree.chart.ui.Library",
      "org.jfree.data.time.SerialDate",
      "org.jfree.chart.block.ColumnArrangement",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.chart.plot.Zoomable",
      "com.lowagie.text.pdf.PdfEncryption",
      "com.lowagie.text.pdf.PdfGraphics2D",
      "org.jfree.chart.util.ObjectList",
      "com.lowagie.text.pdf.PRStream",
      "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer",
      "com.lowagie.text.Image",
      "com.lowagie.text.pdf.PdfContentByte",
      "com.lowagie.text.Meta",
      "org.jfree.chart.axis.PeriodAxis",
      "org.jfree.chart.needle.ArrowNeedle",
      "com.lowagie.text.pdf.PdfIndirectObject",
      "com.lowagie.text.ImgTemplate",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset",
      "com.lowagie.text.pdf.PdfDocument$PdfCatalog",
      "com.lowagie.text.pdf.PdfICCBased",
      "org.jfree.data.UnknownKeyException",
      "org.jfree.data.time.TimePeriod",
      "org.jfree.chart.renderer.WaferMapRenderer",
      "org.jfree.chart.util.LengthAdjustmentType",
      "org.jfree.chart.block.Block",
      "com.lowagie.text.pdf.PdfDate",
      "com.lowagie.text.ExceptionConverter",
      "com.lowagie.text.pdf.interfaces.PdfEncryptionSettings",
      "com.lowagie.text.pdf.PdfEncodings$WingdingsConversion",
      "com.lowagie.text.xml.xmp.XmpBasicSchema",
      "com.lowagie.text.pdf.PdfRendition",
      "org.jfree.data.general.PieDataset",
      "com.lowagie.text.xml.xmp.XmpSchema",
      "com.lowagie.text.Table",
      "org.jfree.chart.axis.AxisLocation",
      "com.lowagie.text.pdf.PdfStream",
      "org.jfree.chart.event.ChartProgressEvent",
      "org.jfree.data.general.KeyedValues2DDataset",
      "com.lowagie.text.pdf.PdfTemplate",
      "com.lowagie.text.pdf.PdfGraphics2D$fakeComponent",
      "com.lowagie.text.pdf.PdfObject",
      "com.lowagie.text.pdf.PdfEncodings",
      "org.jfree.data.Range",
      "org.jfree.chart.plot.CombinedDomainCategoryPlot",
      "org.jfree.data.statistics.DefaultStatisticalCategoryDataset",
      "org.jfree.data.category.IntervalCategoryDataset",
      "org.jfree.chart.plot.PlotState",
      "com.lowagie.text.pdf.PdfShadingPattern",
      "org.jfree.data.time.Year",
      "org.jfree.chart.Drawable",
      "com.lowagie.text.pdf.collection.PdfCollectionSort",
      "org.jfree.chart.axis.CategoryLabelPosition",
      "org.jfree.chart.text.TextLine",
      "com.lowagie.text.pdf.interfaces.PdfAnnotations",
      "org.jfree.chart.PaintMap",
      "com.lowagie.text.pdf.interfaces.PdfRunDirection",
      "com.lowagie.text.pdf.PdfContentByte$GraphicState",
      "org.jfree.chart.axis.DateTickUnit",
      "org.jfree.chart.axis.ModuloAxis",
      "com.lowagie.text.pdf.PdfFileSpecification",
      "com.lowagie.text.pdf.PdfDocument$Indentation",
      "org.jfree.chart.entity.ChartEntity",
      "org.jfree.chart.entity.EntityCollection",
      "com.lowagie.text.Rectangle",
      "org.jfree.data.gantt.GanttCategoryDataset",
      "org.jfree.data.Values2D",
      "org.jfree.data.KeyedObject",
      "org.jfree.data.general.DatasetChangeEvent",
      "com.lowagie.text.pdf.interfaces.PdfDocumentActions",
      "org.jfree.data.general.SeriesChangeListener",
      "org.jfree.data.category.DefaultCategoryDataset",
      "com.lowagie.text.pdf.PdfColor",
      "org.jfree.data.general.KeyedValuesDataset",
      "org.jfree.chart.entity.PieSectionEntity",
      "org.jfree.data.general.DefaultKeyedValuesDataset",
      "org.jfree.chart.util.Layer",
      "org.jfree.chart.event.PlotChangeListener",
      "com.lowagie.text.pdf.IntHashtable",
      "org.jfree.data.general.Series",
      "com.lowagie.text.pdf.Type1Font",
      "com.lowagie.text.pdf.PdfString",
      "com.lowagie.text.BadElementException",
      "com.lowagie.text.pdf.PdfContents",
      "org.jfree.chart.plot.DrawingSupplier",
      "org.jfree.data.KeyedValue",
      "com.lowagie.text.pdf.interfaces.PdfXConformance",
      "org.jfree.chart.plot.IntervalMarker",
      "org.jfree.chart.util.PublicCloneable",
      "com.lowagie.text.pdf.BaseFont$StreamFont",
      "com.lowagie.text.Document",
      "org.jfree.chart.StrokeMap",
      "com.lowagie.text.pdf.PdfResources",
      "org.jfree.data.KeyedObjects2D",
      "com.lowagie.text.pdf.OutputStreamEncryption",
      "org.jfree.chart.axis.LogAxis",
      "org.jfree.chart.axis.CategoryLabelWidthType"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(CategoryPlot_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.util.RectangleInsets",
      "org.jfree.chart.plot.Plot",
      "org.jfree.chart.plot.CategoryPlot",
      "org.jfree.chart.plot.DatasetRenderingOrder",
      "org.jfree.chart.util.SortOrder",
      "org.jfree.chart.plot.PlotOrientation",
      "org.jfree.chart.axis.AxisLocation",
      "org.jfree.chart.axis.CategoryAnchor",
      "org.jfree.chart.util.Layer",
      "org.jfree.chart.util.RectangleEdge",
      "org.jfree.chart.event.ChartChangeEventType",
      "org.jfree.chart.util.SerialUtilities",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.data.KeyedObjects2D",
      "org.jfree.data.Range",
      "org.jfree.chart.axis.Axis",
      "org.jfree.chart.axis.CategoryAxis",
      "org.jfree.chart.axis.CategoryAxis3D",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.chart.event.AxisChangeEvent",
      "org.jfree.chart.axis.CategoryLabelPosition",
      "org.jfree.chart.util.RectangleAnchor",
      "org.jfree.chart.text.TextBlockAnchor",
      "org.jfree.chart.text.TextAnchor",
      "org.jfree.chart.axis.CategoryLabelWidthType",
      "org.jfree.chart.axis.CategoryLabelPositions",
      "org.jfree.chart.axis.ValueAxis",
      "org.jfree.chart.axis.TickUnit",
      "org.jfree.chart.axis.NumberTickUnit",
      "org.jfree.chart.axis.NumberAxis",
      "org.jfree.chart.axis.SymbolAxis",
      "org.jfree.chart.axis.TickUnits",
      "org.jfree.data.RangeType",
      "org.jfree.chart.renderer.AbstractRenderer",
      "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer",
      "org.jfree.chart.renderer.category.LineAndShapeRenderer",
      "org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer",
      "org.jfree.chart.util.AbstractObjectList",
      "org.jfree.chart.util.BooleanList",
      "org.jfree.chart.util.PaintList",
      "org.jfree.chart.util.StrokeList",
      "org.jfree.chart.util.ShapeList",
      "org.jfree.chart.util.ObjectList",
      "org.jfree.chart.labels.ItemLabelPosition",
      "org.jfree.chart.labels.ItemLabelAnchor",
      "org.jfree.chart.labels.StandardCategorySeriesLabelGenerator",
      "org.jfree.chart.ChartColor",
      "org.jfree.chart.plot.DefaultDrawingSupplier",
      "org.jfree.data.general.DatasetChangeEvent",
      "org.jfree.chart.event.PlotChangeEvent",
      "org.jfree.chart.plot.Marker",
      "org.jfree.chart.plot.ValueMarker",
      "org.jfree.chart.util.LengthAdjustmentType",
      "org.jfree.chart.axis.LogAxis",
      "org.jfree.chart.renderer.category.AreaRenderer",
      "org.jfree.chart.renderer.AreaRendererEndType",
      "org.jfree.chart.resources.JFreeChartResources",
      "org.jfree.chart.ui.Licences",
      "org.jfree.chart.JFreeChart",
      "org.jfree.chart.plot.CombinedRangeCategoryPlot",
      "org.jfree.chart.plot.MultiplePiePlot",
      "org.jfree.chart.plot.PiePlot",
      "org.jfree.chart.util.Rotation",
      "org.jfree.chart.PaintMap",
      "org.jfree.chart.StrokeMap",
      "org.jfree.chart.labels.AbstractPieItemLabelGenerator",
      "org.jfree.chart.labels.StandardPieSectionLabelGenerator",
      "org.jfree.chart.plot.AbstractPieLabelDistributor",
      "org.jfree.chart.plot.PieLabelDistributor",
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
      "org.jfree.chart.util.TableOrder",
      "org.jfree.chart.title.TextTitle",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.time.Millisecond",
      "org.jfree.data.time.Day",
      "org.jfree.data.time.SerialDate",
      "org.jfree.data.time.SpreadsheetDate",
      "org.jfree.data.category.DefaultCategoryDataset",
      "org.jfree.data.jdbc.JDBCCategoryDataset",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.chart.axis.LogarithmicAxis",
      "com.lowagie.text.Document",
      "com.lowagie.text.DocWriter",
      "com.lowagie.text.pdf.PdfObject",
      "com.lowagie.text.pdf.ByteBuffer",
      "com.lowagie.text.pdf.PdfName",
      "com.lowagie.text.pdf.PdfWriter",
      "com.lowagie.text.pdf.PdfDocument",
      "com.lowagie.text.Rectangle",
      "com.lowagie.text.PageSize",
      "com.lowagie.text.pdf.PdfDictionary",
      "com.lowagie.text.pdf.PdfDate",
      "com.lowagie.text.pdf.internal.PdfViewerPreferencesImp",
      "com.lowagie.text.pdf.internal.PdfVersionImp",
      "com.lowagie.text.pdf.internal.PdfXConformanceImp",
      "com.lowagie.text.pdf.PdfContentByte",
      "com.lowagie.text.pdf.PdfTemplate",
      "org.jfree.data.time.Hour",
      "org.jfree.chart.axis.PeriodAxis",
      "org.jfree.data.time.Year",
      "org.jfree.data.time.Quarter",
      "org.jfree.data.time.Month",
      "org.jfree.data.time.Minute",
      "org.jfree.chart.axis.PeriodAxisLabelInfo",
      "org.jfree.chart.axis.ExtendedCategoryAxis",
      "org.jfree.chart.plot.CombinedDomainCategoryPlot",
      "org.jfree.chart.ChartPanel",
      "org.jfree.chart.ChartRenderingInfo",
      "org.jfree.chart.entity.StandardEntityCollection",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "com.lowagie.text.pdf.PdfGraphics2D",
      "org.jfree.chart.axis.CyclicNumberAxis",
      "org.jfree.chart.plot.XYPlot",
      "org.jfree.chart.plot.CombinedDomainXYPlot",
      "org.jfree.chart.plot.SeriesRenderingOrder",
      "org.jfree.chart.renderer.category.BarRenderer",
      "org.jfree.chart.renderer.category.IntervalBarRenderer",
      "org.jfree.chart.renderer.category.GanttRenderer",
      "org.jfree.chart.util.StandardGradientPaintTransformer",
      "org.jfree.chart.util.GradientPaintTransformType",
      "org.jfree.chart.event.RendererChangeEvent",
      "org.jfree.chart.renderer.category.CategoryStepRenderer",
      "com.lowagie.text.Image",
      "org.jfree.chart.axis.NumberAxis3D",
      "org.jfree.data.time.DateRange",
      "org.jfree.chart.axis.DateTickUnit",
      "org.jfree.chart.axis.DateAxis$DefaultTimeline",
      "org.jfree.chart.axis.DateAxis",
      "org.jfree.chart.labels.HighLowItemLabelGenerator",
      "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
      "org.jfree.chart.renderer.xy.CandlestickRenderer",
      "org.jfree.chart.labels.StandardXYSeriesLabelGenerator",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.data.xy.YIntervalSeriesCollection",
      "org.jfree.chart.axis.ModuloAxis",
      "org.jfree.chart.renderer.category.StackedAreaRenderer",
      "com.lowagie.text.DocumentException",
      "com.lowagie.text.BadElementException",
      "org.jfree.chart.util.ObjectUtilities",
      "org.jfree.chart.PolarChartPanel",
      "org.jfree.data.general.DefaultKeyedValues2DDataset",
      "org.jfree.chart.axis.DateTickMarkPosition",
      "org.jfree.chart.LegendItemCollection",
      "org.jfree.chart.renderer.xy.XYBubbleRenderer",
      "org.jfree.data.category.DefaultIntervalCategoryDataset",
      "org.jfree.data.resources.DataPackageResources",
      "com.lowagie.text.pdf.codec.PngImage",
      "org.jfree.chart.renderer.category.MinMaxCategoryRenderer",
      "org.jfree.chart.plot.CategoryMarker",
      "org.jfree.chart.event.MarkerChangeEvent",
      "org.jfree.chart.renderer.DefaultPolarItemRenderer",
      "org.jfree.chart.axis.SubCategoryAxis",
      "org.jfree.data.xy.DefaultTableXYDataset",
      "org.jfree.data.xy.IntervalXYDelegate",
      "org.jfree.chart.plot.PolarPlot",
      "org.jfree.chart.axis.Tick",
      "org.jfree.chart.axis.ValueTick",
      "org.jfree.chart.axis.NumberTick",
      "org.jfree.chart.axis.TickType",
      "org.jfree.chart.renderer.category.WaterfallBarRenderer",
      "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator",
      "org.jfree.chart.labels.StandardCategoryToolTipGenerator",
      "org.jfree.chart.plot.ThermometerPlot",
      "org.jfree.data.general.DefaultValueDataset",
      "org.jfree.chart.renderer.category.BarRenderer3D",
      "org.jfree.chart.renderer.category.StackedBarRenderer3D",
      "org.jfree.data.gantt.TaskSeriesCollection",
      "org.jfree.data.time.Week",
      "org.jfree.chart.renderer.category.LineRenderer3D",
      "org.jfree.data.time.FixedMillisecond",
      "org.jfree.data.time.DynamicTimeSeriesCollection",
      "org.jfree.data.time.Second",
      "com.lowagie.text.pdf.BaseFont",
      "org.jfree.chart.renderer.category.StackedBarRenderer",
      "org.jfree.chart.renderer.category.LevelRenderer",
      "org.jfree.chart.plot.RingPlot",
      "org.jfree.chart.plot.SpiderWebPlot",
      "org.jfree.chart.labels.StandardCategoryItemLabelGenerator",
      "org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator",
      "org.jfree.chart.axis.AxisSpace",
      "org.jfree.chart.annotations.CategoryLineAnnotation",
      "com.lowagie.text.pdf.PdfAppearance",
      "org.jfree.data.time.TimeSeriesCollection",
      "org.jfree.data.time.TimePeriodAnchor",
      "org.jfree.chart.plot.MeterPlot",
      "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer",
      "org.jfree.chart.plot.FastScatterPlot",
      "org.jfree.chart.labels.IntervalCategoryToolTipGenerator",
      "com.lowagie.text.Jpeg",
      "org.jfree.data.time.TimePeriodValuesCollection",
      "org.jfree.chart.plot.CompassPlot",
      "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer",
      "org.jfree.chart.renderer.xy.XYLine3DRenderer",
      "org.jfree.data.statistics.DefaultStatisticalCategoryDataset",
      "org.jfree.chart.renderer.category.StatisticalBarRenderer",
      "org.jfree.data.UnknownKeyException",
      "org.jfree.chart.renderer.category.DefaultCategoryItemRenderer",
      "org.jfree.chart.renderer.xy.DefaultXYItemRenderer",
      "org.jfree.chart.needle.MeterNeedle",
      "org.jfree.chart.needle.ArrowNeedle",
      "org.jfree.chart.needle.WindNeedle",
      "org.jfree.chart.labels.IntervalCategoryItemLabelGenerator",
      "org.jfree.chart.annotations.TextAnnotation",
      "org.jfree.chart.annotations.CategoryTextAnnotation",
      "org.jfree.data.xy.DefaultXYDataset",
      "org.jfree.chart.renderer.category.LayeredBarRenderer",
      "org.jfree.data.time.TimeTableXYDataset",
      "org.jfree.chart.urls.StandardCategoryURLGenerator",
      "org.jfree.chart.plot.PiePlot3D",
      "org.jfree.chart.axis.StandardTickUnitSource",
      "com.lowagie.text.pdf.Type1Font",
      "com.lowagie.text.ExceptionConverter",
      "org.jfree.chart.plot.WaferMapPlot",
      "org.jfree.chart.title.ImageTitle",
      "org.jfree.chart.renderer.GrayPaintScale",
      "com.lowagie.text.pdf.AsianFontMapper",
      "org.jfree.chart.util.ShapeUtilities",
      "org.jfree.chart.plot.DialShape",
      "org.jfree.chart.renderer.category.GroupedStackedBarRenderer",
      "org.jfree.data.KeyToGroupMap",
      "com.lowagie.text.Section",
      "com.lowagie.text.Chapter",
      "com.lowagie.text.Phrase",
      "com.lowagie.text.Paragraph",
      "com.lowagie.text.Font",
      "com.lowagie.text.Chunk",
      "org.jfree.chart.annotations.CategoryPointerAnnotation",
      "org.jfree.chart.entity.ChartEntity",
      "org.jfree.data.time.TimePeriodFormatException",
      "org.jfree.chart.renderer.WaferMapRenderer",
      "org.jfree.chart.renderer.xy.XYBarRenderer",
      "org.jfree.chart.renderer.xy.ClusteredXYBarRenderer",
      "org.jfree.chart.renderer.xy.XYErrorRenderer",
      "org.jfree.data.xy.XYBarDataset",
      "org.jfree.chart.text.TextBlock",
      "org.jfree.data.general.DefaultPieDataset",
      "org.jfree.data.jdbc.JDBCPieDataset",
      "org.jfree.data.DefaultKeyedValues",
      "org.jfree.chart.axis.SegmentedTimeline",
      "com.lowagie.text.pdf.PdfEncodings$WingdingsConversion",
      "com.lowagie.text.pdf.PdfEncodings$SymbolConversion",
      "com.lowagie.text.pdf.PdfEncodings$Cp437Conversion",
      "com.lowagie.text.pdf.PdfEncodings",
      "com.lowagie.text.Anchor",
      "org.jfree.chart.annotations.XYTextAnnotation",
      "org.jfree.chart.plot.IntervalMarker",
      "org.jfree.data.xy.DefaultWindDataset",
      "org.jfree.chart.labels.AbstractXYItemLabelGenerator",
      "org.jfree.chart.labels.StandardXYToolTipGenerator",
      "org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator",
      "org.jfree.chart.urls.StandardXYURLGenerator",
      "org.jfree.chart.renderer.xy.XYStepRenderer",
      "org.jfree.chart.util.PaintUtilities",
      "org.jfree.chart.renderer.LookupPaintScale",
      "org.jfree.chart.title.PaintScaleLegend",
      "org.jfree.data.general.WaferMapDataset",
      "org.jfree.data.general.CombinedDataset",
      "com.lowagie.text.pdf.PdfDestination",
      "org.jfree.data.jdbc.JDBCXYDataset",
      "com.lowagie.text.Row",
      "com.lowagie.text.pdf.ExtendedColor",
      "org.jfree.chart.event.ChartProgressEvent",
      "org.jfree.chart.block.LengthConstraintType",
      "org.jfree.chart.block.RectangleConstraint",
      "org.jfree.chart.text.TextUtilities",
      "org.jfree.chart.util.Size2D",
      "com.lowagie.text.ListItem",
      "org.jfree.chart.renderer.xy.XYBlockRenderer",
      "org.jfree.data.DefaultKeyedValue",
      "com.lowagie.text.pdf.PdfAnnotation",
      "com.lowagie.text.pdf.PdfFormField",
      "org.jfree.data.general.DefaultKeyedValuesDataset",
      "com.lowagie.text.pdf.PdfGState",
      "org.jfree.data.xy.XYIntervalSeriesCollection",
      "com.lowagie.text.pdf.PdfEncryption",
      "org.jfree.chart.text.TextLine",
      "org.jfree.chart.text.TextFragment",
      "org.jfree.chart.title.DateTitle",
      "org.jfree.chart.plot.CombinedRangeXYPlot",
      "com.lowagie.text.SimpleCell",
      "org.jfree.data.general.Series",
      "org.jfree.data.xy.XYSeries",
      "org.jfree.chart.labels.StandardXYZToolTipGenerator",
      "org.jfree.data.xy.OHLCDataItem",
      "org.jfree.data.ComparableObjectSeries",
      "org.jfree.data.xy.VectorSeries",
      "org.jfree.data.ComparableObjectItem",
      "com.lowagie.text.Table",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset",
      "org.jfree.data.xy.XIntervalSeriesCollection",
      "org.jfree.chart.axis.DateTick",
      "org.jfree.data.statistics.MeanAndStandardDeviation",
      "org.jfree.data.KeyedObjects",
      "org.jfree.data.KeyedObject",
      "org.jfree.data.xy.XYSeriesCollection",
      "org.jfree.data.xy.DefaultOHLCDataset",
      "org.jfree.chart.LegendItem",
      "com.lowagie.text.ImgCCITT",
      "org.jfree.data.category.CategoryToPieDataset",
      "org.jfree.chart.axis.MarkerAxisBand",
      "org.jfree.chart.renderer.xy.StackedXYBarRenderer",
      "org.jfree.chart.annotations.XYPointerAnnotation",
      "com.lowagie.text.pdf.PdfReader",
      "org.jfree.chart.renderer.xy.HighLowRenderer",
      "org.jfree.chart.block.CenterArrangement",
      "org.jfree.chart.block.BorderArrangement",
      "org.jfree.chart.labels.CustomXYToolTipGenerator",
      "com.lowagie.text.ChapterAutoNumber"
    );
  }
}
