package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SoftBank device specifications for Android Compose previews.
 *
 * This extension provides SoftBank device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SoftBank.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SoftBank: Any
  get() = object {
      /** DeviceSpec(manufacturer=SoftBank, code=Z8851S, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SoftBank, code=Z8851S, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val Z8851S = "spec:width=1080,height=2340,unit=px,dpi=480"

  }
