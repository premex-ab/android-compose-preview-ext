package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * UniStrong device specifications for Android Compose previews.
 *
 * This extension provides UniStrong device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.UniStrong.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.UniStrong: Any
  get() = object {
      /** DeviceSpec(manufacturer=UniStrong, code=UT10, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UniStrong, code=UT10, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val UT10 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=UniStrong, code=UT12, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UniStrong, code=UT12, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val UT12 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=UniStrong, code=UT30, width=800, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UniStrong, code=UT30, width=800,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val UT30 = "spec:width=800,height=1280,unit=px,dpi=320"

  }
