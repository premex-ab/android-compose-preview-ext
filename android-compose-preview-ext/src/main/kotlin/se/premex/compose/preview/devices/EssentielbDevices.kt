package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Essentielb device specifications for Android Compose previews.
 *
 * This extension provides Essentielb device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Essentielb.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Essentielb: Any
  get() = object {
      /** Essentielb M16Q1A */
      val M16Q1A = "spec:width=1200,height=1920,unit=px,dpi=213"

      /** Essentielb M16Q1C */
      val M16Q1C = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Essentielb SmartTAB1007 */
      val SMARTTAB1007 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Essentielb SmartTAB1008 */
      val SMARTTAB1008 = "spec:width=1200,height=1920,unit=px,dpi=213"

      /** Essentielb SmartTab_1004_XS */
      val SMARTTAB_1004_XS = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Essentielb Wooze_L */
      val WOOZE_L = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Essentielb Wooze_XL */
      val WOOZE_XL = "spec:width=720,height=1280,unit=px,dpi=320"

  }
