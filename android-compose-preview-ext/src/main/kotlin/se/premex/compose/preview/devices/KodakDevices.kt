package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Kodak device specifications for Android Compose previews.
 *
 * This extension provides Kodak device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kodak.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kodak: Any
  get() = object {
      /** Kodak KD10112TB */
      val KD10112TB = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Kodak KodakEktra */
      val KODAKEKTRA = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Kodak Kodak_D40 */
      val KODAK_D40 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Kodak Kodak_D50L */
      val KODAK_D50L = "spec:width=480,height=960,unit=px,dpi=240"

      /** Kodak Kodak_D55L */
      val KODAK_D55L = "spec:width=444,height=960,unit=px,dpi=213"

      /** Kodak Kodak_D60LX */
      val KODAK_D60LX = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Kodak Kodak_D61L */
      val KODAK_D61L = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Kodak Kodak_D65LX */
      val KODAK_D65LX = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Kodak Kodak_KD50 */
      val KODAK_KD50 = "spec:width=480,height=960,unit=px,dpi=240"

  }
