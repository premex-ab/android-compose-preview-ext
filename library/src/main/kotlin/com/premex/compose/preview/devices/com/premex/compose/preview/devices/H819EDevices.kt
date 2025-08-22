package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * H819E device specifications for Android Compose previews.
 *
 * This extension provides H819E device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.H819E.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.H819E: Any
  get() = object {
      /** DeviceSpec(manufacturer=H819E, code=MINTAKA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=H819E, code=MINTAKA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val MINTAKA = "spec:width=800,height=1280,unit=px,dpi=160"

  }
