package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Webee device specifications for Android Compose previews.
 *
 * This extension provides Webee device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Webee.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Webee: Any
  get() = object {
      /** DeviceSpec(manufacturer=Webee, code=Webee_Tab_8, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Webee, code=Webee_Tab_8, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val WEBEE_TAB_8 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
