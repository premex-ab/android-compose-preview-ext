package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Mswipe device specifications for Android Compose previews.
 *
 * This extension provides Mswipe device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mswipe.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mswipe: Any
  get() = object {
      /** Mswipe L200 */
      val L200 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
