package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EKS device specifications for Android Compose previews.
 *
 * This extension provides EKS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EKS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EKS: Any
  get() = object {
      /** DeviceSpec(manufacturer=EKS, code=S5LS, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EKS, code=S5LS, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val S5LS = "spec:width=480,height=854,unit=px,dpi=240"

  }
