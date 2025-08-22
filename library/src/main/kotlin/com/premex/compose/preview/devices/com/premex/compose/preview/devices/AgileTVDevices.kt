package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AgileTV device specifications for Android Compose previews.
 *
 * This extension provides AgileTV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AgileTV.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AgileTV: Any
  get() = object {
      /** DeviceSpec(manufacturer=AgileTV, code=DV9157-T2-KIA, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AgileTV, code=DV9157-T2-KIA,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val DV9157_T2_KIA = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=AgileTV, code=dwt765mm, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AgileTV, code=dwt765mm, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DWT765MM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=AgileTV, code=uzw4060mm, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AgileTV, code=uzw4060mm,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val UZW4060MM = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
