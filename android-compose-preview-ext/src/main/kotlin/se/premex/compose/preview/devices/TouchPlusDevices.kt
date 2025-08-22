package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TOUCH-plus device specifications for Android Compose previews.
 *
 * This extension provides TOUCH-plus device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TouchPlus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TouchPlus: Any
  get() = object {
      /** TOUCH-plus 1100AS */
      val _1100AS = "spec:width=800,height=1280,unit=px,dpi=180"

  }
