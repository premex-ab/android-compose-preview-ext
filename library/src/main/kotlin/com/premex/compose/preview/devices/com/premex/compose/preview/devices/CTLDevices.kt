package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CTL device specifications for Android Compose previews.
 *
 * This extension provides CTL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CTL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CTL: Any
  get() = object {
      /** DeviceSpec(manufacturer=CTL, code=ctl_iptv_mrvl, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CTL, code=ctl_iptv_mrvl,
      width=1080, height=1920, dpi=240, isGoogleDevice=false).code */
      val CTL_IPTV_MRVL = "spec:width=1080,height=1920,unit=px,dpi=240"

  }
