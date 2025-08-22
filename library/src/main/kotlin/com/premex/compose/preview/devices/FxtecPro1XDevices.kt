package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Fx_tec_Pro1X device specifications for Android Compose previews.
 *
 * This extension provides Fx_tec_Pro1X device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FxtecPro1X.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FxtecPro1X: Any
  get() = object {
      /** Fx_tec_Pro1X QX1050 */
      val QX1050 = "spec:width=1440,height=2960,unit=px,dpi=440"

  }
