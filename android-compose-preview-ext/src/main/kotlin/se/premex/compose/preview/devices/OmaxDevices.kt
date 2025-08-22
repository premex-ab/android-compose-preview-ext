package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * OMAX device specifications for Android Compose previews.
 *
 * This extension provides OMAX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Omax.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Omax: Any
  get() = object {
      /** OMAX 7PAN */
      val _7PAN = "spec:width=2160,height=3840,unit=px,dpi=420"

  }
