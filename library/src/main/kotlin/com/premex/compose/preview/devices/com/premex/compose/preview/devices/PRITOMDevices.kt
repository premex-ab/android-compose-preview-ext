package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PRITOM device specifications for Android Compose previews.
 *
 * This extension provides PRITOM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PRITOM.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PRITOM: Any
  get() = object {
      /** DeviceSpec(manufacturer=PRITOM, code=K7, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=K7, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val K7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PRITOM, code=K7Pro, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=K7Pro, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val K7PRO = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PRITOM, code=K7Pro_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=K7Pro_EEA, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val K7PRO_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PRITOM, code=K7_A04, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=K7_A04, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val K7_A04 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PRITOM, code=K7_A04_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=K7_A04_EEA, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val K7_A04_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PRITOM, code=K7_A101, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=K7_A101, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val K7_A101 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PRITOM, code=K7_A101_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=K7_A101_EEA,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val K7_A101_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PRITOM, code=K7_A102, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=K7_A102, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val K7_A102 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PRITOM, code=L10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=L10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val L10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PRITOM, code=L10_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=L10_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val L10_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PRITOM, code=L10_T07, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=L10_T07, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val L10_T07 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=PRITOM, code=L10_T13, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=L10_T13, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val L10_T13 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PRITOM, code=L8, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=L8, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val L8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PRITOM, code=L8_A01, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=L8_A01, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val L8_A01 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PRITOM, code=L8_B01, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=L8_B01, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val L8_B01 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PRITOM, code=L8_B02, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=L8_B02, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val L8_B02 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PRITOM, code=L8_B02_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=L8_B02_EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val L8_B02_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PRITOM, code=L8_C01, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=L8_C01, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val L8_C01 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PRITOM, code=L8_C01_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=L8_C01_EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val L8_C01_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PRITOM, code=L8_C02, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=L8_C02, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val L8_C02 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PRITOM, code=L8_C02_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=L8_C02_EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val L8_C02_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PRITOM, code=L8_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=L8_EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val L8_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PRITOM, code=L8_PRO, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=L8_PRO, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val L8_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PRITOM, code=L8_PRO_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=L8_PRO_EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val L8_PRO_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PRITOM, code=L8-T01, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=L8-T01, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val L8_T01 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PRITOM, code=M10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=M10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val M10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PRITOM, code=M10_A01, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=M10_A01, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val M10_A01 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PRITOM, code=M10_A01_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=M10_A01_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val M10_A01_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PRITOM, code=M10_A05, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=M10_A05, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val M10_A05 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PRITOM, code=M10_A05_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=M10_A05_EEA,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val M10_A05_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PRITOM, code=M10_Air_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=M10_Air_EEA,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val M10_AIR_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PRITOM, code=M10_B05, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=M10_B05, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val M10_B05 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PRITOM, code=M10_B05_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=M10_B05_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val M10_B05_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PRITOM, code=M10_B06, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=M10_B06, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val M10_B06 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PRITOM, code=M10_C01, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=M10_C01, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val M10_C01 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PRITOM, code=M10_C01_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=M10_C01_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val M10_C01_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PRITOM, code=M10_C02, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=M10_C02, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val M10_C02 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PRITOM, code=M10_C02_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=M10_C02_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val M10_C02_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PRITOM, code=M10_C03, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=M10_C03, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val M10_C03 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PRITOM, code=M10_C03_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=M10_C03_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val M10_C03_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PRITOM, code=M10_C04, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=M10_C04, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val M10_C04 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PRITOM, code=M10_C04_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=M10_C04_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val M10_C04_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PRITOM, code=M10_C05, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=M10_C05, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val M10_C05 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PRITOM, code=M10_C05_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=M10_C05_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val M10_C05_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PRITOM, code=M10_C05_Kids, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=M10_C05_Kids,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val M10_C05_KIDS = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PRITOM, code=M10_C06_Kids, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=M10_C06_Kids,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val M10_C06_KIDS = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PRITOM, code=M10_C07, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=M10_C07, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val M10_C07 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PRITOM, code=M10_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=M10_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val M10_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PRITOM, code=M10_Max, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=M10_Max, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val M10_MAX = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=PRITOM, code=M10_Max_EEA, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=M10_Max_EEA,
      width=800, height=1280, dpi=180, isGoogleDevice=false).code */
      val M10_MAX_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=PRITOM, code=M10_PLUS_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=M10_PLUS_EEA,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val M10_PLUS_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PRITOM, code=M10_PRO, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=M10_PRO, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val M10_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PRITOM, code=M10_PRO_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=M10_PRO_EEA,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val M10_PRO_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PRITOM, code=M10_R01, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=M10_R01, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val M10_R01 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PRITOM, code=M10_R01_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=M10_R01_EEA,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val M10_R01_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PRITOM, code=M10_R02, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=M10_R02, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val M10_R02 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PRITOM, code=M10_R02_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=M10_R02_EEA,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val M10_R02_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PRITOM, code=M10_R03, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=M10_R03, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val M10_R03 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PRITOM, code=M10_R04, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=M10_R04, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val M10_R04 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PRITOM, code=M30, width=800, height=1280, dpi=190,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=M30, width=800,
      height=1280, dpi=190, isGoogleDevice=false).code */
      val M30 = "spec:width=800,height=1280,unit=px,dpi=190"

      /** DeviceSpec(manufacturer=PRITOM, code=M30_EEA, width=800, height=1280, dpi=190,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=M30_EEA, width=800,
      height=1280, dpi=190, isGoogleDevice=false).code */
      val M30_EEA = "spec:width=800,height=1280,unit=px,dpi=190"

      /** DeviceSpec(manufacturer=PRITOM, code=P7, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=P7, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val P7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PRITOM, code=P7PLUS, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=P7PLUS, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val P7PLUS = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PRITOM, code=P7PLUS_EEA, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=P7PLUS_EEA,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val P7PLUS_EEA = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PRITOM, code=P7PRO, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=P7PRO, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val P7PRO = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PRITOM, code=P7PRO_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=P7PRO_EEA, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val P7PRO_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PRITOM, code=P7_A03, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=P7_A03, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val P7_A03 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PRITOM, code=P7_A04, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=P7_A04, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val P7_A04 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PRITOM, code=P7_A05, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=P7_A05, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val P7_A05 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PRITOM, code=P7_A07, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=P7_A07, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val P7_A07 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PRITOM, code=P7_A1, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=P7_A1, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val P7_A1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PRITOM, code=P7_A1_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRITOM, code=P7_A1_EEA, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val P7_A1_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

  }
