package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * mirarel device specifications for Android Compose previews.
 *
 * This extension provides mirarel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mirarel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mirarel: Any
  get() = object {
      /** mirarel ksr */
      val KSR = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
