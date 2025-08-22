package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Turk_Telekom device specifications for Android Compose previews.
 *
 * This extension provides Turk_Telekom device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TurkTelekom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TurkTelekom: Any
  get() = object {
      /** Turk_Telekom ZTE_Blade_V580 */
      val ZTE_BLADE_V580 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Turk_Telekom 722T */
      val _722T = "spec:width=480,height=800,unit=px,dpi=240"

  }
