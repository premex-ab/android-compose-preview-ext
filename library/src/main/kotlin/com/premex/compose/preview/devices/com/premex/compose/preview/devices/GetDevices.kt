package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Get device specifications for Android Compose previews.
 *
 * This extension provides Get device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Get.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Get: Any
  get() = object {
      /** DeviceSpec(manufacturer=Get, code=dciw387get, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Get, code=dciw387get, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DCIW387GET = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
