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
      /** PRITOM K7 */
      val K7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** PRITOM K7Pro */
      val K7PRO = "spec:width=600,height=1024,unit=px,dpi=160"

      /** PRITOM K7Pro_EEA */
      val K7PRO_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** PRITOM K7_A04 */
      val K7_A04 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** PRITOM K7_A04_EEA */
      val K7_A04_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** PRITOM K7_A101 */
      val K7_A101 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** PRITOM K7_A101_EEA */
      val K7_A101_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** PRITOM K7_A102 */
      val K7_A102 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** PRITOM L10 */
      val L10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** PRITOM L10_EEA */
      val L10_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** PRITOM L10_T07 */
      val L10_T07 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** PRITOM L10_T13 */
      val L10_T13 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** PRITOM L8 */
      val L8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** PRITOM L8_A01 */
      val L8_A01 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** PRITOM L8_B01 */
      val L8_B01 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** PRITOM L8_B02 */
      val L8_B02 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** PRITOM L8_B02_EEA */
      val L8_B02_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** PRITOM L8_C01 */
      val L8_C01 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** PRITOM L8_C01_EEA */
      val L8_C01_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** PRITOM L8_C02 */
      val L8_C02 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** PRITOM L8_C02_EEA */
      val L8_C02_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** PRITOM L8_EEA */
      val L8_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** PRITOM L8_PRO */
      val L8_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** PRITOM L8_PRO_EEA */
      val L8_PRO_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** PRITOM L8-T01 */
      val L8_T01 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** PRITOM M10 */
      val M10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** PRITOM M10_A01 */
      val M10_A01 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** PRITOM M10_A01_EEA */
      val M10_A01_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** PRITOM M10_A05 */
      val M10_A05 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** PRITOM M10_A05_EEA */
      val M10_A05_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** PRITOM M10_Air_EEA */
      val M10_AIR_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** PRITOM M10_B05 */
      val M10_B05 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** PRITOM M10_B05_EEA */
      val M10_B05_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** PRITOM M10_B06 */
      val M10_B06 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** PRITOM M10_C01 */
      val M10_C01 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** PRITOM M10_C01_EEA */
      val M10_C01_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** PRITOM M10_C02 */
      val M10_C02 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** PRITOM M10_C02_EEA */
      val M10_C02_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** PRITOM M10_C03 */
      val M10_C03 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** PRITOM M10_C03_EEA */
      val M10_C03_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** PRITOM M10_C04 */
      val M10_C04 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** PRITOM M10_C04_EEA */
      val M10_C04_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** PRITOM M10_C05 */
      val M10_C05 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** PRITOM M10_C05_EEA */
      val M10_C05_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** PRITOM M10_C05_Kids */
      val M10_C05_KIDS = "spec:width=800,height=1280,unit=px,dpi=160"

      /** PRITOM M10_C06_Kids */
      val M10_C06_KIDS = "spec:width=800,height=1280,unit=px,dpi=160"

      /** PRITOM M10_C07 */
      val M10_C07 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** PRITOM M10_EEA */
      val M10_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** PRITOM M10_Max */
      val M10_MAX = "spec:width=800,height=1280,unit=px,dpi=180"

      /** PRITOM M10_Max_EEA */
      val M10_MAX_EEA = "spec:width=800,height=1280,unit=px,dpi=180"

      /** PRITOM M10_PLUS_EEA */
      val M10_PLUS_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** PRITOM M10_PRO */
      val M10_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** PRITOM M10_PRO_EEA */
      val M10_PRO_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** PRITOM M10_R01 */
      val M10_R01 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** PRITOM M10_R01_EEA */
      val M10_R01_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** PRITOM M10_R02 */
      val M10_R02 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** PRITOM M10_R02_EEA */
      val M10_R02_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** PRITOM M10_R03 */
      val M10_R03 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** PRITOM M10_R04 */
      val M10_R04 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** PRITOM M30 */
      val M30 = "spec:width=800,height=1280,unit=px,dpi=190"

      /** PRITOM M30_EEA */
      val M30_EEA = "spec:width=800,height=1280,unit=px,dpi=190"

      /** PRITOM P7 */
      val P7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** PRITOM P7PLUS */
      val P7PLUS = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** PRITOM P7PLUS_EEA */
      val P7PLUS_EEA = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** PRITOM P7PRO */
      val P7PRO = "spec:width=600,height=1024,unit=px,dpi=213"

      /** PRITOM P7PRO_EEA */
      val P7PRO_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** PRITOM P7_A03 */
      val P7_A03 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** PRITOM P7_A04 */
      val P7_A04 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** PRITOM P7_A05 */
      val P7_A05 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** PRITOM P7_A07 */
      val P7_A07 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** PRITOM P7_A1 */
      val P7_A1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** PRITOM P7_A1_EEA */
      val P7_A1_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

  }
