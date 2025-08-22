package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LT device specifications for Android Compose previews.
 *
 * This extension provides LT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LT: Any
  get() = object {
      /** DeviceSpec(manufacturer=LT, code=HLTE227E, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LT, code=HLTE227E, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val HLTE227E = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=LT, code=HS8909QC, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LT, code=HS8909QC, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val HS8909QC = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=LT, code=HS8917QC, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LT, code=HS8917QC, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val HS8917QC = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LT, code=LT, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LT, code=LT, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val LT = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=LT, code=LT971, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LT, code=LT971, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val LT971 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LT, code=LT_6217, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LT, code=LT_6217, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val LT_6217 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LT, code=LT_6509, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LT, code=LT_6509, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val LT_6509 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LT, code=LT_8103, width=720, height=1604, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LT, code=LT_8103, width=720,
      height=1604, dpi=320, isGoogleDevice=false).code */
      val LT_8103 = "spec:width=720,height=1604,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LT, code=LT_8501, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LT, code=LT_8501, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val LT_8501 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LT, code=LT_9701, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LT, code=LT_9701, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val LT_9701 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=LT, code=LT_9902, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LT, code=LT_9902, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val LT_9902 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=LT, code=LT_9906, width=1080, height=2560, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LT, code=LT_9906, width=1080,
      height=2560, dpi=480, isGoogleDevice=false).code */
      val LT_9906 = "spec:width=1080,height=2560,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=LT, code=LT_C1500, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LT, code=LT_C1500, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val LT_C1500 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LT, code=LT_C2100, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LT, code=LT_C2100, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val LT_C2100 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LT, code=LT_C2200, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LT, code=LT_C2200, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val LT_C2200 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LT, code=LT_C3300, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LT, code=LT_C3300, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val LT_C3300 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LT, code=LT_C3500, width=720, height=1500, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LT, code=LT_C3500, width=720,
      height=1500, dpi=320, isGoogleDevice=false).code */
      val LT_C3500 = "spec:width=720,height=1500,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LT, code=LT-NOTE-10S, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LT, code=LT-NOTE-10S, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val LT_NOTE_10S = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=LT, code=LT_S10_Lite, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LT, code=LT_S10_Lite, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val LT_S10_LITE = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LT, code=LT_S9_NOTE, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LT, code=LT_S9_NOTE, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val LT_S9_NOTE = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=LT, code=Note_30, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LT, code=Note_30, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val NOTE_30 = "spec:width=1080,height=2400,unit=px,dpi=480"

  }
