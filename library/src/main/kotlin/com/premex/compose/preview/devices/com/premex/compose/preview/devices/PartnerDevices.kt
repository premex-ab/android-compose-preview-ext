package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Partner device specifications for Android Compose previews.
 *
 * This extension provides Partner device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Partner.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Partner: Any
  get() = object {
      /** DeviceSpec(manufacturer=Partner, code=Batman, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Partner, code=Batman, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val BATMAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Partner, code=uzw4054ptn, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Partner, code=uzw4054ptn,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val UZW4054PTN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
