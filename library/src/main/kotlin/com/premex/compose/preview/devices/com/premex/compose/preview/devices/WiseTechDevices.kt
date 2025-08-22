package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Wise_Tech device specifications for Android Compose previews.
 *
 * This extension provides Wise_Tech device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.WiseTech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.WiseTech: Any
  get() = object {
      /** DeviceSpec(manufacturer=Wise_Tech, code=Tech_A1_Plus, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Wise_Tech, code=Tech_A1_Plus,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val TECH_A1_PLUS = "spec:width=800,height=1280,unit=px,dpi=213"

  }
