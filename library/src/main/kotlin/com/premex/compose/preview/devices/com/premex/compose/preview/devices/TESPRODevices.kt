package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TESPRO device specifications for Android Compose previews.
 *
 * This extension provides TESPRO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TESPRO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TESPRO: Any
  get() = object {
      /** DeviceSpec(manufacturer=TESPRO, code=Mayumi_U1, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TESPRO, code=Mayumi_U1, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val MAYUMI_U1 = "spec:width=720,height=1520,unit=px,dpi=320"

  }
