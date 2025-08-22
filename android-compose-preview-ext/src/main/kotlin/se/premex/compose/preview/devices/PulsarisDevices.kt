package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Pulsaris device specifications for Android Compose previews.
 *
 * This extension provides Pulsaris device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Pulsaris.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Pulsaris: Any
  get() = object {
      /** Pulsaris Fresh */
      val FRESH = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Pulsaris Pluma */
      val PLUMA = "spec:width=480,height=854,unit=px,dpi=220"

  }
