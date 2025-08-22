package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ATEC device specifications for Android Compose previews.
 *
 * This extension provides ATEC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ATEC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ATEC: Any
  get() = object {
      /** DeviceSpec(manufacturer=ATEC, code=APD3, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATEC, code=APD3, width=1200,
      height=2000, dpi=320, isGoogleDevice=false).code */
      val APD3 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ATEC, code=ATEC_IWB, width=2160, height=3840, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATEC, code=ATEC_IWB, width=2160,
      height=3840, dpi=420, isGoogleDevice=false).code */
      val ATEC_IWB = "spec:width=2160,height=3840,unit=px,dpi=420"

  }
