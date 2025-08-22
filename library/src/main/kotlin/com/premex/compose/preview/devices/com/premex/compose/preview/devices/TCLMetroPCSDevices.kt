package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TCL_MetroPCS device specifications for Android Compose previews.
 *
 * This extension provides TCL_MetroPCS device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TCLMetroPCS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TCLMetroPCS: Any
  get() = object {
      /** DeviceSpec(manufacturer=TCL_MetroPCS, code=Yaris5TMO, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TCL_MetroPCS, code=Yaris5TMO,
      width=540, height=960, dpi=240, isGoogleDevice=false).code */
      val YARIS5TMO = "spec:width=540,height=960,unit=px,dpi=240"

  }
