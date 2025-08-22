package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Geshem device specifications for Android Compose previews.
 *
 * This extension provides Geshem device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Geshem.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Geshem: Any
  get() = object {
      /** Geshem GS0882T */
      val GS0882T = "spec:width=800,height=1280,unit=px,dpi=240"

      /** Geshem GS0883T */
      val GS0883T = "spec:width=800,height=1280,unit=px,dpi=240"

      /** Geshem GS1081T */
      val GS1081T = "spec:width=800,height=1280,unit=px,dpi=240"

      /** Geshem GS109M2A */
      val GS109M2A = "spec:width=800,height=1280,unit=px,dpi=240"

      /** Geshem GS109M3A */
      val GS109M3A = "spec:width=800,height=1280,unit=px,dpi=240"

      /** Geshem GS81TE */
      val GS81TE = "spec:width=800,height=1280,unit=px,dpi=240"

  }
