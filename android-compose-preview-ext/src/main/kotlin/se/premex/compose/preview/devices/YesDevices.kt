package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * YES device specifications for Android Compose previews.
 *
 * This extension provides YES device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Yes.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Yes: Any
  get() = object {
      /** YES Altitude_4 */
      val ALTITUDE_4 = "spec:width=480,height=960,unit=px,dpi=240"

  }
