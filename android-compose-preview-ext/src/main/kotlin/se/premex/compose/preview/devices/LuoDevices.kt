package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * LUO device specifications for Android Compose previews.
 *
 * This extension provides LUO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Luo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Luo: Any
  get() = object {
      /** LUO P70_Pro */
      val P70_PRO = "spec:width=720,height=1612,unit=px,dpi=320"

      /** LUO S15_Pro */
      val S15_PRO = "spec:width=720,height=1612,unit=px,dpi=320"

      /** LUO S16_Pro */
      val S16_PRO = "spec:width=720,height=1640,unit=px,dpi=320"

      /** LUO S17_Pro */
      val S17_PRO = "spec:width=720,height=1640,unit=px,dpi=320"

      /** LUO S18_Max */
      val S18_MAX = "spec:width=720,height=1640,unit=px,dpi=320"

  }
