package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Xsmart device specifications for Android Compose previews.
 *
 * This extension provides Xsmart device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Xsmart.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Xsmart: Any
  get() = object {
      /** Xsmart CORE_X */
      val CORE_X = "spec:width=720,height=1640,unit=px,dpi=320"

      /** Xsmart Mate_10 */
      val MATE_10 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** Xsmart NOVA_7 */
      val NOVA_7 = "spec:width=720,height=1612,unit=px,dpi=300"

  }
