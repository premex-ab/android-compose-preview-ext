package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Kelyx_KL783 device specifications for Android Compose previews.
 *
 * This extension provides Kelyx_KL783 device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KelyxKL783.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KelyxKL783: Any
  get() = object {
      /** DeviceSpec(manufacturer=Kelyx_KL783, code=AKS01_KL783, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kelyx_KL783, code=AKS01_KL783,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val AKS01_KL783 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
