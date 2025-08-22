package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Smooth device specifications for Android Compose previews.
 *
 * This extension provides Smooth device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Smooth.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Smooth: Any
  get() = object {
      /** Smooth Smooth626 */
      val SMOOTH626 = "spec:width=480,height=1014,unit=px,dpi=213"

  }
