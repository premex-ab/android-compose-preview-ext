package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * E_Wealth_Mobile device specifications for Android Compose previews.
 *
 * This extension provides E_Wealth_Mobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EWealthMobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EWealthMobile: Any
  get() = object {
      /** DeviceSpec(manufacturer=E_Wealth_Mobile, code=E5701, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=E_Wealth_Mobile, code=E5701,
      width=720, height=1520, dpi=320, isGoogleDevice=false).code */
      val E5701 = "spec:width=720,height=1520,unit=px,dpi=320"

  }
