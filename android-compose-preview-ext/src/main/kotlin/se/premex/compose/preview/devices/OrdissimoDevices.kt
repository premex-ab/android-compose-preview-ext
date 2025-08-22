package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Ordissimo device specifications for Android Compose previews.
 *
 * This extension provides Ordissimo device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ordissimo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ordissimo: Any
  get() = object {
      /** Ordissimo Celia */
      val CELIA = "spec:width=1200,height=1920,unit=px,dpi=272"

      /** Ordissimo LeNumero2 */
      val LENUMERO2 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** Ordissimo LeNumero2Mini */
      val LENUMERO2MINI = "spec:width=720,height=1440,unit=px,dpi=320"

  }
