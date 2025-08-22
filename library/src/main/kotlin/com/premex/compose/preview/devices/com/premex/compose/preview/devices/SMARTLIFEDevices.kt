package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SMARTLIFE device specifications for Android Compose previews.
 *
 * This extension provides SMARTLIFE device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SMARTLIFE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SMARTLIFE: Any
  get() = object {
      /** DeviceSpec(manufacturer=SMARTLIFE, code=SL-TAB10232, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SMARTLIFE, code=SL-TAB10232,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val SL_TAB10232 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
