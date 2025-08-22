package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ETG device specifications for Android Compose previews.
 *
 * This extension provides ETG device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Etg.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Etg: Any
  get() = object {
      /** ETG ETG-BT1121 */
      val ETG_BT1121 = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
