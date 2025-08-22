package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Avtek device specifications for Android Compose previews.
 *
 * This extension provides Avtek device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Avtek.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Avtek: Any
  get() = object {
      /** Avtek MTK9679 */
      val MTK9679 = "spec:width=2160,height=3840,unit=px,dpi=480"

  }
