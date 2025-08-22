package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BWJBSW device specifications for Android Compose previews.
 *
 * This extension provides BWJBSW device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BWJBSW.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BWJBSW: Any
  get() = object {
      /** DeviceSpec(manufacturer=BWJBSW, code=KT802_US, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BWJBSW, code=KT802_US, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val KT802_US = "spec:width=800,height=1280,unit=px,dpi=213"

  }
