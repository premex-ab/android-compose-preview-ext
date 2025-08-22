package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * inefi device specifications for Android Compose previews.
 *
 * This extension provides inefi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Inefi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Inefi: Any
  get() = object {
      /** DeviceSpec(manufacturer=inefi, code=Android_G17, width=1080, height=1920, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=inefi, code=Android_G17,
      width=1080, height=1920, dpi=160, isGoogleDevice=false).code */
      val ANDROID_G17 = "spec:width=1080,height=1920,unit=px,dpi=160"

  }
