package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * NeXTbyMaxis_M1 device specifications for Android Compose previews.
 *
 * This extension provides NeXTbyMaxis_M1 device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NextbymaxisM1.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NextbymaxisM1: Any
  get() = object {
      /** NeXTbyMaxis_M1 VFD700 */
      val VFD700 = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
