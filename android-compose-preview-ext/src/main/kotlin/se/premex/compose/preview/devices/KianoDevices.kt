package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Kiano device specifications for Android Compose previews.
 *
 * This extension provides Kiano device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kiano.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kiano: Any
  get() = object {
      /** Kiano ELEGANCE_6 */
      val ELEGANCE_6 = "spec:width=720,height=1512,unit=px,dpi=320"

  }
