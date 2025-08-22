package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * GTEL device specifications for Android Compose previews.
 *
 * This extension provides GTEL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Gtel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Gtel: Any
  get() = object {
      /** GTEL Delta_14 */
      val DELTA_14 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** GTEL Infinity_13 */
      val INFINITY_13 = "spec:width=720,height=1612,unit=px,dpi=320"

  }
