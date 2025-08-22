package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Witooth device specifications for Android Compose previews.
 *
 * This extension provides Witooth device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Witooth.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Witooth: Any
  get() = object {
      /** Witooth longshan */
      val LONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Witooth sindorim */
      val SINDORIM = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
