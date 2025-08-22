package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * qti device specifications for Android Compose previews.
 *
 * This extension provides qti device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Qti.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Qti: Any
  get() = object {
      /** DeviceSpec(manufacturer=qti, code=kona, width=1080, height=1920, dpi=360,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=qti, code=kona, width=1080,
      height=1920, dpi=360, isGoogleDevice=false).code */
      val KONA = "spec:width=1080,height=1920,unit=px,dpi=360"

  }
