package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DENSOWAVE device specifications for Android Compose previews.
 *
 * This extension provides DENSOWAVE device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DENSOWAVE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DENSOWAVE: Any
  get() = object {
      /** DeviceSpec(manufacturer=DENSOWAVE, code=BHT-1700BWB-1-A7, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DENSOWAVE, code=BHT-1700BWB-1-A7,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val BHT_1700BWB_1_A7 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DENSOWAVE, code=BHT-1700QWBG-1-A7, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DENSOWAVE, code=BHT-1700QWBG-1-A7,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val BHT_1700QWBG_1_A7 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DENSOWAVE, code=BHT-1700QWBG-2-A7, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DENSOWAVE, code=BHT-1700QWBG-2-A7,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val BHT_1700QWBG_2_A7 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DENSOWAVE, code=BHT-1700QWB-1-A7, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DENSOWAVE, code=BHT-1700QWB-1-A7,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val BHT_1700QWB_1_A7 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DENSOWAVE, code=BHT-1700QWB-2-A7, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DENSOWAVE, code=BHT-1700QWB-2-A7,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val BHT_1700QWB_2_A7 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DENSOWAVE, code=BHT-1800QWBG-1-A7, width=720, height=1280,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DENSOWAVE,
      code=BHT-1800QWBG-1-A7, width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val BHT_1800QWBG_1_A7 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DENSOWAVE, code=BHT-1800QWB-1-A7, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DENSOWAVE, code=BHT-1800QWB-1-A7,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val BHT_1800QWB_1_A7 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DENSOWAVE, code=BHT-M60-QWG-A10, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DENSOWAVE, code=BHT-M60-QWG-A10,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val BHT_M60_QWG_A10 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DENSOWAVE, code=BHT-M60-QW-A10, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DENSOWAVE, code=BHT-M60-QW-A10,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val BHT_M60_QW_A10 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DENSOWAVE, code=BHT-M70-QWG-A10, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DENSOWAVE, code=BHT-M70-QWG-A10,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val BHT_M70_QWG_A10 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DENSOWAVE, code=BHT-M70-QW-A10, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DENSOWAVE, code=BHT-M70-QW-A10,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val BHT_M70_QW_A10 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DENSOWAVE, code=BHT-M80-QWG-A10, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DENSOWAVE, code=BHT-M80-QWG-A10,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val BHT_M80_QWG_A10 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DENSOWAVE, code=BHT-M80-QW-A10, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DENSOWAVE, code=BHT-M80-QW-A10,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val BHT_M80_QW_A10 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
