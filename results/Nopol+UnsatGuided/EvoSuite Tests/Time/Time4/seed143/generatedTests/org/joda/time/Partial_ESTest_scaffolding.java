/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Jan 16 13:51:58 GMT 2017
 */

package org.joda.time;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Partial_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.joda.time.Partial"; 
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
    java.lang.System.setProperty("user.timezone", "Europe/Paris"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Partial_ESTest_scaffolding.class.getClassLoader() ,
      "org.joda.time.DateTimeZone",
      "org.joda.time.TestAbstractPartial$MockProperty0Field",
      "org.joda.time.field.AbstractPartialFieldProperty",
      "org.joda.time.TestDateMidnight_Basics",
      "org.joda.time.TestMutableInterval_Constructors$MockInterval",
      "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType",
      "org.joda.time.chrono.BasicChronology$HalfdayField",
      "org.joda.time.LocalDate$Property",
      "org.joda.time.TestDateMidnight_Basics$1",
      "org.joda.time.chrono.BasicChronology$YearInfo",
      "org.joda.time.field.UnsupportedDurationField",
      "org.joda.time.ReadWritableInterval",
      "org.joda.time.format.PeriodFormatterBuilder",
      "org.joda.time.format.DateTimePrinter",
      "org.joda.time.chrono.ISOChronology",
      "org.joda.time.base.BaseLocal",
      "org.joda.time.chrono.LenientChronology",
      "org.joda.time.format.PeriodFormatterBuilder$FieldFormatter",
      "org.joda.time.TestMutableInterval_Updates$MockBadInterval",
      "org.joda.time.field.DividedDateTimeField",
      "org.joda.time.chrono.ZonedChronology",
      "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset",
      "org.joda.time.field.BaseDateTimeField",
      "org.joda.time.field.ZeroIsMaxDateTimeField",
      "org.joda.time.base.BaseInterval",
      "org.joda.time.Duration",
      "org.joda.time.format.FormatUtils",
      "org.joda.time.format.PeriodFormatter",
      "org.joda.time.TestLocalDateTime_Basics$MockInstant",
      "org.joda.time.Interval",
      "org.joda.time.base.AbstractInstant",
      "org.joda.time.tz.DateTimeZoneBuilder",
      "org.joda.time.ReadWritablePeriod",
      "org.joda.time.LocalDateTime",
      "org.joda.time.tz.FixedDateTimeZone",
      "org.joda.time.base.BasePeriod$1",
      "org.joda.time.convert.IntervalConverter",
      "org.joda.time.TestMutableDateTime_Basics$MockEqualsChronology",
      "org.joda.time.format.PeriodPrinter",
      "org.joda.time.field.PreciseDateTimeField",
      "org.joda.time.chrono.LimitChronology$LimitException",
      "org.joda.time.base.BaseDuration",
      "org.joda.time.field.DecoratedDateTimeField",
      "org.joda.time.YearMonthDay",
      "org.joda.time.TestDateTime_Basics$MockEqualsChronology",
      "org.joda.time.format.DateTimeParser",
      "org.joda.time.format.DateTimeFormatterBuilder$CharacterLiteral",
      "org.joda.time.YearMonth",
      "org.joda.time.chrono.GJChronology$CutoverField",
      "org.joda.time.field.OffsetDateTimeField",
      "org.joda.time.DateTimeField",
      "org.joda.time.field.FieldUtils",
      "org.joda.time.Partial",
      "org.joda.time.format.ISODateTimeFormat",
      "org.joda.time.field.SkipDateTimeField",
      "org.joda.time.base.AbstractPeriod",
      "org.joda.time.DateTimeUtils$SystemMillisProvider",
      "org.joda.time.chrono.GJDayOfWeekDateTimeField",
      "org.joda.time.IllegalFieldValueException",
      "org.joda.time.IllegalInstantException",
      "org.joda.time.format.DateTimeFormatterBuilder$Composite",
      "org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber",
      "org.joda.time.TestDateMidnight_Basics$MockInstant",
      "org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField",
      "org.joda.time.ReadablePeriod",
      "org.joda.time.TestAbstractPartial$MockProperty0",
      "org.joda.time.TestAbstractPartial$MockProperty1",
      "org.joda.time.chrono.ZonedChronology$ZonedDateTimeField",
      "org.joda.time.chrono.GregorianChronology",
      "org.joda.time.TestMutableInterval_Updates",
      "org.joda.time.chrono.GJChronology$LinkedDurationField",
      "org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber",
      "org.joda.time.Minutes",
      "org.joda.time.chrono.BasicMonthOfYearDateTimeField",
      "org.joda.time.base.AbstractPartial",
      "org.joda.time.base.BasePartial",
      "org.joda.time.base.BaseDateTime",
      "org.joda.time.base.AbstractDuration",
      "org.joda.time.DateTimeUtils",
      "org.joda.time.LocalTime",
      "org.joda.time.base.AbstractInterval",
      "org.joda.time.Hours",
      "org.joda.time.TestMonthDay_Basics",
      "org.joda.time.TestMonthDay_Basics$MockMD",
      "org.joda.time.base.BasePeriod",
      "org.joda.time.field.DecoratedDurationField",
      "org.joda.time.tz.DateTimeZoneBuilder$DSTZone",
      "org.joda.time.format.DateTimeFormat$1",
      "org.joda.time.TimeOfDay",
      "org.joda.time.format.ISOPeriodFormat",
      "org.joda.time.Partial$Property",
      "org.joda.time.chrono.CopticChronology",
      "org.joda.time.field.ImpreciseDateTimeField",
      "org.joda.time.field.PreciseDurationField",
      "org.joda.time.tz.DateTimeZoneBuilder$OfYear",
      "org.joda.time.ReadableDuration",
      "org.joda.time.chrono.BasicGJChronology",
      "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter",
      "org.joda.time.format.DateTimeFormatter",
      "org.joda.time.DurationField",
      "org.joda.time.TestMutableDateTime_Basics$1",
      "org.joda.time.DateTime",
      "org.joda.time.format.PeriodFormatterBuilder$SimpleAffix",
      "org.joda.time.ReadWritableDateTime",
      "org.joda.time.chrono.ZonedChronology$ZonedDurationField",
      "org.joda.time.Instant",
      "org.joda.time.format.PeriodFormatterBuilder$Separator",
      "org.joda.time.chrono.LimitChronology$LimitDurationField",
      "org.joda.time.DurationFieldType$StandardDurationFieldType",
      "org.joda.time.chrono.BasicDayOfYearDateTimeField",
      "org.joda.time.TestMutableDateTime_Basics",
      "org.joda.time.chrono.BuddhistChronology",
      "org.joda.time.format.DateTimeFormatterBuilder$StringLiteral",
      "org.joda.time.tz.DateTimeZoneBuilder$Recurrence",
      "org.joda.time.format.ISODateTimeFormat$Constants",
      "org.joda.time.convert.Converter",
      "org.joda.time.DateTimeUtils$MillisProvider",
      "org.joda.time.chrono.GJYearOfEraDateTimeField",
      "org.joda.time.Seconds",
      "org.joda.time.TestDateTime_Basics",
      "org.joda.time.field.RemainderDateTimeField",
      "org.joda.time.JodaTimePermission",
      "org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField",
      "org.joda.time.DateTimeFieldType",
      "org.joda.time.format.DateTimeFormatterBuilder$Fraction",
      "org.joda.time.format.DateTimeFormatterBuilder$FixedNumber",
      "org.joda.time.MutableDateTime$Property",
      "org.joda.time.TestAbstractPartial$MockProperty0Chrono",
      "org.joda.time.ReadableInterval",
      "org.joda.time.chrono.LimitChronology$LimitDateTimeField",
      "org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone",
      "org.joda.time.base.AbstractDateTime",
      "org.joda.time.field.SkipUndoDateTimeField",
      "org.joda.time.field.DelegatedDateTimeField",
      "org.joda.time.chrono.BasicChronology",
      "org.joda.time.chrono.BasicYearDateTimeField",
      "org.joda.time.TestAbstractPartial$MockPartial",
      "org.joda.time.TestMutableInterval_Constructors",
      "org.joda.time.format.DateTimeFormatterBuilder",
      "org.joda.time.tz.CachedDateTimeZone$Info",
      "org.joda.time.PeriodType",
      "org.joda.time.field.MillisDurationField",
      "org.joda.time.MockNullZoneChronology",
      "org.joda.time.chrono.GJChronology",
      "org.joda.time.TestYearMonthDay_Basics$MockInstant",
      "org.joda.time.chrono.BasicFixedMonthChronology",
      "org.joda.time.field.UnsupportedDateTimeField",
      "org.joda.time.field.ScaledDurationField",
      "org.joda.time.chrono.ISOYearOfEraDateTimeField",
      "org.joda.time.TestAbstractPartial$MockProperty0Val",
      "org.joda.time.TestMutableDateTime_Basics$MockInstant",
      "org.joda.time.field.PreciseDurationDateTimeField",
      "org.joda.time.MutablePeriod",
      "org.joda.time.MutableDateTime",
      "org.joda.time.tz.CachedDateTimeZone",
      "org.joda.time.ReadableDateTime",
      "org.joda.time.format.PeriodFormatterBuilder$Literal",
      "org.joda.time.format.PeriodParser",
      "org.joda.time.TestInterval_Basics",
      "org.joda.time.DateMidnight",
      "org.joda.time.TestYearMonth_Basics$MockYM",
      "org.joda.time.chrono.GJMonthOfYearDateTimeField",
      "org.joda.time.TestYearMonth_Basics",
      "org.joda.time.chrono.BasicWeekyearDateTimeField",
      "org.joda.time.Days",
      "org.joda.time.format.DateTimeFormatterBuilder$MatchingParser",
      "org.joda.time.chrono.BasicSingleEraDateTimeField",
      "org.joda.time.format.DateTimeFormat",
      "org.joda.time.chrono.LimitChronology",
      "org.joda.time.ReadableInstant",
      "org.joda.time.base.BaseSingleFieldPeriod",
      "org.joda.time.TestDateTime_Basics$MockInstant",
      "org.joda.time.tz.DefaultNameProvider",
      "org.joda.time.tz.Provider",
      "org.joda.time.chrono.AssembledChronology$Fields",
      "org.joda.time.DurationFieldType",
      "org.joda.time.ReadWritableInstant",
      "org.joda.time.MutableInterval",
      "org.joda.time.tz.NameProvider",
      "org.joda.time.TestLocalDateTime_Basics",
      "org.joda.time.chrono.AssembledChronology",
      "org.joda.time.TestYearMonthDay_Basics",
      "org.joda.time.TestAbstractPartial",
      "org.joda.time.tz.ZoneInfoProvider",
      "org.joda.time.chrono.GJEraDateTimeField",
      "org.joda.time.DateTimeZone$1",
      "org.joda.time.chrono.BaseChronology",
      "org.joda.time.chrono.JulianChronology",
      "org.joda.time.Period",
      "org.joda.time.Weeks",
      "org.joda.time.Chronology",
      "org.joda.time.format.PeriodFormatterBuilder$Composite",
      "org.joda.time.field.AbstractReadableInstantFieldProperty",
      "org.joda.time.format.PeriodFormatterBuilder$PeriodFieldAffix",
      "org.joda.time.TestInterval_Basics$MockInterval",
      "org.joda.time.LocalDate",
      "org.joda.time.MockPartial",
      "org.joda.time.TestDateTime_Basics$1",
      "org.joda.time.chrono.BasicDayOfMonthDateTimeField",
      "org.joda.time.ReadablePartial",
      "org.joda.time.chrono.GJChronology$ImpreciseCutoverField",
      "org.joda.time.field.BaseDurationField"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Partial_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.joda.time.Partial",
      "org.joda.time.Partial$Property",
      "org.joda.time.tz.FixedDateTimeZone",
      "org.joda.time.DateTimeZone",
      "org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone",
      "org.joda.time.tz.DateTimeZoneBuilder$DSTZone",
      "org.joda.time.tz.CachedDateTimeZone",
      "org.joda.time.DateTimeUtils",
      "org.joda.time.format.FormatUtils",
      "org.joda.time.chrono.BaseChronology",
      "org.joda.time.chrono.AssembledChronology",
      "org.joda.time.field.MillisDurationField",
      "org.joda.time.field.BaseDurationField",
      "org.joda.time.field.PreciseDurationField",
      "org.joda.time.DurationFieldType$StandardDurationFieldType",
      "org.joda.time.DurationFieldType",
      "org.joda.time.field.PreciseDurationDateTimeField",
      "org.joda.time.field.PreciseDateTimeField",
      "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType",
      "org.joda.time.DateTimeFieldType",
      "org.joda.time.field.DecoratedDateTimeField",
      "org.joda.time.field.ZeroIsMaxDateTimeField",
      "org.joda.time.chrono.BasicChronology$HalfdayField",
      "org.joda.time.chrono.BasicChronology",
      "org.joda.time.chrono.BasicGJChronology",
      "org.joda.time.field.ImpreciseDateTimeField",
      "org.joda.time.chrono.BasicYearDateTimeField",
      "org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField",
      "org.joda.time.chrono.GJYearOfEraDateTimeField",
      "org.joda.time.field.OffsetDateTimeField",
      "org.joda.time.field.DividedDateTimeField",
      "org.joda.time.field.DecoratedDurationField",
      "org.joda.time.field.ScaledDurationField",
      "org.joda.time.field.RemainderDateTimeField",
      "org.joda.time.chrono.GJEraDateTimeField",
      "org.joda.time.chrono.GJDayOfWeekDateTimeField",
      "org.joda.time.chrono.BasicDayOfMonthDateTimeField",
      "org.joda.time.chrono.BasicDayOfYearDateTimeField",
      "org.joda.time.chrono.BasicMonthOfYearDateTimeField",
      "org.joda.time.chrono.GJMonthOfYearDateTimeField",
      "org.joda.time.chrono.BasicWeekyearDateTimeField",
      "org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField",
      "org.joda.time.field.UnsupportedDurationField",
      "org.joda.time.chrono.GregorianChronology",
      "org.joda.time.chrono.ISOYearOfEraDateTimeField",
      "org.joda.time.chrono.ISOChronology",
      "org.joda.time.format.ISODateTimeFormat$Constants",
      "org.joda.time.format.DateTimeFormat$1",
      "org.joda.time.format.DateTimeFormat",
      "org.joda.time.base.BaseLocal",
      "org.joda.time.LocalTime",
      "org.joda.time.chrono.ZonedChronology",
      "org.joda.time.chrono.ZonedChronology$ZonedDurationField",
      "org.joda.time.chrono.ZonedChronology$ZonedDateTimeField",
      "org.joda.time.base.BaseDateTime",
      "org.joda.time.DateTime",
      "org.joda.time.TestInterval_Constructors",
      "org.joda.time.LocalDateTime",
      "org.joda.time.convert.ConverterManager",
      "org.joda.time.convert.ReadableInstantConverter",
      "org.joda.time.convert.StringConverter",
      "org.joda.time.convert.CalendarConverter",
      "org.joda.time.convert.DateConverter",
      "org.joda.time.convert.LongConverter",
      "org.joda.time.convert.NullConverter",
      "org.joda.time.convert.ReadablePartialConverter",
      "org.joda.time.convert.ReadableDurationConverter",
      "org.joda.time.convert.ReadableIntervalConverter",
      "org.joda.time.convert.ReadablePeriodConverter",
      "org.joda.time.Instant",
      "org.joda.time.chrono.GJChronology",
      "org.joda.time.LocalDate",
      "org.joda.time.field.DelegatedDateTimeField",
      "org.joda.time.field.SkipDateTimeField",
      "org.joda.time.chrono.JulianChronology",
      "org.joda.time.chrono.GJChronology$CutoverField",
      "org.joda.time.chrono.GJChronology$ImpreciseCutoverField",
      "org.joda.time.chrono.GJChronology$LinkedDurationField",
      "org.joda.time.chrono.BasicSingleEraDateTimeField",
      "org.joda.time.field.SkipUndoDateTimeField",
      "org.joda.time.chrono.LimitChronology",
      "org.joda.time.chrono.LimitChronology$LimitDurationField",
      "org.joda.time.chrono.LimitChronology$LimitDateTimeField",
      "org.joda.time.chrono.BuddhistChronology",
      "org.joda.time.chrono.BasicFixedMonthChronology",
      "org.joda.time.chrono.CopticChronology",
      "org.joda.time.TestDateMidnight_Basics",
      "org.joda.time.TestMutableDateTime_Basics",
      "org.joda.time.TestMutableDateTime_Basics$MockEqualsChronology",
      "org.joda.time.TestDateTime_Basics",
      "org.joda.time.TestDateTime_Basics$MockEqualsChronology",
      "org.joda.time.TestInterval_Basics",
      "org.joda.time.TestMutableInterval_Basics",
      "org.joda.time.base.BaseInterval",
      "org.joda.time.MutableInterval",
      "org.joda.time.chrono.ISOChronology$Stub",
      "org.joda.time.DateTimeZone$Stub",
      "org.joda.time.MockZone",
      "org.joda.time.TestLocalDate_Basics",
      "org.joda.time.MockPartial",
      "org.joda.time.MockNullZoneChronology",
      "org.joda.time.TestDateTimeZone$MockDateTimeZone",
      "org.joda.time.field.UnsupportedDateTimeField",
      "org.joda.time.TestMutableInterval_Constructors",
      "org.joda.time.MutableDateTime",
      "org.joda.time.TestLocalDateTime_Basics",
      "org.joda.time.TestTimeOfDay_Basics",
      "org.joda.time.IllegalFieldValueException",
      "org.joda.time.TestYearMonth_Basics",
      "org.joda.time.PeriodType",
      "org.joda.time.base.BasePeriod",
      "org.joda.time.Period",
      "org.joda.time.TestLocalTime_Basics",
      "org.joda.time.TestMonthDay_Basics",
      "org.joda.time.base.BasePartial",
      "org.joda.time.MonthDay",
      "org.joda.time.TimeOfDay",
      "org.joda.time.base.BaseDuration",
      "org.joda.time.Duration",
      "org.joda.time.base.BaseSingleFieldPeriod",
      "org.joda.time.format.ISOPeriodFormat",
      "org.joda.time.format.PeriodFormatterBuilder",
      "org.joda.time.format.PeriodFormatterBuilder$Literal",
      "org.joda.time.Hours",
      "org.joda.time.TestInstant_Basics",
      "org.joda.time.TestYearMonthDay_Basics",
      "org.joda.time.TestMutableInterval_Updates",
      "org.joda.time.TestBasePartial$MockPartial",
      "org.joda.time.Seconds",
      "org.joda.time.Days",
      "org.joda.time.MutablePeriod",
      "org.joda.time.TestDuration_Basics",
      "org.joda.time.Interval",
      "org.joda.time.DateMidnight",
      "org.joda.time.YearMonth",
      "org.joda.time.field.AbstractReadableInstantFieldProperty",
      "org.joda.time.LocalDate$Property",
      "junit.runner.BaseTestRunner",
      "junit.textui.TestRunner",
      "org.joda.time.MutableDateTime$Property",
      "org.joda.time.TestMutableDateTime_Basics$1",
      "org.joda.time.format.DateTimeFormatterBuilder$TextField",
      "org.joda.time.chrono.GJLocaleSymbols",
      "org.joda.time.Weeks",
      "org.joda.time.Minutes",
      "org.joda.time.chrono.LenientChronology",
      "org.joda.time.field.LenientDateTimeField",
      "org.joda.time.TestDuration_Basics$MockMutableDuration",
      "org.joda.time.DateTime$Property",
      "org.joda.time.TestBaseSingleFieldPeriod$Single",
      "org.joda.time.DateTimeZone$1",
      "org.joda.time.LocalDateTime$Property",
      "org.joda.time.YearMonth$Property"
    );
  }
}
