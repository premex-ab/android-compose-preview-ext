package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * FOLG device specifications for Android Compose previews.
 *
 * This extension provides FOLG device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Folg.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Folg: Any
  get() = object {
      /** FOLG FOLG_GT_10 */
      val FOLG_GT_10 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** FOLG FOLG_TAB_10 */
      val FOLG_TAB_10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** FOLG FOLG_Tab_10s */
      val FOLG_TAB_10S = "spec:width=800,height=1280,unit=px,dpi=180"

      /** FOLG FT01 */
      val FT01 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** FOLG FT02 */
      val FT02 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** FOLG KS20 */
      val KS20 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** FOLG S18 */
      val S18 = "spec:width=1200,height=1920,unit=px,dpi=360"

      /** FOLG S19 */
      val S19 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** FOLG S30 */
      val S30 = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
