package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * MNC_NOW device specifications for Android Compose previews.
 *
 * This extension provides MNC_NOW device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MncNow.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MncNow: Any
  get() = object {
      /** MNC_NOW HP40A3 */
      val HP40A3 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
