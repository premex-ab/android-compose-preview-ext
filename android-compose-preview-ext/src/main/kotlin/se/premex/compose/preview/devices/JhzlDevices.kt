package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * JHZL device specifications for Android Compose previews.
 *
 * This extension provides JHZL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Jhzl.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Jhzl: Any
  get() = object {
      /** JHZL J101-EEA */
      val J101_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

  }
