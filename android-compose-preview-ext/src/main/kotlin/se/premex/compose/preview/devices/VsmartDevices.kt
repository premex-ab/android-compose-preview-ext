package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Vsmart device specifications for Android Compose previews.
 *
 * This extension provides Vsmart device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vsmart.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vsmart: Any
  get() = object {
      /** Vsmart samseong */
      val SAMSEONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Vsmart TR2001 */
      val TR2001 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
