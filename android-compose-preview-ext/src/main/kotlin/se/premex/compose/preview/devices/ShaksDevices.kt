package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Shaks device specifications for Android Compose previews.
 *
 * This extension provides Shaks device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Shaks.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Shaks: Any
  get() = object {
      /** Shaks TSA */
      val TSA = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
