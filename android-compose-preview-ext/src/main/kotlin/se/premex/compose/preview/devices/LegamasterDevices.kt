package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Legamaster device specifications for Android Compose previews.
 *
 * This extension provides Legamaster device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Legamaster.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Legamaster: Any
  get() = object {
      /** Legamaster ETX */
      val ETX = "spec:width=2160,height=3840,unit=px,dpi=480"

  }
