package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * IQ_TOUCH device specifications for Android Compose previews.
 *
 * This extension provides IQ_TOUCH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IQTOUCH.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IQTOUCH: Any
  get() = object {
      /** DeviceSpec(manufacturer=IQ_TOUCH, code=iMax_EC1053, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IQ_TOUCH, code=iMax_EC1053,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val IMAX_EC1053 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
