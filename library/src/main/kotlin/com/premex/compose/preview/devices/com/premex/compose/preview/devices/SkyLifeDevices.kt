package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SkyLife device specifications for Android Compose previews.
 *
 * This extension provides SkyLife device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SkyLife.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SkyLife: Any
  get() = object {
      /** DeviceSpec(manufacturer=SkyLife, code=KSTB6165, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SkyLife, code=KSTB6165, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KSTB6165 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SkyLife, code=ma5100, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SkyLife, code=ma5100, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MA5100 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
