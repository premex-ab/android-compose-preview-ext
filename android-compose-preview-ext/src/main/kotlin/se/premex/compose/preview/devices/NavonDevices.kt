package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * NAVON device specifications for Android Compose previews.
 *
 * This extension provides NAVON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Navon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Navon: Any
  get() = object {
      /** NAVON D455 */
      val D455 = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
