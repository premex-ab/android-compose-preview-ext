package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ismart device specifications for Android Compose previews.
 *
 * This extension provides ismart device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ismart.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ismart: Any
  get() = object {
      /** ismart MID1016-MK */
      val MID1016_MK = "spec:width=800,height=1280,unit=px,dpi=160"

  }
