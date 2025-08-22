package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * newbalance device specifications for Android Compose previews.
 *
 * This extension provides newbalance device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Newbalance.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Newbalance: Any
  get() = object {
      /** DeviceSpec(manufacturer=newbalance, code=shasta, width=400, height=400, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=newbalance, code=shasta, width=400,
      height=400, dpi=280, isGoogleDevice=false).code */
      val SHASTA = "spec:width=400,height=400,unit=px,dpi=280"

  }
