package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ENGLAON device specifications for Android Compose previews.
 *
 * This extension provides ENGLAON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Englaon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Englaon: Any
  get() = object {
      /** ENGLAON mountbaker */
      val MOUNTBAKER = "spec:width=720,height=1280,unit=px,dpi=213"

      /** ENGLAON stanford */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

  }
