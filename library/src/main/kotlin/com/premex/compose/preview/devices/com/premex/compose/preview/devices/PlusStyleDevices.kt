package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PlusStyle device specifications for Android Compose previews.
 *
 * This extension provides PlusStyle device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PlusStyle.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PlusStyle: Any
  get() = object {
      /** DeviceSpec(manufacturer=PlusStyle, code=PS_TAB_WB01, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PlusStyle, code=PS_TAB_WB01,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val PS_TAB_WB01 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
