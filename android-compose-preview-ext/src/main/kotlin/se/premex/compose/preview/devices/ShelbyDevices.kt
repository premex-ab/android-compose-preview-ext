package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Shelby device specifications for Android Compose previews.
 *
 * This extension provides Shelby device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Shelby.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Shelby: Any
  get() = object {
      /** Shelby ZA555 */
      val ZA555 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
