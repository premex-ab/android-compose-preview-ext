package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * oneplus device specifications for Android Compose previews.
 *
 * This extension provides oneplus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Oneplus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Oneplus: Any
  get() = object {
      /** oneplus A0001 */
      val A0001 = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
