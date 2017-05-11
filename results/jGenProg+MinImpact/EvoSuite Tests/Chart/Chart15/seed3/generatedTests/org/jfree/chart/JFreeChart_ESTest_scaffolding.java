/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Jan 17 20:56:53 GMT 2017
 */

package org.jfree.chart;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class JFreeChart_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jfree.chart.JFreeChart"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(JFreeChart_ESTest_scaffolding.class.getClassLoader() ,
      "org.jfree.chart.event.ChartProgressListener",
      "org.jfree.chart.labels.StandardPieSectionLabelGenerator",
      "org.jfree.chart.labels.AbstractPieItemLabelGenerator",
      "com.lowagie.text.pdf.TrueTypeFontUnicode",
      "org.jfree.chart.plot.ValueMarker",
      "org.jfree.chart.plot.WaferMapPlot",
      "com.lowagie.text.Jpeg2000",
      "com.lowagie.text.pdf.PdfOCG",
      "com.lowagie.text.Element",
      "org.jfree.data.general.ValueDataset",
      "org.jfree.chart.needle.WindNeedle",
      "com.lowagie.text.pdf.interfaces.PdfViewerPreferences",
      "com.lowagie.text.pdf.PdfEncodings$SymbolTTConversion",
      "org.jfree.chart.axis.MarkerAxisBand",
      "com.lowagie.text.pdf.PdfPCellEvent",
      "org.jfree.data.general.AbstractSeriesDataset",
      "com.lowagie.text.xml.xmp.XmpWriter",
      "org.jfree.chart.LegendItemCollection",
      "com.lowagie.text.pdf.PdfPatternPainter",
      "org.jfree.chart.axis.CategoryAxis",
      "org.jfree.chart.renderer.xy.XYItemRenderer",
      "com.lowagie.text.pdf.ExtraEncoding",
      "org.jfree.data.RangeInfo",
      "org.jfree.chart.ui.ProjectInfo",
      "org.jfree.chart.renderer.RendererState",
      "com.lowagie.text.xml.xmp.PdfA1Schema",
      "org.jfree.chart.text.TextFragment",
      "org.jfree.chart.entity.StandardEntityCollection",
      "com.lowagie.text.pdf.CJKFont",
      "org.jfree.chart.axis.LogarithmicAxis",
      "org.jfree.chart.plot.CompassPlot",
      "com.lowagie.text.pdf.PdfBoolean",
      "com.lowagie.text.TextElementArray",
      "org.jfree.chart.labels.StandardXYSeriesLabelGenerator",
      "org.jfree.chart.labels.ItemLabelPosition",
      "org.jfree.chart.plot.CategoryPlot",
      "org.jfree.chart.event.MarkerChangeListener",
      "org.jfree.chart.event.PlotChangeEvent",
      "com.lowagie.text.pdf.interfaces.PdfPageActions",
      "org.jfree.chart.plot.PiePlot",
      "org.jfree.chart.plot.PiePlot3D",
      "org.jfree.chart.util.PaintList",
      "org.jfree.chart.labels.ItemLabelAnchor",
      "com.lowagie.text.pdf.PageResources",
      "com.lowagie.text.HeaderFooter",
      "org.jfree.chart.ui.Contributor",
      "org.jfree.chart.event.RendererChangeEvent",
      "org.jfree.chart.needle.LongNeedle",
      "org.jfree.chart.text.G2TextMeasurer",
      "com.lowagie.text.pdf.PdfStructureElement",
      "org.jfree.chart.util.RectangleAnchor",
      "com.lowagie.text.pdf.PdfException",
      "com.lowagie.text.pdf.PdfIndirectReference",
      "org.jfree.chart.labels.PieSectionLabelGenerator",
      "org.jfree.chart.axis.Tick",
      "com.lowagie.text.pdf.DocumentFont",
      "org.jfree.chart.text.TextBlock",
      "org.jfree.chart.axis.Axis",
      "org.jfree.chart.urls.PieURLGenerator",
      "com.lowagie.text.pdf.PdfPattern",
      "org.jfree.data.DefaultKeyedValues",
      "com.lowagie.text.pdf.PdfRectangle",
      "com.lowagie.text.pdf.PdfArray",
      "org.jfree.chart.util.ShapeList",
      "org.jfree.chart.block.BlockBorder",
      "org.jfree.chart.util.UnitType",
      "com.lowagie.text.pdf.collection.PdfCollection",
      "com.lowagie.text.pdf.PdfPageEvent",
      "org.jfree.chart.urls.XYURLGenerator",
      "org.jfree.chart.annotations.XYAnnotation",
      "org.jfree.chart.util.ObjectUtilities",
      "org.jfree.chart.needle.MeterNeedle",
      "com.lowagie.text.pdf.OutputStreamCounter",
      "org.jfree.chart.util.HorizontalAlignment",
      "com.lowagie.text.DocWriter",
      "com.lowagie.text.pdf.PdfOutline",
      "org.jfree.chart.needle.PlumNeedle",
      "org.jfree.chart.axis.CategoryAnchor",
      "org.jfree.chart.plot.DatasetRenderingOrder",
      "org.jfree.chart.event.RendererChangeListener",
      "org.jfree.data.KeyedValues",
      "org.jfree.chart.plot.CombinedRangeCategoryPlot",
      "org.jfree.chart.block.FlowArrangement",
      "org.jfree.chart.labels.CategoryToolTipGenerator",
      "org.jfree.chart.title.CompositeTitle",
      "org.jfree.data.general.DefaultKeyedValues2DDataset",
      "com.lowagie.text.pdf.PdfSpotColor",
      "org.jfree.chart.entity.XYItemEntity",
      "org.jfree.chart.event.TitleChangeListener",
      "com.lowagie.text.ListItem",
      "org.jfree.chart.plot.DialShape",
      "org.jfree.chart.axis.CategoryLabelPositions",
      "org.jfree.chart.text.TextMeasurer",
      "org.jfree.chart.LegendItemSource",
      "com.lowagie.text.pdf.PdfAction",
      "org.jfree.chart.renderer.PolarItemRenderer",
      "org.jfree.chart.util.SortOrder",
      "org.jfree.data.general.DatasetChangeListener",
      "org.jfree.data.statistics.MultiValueCategoryDataset",
      "org.jfree.chart.block.BlockParams",
      "org.jfree.data.gantt.TaskSeries",
      "org.jfree.chart.event.TitleChangeEvent",
      "org.jfree.chart.annotations.CategoryAnnotation",
      "org.jfree.chart.ui.ExtensionFileFilter",
      "org.jfree.chart.axis.AxisSpace",
      "org.jfree.chart.plot.PolarPlot",
      "org.jfree.chart.needle.PointerNeedle",
      "org.jfree.chart.ui.Licences",
      "org.jfree.chart.plot.MeterInterval",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.chart.axis.CyclicNumberAxis$CycleBoundTick",
      "com.lowagie.text.pdf.Type3Font",
      "org.jfree.chart.event.ChartChangeEventType",
      "org.jfree.chart.util.Rotation",
      "com.lowagie.text.pdf.PdfNull",
      "org.jfree.chart.block.BlockResult",
      "com.lowagie.text.pdf.PdfOCProperties",
      "com.lowagie.text.xml.xmp.PdfSchema",
      "org.jfree.chart.axis.ExtendedCategoryAxis",
      "com.lowagie.text.pdf.PdfDocument",
      "com.lowagie.text.pdf.ByteBuffer",
      "org.jfree.chart.renderer.category.CategoryItemRenderer",
      "com.lowagie.text.pdf.PdfBorderDictionary",
      "org.jfree.chart.util.Size2D",
      "com.lowagie.text.pdf.PdfAnnotation",
      "org.jfree.chart.util.ShapeUtilities",
      "com.lowagie.text.pdf.PdfSignature",
      "org.jfree.data.general.SeriesChangeEvent",
      "com.lowagie.text.pdf.PdfMediaClipData",
      "org.jfree.chart.ChartPanel",
      "org.jfree.chart.labels.CategoryItemLabelGenerator",
      "org.jfree.chart.plot.FastScatterPlot",
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
      "org.jfree.data.general.WaferMapDataset",
      "org.jfree.chart.block.EntityBlockParams",
      "org.jfree.data.general.Dataset",
      "org.jfree.chart.plot.SeriesRenderingOrder",
      "org.jfree.chart.block.EntityBlockResult",
      "org.jfree.chart.plot.PlotOrientation",
      "com.lowagie.text.pdf.PdfXConformanceException",
      "org.jfree.chart.axis.NumberAxis",
      "com.lowagie.text.DocListener",
      "org.jfree.chart.axis.NumberTick",
      "com.lowagie.text.Chunk",
      "com.lowagie.text.ImgCCITT",
      "com.lowagie.text.pdf.collection.PdfCollectionSchema",
      "org.jfree.chart.axis.ValueTick",
      "com.lowagie.text.Phrase",
      "org.jfree.chart.block.BlockContainer",
      "org.jfree.chart.JFreeChart",
      "com.lowagie.text.pdf.FontMapper",
      "com.lowagie.text.pdf.PdfFormField",
      "org.jfree.chart.plot.Marker",
      "com.lowagie.text.pdf.PdfDestination",
      "org.jfree.chart.ChartMouseListener",
      "org.jfree.chart.title.LegendTitle",
      "com.lowagie.text.pdf.PdfTable",
      "com.lowagie.text.pdf.PdfNumber",
      "com.lowagie.text.Paragraph",
      "org.jfree.chart.ChartRenderingInfo",
      "org.jfree.chart.axis.ValueAxis",
      "org.jfree.chart.needle.ShipNeedle",
      "org.jfree.data.Value",
      "org.jfree.chart.JFreeChartInfo",
      "org.jfree.chart.plot.MultiplePiePlot",
      "org.jfree.chart.event.MarkerChangeEvent",
      "com.lowagie.text.pdf.internal.PdfXConformanceImp",
      "org.jfree.chart.block.BlockFrame",
      "org.jfree.chart.event.AxisChangeListener",
      "org.jfree.data.general.DefaultValueDataset",
      "com.lowagie.text.pdf.BadPdfFormatException",
      "com.lowagie.text.Cell",
      "com.lowagie.text.pdf.ExtendedColor",
      "com.lowagie.text.pdf.PdfDocument$PdfInfo",
      "com.lowagie.text.pdf.BaseFont",
      "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
      "com.lowagie.text.pdf.PdfAcroForm",
      "org.jfree.chart.labels.XYSeriesLabelGenerator",
      "org.jfree.chart.plot.CrosshairState",
      "org.jfree.chart.ui.Library",
      "org.jfree.chart.axis.AxisState",
      "org.jfree.chart.renderer.AbstractRenderer",
      "org.jfree.chart.block.ColumnArrangement",
      "org.jfree.chart.plot.RingPlot",
      "com.lowagie.text.pdf.PdfTransparencyGroup",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.chart.renderer.DefaultPolarItemRenderer",
      "org.jfree.chart.block.RectangleConstraint",
      "org.jfree.chart.title.Title",
      "org.jfree.chart.plot.Zoomable",
      "com.lowagie.text.pdf.PdfBorderArray",
      "com.lowagie.text.pdf.PdfEncodings$SymbolConversion",
      "org.jfree.chart.labels.PieToolTipGenerator",
      "org.jfree.chart.block.LineBorder",
      "com.lowagie.text.pdf.PdfGraphics2D",
      "com.lowagie.text.pdf.PdfFormXObject",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.chart.util.ObjectList",
      "com.lowagie.text.pdf.PRStream",
      "com.lowagie.text.pdf.PdfShading",
      "com.lowagie.text.Image",
      "com.lowagie.text.pdf.PdfContentByte",
      "org.jfree.chart.plot.PiePlotState",
      "org.jfree.chart.plot.CombinedDomainXYPlot",
      "com.lowagie.text.pdf.PdfEncodings$Cp437Conversion",
      "org.jfree.chart.needle.ArrowNeedle",
      "org.jfree.chart.labels.StandardCategoryItemLabelGenerator",
      "org.jfree.data.general.SeriesDataset",
      "org.jfree.chart.ui.BasicProjectInfo",
      "com.lowagie.text.pdf.Type3Glyph",
      "com.lowagie.text.pdf.PdfReader",
      "com.lowagie.text.ImgTemplate",
      "org.jfree.data.xy.XYDataset",
      "org.jfree.chart.block.Arrangement",
      "org.jfree.chart.plot.Plot",
      "com.lowagie.text.pdf.IntHashtable$Entry",
      "com.lowagie.text.pdf.PdfDocument$PdfCatalog",
      "com.lowagie.text.pdf.PdfICCBased",
      "org.jfree.chart.plot.ValueAxisPlot",
      "org.jfree.data.UnknownKeyException",
      "org.jfree.chart.labels.XYToolTipGenerator",
      "org.jfree.chart.event.AxisChangeEvent",
      "org.jfree.chart.LegendItem",
      "org.jfree.chart.renderer.WaferMapRenderer",
      "org.jfree.chart.urls.CategoryURLGenerator",
      "org.jfree.chart.plot.MeterPlot",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.chart.renderer.xy.CandlestickRenderer",
      "org.jfree.chart.util.LengthAdjustmentType",
      "org.jfree.chart.block.Block",
      "com.lowagie.text.pdf.PdfDate",
      "com.lowagie.text.pdf.interfaces.PdfEncryptionSettings",
      "com.lowagie.text.ExceptionConverter",
      "org.jfree.chart.entity.TickLabelEntity",
      "com.lowagie.text.pdf.PdfEncodings$WingdingsConversion",
      "com.lowagie.text.xml.xmp.XmpBasicSchema",
      "org.jfree.chart.plot.CombinedRangeXYPlot",
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
      "org.jfree.chart.axis.AxisLocation",
      "org.jfree.chart.util.AbstractObjectList",
      "com.lowagie.text.pdf.PdfStream",
      "org.jfree.data.xy.IntervalXYDataset",
      "org.jfree.chart.needle.LineNeedle",
      "org.jfree.data.general.DefaultPieDataset",
      "org.jfree.chart.event.ChartProgressEvent",
      "org.jfree.chart.entity.CategoryLabelEntity",
      "org.jfree.data.general.KeyedValues2DDataset",
      "org.jfree.chart.util.RectangleEdge",
      "com.lowagie.text.pdf.PdfTemplate",
      "org.jfree.chart.plot.DefaultDrawingSupplier",
      "org.jfree.chart.block.LengthConstraintType",
      "org.jfree.chart.plot.PieLabelDistributor",
      "com.lowagie.text.pdf.PdfGraphics2D$fakeComponent",
      "com.lowagie.text.pdf.PdfObject",
      "com.lowagie.text.ElementListener",
      "com.lowagie.text.pdf.PdfEncodings",
      "org.jfree.data.category.CategoryDataset",
      "org.jfree.data.Range",
      "org.jfree.data.statistics.DefaultMultiValueCategoryDataset",
      "org.jfree.chart.util.RectangleInsets",
      "org.jfree.chart.plot.CombinedDomainCategoryPlot",
      "org.jfree.data.statistics.DefaultStatisticalCategoryDataset",
      "org.jfree.chart.text.TextAnchor",
      "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator",
      "org.jfree.data.category.IntervalCategoryDataset",
      "org.jfree.chart.plot.PlotState",
      "org.jfree.chart.axis.TickUnit",
      "com.lowagie.text.pdf.PdfShadingPattern",
      "org.jfree.chart.ChartColor",
      "org.jfree.chart.Drawable",
      "org.jfree.chart.util.GradientPaintTransformer",
      "com.lowagie.text.pdf.collection.PdfCollectionSort",
      "org.jfree.chart.axis.CategoryLabelPosition",
      "org.jfree.data.gantt.TaskSeriesCollection",
      "com.lowagie.text.pdf.PdfImage",
      "org.jfree.chart.util.StrokeList",
      "com.lowagie.text.pdf.interfaces.PdfVersion",
      "org.jfree.chart.text.TextLine",
      "com.lowagie.text.pdf.interfaces.PdfAnnotations",
      "org.jfree.chart.PaintMap",
      "com.lowagie.text.pdf.interfaces.PdfRunDirection",
      "org.jfree.chart.text.TextUtilities",
      "com.lowagie.text.pdf.PdfContentByte$GraphicState",
      "com.lowagie.text.pdf.PdfPage",
      "org.jfree.chart.axis.TickUnitSource",
      "org.jfree.chart.plot.CategoryMarker",
      "org.jfree.chart.block.AbstractBlock",
      "org.jfree.chart.plot.XYPlot",
      "org.jfree.chart.needle.PinNeedle",
      "org.jfree.chart.util.TableOrder",
      "com.lowagie.text.pdf.PdfName",
      "org.jfree.chart.entity.ChartEntity",
      "com.lowagie.text.pdf.PdfGState",
      "org.jfree.chart.entity.EntityCollection",
      "com.lowagie.text.pdf.RandomAccessFileOrArray",
      "com.lowagie.text.Rectangle",
      "org.jfree.data.gantt.GanttCategoryDataset",
      "org.jfree.data.Values2D",
      "com.lowagie.text.ImgWMF",
      "com.lowagie.text.pdf.PdfAppearance",
      "org.jfree.data.general.DatasetChangeEvent",
      "com.lowagie.text.pdf.PdfTextArray",
      "com.lowagie.text.pdf.interfaces.PdfDocumentActions",
      "org.jfree.data.general.SeriesChangeListener",
      "org.jfree.data.category.DefaultCategoryDataset",
      "org.jfree.chart.axis.TickType",
      "org.jfree.chart.plot.SpiderWebPlot",
      "com.lowagie.text.pdf.PdfColor",
      "org.jfree.data.general.KeyedValuesDataset",
      "org.jfree.chart.renderer.xy.XYItemRendererState",
      "org.jfree.chart.entity.PieSectionEntity",
      "com.lowagie.text.Jpeg",
      "org.jfree.chart.plot.ThermometerPlot",
      "org.jfree.data.general.DefaultKeyedValuesDataset",
      "org.jfree.chart.util.Layer",
      "com.lowagie.text.ImgRaw",
      "org.jfree.chart.event.PlotChangeListener",
      "com.lowagie.text.pdf.IntHashtable",
      "com.lowagie.text.pdf.PdfPTableEvent",
      "org.jfree.data.general.Series",
      "com.lowagie.text.pdf.Type1Font",
      "com.lowagie.text.pdf.PdfString",
      "com.lowagie.text.BadElementException",
      "com.lowagie.text.pdf.collection.PdfTargetDictionary",
      "org.jfree.chart.axis.NumberTickUnit",
      "com.lowagie.text.pdf.PdfContents",
      "com.lowagie.text.pdf.TrueTypeFont",
      "org.jfree.chart.plot.DrawingSupplier",
      "org.jfree.chart.title.TextTitle",
      "com.lowagie.text.pdf.PRIndirectReference",
      "org.jfree.data.statistics.StatisticalCategoryDataset",
      "com.lowagie.text.pdf.interfaces.PdfXConformance",
      "org.jfree.chart.labels.HighLowItemLabelGenerator",
      "org.jfree.chart.util.PublicCloneable",
      "com.lowagie.text.pdf.BaseFont$StreamFont",
      "com.lowagie.text.DocumentException",
      "com.lowagie.text.Font",
      "org.jfree.chart.event.ChartChangeEvent",
      "com.lowagie.text.Document",
      "org.jfree.chart.StrokeMap",
      "org.jfree.data.Values",
      "org.jfree.data.KeyedValues2D",
      "com.lowagie.text.pdf.PdfPSXObject",
      "com.lowagie.text.pdf.PdfResources",
      "org.jfree.chart.axis.CyclicNumberAxis",
      "org.jfree.data.KeyedObjects2D",
      "com.lowagie.text.xml.xmp.DublinCoreSchema",
      "org.jfree.chart.text.TextBlockAnchor",
      "org.jfree.chart.needle.MiddlePinNeedle",
      "org.jfree.chart.event.ChartChangeListener",
      "com.lowagie.text.pdf.OutputStreamEncryption",
      "org.jfree.chart.util.PaintUtilities",
      "org.jfree.chart.axis.CategoryLabelWidthType"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(JFreeChart_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jfree.chart.resources.JFreeChartResources",
      "org.jfree.chart.ui.Licences",
      "org.jfree.chart.JFreeChart",
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.util.RectangleInsets",
      "org.jfree.chart.util.RectangleEdge",
      "org.jfree.chart.util.HorizontalAlignment",
      "org.jfree.chart.util.VerticalAlignment",
      "org.jfree.chart.block.LengthConstraintType",
      "org.jfree.chart.util.SerialUtilities",
      "org.jfree.chart.plot.Plot",
      "org.jfree.chart.plot.XYPlot",
      "org.jfree.chart.ChartColor",
      "org.jfree.chart.plot.DefaultDrawingSupplier",
      "org.jfree.chart.plot.DatasetRenderingOrder",
      "org.jfree.chart.plot.SeriesRenderingOrder",
      "org.jfree.chart.plot.PlotOrientation",
      "org.jfree.chart.util.AbstractObjectList",
      "org.jfree.chart.util.ObjectList",
      "org.jfree.data.general.DatasetChangeEvent",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.chart.event.PlotChangeEvent",
      "org.jfree.chart.event.ChartChangeEventType",
      "org.jfree.chart.axis.AxisLocation",
      "org.jfree.chart.block.AbstractBlock",
      "org.jfree.chart.title.Title",
      "org.jfree.chart.title.LegendTitle",
      "org.jfree.chart.block.FlowArrangement",
      "org.jfree.chart.block.ColumnArrangement",
      "org.jfree.chart.block.BlockBorder",
      "org.jfree.chart.block.BlockContainer",
      "org.jfree.chart.util.RectangleAnchor",
      "org.jfree.chart.block.LineBorder",
      "org.jfree.chart.event.TitleChangeEvent",
      "org.jfree.chart.renderer.AbstractRenderer",
      "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
      "org.jfree.chart.renderer.xy.XYAreaRenderer2",
      "org.jfree.chart.util.BooleanList",
      "org.jfree.chart.util.PaintList",
      "org.jfree.chart.util.StrokeList",
      "org.jfree.chart.util.ShapeList",
      "org.jfree.chart.labels.ItemLabelPosition",
      "org.jfree.chart.labels.ItemLabelAnchor",
      "org.jfree.chart.text.TextAnchor",
      "org.jfree.chart.labels.StandardXYSeriesLabelGenerator",
      "org.jfree.chart.event.RendererChangeEvent",
      "org.jfree.chart.labels.MultipleXYSeriesLabelGenerator",
      "com.lowagie.text.pdf.PdfObject",
      "com.lowagie.text.pdf.ByteBuffer",
      "com.lowagie.text.pdf.PdfName",
      "com.lowagie.text.pdf.BaseFont",
      "org.jfree.chart.plot.PiePlot",
      "org.jfree.chart.util.Rotation",
      "org.jfree.chart.PaintMap",
      "org.jfree.chart.StrokeMap",
      "org.jfree.chart.labels.AbstractPieItemLabelGenerator",
      "org.jfree.chart.labels.StandardPieSectionLabelGenerator",
      "org.jfree.chart.plot.AbstractPieLabelDistributor",
      "org.jfree.chart.plot.PieLabelDistributor",
      "org.jfree.chart.annotations.TextAnnotation",
      "org.jfree.chart.axis.Axis",
      "org.jfree.data.Range",
      "org.jfree.chart.axis.ValueAxis",
      "org.jfree.chart.axis.TickUnit",
      "org.jfree.chart.axis.NumberTickUnit",
      "org.jfree.chart.axis.NumberAxis",
      "org.jfree.chart.axis.TickUnits",
      "org.jfree.data.RangeType",
      "org.jfree.chart.plot.CombinedDomainXYPlot",
      "org.jfree.chart.ChartRenderingInfo",
      "org.jfree.chart.entity.StandardEntityCollection",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.chart.plot.MultiplePiePlot",
      "org.jfree.chart.util.ObjectUtilities",
      "org.jfree.chart.util.TableOrder",
      "org.jfree.chart.title.TextTitle",
      "org.jfree.chart.event.ChartProgressEvent",
      "org.jfree.chart.block.RectangleConstraint",
      "org.jfree.chart.util.Size2D",
      "org.jfree.chart.LegendItemCollection",
      "org.jfree.chart.plot.MeterPlot",
      "org.jfree.chart.plot.DialShape",
      "org.jfree.chart.plot.CombinedRangeXYPlot",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.time.Minute",
      "org.jfree.data.time.Hour",
      "org.jfree.data.time.Day",
      "org.jfree.data.time.SerialDate",
      "org.jfree.data.time.SpreadsheetDate",
      "org.jfree.chart.plot.ThermometerPlot",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.general.DefaultValueDataset",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.chart.event.AxisChangeEvent",
      "org.jfree.chart.title.DateTitle",
      "org.jfree.chart.plot.CategoryPlot",
      "org.jfree.chart.plot.CombinedRangeCategoryPlot",
      "org.jfree.chart.util.SortOrder",
      "org.jfree.chart.axis.CategoryAnchor",
      "org.jfree.chart.plot.Marker",
      "org.jfree.chart.plot.ValueMarker",
      "org.jfree.chart.util.LengthAdjustmentType",
      "org.jfree.chart.util.Layer",
      "org.jfree.chart.ChartPanel",
      "org.jfree.data.category.DefaultCategoryDataset",
      "org.jfree.data.general.DefaultKeyedValues2DDataset",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.chart.plot.SpiderWebPlot",
      "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator",
      "org.jfree.chart.labels.StandardCategoryItemLabelGenerator",
      "org.jfree.chart.axis.CategoryAxis",
      "org.jfree.chart.axis.ExtendedCategoryAxis",
      "org.jfree.chart.axis.CategoryLabelPosition",
      "org.jfree.chart.text.TextBlockAnchor",
      "org.jfree.chart.axis.CategoryLabelWidthType",
      "org.jfree.chart.axis.CategoryLabelPositions",
      "org.jfree.chart.plot.FastScatterPlot",
      "org.jfree.chart.plot.WaferMapPlot",
      "org.jfree.data.UnknownKeyException",
      "org.jfree.chart.PolarChartPanel",
      "org.jfree.data.jdbc.JDBCCategoryDataset",
      "org.jfree.data.general.DefaultPieDataset",
      "org.jfree.data.jdbc.JDBCPieDataset",
      "org.jfree.data.DefaultKeyedValues",
      "org.jfree.chart.plot.PiePlot3D",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.category.DefaultIntervalCategoryDataset",
      "org.jfree.data.resources.DataPackageResources",
      "org.jfree.chart.axis.CyclicNumberAxis",
      "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer",
      "org.jfree.chart.renderer.category.BarRenderer",
      "org.jfree.chart.renderer.category.IntervalBarRenderer",
      "org.jfree.chart.renderer.category.GanttRenderer",
      "org.jfree.chart.labels.StandardCategorySeriesLabelGenerator",
      "org.jfree.chart.util.StandardGradientPaintTransformer",
      "org.jfree.chart.util.GradientPaintTransformType",
      "com.lowagie.text.Document",
      "com.lowagie.text.Rectangle",
      "com.lowagie.text.PageSize",
      "com.lowagie.text.DocWriter",
      "com.lowagie.text.pdf.PdfWriter",
      "com.lowagie.text.pdf.PdfDocument",
      "com.lowagie.text.pdf.PdfDictionary",
      "com.lowagie.text.pdf.PdfDate",
      "com.lowagie.text.pdf.internal.PdfViewerPreferencesImp",
      "com.lowagie.text.pdf.internal.PdfVersionImp",
      "com.lowagie.text.pdf.internal.PdfXConformanceImp",
      "com.lowagie.text.pdf.PdfContentByte",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset",
      "org.jfree.data.KeyedObjects2D",
      "org.jfree.chart.renderer.WaferMapRenderer",
      "org.jfree.chart.annotations.CategoryTextAnnotation",
      "org.jfree.chart.annotations.CategoryPointerAnnotation",
      "org.jfree.data.general.Series",
      "org.jfree.data.xy.XYSeries",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.data.xy.XYSeriesCollection",
      "org.jfree.data.xy.IntervalXYDelegate",
      "org.jfree.data.general.SubSeriesDataset",
      "org.jfree.chart.renderer.GrayPaintScale",
      "org.jfree.chart.renderer.xy.XYBlockRenderer",
      "org.jfree.chart.renderer.LookupPaintScale",
      "org.jfree.data.time.DynamicTimeSeriesCollection",
      "com.lowagie.text.pdf.PdfGraphics2D",
      "com.lowagie.text.pdf.Type1Font",
      "com.lowagie.text.ExceptionConverter",
      "org.jfree.chart.plot.CombinedDomainCategoryPlot",
      "org.jfree.data.general.WaferMapDataset",
      "org.jfree.chart.axis.AxisSpace",
      "org.jfree.chart.axis.Tick",
      "org.jfree.chart.axis.ValueTick",
      "org.jfree.chart.axis.NumberTick",
      "org.jfree.chart.axis.TickType",
      "org.jfree.chart.text.TextUtilities",
      "com.lowagie.text.pdf.AsianFontMapper",
      "org.jfree.chart.axis.NumberAxis3D",
      "org.jfree.chart.renderer.category.AreaRenderer",
      "org.jfree.chart.renderer.category.StackedAreaRenderer",
      "org.jfree.chart.renderer.AreaRendererEndType",
      "org.jfree.chart.plot.CompassPlot",
      "org.jfree.chart.needle.MeterNeedle",
      "org.jfree.chart.needle.ArrowNeedle",
      "org.jfree.data.general.DefaultKeyedValuesDataset",
      "org.jfree.chart.plot.RingPlot",
      "org.jfree.chart.plot.PolarPlot",
      "org.jfree.chart.plot.CategoryMarker",
      "org.jfree.chart.event.MarkerChangeEvent",
      "org.jfree.chart.needle.WindNeedle",
      "org.jfree.data.gantt.TaskSeriesCollection",
      "org.jfree.chart.title.PaintScaleLegend",
      "org.jfree.chart.renderer.xy.CandlestickRenderer",
      "org.jfree.chart.labels.HighLowItemLabelGenerator",
      "org.jfree.chart.axis.SymbolAxis",
      "org.jfree.chart.annotations.XYTextAnnotation",
      "org.jfree.chart.labels.CustomXYToolTipGenerator",
      "com.lowagie.text.pdf.CJKFont",
      "com.lowagie.text.DocumentException",
      "com.lowagie.text.pdf.PdfAnnotation",
      "com.lowagie.text.pdf.PdfFormField",
      "org.jfree.chart.axis.PeriodAxis",
      "org.jfree.data.time.Year",
      "org.jfree.data.time.Quarter",
      "org.jfree.data.time.Month",
      "org.jfree.chart.axis.PeriodAxisLabelInfo",
      "org.jfree.data.time.DateRange",
      "org.jfree.chart.axis.DateTickUnit",
      "org.jfree.chart.axis.DateAxis$DefaultTimeline",
      "org.jfree.chart.axis.DateAxis",
      "org.jfree.chart.axis.DateTickMarkPosition",
      "org.jfree.chart.util.ShapeUtilities",
      "org.jfree.data.statistics.DefaultStatisticalCategoryDataset",
      "com.lowagie.text.pdf.PdfTemplate",
      "org.jfree.data.xy.CategoryTableXYDataset",
      "org.jfree.data.statistics.DefaultMultiValueCategoryDataset",
      "org.jfree.chart.axis.LogAxis",
      "com.lowagie.text.Phrase",
      "com.lowagie.text.Paragraph",
      "com.lowagie.text.ListItem",
      "com.lowagie.text.Font",
      "com.lowagie.text.Chunk",
      "org.jfree.chart.renderer.DefaultPolarItemRenderer",
      "org.jfree.data.general.DefaultKeyedValueDataset",
      "org.jfree.data.DefaultKeyedValue",
      "com.lowagie.text.Section",
      "com.lowagie.text.Chapter",
      "org.jfree.data.jdbc.JDBCXYDataset",
      "org.jfree.chart.axis.LogarithmicAxis",
      "org.jfree.chart.renderer.xy.XYAreaRenderer",
      "org.jfree.chart.renderer.xy.StackedXYAreaRenderer",
      "org.jfree.chart.axis.SegmentedTimeline",
      "org.jfree.data.time.TimeTableXYDataset",
      "org.jfree.data.time.TimePeriodAnchor",
      "org.jfree.data.time.Second",
      "com.lowagie.text.Anchor",
      "com.lowagie.text.Image",
      "com.lowagie.text.Jpeg",
      "org.jfree.chart.labels.AbstractXYItemLabelGenerator",
      "org.jfree.chart.labels.StandardXYToolTipGenerator",
      "org.jfree.data.xy.DefaultHighLowDataset",
      "org.jfree.chart.axis.SubCategoryAxis",
      "org.jfree.chart.title.ImageTitle",
      "org.jfree.chart.axis.CategoryAxis3D",
      "org.jfree.data.category.CategoryToPieDataset",
      "org.jfree.chart.text.TextBlock",
      "org.jfree.chart.text.TextLine",
      "org.jfree.chart.text.TextFragment",
      "org.jfree.chart.block.GridArrangement",
      "org.jfree.data.statistics.SimpleHistogramDataset",
      "com.lowagie.text.pdf.PdfPageLabels",
      "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer",
      "org.jfree.chart.renderer.xy.XYLine3DRenderer",
      "org.jfree.chart.renderer.category.LineAndShapeRenderer",
      "org.jfree.chart.renderer.category.LineRenderer3D",
      "org.jfree.chart.renderer.category.BarRenderer3D",
      "org.jfree.chart.entity.ChartEntity",
      "org.jfree.chart.title.CompositeTitle",
      "org.jfree.chart.renderer.category.DefaultCategoryItemRenderer",
      "org.jfree.data.general.SeriesChangeEvent",
      "org.jfree.chart.renderer.category.CategoryStepRenderer",
      "org.jfree.data.xy.XYIntervalSeriesCollection",
      "org.jfree.data.general.CombinedDataset",
      "org.jfree.data.xy.AbstractXYZDataset",
      "org.jfree.data.xy.DefaultXYZDataset",
      "org.jfree.data.statistics.HistogramDataset",
      "org.jfree.data.statistics.HistogramType",
      "org.jfree.data.time.TimeSeriesCollection",
      "com.lowagie.text.pdf.PdfGState",
      "org.jfree.chart.renderer.category.LevelRenderer",
      "org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer",
      "com.lowagie.text.pdf.PdfAction",
      "com.lowagie.text.pdf.PdfEncodings$WingdingsConversion",
      "com.lowagie.text.pdf.PdfEncodings$SymbolConversion",
      "com.lowagie.text.pdf.PdfEncodings$Cp437Conversion",
      "com.lowagie.text.pdf.PdfEncodings",
      "org.jfree.data.time.Millisecond",
      "com.lowagie.text.Jpeg2000",
      "com.lowagie.text.Row",
      "org.jfree.chart.block.BorderArrangement",
      "com.lowagie.text.SimpleCell",
      "org.jfree.chart.labels.StandardPieToolTipGenerator",
      "com.lowagie.text.List",
      "com.lowagie.text.FontFactoryImp",
      "com.lowagie.text.FontFactory",
      "org.jfree.data.time.SimpleTimePeriod",
      "org.jfree.data.KeyedObjects",
      "org.jfree.data.KeyedObject",
      "org.jfree.chart.renderer.xy.XYBarRenderer",
      "org.jfree.chart.renderer.xy.StackedXYBarRenderer",
      "org.jfree.chart.urls.TimeSeriesURLGenerator",
      "org.jfree.chart.renderer.xy.WindItemRenderer",
      "org.jfree.chart.block.CenterArrangement",
      "org.jfree.data.xy.DefaultWindDataset",
      "org.jfree.chart.renderer.category.WaterfallBarRenderer",
      "org.jfree.data.time.Week",
      "org.jfree.data.time.TimePeriodFormatException",
      "org.jfree.chart.plot.MeterInterval",
      "org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator",
      "org.jfree.chart.axis.ModuloAxis",
      "com.lowagie.text.pdf.ColumnText",
      "org.jfree.chart.renderer.xy.StackedXYAreaRenderer2",
      "org.jfree.data.xy.XIntervalSeriesCollection",
      "org.jfree.chart.renderer.xy.StandardXYItemRenderer",
      "org.jfree.chart.renderer.xy.CyclicXYItemRenderer",
      "com.lowagie.text.ChapterAutoNumber",
      "org.jfree.chart.annotations.XYPointerAnnotation",
      "org.jfree.chart.util.PaintUtilities",
      "com.lowagie.text.BadElementException",
      "org.jfree.data.xy.MatrixSeries",
      "org.jfree.chart.text.TextBox",
      "org.jfree.data.xy.YIntervalSeriesCollection",
      "com.lowagie.text.pdf.ExtendedColor",
      "com.lowagie.text.ImgCCITT",
      "org.jfree.chart.axis.StandardTickUnitSource",
      "org.jfree.data.time.FixedMillisecond",
      "org.jfree.data.xy.MatrixSeriesCollection",
      "org.jfree.data.xy.DefaultTableXYDataset",
      "org.jfree.chart.renderer.xy.HighLowRenderer",
      "org.jfree.chart.renderer.category.LayeredBarRenderer",
      "org.jfree.data.KeyedValueComparatorType",
      "org.jfree.chart.plot.IntervalMarker",
      "org.jfree.chart.labels.StandardXYZToolTipGenerator"
    );
  }
}
