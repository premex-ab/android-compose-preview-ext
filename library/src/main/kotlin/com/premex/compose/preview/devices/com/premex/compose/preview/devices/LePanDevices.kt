package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LePan device specifications for Android Compose previews.
 *
 * This extension provides LePan device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LePan.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LePan: Any
  get() = object {
      /** DeviceSpec(manufacturer=LePan, code=UY8, width=768, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LePan, code=UY8, width=768,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val UY8 = "spec:width=768,height=1024,unit=px,dpi=160"

  }
