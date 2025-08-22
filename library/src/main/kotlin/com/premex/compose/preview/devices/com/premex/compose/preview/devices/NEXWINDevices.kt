package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NEXWIN device specifications for Android Compose previews.
 *
 * This extension provides NEXWIN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NEXWIN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NEXWIN: Any
  get() = object {
      /** DeviceSpec(manufacturer=NEXWIN, code=IFPD_RK3588, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NEXWIN, code=IFPD_RK3588,
      width=2160, height=3840, dpi=320, isGoogleDevice=false).code */
      val IFPD_RK3588 = "spec:width=2160,height=3840,unit=px,dpi=320"

  }
