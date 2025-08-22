package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * WCED device specifications for Android Compose previews.
 *
 * This extension provides WCED device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Wced.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Wced: Any
  get() = object {
      /** WCED H1010_M50 */
      val H1010_M50 = "spec:width=1200,height=2000,unit=px,dpi=320"

  }
