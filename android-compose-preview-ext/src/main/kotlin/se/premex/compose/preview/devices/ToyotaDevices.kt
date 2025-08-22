package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TOYOTA device specifications for Android Compose previews.
 *
 * This extension provides TOYOTA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Toyota.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Toyota: Any
  get() = object {
      /** TOYOTA TSA */
      val TSA = "spec:width=2160,height=3840,unit=px,dpi=320"

  }
