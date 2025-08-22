package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Telev8 device specifications for Android Compose previews.
 *
 * This extension provides Telev8 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Telev8.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Telev8: Any
  get() = object {
      /** Telev8 MH700 */
      val MH700 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
