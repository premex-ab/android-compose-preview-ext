package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * SAMSUNG device specifications for Android Compose previews.
 *
 * This extension provides SAMSUNG device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Samsung.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Samsung: Any
  get() = object {
      /** SAMSUNG SAMSUNG_INTERACTIVE_DISPLAY */
      val SAMSUNG_INTERACTIVE_DISPLAY = "spec:width=2160,height=3840,unit=px,dpi=480"

  }
