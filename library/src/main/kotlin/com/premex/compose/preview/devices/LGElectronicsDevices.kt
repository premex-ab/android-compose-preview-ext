package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LG_Electronics device specifications for Android Compose previews.
 *
 * This extension provides LG_Electronics device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LGElectronics.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LGElectronics: Any
  get() = object {
      /** LG_Electronics rk3588_t */
      val RK3588_T = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** LG_Electronics TR3DK */
      val TR3DK = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** LG_Electronics TR3DQ-B */
      val TR3DQ_B = "spec:width=2160,height=3840,unit=px,dpi=480"

  }
