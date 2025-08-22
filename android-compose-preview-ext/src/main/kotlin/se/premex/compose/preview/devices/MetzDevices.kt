package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * METZ device specifications for Android Compose previews.
 *
 * This extension provides METZ device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Metz.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Metz: Any
  get() = object {
      /** METZ 86SG1 */
      val _86SG1 = "spec:width=2160,height=3840,unit=px,dpi=480"

  }
