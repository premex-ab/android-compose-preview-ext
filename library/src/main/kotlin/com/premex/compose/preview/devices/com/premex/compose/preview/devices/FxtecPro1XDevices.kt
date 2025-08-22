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
      /** DeviceSpec(manufacturer=Fx_tec_Pro1X, code=QX1050, width=1440, height=2960, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fx_tec_Pro1X, code=QX1050,
      width=1440, height=2960, dpi=440, isGoogleDevice=false).code */
      val QX1050 = "spec:width=1440,height=2960,unit=px,dpi=440"

  }
