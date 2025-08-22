package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MBO device specifications for Android Compose previews.
 *
 * This extension provides MBO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MBO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MBO: Any
  get() = object {
      /** DeviceSpec(manufacturer=MBO, code=16A_Pro, width=720, height=1612, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MBO, code=16A_Pro, width=720,
      height=1612, dpi=240, isGoogleDevice=false).code */
      val _16A_PRO = "spec:width=720,height=1612,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MBO, code=24S_Ultra, width=720, height=1612, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MBO, code=24S_Ultra, width=720,
      height=1612, dpi=240, isGoogleDevice=false).code */
      val _24S_ULTRA = "spec:width=720,height=1612,unit=px,dpi=240"

  }
