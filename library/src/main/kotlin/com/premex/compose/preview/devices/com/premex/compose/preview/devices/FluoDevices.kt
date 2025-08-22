package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * fluo device specifications for Android Compose previews.
 *
 * This extension provides fluo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Fluo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Fluo: Any
  get() = object {
      /** DeviceSpec(manufacturer=fluo, code=N, width=720, height=1498, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=fluo, code=N, width=720,
      height=1498, dpi=320, isGoogleDevice=false).code */
      val N = "spec:width=720,height=1498,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=fluo, code=X2_Max, width=720, height=1500, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=fluo, code=X2_Max, width=720,
      height=1500, dpi=320, isGoogleDevice=false).code */
      val X2_MAX = "spec:width=720,height=1500,unit=px,dpi=320"

  }
