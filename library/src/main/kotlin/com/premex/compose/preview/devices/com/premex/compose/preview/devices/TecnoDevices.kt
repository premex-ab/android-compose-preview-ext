package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Tecno device specifications for Android Compose previews.
 *
 * This extension provides Tecno device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tecno.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tecno: Any
  get() = object {
      /** DeviceSpec(manufacturer=Tecno, code=N5S, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Tecno, code=N5S, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val N5S = "spec:width=480,height=854,unit=px,dpi=240"

  }
