package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * VORCOM device specifications for Android Compose previews.
 *
 * This extension provides VORCOM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vorcom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vorcom: Any
  get() = object {
      /** VORCOM AVALON */
      val AVALON = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** VORCOM QuartzLITE */
      val QUARTZLITE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** VORCOM QuartzPRO */
      val QUARTZPRO = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** VORCOM S12_classic */
      val S12_CLASSIC = "spec:width=800,height=1280,unit=px,dpi=213"

      /** VORCOM S7-classic */
      val S7_CLASSIC = "spec:width=600,height=1024,unit=px,dpi=160"

      /** VORCOM S7-classic-10 */
      val S7_CLASSIC_10 = "spec:width=600,height=1022,unit=px,dpi=160"

      /** VORCOM S8Pro */
      val S8PRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** VORCOM SXPRO_classic */
      val SXPRO_CLASSIC = "spec:width=800,height=1280,unit=px,dpi=213"

      /** VORCOM ULTRAPAD */
      val ULTRAPAD = "spec:width=1200,height=2000,unit=px,dpi=280"

  }
