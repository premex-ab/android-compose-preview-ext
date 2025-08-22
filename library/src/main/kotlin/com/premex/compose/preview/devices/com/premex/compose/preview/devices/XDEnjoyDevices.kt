package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * XD-Enjoy device specifications for Android Compose previews.
 *
 * This extension provides XD-Enjoy device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.XDEnjoy.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.XDEnjoy: Any
  get() = object {
      /** DeviceSpec(manufacturer=XD-Enjoy, code=XDDGM10, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XD-Enjoy, code=XDDGM10, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val XDDGM10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=XD-Enjoy, code=XDDGM11BS, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XD-Enjoy, code=XDDGM11BS,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val XDDGM11BS = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=XD-Enjoy, code=XDDGM99PM, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XD-Enjoy, code=XDDGM99PM,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val XDDGM99PM = "spec:width=800,height=1280,unit=px,dpi=213"

  }
