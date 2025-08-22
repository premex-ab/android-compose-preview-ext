package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Pixus device specifications for Android Compose previews.
 *
 * This extension provides Pixus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Pixus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Pixus: Any
  get() = object {
      /** DeviceSpec(manufacturer=Pixus, code=Pixus_Arena, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Pixus, code=Pixus_Arena,
      width=1200, height=2000, dpi=240, isGoogleDevice=false).code */
      val PIXUS_ARENA = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Pixus, code=Pixus_Blast, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Pixus, code=Pixus_Blast,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val PIXUS_BLAST = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Pixus, code=Pixus_Combo, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Pixus, code=Pixus_Combo,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val PIXUS_COMBO = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Pixus, code=Pixus_Deon, width=800, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Pixus, code=Pixus_Deon, width=800,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PIXUS_DEON = "spec:width=800,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Pixus, code=Pixus_Drive, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Pixus, code=Pixus_Drive,
      width=1200, height=2000, dpi=320, isGoogleDevice=false).code */
      val PIXUS_DRIVE = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Pixus, code=Pixus_Falcon, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Pixus, code=Pixus_Falcon,
      width=1200, height=2000, dpi=320, isGoogleDevice=false).code */
      val PIXUS_FALCON = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Pixus, code=Pixus_Folio, width=1200, height=1920, dpi=360,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Pixus, code=Pixus_Folio,
      width=1200, height=1920, dpi=360, isGoogleDevice=false).code */
      val PIXUS_FOLIO = "spec:width=1200,height=1920,unit=px,dpi=360"

      /** DeviceSpec(manufacturer=Pixus, code=Pixus_Hammer, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Pixus, code=Pixus_Hammer,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val PIXUS_HAMMER = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Pixus, code=Pixus_Joker, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Pixus, code=Pixus_Joker,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val PIXUS_JOKER = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Pixus, code=Pixus_Line, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Pixus, code=Pixus_Line, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val PIXUS_LINE = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Pixus, code=Pixus_Loga, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Pixus, code=Pixus_Loga, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val PIXUS_LOGA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Pixus, code=Pixus_Titan, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Pixus, code=Pixus_Titan,
      width=1200, height=2000, dpi=320, isGoogleDevice=false).code */
      val PIXUS_TITAN = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Pixus, code=Pixus_Touch_7_3G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Pixus, code=Pixus_Touch_7_3G,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val PIXUS_TOUCH_7_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Pixus, code=Pixus_Wing, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Pixus, code=Pixus_Wing, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val PIXUS_WING = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Pixus, code=Sprint, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Pixus, code=Sprint, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val SPRINT = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Pixus, code=Sprint_2_16, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Pixus, code=Sprint_2_16, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SPRINT_2_16 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
