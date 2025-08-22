package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * vkworld device specifications for Android Compose previews.
 *
 * This extension provides vkworld device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vkworld.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vkworld: Any
  get() = object {
      /** DeviceSpec(manufacturer=vkworld, code=VK7000, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vkworld, code=VK7000, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val VK7000 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=vkworld, code=vkworld_S8, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=vkworld, code=vkworld_S8,
      width=1080, height=2160, dpi=480, isGoogleDevice=false).code */
      val VKWORLD_S8 = "spec:width=1080,height=2160,unit=px,dpi=480"

  }
